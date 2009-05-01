<%
String [] articlePathToPage = { "contentrel,artikel", "readmore,artikel", "posrel,images,pos4rel,artikel" };      
for(int i = 0; i<3; i++) {
    %>
    <mm:related path="<%= articlePathToPage[i] %>" fields="artikel.number">
      <mm:field name="artikel.number" jspvar="sID" vartype="String" write="false">
        <mm:list nodes="<%= sID %>" path="artikel,posrel,paragraaf,posrel,attachments" fields="attachments.number,attachments.filename,attachments.titel">
          <mm:field name="attachments.number" jspvar="sAttID" vartype="String" write="false">
            <% 
            if (hsetAttachmentsParagraafNodes.contains(sAttID)) { 
              bHasAttachments = true;
              %>
               <%@include file="show_attachments.jsp" %>															
               <%	
            } %>
          </mm:field>
        </mm:list>
        <%
        if(hsetArticlesNodes.contains(sID)||bHasAttachments){
          %>
          <mm:node element="artikel" id="this_article">
            <mm:field name="titel" jspvar="titel" vartype="String" write="false">
              <%@include file="highlightsshow.jsp" %>
            <% String highlightSearchTerms = su.highlightSearchTerms(textStr,defaultSearchTerms,"b");
              if (!highlightSearchTerms.trim().equals("")) {
                highlightSearchTerms += "<br/>";
              }
              titleStr = titel;
              if (bHasAttachments) {%>
                <%@include file="../poolanddate.jsp" %>
                <%= highlightSearchTerms %>
                <a href="<%= templateUrl %>?p=<%=sPageID%>&article=<%= sID %>">
                <span class="normal" style="text-decoration:underline;"><%= su.highlightSearchTerms(titel,defaultSearchTerms,"b") %></span></a><br/>
            <% } else {%>
                <li><a href="<%= templateUrl %>?p=<%=sPageID%>&article=<%= sID %>">
                 <span class="normal" style="text-decoration:underline;"><%= su.highlightSearchTerms(titel,defaultSearchTerms,"b") %></span></a></li><br/>
                <%@include file="../poolanddate.jsp" %>
                <%= highlightSearchTerms %>
            <% } %><br/>	
            </mm:field>
          </mm:node>
          <mm:remove referid="this_article" />
          <% 
        }
        bHasAttachments = false;
        %>
     </mm:field>
  </mm:related>
  <%
} %>
