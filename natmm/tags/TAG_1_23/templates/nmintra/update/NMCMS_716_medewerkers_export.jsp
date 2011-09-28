<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.mmbase.org/mmbase-taglib-1.0" prefix="mm" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page import="org.mmbase.bridge.*,java.util.*,nl.leocms.util.*,nl.leocms.util.tools.*,nl.leocms.applications.*" %>

<%
Calendar cal = Calendar.getInstance();
String [] days = { "ZONDAG","MAANDAG","DINSDAG","WOENSDAG","DONDERDAG","VRIJDAG","ZATERDAG" }; 
String [] days_lcase = { "Zondag","Maandag","Dinsdag","Woensdag","Donderdag","Vrijdag","Zaterdag" }; 
String [] days_abbr = { "Zo.","Ma.","Di.","Wo.","Do.","Vrij.","Za." } ; 
String [] months = { "JANUARI","FEBRUARI","MAART","APRIL","MEI","JUNI","JULI",
					"AUGUSTUS","SEPTEMBER","OKTOBER","NOVEMBER","DECEMBER" };
String [] months_lcase = { "januari","februari","maart","april","mei","juni","juli",
					"augustus","september","oktober","november","december" };
%>

<mm:cloud jspvar="cloud" method="pagelogon" username="admin" password="<%= (String) com.finalist.mmbase.util.CloudFactory.getAdminUserCredentials().get("password") %>">     

<c:set var="m_volg" value="0" />

<mm:listnodes type="medewerkers">
	<mm:first><p>Aantal medewerkers: <mm:size/></p></mm:first>
</mm:listnodes>

	<table border="1">
	<tr>
	<th>Volg nummer</th>
	<th>naam</th>
	<th>sofinummer (beaufort)</th>
	<th>titel (beaufort)</th>
	<th>voornaam (beaufort)</th>
	<th>initialen (beaufort)</th>
	<th>tussenvoegsel (beaufort)</th>
	<th>achternaam (beaufort)</th>
	<th>geslacht (beaufort)</th>
	<th>telefoon (fz)</th>
	<th>06-nummer (fz)</th>
	<!--<th>toon mobiel (fz)</th>-->
	<th>fax (fz)</th>
	<th>email (outlook)</th>
	<!--<th>email automatisch updaten (fz)</th>-->
	<th>account (netwerk)</th>
	<!--<th>functie op visitekaartje (fz)</th>-->
	<!--<th>bedrijfshulpverlener (fz)</th>-->
	<!--<th>vaste vrije/werk dagen (medewerker)</th>-->
	<!--<th>werkzaamheden</th>-->
	<!--<th>en verder (medewerker)</th>-->
	<!--<th>geboortedatum</th>-->
	<!--<th>redactionele aantekening</th>-->
	<!--<th>importstatus (beaufort)</th>-->
	</tr>

	<mm:listnodes type="medewerkers" orderby="titel" directions="UP">
		<c:set var="m_volg" value="${m_volg + 1}" />
	
		<tr>
		<td>${m_volg}</td>
		<td><mm:field name="titel" /></td>
		<td><mm:field name="externid" /></td>
		<td><mm:field name="prefix" /></td>
		<td><mm:field name="firstname" /></td>
		<td><mm:field name="initials" /></td>
		<td><mm:field name="suffix" /></td>
		<td><mm:field name="lastname" /></td>
		<td>
			<mm:field name="gender" jspvar="fgender" write="false" vartype="String"/>
			<c:choose>
				<c:when test="${fgender eq '0'}">
					Vrouw
				</c:when>
				<c:when test="${fgender eq '1'}">
					Man
				</c:when>
			</c:choose>
		</td>
		<td><mm:field name="companyphone" /></td>
		<td><mm:field name="cellularphone" /></td>
		<!--<td><mm:field name="titel_zichtbaar" /></td>-->
		<td><mm:field name="fax" /></td>
		<td><mm:field name="email" /></td>
		<!--<td><mm:field name="updateinfo" /></td>-->
		<td><mm:field name="account" /></td>
		<!--<td><mm:field name="job" /></td>-->
		<!--<td><mm:field name="reageer" /></td>-->
		<!--<td><mm:field name="omschrijving_fra" /></td>-->
		<!--<td><mm:field name="omschrijving_de" /></td>-->
		<!--<td><mm:field name="omschrijving" /></td>-->
		<!--<td><mm:field name="dayofbirth" jspvar="dayofbirth" vartype="String" write="false"/></td>-->
		<!--<td><mm:field name="metatags" /></td>-->
		<!--<td><mm:field name="importstatus" /></td>-->
		</tr>
		
	</mm:listnodes>

	</table>

</mm:cloud>