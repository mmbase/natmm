<mm:node number="<%= employeeId %>" jspvar="e"><%
   thisPerson = firstnameId;
   if(!suffixId.equals("")) { thisPerson += " " + suffixId; }
   thisPerson += " " + lastnameId;
   thisPerson += " (Sofinummer: " + e.getStringValue("externid") + ")";
   
   // *** FZ ***
   if(!companyphoneId.equals(e.getStringValue("companyphone"))) {
      fzText += "<br><br>Telefoon '" + e.getStringValue("companyphone") + "' moet worden gewijzigd in: " + companyphoneId;
   }
   if(!cellularphoneId.equals(e.getStringValue("cellularphone"))) {
      fzText += "<br><br>Mobiel '" + e.getStringValue("cellularphone") + "' moet worden gewijzigd in: " + cellularphoneId;
   }
   if(!faxId.equals(e.getStringValue("fax"))) {
      fzText += "<br><br>Fax '" + e.getStringValue("fax") + "' moet worden gewijzigd in: " + faxId;
   }
   if(!emailId.equals(e.getStringValue("email"))) {
      fzText += "<br><br>Email '" + e.getStringValue("email") + "' moet worden gewijzigd in: " + emailId + " (wordt afgestemd met automatisering en/of betrokken medewerker)";
   }
   
   // *** fields that can be changed by employees themselves ***
   if(!omschrijving_fraId.equals(e.getStringValue("omschrijving_fra"))) {
     dcText += "<br><br>" + specialDays + ": " + omschrijving_fraId;
   }
   if(!omschrijvingId.equals(e.getStringValue("omschrijving"))) {
     dcText += "<br><br>En verder moet worden gewijzigd in: " + omschrijvingId;
   }
   if(!omschrijving_deId.equals(e.getStringValue("omschrijving_de"))) {
     dcText += "<br><br>Beschrijving werkzaamheden moet worden gewijzigd in:<br>" + omschrijving_deId;
   }
%></mm:node>