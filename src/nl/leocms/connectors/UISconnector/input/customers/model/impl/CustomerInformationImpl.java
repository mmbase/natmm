//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.27 at 04:59:29 PM MSD 
//


package nl.leocms.connectors.UISconnector.input.customers.model.impl;

public class CustomerInformationImpl
    extends nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl
    implements nl.leocms.connectors.UISconnector.input.customers.model.CustomerInformation, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.UnmarshallableObject, nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.XMLSerializable, nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (nl.leocms.connectors.UISconnector.input.customers.model.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (nl.leocms.connectors.UISconnector.input.customers.model.CustomerInformation.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "customerInformation";
    }

    public nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.UnmarshallingEventHandler createUnmarshaller(nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.UnmarshallingContext context) {
        return new nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.Unmarshaller(context);
    }

    public void serializeBody(nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "customerInformation");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
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
        return (nl.leocms.connectors.UISconnector.input.customers.model.CustomerInformation.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsr\u0000!com.sun.msv.g"
+"rammar.InterleaveExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000\nppsq\u0000~\u0000\nppsq\u0000~\u0000"
+"\nppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000"
+"\u0000pp\u0000sq\u0000~\u0000\u000fppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004s"
+"r\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.g"
+"rammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq"
+"\u0000~\u0000\u0004q\u0000~\u0000\u0017psr\u00002com.sun.msv.grammar.Expression$AnyStringExpres"
+"sion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0016\u0001psr\u0000 com.sun.msv.grammar.AnyName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001cpsr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000#"
+"xq\u0000~\u0000\u001et\u0000Knl.leocms.connectors.UISconnector.input.customers.m"
+"odel.PersonalInformationt\u0000+http://java.sun.com/jaxb/xjc/dumm"
+"y-elementssq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~"
+"\u0000\u0018q\u0000~\u0000\u0017pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000Onl.leocms.connectors.UISconn"
+"ector.input.customers.model.PersonalInformationTypeq\u0000~\u0000&sq\u0000~"
+"\u0000\u000fppsq\u0000~\u0000\u0018q\u0000~\u0000\u0017psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000"
+"\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000"
+"\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.msv.dataty"
+"pe.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.Buil"
+"tinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Concret"
+"eType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000#L\u0000\btypeNameq\u0000~\u0000#L\u0000\nwhiteSpacet"
+"\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://"
+"www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xs"
+"d.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.dat"
+"atype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gr"
+"ammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004ppsr\u0000\u001bcom"
+".sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000#L\u0000\fnames"
+"paceURIq\u0000~\u0000#xpq\u0000~\u0000<q\u0000~\u0000;sq\u0000~\u0000\"t\u0000\u0004typet\u0000)http://www.w3.org/20"
+"01/XMLSchema-instanceq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0013personalInformationt\u0000\u0000sq\u0000"
+"~\u0000\u000fppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u0018q\u0000~\u0000\u0017pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000"
+"!sq\u0000~\u0000\"t\u0000Knl.leocms.connectors.UISconnector.input.customers."
+"model.BusinessInformationq\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~"
+"\u0000\u000fppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u0018q\u0000~\u0000\u0017pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000Onl.leocm"
+"s.connectors.UISconnector.input.customers.model.BusinessInfo"
+"rmationTypeq\u0000~\u0000&sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0018q\u0000~\u0000\u0017pq\u0000~\u00004q\u0000~\u0000Dq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0013"
+"businessInformationq\u0000~\u0000Isq\u0000~\u0000\u000fppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017"
+"psq\u0000~\u0000\u0018q\u0000~\u0000\u0017pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000Inl.leocms.connectors.UI"
+"Sconnector.input.customers.model.CommonInformationq\u0000~\u0000&sq\u0000~\u0000"
+"\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u0018q\u0000~\u0000\u0017pq\u0000~\u0000\u001bq\u0000"
+"~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000Mnl.leocms.connectors.UISconnector.input.cus"
+"tomers.model.CommonInformationTypeq\u0000~\u0000&sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0018q\u0000~\u0000\u0017pq"
+"\u0000~\u00004q\u0000~\u0000Dq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0011commonInformationq\u0000~\u0000Isq\u0000~\u0000\u000fppsq\u0000~\u0000\u0000p"
+"p\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u0018q\u0000~\u0000\u0017pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000?nl"
+".leocms.connectors.UISconnector.input.customers.model.Addres"
+"sq\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u0018q\u0000"
+"~\u0000\u0017pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000Cnl.leocms.connectors.UISconnecto"
+"r.input.customers.model.AddressTypeq\u0000~\u0000&sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0018q\u0000~\u0000\u0017p"
+"q\u0000~\u00004q\u0000~\u0000Dq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0007addressq\u0000~\u0000Isq\u0000~\u0000\u000fppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fp"
+"psq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u0018q\u0000~\u0000\u0017pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000Dnl.leocms.c"
+"onnectors.UISconnector.input.customers.model.PropertyListq\u0000~"
+"\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u0018q\u0000~\u0000\u0017p"
+"q\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000Hnl.leocms.connectors.UISconnector.in"
+"put.customers.model.PropertyListTypeq\u0000~\u0000&sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0018q\u0000~\u0000\u0017"
+"pq\u0000~\u00004q\u0000~\u0000Dq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\fpropertyListq\u0000~\u0000Isq\u0000~\u0000\u000fppsq\u0000~\u0000\u0018q\u0000~\u0000"
+"\u0017pq\u0000~\u00004q\u0000~\u0000Dq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0013customerInformationq\u0000~\u0000Isr\u0000\"com.su"
+"n.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/su"
+"n/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.gr"
+"ammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamV"
+"ersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000)"
+"\u0001pq\u0000~\u0000\u0012q\u0000~\u0000*q\u0000~\u0000Lq\u0000~\u0000Tq\u0000~\u0000_q\u0000~\u0000gq\u0000~\u0000rq\u0000~\u0000zq\u0000~\u0000\u0085q\u0000~\u0000\u008dq\u0000~\u0000\tq\u0000~"
+"\u0000\fq\u0000~\u0000\u0010q\u0000~\u0000Jq\u0000~\u0000]q\u0000~\u0000pq\u0000~\u0000\u0083q\u0000~\u0000(q\u0000~\u0000Rq\u0000~\u0000eq\u0000~\u0000xq\u0000~\u0000\u008bq\u0000~\u0000\u000eq\u0000~"
+"\u0000\u0015q\u0000~\u0000+q\u0000~\u0000Mq\u0000~\u0000Uq\u0000~\u0000`q\u0000~\u0000hq\u0000~\u0000sq\u0000~\u0000{q\u0000~\u0000\u0086q\u0000~\u0000\u008eq\u0000~\u0000\u000bq\u0000~\u0000/q\u0000~"
+"\u0000Yq\u0000~\u0000lq\u0000~\u0000\u007fq\u0000~\u0000\u0092q\u0000~\u0000\u0096q\u0000~\u0000\rx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(nl.leocms.connectors.UISconnector.input.customers.model.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("customerInformation" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("propertyList" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterElement((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("propertyList" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterElement((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("address" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterElement((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("address" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterElement((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("commonInformation" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterElement((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("commonInformation" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterElement((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("businessInformation" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterElement((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("businessInformation" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterElement((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("personalInformation" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterElement((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("personalInformation" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterElement((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
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
                    case  1 :
                        spawnHandlerFromLeaveElement((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("customerInformation" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
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
                    case  1 :
                        spawnHandlerFromEnterAttribute((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
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
                    case  1 :
                        spawnHandlerFromLeaveAttribute((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
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
                        case  1 :
                            spawnHandlerFromText((((nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationTypeImpl)nl.leocms.connectors.UISconnector.input.customers.model.impl.CustomerInformationImpl.this).new Unmarshaller(context)), 2, value);
                            return ;
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
