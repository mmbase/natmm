//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.27 at 04:59:29 PM MSD 
//


package nl.leocms.connectors.UISconnector.input.customers.model.impl;

public class PropertyValueTypeImpl implements nl.leocms.connectors.UISconnector.input.customers.model.PropertyValueType, com.sun.xml.bind.JAXBObject, nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.UnmarshallableObject, nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.XMLSerializable, nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.ValidatableObject
{

    protected java.lang.String _PropertyValueDescription;
    protected java.lang.String _PropertyValueId;
    public final static java.lang.Class version = (nl.leocms.connectors.UISconnector.input.customers.model.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (nl.leocms.connectors.UISconnector.input.customers.model.PropertyValueType.class);
    }

    public java.lang.String getPropertyValueDescription() {
        return _PropertyValueDescription;
    }

    public void setPropertyValueDescription(java.lang.String value) {
        _PropertyValueDescription = value;
    }

    public java.lang.String getPropertyValueId() {
        return _PropertyValueId;
    }

    public void setPropertyValueId(java.lang.String value) {
        _PropertyValueId = value;
    }

    public nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.UnmarshallingEventHandler createUnmarshaller(nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.UnmarshallingContext context) {
        return new nl.leocms.connectors.UISconnector.input.customers.model.impl.PropertyValueTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "propertyValueId");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _PropertyValueId), "PropertyValueId");
        } catch (java.lang.Exception e) {
            nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        context.startElement("", "propertyValueDescription");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _PropertyValueDescription), "PropertyValueDescription");
        } catch (java.lang.Exception e) {
            nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
    }

    public void serializeAttributes(nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (nl.leocms.connectors.UISconnector.input.customers.model.PropertyValueType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000!com.sun.msv.grammar.InterleaveExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom."
+"sun.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/g"
+"rammar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expres"
+"sion\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L"
+"\u0000\u000bexpandedExpq\u0000~\u0000\u0002xpppsr\u0000\'com.sun.msv.grammar.trex.ElementPa"
+"ttern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClas"
+"s;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUnde"
+"claredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sr\u0000\u001fcom.sun.msv"
+".grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\u001bcom.sun.msv.gramm"
+"ar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;"
+"L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003p"
+"psr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwa"
+"ysValidxr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'"
+"com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespa"
+"ceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0014L\u0000\nwhiteSpacet\u0000.Lc"
+"om/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www."
+"w3.org/2001/XMLSchemat\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.W"
+"hiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.dataty"
+"pe.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.gram"
+"mar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.s"
+"un.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0014L\u0000\fnamespa"
+"ceURIq\u0000~\u0000\u0014xpq\u0000~\u0000\u0018q\u0000~\u0000\u0017sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0007xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080"
+"\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\fppsr\u0000\"com.sun.msv.datatype.xsd.Qnam"
+"eType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0011q\u0000~\u0000\u0017t\u0000\u0005QNamesr\u00005com.sun.msv.datatype."
+"xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001aq\u0000~\u0000\u001dsq\u0000~\u0000\u001e"
+"q\u0000~\u0000)q\u0000~\u0000\u0017sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002"
+"L\u0000\tlocalNameq\u0000~\u0000\u0014L\u0000\fnamespaceURIq\u0000~\u0000\u0014xr\u0000\u001dcom.sun.msv.grammar"
+".NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLS"
+"chema-instancesr\u00000com.sun.msv.grammar.Expression$EpsilonExpr"
+"ession\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000$\u0001psq\u0000~\u0000-t\u0000\u000fpropertyValueIdt\u0000\u0000sq"
+"\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\nppq\u0000~\u0000\u000fsq\u0000~\u0000 ppsq\u0000~\u0000\"q\u0000~\u0000%pq\u0000~\u0000&q\u0000~\u0000/q\u0000~\u00003sq\u0000~\u0000"
+"-t\u0000\u0018propertyValueDescriptionq\u0000~\u00007sr\u0000\"com.sun.msv.grammar.Exp"
+"ressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Exp"
+"ressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionP"
+"ool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000"
+"$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u0005\u0001pq\u0000~\u0000\u0005q\u0000~\u0000\u000bq\u0000~\u00009"
+"q\u0000~\u0000!q\u0000~\u0000:x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.UnmarshallingContext context) {
            super(context, "-----");
        }

        protected Unmarshaller(nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return nl.leocms.connectors.UISconnector.input.customers.model.impl.PropertyValueTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("propertyValueDescription" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 1;
                            return ;
                        }
                        if (("propertyValueId" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 3;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        if (("propertyValueId" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 0;
                            return ;
                        }
                        break;
                    case  2 :
                        if (("propertyValueDescription" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 0;
                            return ;
                        }
                        break;
                    case  0 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            state = 4;
                            eatText1(value);
                            return ;
                        case  1 :
                            state = 2;
                            eatText2(value);
                            return ;
                        case  0 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _PropertyValueId = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _PropertyValueDescription = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}