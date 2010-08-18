<%@include file="/taglibs.jsp" %>
<mm:content type="text/html" escaper="none">
<%@page import="nl.leocms.util.PropertiesUtil,nl.leocms.util.ApplicationHelper,org.mmbase.bridge.*,java.net.*,java.util.*" %>

<% 
// make sure website_user is not used as editor account
String account = null; 
String objects = "";
%>
<mm:cloud method="http" rank="anonymous" jspvar="cloud">
  <% account = cloud.getUser().getIdentifier(); %>
</mm:cloud>
<% 
if("website_user".equals(account)) {
  request.getSession().invalidate(); 
  %><mm:redirect page="/editors/topmenu.jsp" /><%
} %>

<mm:cloud jspvar="cloud" rank="basic user">
<%
account = cloud.getUser().getIdentifier();
String unused_items = cloud.getNodeManager("users").getList("users.account = '" + account + "'",null,null).getNode(0).getStringValue("unused_items");


if (unused_items!=null&&(!unused_items.equals(""))){
   String contentElementConstraint = " contentelement.number IN (0, " + unused_items + ") ";
   NodeList nlObjects = cloud.getList("",
                                "contentelement",
                                "contentelement.number",
                                contentElementConstraint,
                                null,null,null,true);
   StringBuffer sbObjects = new StringBuffer();
   for(int n=0; n<nlObjects.size(); n++) {
      if(n>0) { sbObjects.append(','); }
      sbObjects.append(nlObjects.getNode(n).getStringValue("contentelement.number"));
   }
   objects = sbObjects.toString();
 }
%>

<% if (!"".equals(objects)) { %>
<mm:listnodes nodes="<%=objects%>" path="contentelement,creatierubriek,rubriek">
   <mm:first>Aantal elementen verwijderd uit de prullenbak: <mm:size/><br/></mm:first>
   <mm:node>
      <mm:field name="number" jspvar="nNumber" vartype="String">
      <% if (!"23736".equals(nNumber) || !"23744".equals(nNumber)) {%>
         <mm:deletenode deleterelations="true" />
      <% } else if (!"23744".equals(nNumber)) {%>
         <mm:deletenode deleterelations="false" />
      <%}%>
      </mm:field>
   </mm:node>

</mm:listnodes>
<%}%>

<%
Node used_items_node = cloud.getNodeManager("users").getList("users.account = '" + account + "'",null,null).getNode(0);
used_items_node.setStringValue("unused_items","");
used_items_node.commit();
%>

<%
Calendar cal = Calendar.getInstance();
cal.set(2008,0,1);
long begintime = cal.getTime().getTime()/1000;
%>

<mm:listnodescontainer path="pagina,contentrel,artikel" element="artikel">
   <mm:constraint field="pagina.number" operator="=" value="13857" />
   <mm:constraint field="artikel.begindatum" operator="<" value="<%= "" + begintime %>" />

   <mm:listnodes>

      <mm:first>Aantal elementen verwijderd gekoppeld aan de Archief pagina t/m 2007: <mm:size/><br/></mm:first>
      <mm:deletenode deleterelations="true" />
   
   </mm:listnodes>
</mm:listnodescontainer>

</mm:cloud>
</mm:content>
