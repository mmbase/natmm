<img src="media/spacer.gif" height="14" width="1" alt="" border="0" alt=""><br>
<table cellspacing="0" cellpadding="0" width="100%">
<tr><td class="titlebar"><img src="media/spacer.gif" height="1" width="1" alt="" border="0" alt=""></td></tr>
<tr><td class="internalnav">Overige producten onder <mm:node number="<%= paginaID %>"><mm:field name="titel" /></mm:node></td></tr>
<tr><form name="selectform" method="post" action=""><td>
	<select name="shop_item" onChange="javascript:postIt();" style="width:180px;height:16px;">
	<mm:list nodes="<%= paginaID %>" path="pagina,posrel,items" fields="items.number,items.titel"
		orderby="items.titel" directions="UP"
		><option value="<mm:field name="items.number" />"><mm:field name="items.titel" />
	</mm:list
	></select>
</td></form></tr>
</table>
<script language="JavaScript" type="text/javascript">
<%= "<!--" %>
function postIt() {
	var shop_item = document.selectform.elements["shop_item"].value;
	document.location = "<mm:url page="<%= ph.createPaginaUrl(paginaID,request.getContextPath()) %>" />" + "?u=" + shop_item;
}
<%= "//-->" %>
</script>