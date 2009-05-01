<?xml version="1.0" encoding="utf-8"?>
<!--
   Stylesheet for customizing the stylesheet of the edit wizards.

   Author: yigal
   Created: 25-07-2003
   Version: $Revision: 1.1 $, $Date: 2006-03-05 21:46:44 $
-->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

   <!-- Import original stylesheet -->
   <xsl:import href="ew:xsl/base.xsl"/>

  <xsl:variable name="imagesize">+s(50x50)</xsl:variable>

  <xsl:variable name="mediadir"><xsl:value-of select="$templatedir"/>media/</xsl:variable>

  <xsl:template name="colorstyle">
    <link rel="stylesheet" type="text/css" href="{$templatedir}/style/color/base.css" />
  </xsl:template>

  <xsl:variable name="searchagetype">none</xsl:variable>

</xsl:stylesheet>