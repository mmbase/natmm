//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.27 at 04:59:29 PM MSD 
//


package nl.leocms.connectors.UISconnector.input.customers.model;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/D:/JAVA/WSDP/16/jaxb/bin/Untitled3.xsd line 34)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bankAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="giroAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isMember" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactPersonId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface CommonInformationType {


    /**
     * Gets the value of the contactPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getContactPersonId();

    /**
     * Sets the value of the contactPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setContactPersonId(java.lang.String value);

    /**
     * Gets the value of the giroAccount property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getGiroAccount();

    /**
     * Sets the value of the giroAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setGiroAccount(java.lang.String value);

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCustomerId();

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCustomerId(java.lang.String value);

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getBankAccount();

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setBankAccount(java.lang.String value);

    /**
     * Gets the value of the isMember property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getIsMember();

    /**
     * Sets the value of the isMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setIsMember(java.lang.String value);

}