<%@include file="/taglibs.jsp" %>
<mm:cloud jspvar="cloud">
<%@include file="includes/templateheader.jsp" %>
<%@include file="includes/cacheparams.jsp" %>
<cache:cache groups="<%= paginaID %>" key="<%= cacheKey %>" time="<%= expireTime %>" scope="application">
<%@include file="includes/header.jsp" %>
<td colspan="2"><%@include file="includes/pagetitle.jsp" %></td>
</tr>
<tr>
<td colspan="2" class="transperant" valign="top">
<div class="<%= infopageClass %>" id="infopage">
<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr><td>
<mm:list nodes="<%= paginaID %>" path="pagina,contentrel,artikel" orderby="contentrel.pos" directions="UP"
	><mm:field name="pagina.omschrijving">
      <mm:isnotempty>
         <div class="black" style="padding-left:10px;padding-bottom:10px;"><mm:write /></div>
      </mm:isnotempty>
   </mm:field>
   <mm:node element="artikel"
      ><div class="pageheader" style="padding-left:10px;">
         <mm:field name="titel"/>
      </div>
      <div class="black" style="padding-left:10px;">
         <mm:field name="intro"><mm:isnotempty><mm:write /></mm:isnotempty></mm:field>
      </div>
		<mm:related path="posrel,paragraaf"
			orderby="posrel.pos" directions="UP" fields="paragraaf.number"
			><mm:first><ul type="square" class="black"></mm:first>
			<li><b><mm:field name="paragraaf.titel"/></b></li><br/>
			<mm:field name="paragraaf.tekst"/>
			<mm:last></ul></mm:last>
		</mm:related
	></mm:node
></mm:list>
<mm:node number="<%= paginaID %>">
   <%@include file="includes/contentblocks.jsp" %>
</mm:node>
</div>
</td></tr>
</table>
</td>
<%@include file="includes/footer.jsp" %>
</cache:cache>
</mm:cloud>
