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
package nl.leocms.beheeromgeving;

/**
 * @author Gerard van de Weerd
 *
 * 
 */
public class ContextBean {
   /** indicates superfunction context */
   private String superfunction;
   /** indicates subfunction context */
   private String subfunction;
   /** indicates rubriek context */
   private String rubriek;
   /**
    * @return
    */
   public String getRubriek() {
      return rubriek;
   }

   /**
    * @return
    */
   public String getSubfunction() {
      return subfunction;
   }

   /**
    * @return
    */
   public String getSuperfunction() {
      return superfunction;
   }

   /**
    * @param string
    */
   public void setRubriek(String string) {
      rubriek = string;
   }

   /**
    * @param string
    */
   public void setSubfunction(String string) {
      subfunction = string;
   }

   /**
    * @param string
    */
   public void setSuperfunction(String string) {
      superfunction = string;
   }
   
}
