//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.27 at 04:59:29 PM MSD 
//


package nl.leocms.connectors.UISconnector.input.customers.model;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/D:/JAVA/WSDP/16/jaxb/bin/Untitled3.xsd line 60)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="initials" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telephoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faxNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface PersonalInformationType {


    /**
     * Gets the value of the faxNo property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getFaxNo();

    /**
     * Sets the value of the faxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setFaxNo(java.lang.String value);

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getEmailAddress();

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setEmailAddress(java.lang.String value);

    /**
     * Gets the value of the telephoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getTelephoneNo();

    /**
     * Sets the value of the telephoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setTelephoneNo(java.lang.String value);

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getBirthDate();

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setBirthDate(java.lang.String value);

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getGender();

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setGender(java.lang.String value);

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getFirstName();

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setFirstName(java.lang.String value);

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getInitials();

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setInitials(java.lang.String value);

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getLastName();

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setLastName(java.lang.String value);

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getSuffix();

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setSuffix(java.lang.String value);

}