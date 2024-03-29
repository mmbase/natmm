<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page language="java" contentType="text/html;charset=UTF-8"
%><%@page isErrorPage="true"
%><%@page import="java.io.*,java.text.*,java.util.*"
%><%
   String contextPath = request.getContextPath();
   long ticket = System.currentTimeMillis();
   StringWriter wr = new StringWriter();
   PrintWriter pw = new PrintWriter(wr);

   exception.printStackTrace(new PrintWriter(wr));
   
   String msg = "EXCEPTION:" + "\n";
   msg += "   requesturl: " + request.getRequestURL() + "\n";
   msg += "   querystring: " + request.getQueryString() + "\n";
   msg += "   method: " + request.getMethod() + "\n";
   msg += "   user: " + request.getRemoteUser()  + "\n";
   msg += wr.toString();
%>
<%!
   /** the date + time long format */
   private static final SimpleDateFormat DATE_TIME_FORMAT =
      new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
   
   /**
    * Creates String.from given long according to dd-MM-yyyy HH:mm:ss
    * @param date the date to format
    * @return Datestring
    */
   public static String getDateTimeString(long date) {
      return DATE_TIME_FORMAT.format(new Date(date));
   }
%>

<html>
<head>
	<meta name="robots" content="index,follow" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta http-equiv="expires" content="-1">
	<script type="text/javascript" src="<%=contextPath%>/natmm/scripts/milonic_src.js"></script>
   <param copyright="JavaScript Menu by Milonic" value="http://www.milonic.com/"></param>
	<script type="text/javascript">
		_d.write("<scr"+"ipt language=JavaScript src=<%=contextPath%>/natmm/scripts/mmenudom.js><\/scr"+"ipt>"); 
	</script>
	<script type="text/javascript" src="<%=contextPath%>/404/menu-bovenkant.js"></script>
	
	<title>Natuurmonumenten - Sorry, er is iets mis gegaan</title>
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
	<link rel="stylesheet" type="text/css" href="<%=contextPath%>/natmm/hoofdsite/themas/main.css"/>
	<link rel="stylesheet" type="text/css" href="<%=contextPath%>/natmm/hoofdsite/themas/default.css" />
   <script type="text/javascript">
      function showError() {
         var errorDisplay = document.getElementById('errordiv').style.display;
         if (errorDisplay =='none') {
            document.getElementById('errordiv').style.display='block';
         }
         else {
            document.getElementById('errordiv').style.display='none';
         }
      }
</script>
</head>
<body style="margin:0;">
<div style="position:relative; width:100%;">
   <table width="100%" border="0" cellspacing="0" cellpadding="0" align="center" valign="top">
   <tr>
   <td style="width:48%" class="maincolor" style=""></td>
   <td style="width:744px;height:21px:" class="maincolor" style=""><img src="<%=contextPath%>/natmm/media/trans.gif" width="744px" height="21" border="0" alt=""></td>
   <td style="width:48%;text-align:center;" class="maincolor" style=""></td>

</tr>
<tr>
   <td style="width:48%;background-color:#0076b9"></td>
   <td style="width:744px;height:68px;background-color: #c6d5ec;"><div style="background-color: #c6d5ec;">     
   <table width="744" border="0" cellspacing="0" cellpadding="0" background="<%=contextPath%>/natmm/media/bgtab_ho_light.gif" style="background-color: #c6d5ec;"> 
      <tr>
         <td style="width:523;height:68;vertical-align:bottom;padding-bottom:6px;">
            <span style="font-size:16px;color:#FFFFFF;margin:0px 0px 5px 0px; font-weight: normal;">Natuurmonumenten.</span>
            <span style="font-size:16px;color:#FFFFFF;margin:0px 0px 5px 0px;">Als je van Nederland houdt.</span>
         </td>

         <td width="220" align="right" valign="top" >
      </td></tr>
      </table></div>
   </td>
   <td style="width:48%;background-color:#c6d5ec;vertical-align:bottom;">
   </td>
</tr>
<tr>
   <td style="width:48%"></td>
   <td style="text-align:left; vertical-align:top; width:744;height:157px;padding-bottom:1px;"> 
         <img src="<%=contextPath%>/404/pano_error_pagina.jpg" border="0"></td>

   <td style="width:48%" rowspan="2" valign="top">
   <img src="<%=contextPath%>/natmm/media/natmm_logo_rgb1.gif" width="159" height="216" style="padding:0;">
   </td>
