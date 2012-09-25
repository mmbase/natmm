<%@page isELIgnored="false" %><%@page 
contentType="text/plain" %><%@ taglib 
uri="http://www.mmbase.org/mmbase-taglib-1.0" prefix="mm" %><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %><%@page import="org.mmbase.bridge.*,java.util.*,nl.leocms.util.*,nl.leocms.util.tools.*,nl.leocms.applications.*" %><%
Calendar cal = Calendar.getInstance();
String [] days = { "ZONDAG","MAANDAG","DINSDAG","WOENSDAG","DONDERDAG","VRIJDAG","ZATERDAG" }; 
String [] days_lcase = { "Zondag","Maandag","Dinsdag","Woensdag","Donderdag","Vrijdag","Zaterdag" }; 
String [] days_abbr = { "Zo.","Ma.","Di.","Wo.","Do.","Vrij.","Za." } ; 
String [] months = { "JANUARI","FEBRUARI","MAART","APRIL","MEI","JUNI","JULI",
 				
"AUGUSTUS","SEPTEMBER","OKTOBER","NOVEMBER","DECEMBER" };
String [] months_lcase = { "januari","februari","maart","april","mei","juni","juli",
					"augustus","september","oktober","november","december" };
%><mm:content type="text/css" escaper="none"><mm:cloud jspvar="cloud" method="pagelogon" username="admin" password="<%= (String) com.finalist.mmbase.util.CloudFactory.getAdminUserCredentials().get("password") %>">     <c:set var="m_volg" value="0" />
Volg_nummer;naam;sofinummer_(beaufort);titel_(beaufort);voornaam_(beaufort);initialen_(beaufort);tussenvoegsel_(beaufort);achternaam_(beaufort);geslacht_(beaufort);telefoon_(fz);06-nummer_(fz);fax_(fz);email_(outlook);account_(netwerk);toon_mobiel_(fz);email_automatisch_updaten_(fz);functie_op_visitekaartje_(fz);bedrijfshulpverlener_(fz);vaste_vrije/werk_dagen_(medewerker);werkzaamheden;en_verder_(medewerker);geboortedatum;redactionele_aantekening;importstatus_(beaufort);foto<mm:listnodes type="medewerkers" orderby="titel" directions="UP"><c:set var="m_volg" value="${m_volg + 1}" /><mm:relatednodes type="images"><c:set 
var="imageUri"><mm:image /></c:set></mm:relatednodes><mm:field name="gender" jspvar="fgender" write="false" vartype="String"/><c:choose><c:when test="${fgender eq '0'}"><c:set var="gender">Vrouw</c:set></c:when><c:when test="${fgender eq '1'}"><c:set var="gender">Man</c:set></c:when></c:choose>
${m_volg};<mm:field name="titel" />;<mm:field name="externid" />;<mm:field name="prefix" />;<mm:field name="firstname" />;<mm:field name="initials" />;<mm:field name="suffix" />;<mm:field name="lastname" />;${gender};<mm:field name="companyphone" />;<mm:field name="cellularphone" />;<mm:field name="fax" />;<mm:field name="email" />;<mm:field name="account" />;<mm:field name="titel_zichtbaar" />;<mm:field name="updateinfo" />;<mm:field name="job" />;<mm:field name="reageer" />;<mm:field name="omschrijving_fra" />;<mm:field name="omschrijving_de" />;<mm:field name="omschrijving" />;<mm:field name="dayofbirth" />;<mm:field name="metatags" />;<mm:field name="importstatus" />;${imageUri}<c:remove var="imageUri"/></mm:listnodes></mm:cloud></mm:content>

