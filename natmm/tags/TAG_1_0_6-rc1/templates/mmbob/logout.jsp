<%@ taglib uri="http://www.mmbase.org/mmbase-taglib-1.0" prefix="mm" %>
<mm:import id="forumid" externid="forumid" jspvar="forumid" />
<mm:import id="cw2"></mm:import>
<mm:import id="ca2"></mm:import>
<mm:import id="pid2">-1</mm:import>
<mm:write referid="cw2" cookie="cwf$forumid" />
<mm:write referid="ca2" cookie="caf$forumid" />
<mm:write referid="pid2" session="pid$forumid" />
<%response.sendRedirect("index.jsp?forumid="+forumid);%>