</tr>
<tr>
   <td style="width:48%"></td>
   <td style="width:744px;padding-bottom:1px;">

<table width="744" border="0" cellspacing="0" cellpadding="0" align="center" valign="top">
<tr>
   <td style="vertical-align:top;width:374px;padding:10px;padding-top:0px"><br/>

<p style="font-size:14px;color:#1D1E94;margin:0px 0px 5px 0px; font-weight: bold;">Error 500: Sorry, er is iets mis gegaan</p>
&nbsp;<br />
<p>Er is een serverfoutopgetreden bij het opvragen van uw pagina. Onze excuses voor het ongemak.</p>
&nbsp;<br />
Hier zijn een paar tips om de pagina alsnog te vinden:<br />
&bull; Als u handmatig een domeinadres hebt ingevuld, kijk of deze wel helemaal klopt <br />
&bull; Gebruik de terug knop van uw browser om terug te gaan naar de vorige pagina en probeer de link nog eens <br />
&bull; Gebruik onze zoekfunctie onderaan de pagina door een paar kernwoorden in te vullen <br />
&bull; Gebruik onze navigatiebalk om de pagina alsnog te vinden <br />
&bull; Probeer het later nog eens, de pagina kan tijdelijk niet beschikbaar zijn <br />
&nbsp;<br />
Als bovenstaande tips niet helpen zouden wij het erg op prijs stellen als u de link die u probeerde te bereiken mailt naar <a href="mailto:webredactie@natuurmonumenten.nl?Subject=Error 500: Sorry, er is iets mis gegaan">webredactie@natuurmonumenten.nl</a>.<br />
Alvast bedankt. <br />

&nbsp;<br />

<p>
   <a href="javascript:showError();"><b>Toon technische informatie</b></a><br/>
</p>
<div id="errordiv" style="display:none">
<pre>
<%= getDateTimeString(ticket) %>
<%= msg %>
</pre>

</div>
</table>
</div>
</td>
</tr>
</table>

<form action="<%=contextPath%>/zoek/zoek.htm" style="margin:0px 0px 0px 0px">
<table style="line-height:90%;width:744;" border="0" cellspacing="0" cellpadding="0" align="center" valign="top">
   <tr>
      <td class="footer" style="width:544;">
         &nbsp;&copy 2008 Natuurmonumenten
              &nbsp;&nbsp;|&nbsp;&nbsp; 
              <a href="<%=contextPath%>/mededelingen/fotografie.htm" class="footerlinks">Fotografie</a>

              &nbsp;&nbsp;|&nbsp;&nbsp; 
              <a href="<%=contextPath%>/mededelingen/privacy.htm" class="footerlinks">Privacy</a>
              &nbsp;&nbsp;|&nbsp;&nbsp; 
              <a href="<%=contextPath%>/mededelingen/lid_worden.htm" class="footerlinks">Lid worden</a>
      </td>
         <input type="hidden" name="offset" value="0"/>
         <input type="hidden" name="pcontentype" value="0"/>
         <td width="196">

            <table cellspacing="0" cellpadding="0">
               <tr>
                  <td class="footerzoektext"><input type="submit" value="ZOEKEN" style="height:16px;border:0;color:#FFFFFF;background-color:#1D1E94;text-align:left;padding-left:10px;font-weight:bold;font-size:0.9em;" /></td>
                  <td class="footerzoekbox"><input type="text" name="query_frm" style="width:100%;height:14px;font-size:12px;border:none;" value=""></td>
                  <td class="footerzoekbox"><input type="image" src="<%=contextPath%>/natmm/media/submit_default.gif" alt="ZOEK" align="middle" border="0"></td>
               </tr>
            </table>
         </td>
   </tr>
   </table>
   </form>
<br/>
</div>
</body>

<!-- Begin Sitestat4 code -->
<script type="text/javascript">
<!--
function sitestat(ns_l){
   ns_l+="&ns__t="+new Date().getTime();ns_pixelUrl=ns_l;
   if(document.images){ns_1=new Image();ns_1.src=ns_l;}else
   document.write("<img src="+ns_l+" width=1 height=1>");
}
sitestat("http://nl.sitestat.com/natuurmonumenten/natuurmonumenten/s?natuurmonumenten.404");
//-->
</script>
<noscript>
<img src="http://nl.sitestat.com/natuurmonumenten/natuurmonumenten/s?natuurmonumenten.404" width=1 height=1>
</noscript>
<!-- End Sitestat4 code -->

</html>