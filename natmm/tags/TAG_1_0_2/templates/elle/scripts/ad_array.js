//<!--
	var elle_seasn			=	document.elle_ad_attr.elle_season.value;
	var elle_design			=	document.elle_ad_attr.elle_designer.value;
	var elle_phottype		=	document.elle_ad_attr.elle_phototype.value;
	var elle_modl			=	document.elle_ad_attr.elle_model.value;
	var elle_celeb			=	document.elle_ad_attr.elle_celebrity.value;
	var elle_pgnum			= 	document.elle_ad_attr.elle_page_number.value;
	var elle_pgtype			= 	document.elle_ad_attr.elle_pagetype.value;
	var elle_article_id		= 	document.elle_ad_attr.elle_article.value;
	var elley 				= 	document.elle_ad_attr.elle_section.value;
	var elle_sectionarray = new Array();
		elle_sectionarray[0] = "home;sect=home";
		elle_sectionarray[1] = "home;sect=home";
		elle_sectionarray[2] = "subscribe;sect=subscribe";
		elle_sectionarray[3] = "fashion;sect=fashion";
		elle_sectionarray[4] = "fashion;sect=features";
		elle_sectionarray[5] = "shop;sect=shop";
		elle_sectionarray[6] = "fashion;sect=video";
		elle_sectionarray[7] = "fashion;sect=essentials";
		elle_sectionarray[8] = "runway;sect=runway";
		elle_sectionarray[9] = "runway;sect=collections";
		elle_sectionarray[10] = "runway;sect=backstagephotos";
		elle_sectionarray[11] = "runway;sect=detailphotos";
		elle_sectionarray[12] = "runway;sect=trends";
		elle_sectionarray[13] = "beauty;sect=beauty";
		elle_sectionarray[14] = "beauty;sect=features";
		elle_sectionarray[15] = "beauty;sect=top5";
		elle_sectionarray[16] = "beauty;sect=projectrunway";
		elle_sectionarray[17] = "beauty;sect=essentials";
		elle_sectionarray[18] = "realstyle;sect=realstyle";
		elle_sectionarray[19] = "realstyle;sect=globalbuzz";
		elle_sectionarray[20] = "fashion;sect=streetchic";
		elle_sectionarray[21] = "realstyle;sect=editorspicks";
		elle_sectionarray[22] = "realstyle;sect=essentials";
		elle_sectionarray[23] = "astrology;sect=astrology";
		elle_sectionarray[24] = "astrology;sect=yourforecast";
		elle_sectionarray[25] = "astrology;sect=numerology";
		elle_sectionarray[26] = "astrology;sect=lovechart";
		elle_sectionarray[27] = "astrology;sect=qa";
		elle_sectionarray[28] = "astrology;sect=stylestars";
		elle_sectionarray[29] = "books;sect=readerscorner";
		elle_sectionarray[30] = "books;sect=newreleases";
		elle_sectionarray[31] = "astrology;sect=weeklyforecast";
		elle_sectionarray[32] = "astrology;sect=birthday";
		elle_sectionarray[33] = "inthemagazine;sect=inthemagazine";
		elle_sectionarray[34] = "inthemagazine;sect=coverstory";
		elle_sectionarray[35] = "inthemagazine;sect=coverfullstory";
		elle_sectionarray[36] = "inthemagazine;sect=featurestory";
		elle_sectionarray[37] = "inthemagazine;sect=featurefullstory";
		elle_sectionarray[38] = "promosevents;sect=promosevents";
		elle_sectionarray[39] = "forums;sect=forums";
		elle_sectionarray[40] = "newsletter;sect=newsletter";
		elle_sectionarray[41] = "aboutus;sect=aboutus";
		elle_sectionarray[42] = "elleworldwide;sect=elleworldwide";
		elle_sectionarray[43] = "search;sect=search";
		elle_sectionarray[44] = "sweepstakes;sect=sweepstakes";
		elle_sectionarray[45] = "inthemagazine;sect=bookclub";
		elle_sectionarray[46] = "inthemagazine;sect=recovered";
		elle_sectionarray[47] = "miscellaneous;sect=recovered";
		elle_sectionarray[48] = "other;sect=other";
		elle_sectionarray[49] = "other;sect=withsky";
		elle_sectionarray[50] = "other;sect=nosky";
		elle_sectionarray[51] = "newsemail;sect=newsemail";
		elle_sectionarray[52] = "thinktank;sect=thinktank";
		elle_sectionarray[53] = "runway;sect=beautytrends";
		elle_sectionarray[54] = "runway;sect=fashiontrends";
		elle_sectionarray[55] = "popupflash;sect=popupflash";
		elle_sectionarray[56] = "special;sect=special";
		elle_sectionarray[57] = "runway;sect=imgpopup_collections";
		elle_sectionarray[58] = "runway;sect=imgpopup_backstage";
		elle_sectionarray[59] = "runway;sect=imgpopup_detail";
		elle_sectionarray[60] = "runway;sect=swfpopup_collections";
		elle_sectionarray[61] = "runway;sect=swfpopup_backstage";
		elle_sectionarray[62] = "runway;sect=swfpopup_detail";
		elle_sectionarray[63] = "fashion;sect=shoppopup";
		elle_sectionarray[64] = "shop;sect=accessories";
		elle_sectionarray[65] = "shop;sect=guide";
		elle_sectionarray[66] = "shop;sect=guidecategory";
		elle_sectionarray[67] = "shop;sect=sponsoredshops";
		elle_sectionarray[68] = "beauty;sect=seasonaltrend";
		elle_sectionarray[69] = "beauty;sect=interpersonal";
		elle_sectionarray[70] = "runway;sect=seasonindex";
		elle_sectionarray[71] = "runway;sect=inspiration";
		elle_sectionarray[72] = "runway;sect=video";
		elle_sectionarray[73] = "runway;sect=ep_bestbeauty";
		elle_sectionarray[74] = "runway;sect=ep_topaccessory";
		elle_sectionarray[75] = "runway;sect=ep_topcollection";
		elle_sectionarray[76] = "runway;sect=ep_topmodels";
		elle_sectionarray[77] = "runway;sect=seasonwrapup";
		elle_sectionarray[78] = "fashion;sect=redcarpetlanding";
		elle_sectionarray[79] = "fashion;sect=redcarpetevent";
		elle_sectionarray[80] = "fashion;sect=globalfashion";
		elle_sectionarray[81] = "fashion;sect=trendreport";
		elle_sectionarray[82] = "fashion;sect=acctrendreport";
		elle_sectionarray[83] = "fashion;sect=runwaypoll";
		elle_sectionarray[84] = "fashion;sect=editorspicks";
		elle_sectionarray[85] = "shop;sect=indisponsoredshops";
		elle_sectionarray[86] = "shop;sect=shopaholic";
		elle_sectionarray[87] = "shop;sect=accindistories";
		elle_sectionarray[88] = "shop;sect=interpersonalshop";
		elle_sectionarray[89] = "inthemagazine;sect=bookclubint";
		elle_sectionarray[90] = "sponsorby;sect=bali";
		elle_sectionarray[91] = "shop;sect=elleaccessoriesgrid";
		elle_sectionarray[92] = "shop;sect=elleaccgridpopupimgs";
		elle_sectionarray[93] = "inthemagazine;sect=askejean";
		elle_sectionarray[94] = "fashion;sect=weekinfashion";
		elle_sectionarray[95] = "tba;sect=95";
		elle_sectionarray[96] = "tba;sect=96";
		elle_sectionarray[97] = "tba;sect=97";
		elle_sectionarray[98] = "tba;sect=98";
		elle_sectionarray[99] = "tba;sect=99";
		
	var	elle_section 	= elle_sectionarray[elley]
	var tag_vars	= elle_section + ";article=" + elle_article_id + ";pagetype=" + elle_pgtype + ";pagenumber=" + elle_pgnum + ";season=" + elle_seasn + ";designer=" + elle_design + ";phototype=" + elle_phottype + ";model=" + elle_modl + ";celebrity=" + elle_celeb + ";";
//-->
