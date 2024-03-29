/*
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is LeoCMS.
 *
 * The Initial Developer of the Original Code is
 * 'De Gemeente Leeuwarden' (The dutch municipality Leeuwarden).
 *
 * See license.txt in the root of the LeoCMS directory for the full license.
 */
package nl.leocms.mmbase.security.cloud;

import java.util.Iterator;
import org.mmbase.module.core.MMObjectBuilder;
import org.mmbase.module.core.MMObjectNode;
import org.mmbase.util.logging.Logger;
import org.mmbase.util.logging.Logging;
import org.mmbase.storage.search.implementation.*;


/**
 * This class implements the user builder to provide custom behaviour for 
 * the leeuwarden website:
 * <ul>
 * <li>Does not allow the field "account" to be changed.
 * <li>Provides a method to authenticate users based on the fields "account" 
 * and "password": {@link #getRankAsString(String,String)}.
 * </ul>
 * 
 * @author  Ronald Kramp
 * @version '$Revision: 1.1 $, $Date: 2006-03-05 21:43:58 $'
 */
public class UserBuilder extends MMObjectBuilder {
   
   /** Logger. */
   private static Logger log = Logging.getLoggerInstance(UserBuilder.class.getName());

   
   // javadoc is inherited
   public boolean setValue(MMObjectNode node, String fieldName, Object originalValue) {

      if (fieldName.equals("account")) {
         Object newValue = node.values.get(fieldName);
         if (originalValue != null && !originalValue.equals(newValue)) {
            // Restore the original value.
            node.values.put(fieldName, originalValue);
            return false;
         }
      }
      return true;
   }
   
   // javadoc is inherited
   public void setDefaults(MMObjectNode node) {
      node.setValue("password", "");
   }
   
   /**
    * Checks whether the user with the given password exists.
    *
    * @param username name of the user
    * @param password of the user (not encoded)
    * @return <code>rank as string</code> if the user exists, otherwise null
    */
   public String getRankAsString(String username, String password) {

      NodeSearchQuery query = new NodeSearchQuery(this);
      BasicFieldValueConstraint constraint = new BasicFieldValueConstraint(query.getField(getField("account")),username);
      query.setConstraint(constraint);
      Iterator userIterator = null;
      try {
         userIterator = getNodes(query).iterator();
      } catch (Exception e) {
         log.error(e);
      }
      
      while (userIterator!=null&&userIterator.hasNext()) {
         
         MMObjectNode node = (MMObjectNode) userIterator.next();
         // check for case sensitive
         if (!username.equals(node.getStringValue("account"))) {
            log.trace("Username found, but not valid (case sensitive check). username = '" + username
               + "' in node #" + node.getNumber());
         }
         else {
            if (password.equals(node.getStringValue("password"))) {
               log.trace("Found: user = '" + username
                  + "', password = '" + password + "' in node #" + node.getNumber());
               return node.getStringValue("rank");
            }
            else {
               log.trace("Password incorrect for user = '" + username
                  + "' in node #" + node.getNumber());
            }
         }
      }
      return null;
   }
}