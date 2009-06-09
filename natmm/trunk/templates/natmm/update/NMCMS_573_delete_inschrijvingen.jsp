<%@ taglib uri="http://www.mmbase.org/mmbase-taglib-1.0" prefix="mm" %>
<%@ page import="org.mmbase.bridge.*,java.util.*,nl.leocms.util.*,nl.leocms.util.tools.*,nl.leocms.applications.*" %>

<html>
   <head>
   </head>
   
   <body>

   <mm:cloud jspvar="cloud" method="pagelogon" username="admin" password="<%= (String) com.finalist.mmbase.util.CloudFactory.getAdminUserCredentials().get("password") %>">
      
      <mm:listnodes path="inschrijvingen" constraints="inschrijvingen.datum_inschrijving < 1199190481">
      
         <mm:field name="number" jspvar="inschrijfNumber" vartype="String" write="false">
         <% System.out.print("Inschrijving verwijderd: " + inschrijfNumber); %>
         </mm:field>
         
         <mm:relatednodes path="email">
            <mm:deletenode deleterelations="true"/> 
         </mm:relatednodes>

         <mm:deletenode deleterelations="true"/>

      </mm:listnodes>

   </mm:cloud>
   
</body>
</html>