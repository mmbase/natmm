//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.27 at 04:59:29 PM MSD 
//


package nl.leocms.connectors.UISconnector.input.customers.model;


/**
 * Java content class for address element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/D:/JAVA/WSDP/16/jaxb/bin/Untitled3.xsd line 6)
 * <p>
 * <pre>
 * &lt;element name="address">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;all>
 *           &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="addressType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="houseNumberExtension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="extraInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/all>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface Address
    extends javax.xml.bind.Element, nl.leocms.connectors.UISconnector.input.customers.model.AddressType
{


}