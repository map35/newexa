//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.10 at 10:25:48 AM WIB 
//


package com.cifservice.cifservice.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PembukaanCustomerPerusahaan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PembukaanCustomerPerusahaan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebRequestCommon" type="{T24WebServicesImpl}webRequestCommon" minOccurs="0"/&gt;
 *         &lt;element name="OfsFunction" type="{T24WebServicesImpl}ofsFunction" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMERIDICORPSHORTR1TWSNType" type="{T24WebServicesImpl}CUSTOMERIDICORPSHORTR1TWSNType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PembukaanCustomerPerusahaan", propOrder = {
    "webRequestCommon",
    "ofsFunction",
    "customeridicorpshortr1TWSNType"
})
public class PembukaanCustomerPerusahaan {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "OfsFunction")
    protected OfsFunction ofsFunction;
    @XmlElement(name = "CUSTOMERIDICORPSHORTR1TWSNType")
    protected CUSTOMERIDICORPSHORTR1TWSNType customeridicorpshortr1TWSNType;

    /**
     * Gets the value of the webRequestCommon property.
     * 
     * @return
     *     possible object is
     *     {@link WebRequestCommon }
     *     
     */
    public WebRequestCommon getWebRequestCommon() {
        return webRequestCommon;
    }

    /**
     * Sets the value of the webRequestCommon property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebRequestCommon }
     *     
     */
    public void setWebRequestCommon(WebRequestCommon value) {
        this.webRequestCommon = value;
    }

    /**
     * Gets the value of the ofsFunction property.
     * 
     * @return
     *     possible object is
     *     {@link OfsFunction }
     *     
     */
    public OfsFunction getOfsFunction() {
        return ofsFunction;
    }

    /**
     * Sets the value of the ofsFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfsFunction }
     *     
     */
    public void setOfsFunction(OfsFunction value) {
        this.ofsFunction = value;
    }

    /**
     * Gets the value of the customeridicorpshortr1TWSNType property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMERIDICORPSHORTR1TWSNType }
     *     
     */
    public CUSTOMERIDICORPSHORTR1TWSNType getCUSTOMERIDICORPSHORTR1TWSNType() {
        return customeridicorpshortr1TWSNType;
    }

    /**
     * Sets the value of the customeridicorpshortr1TWSNType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMERIDICORPSHORTR1TWSNType }
     *     
     */
    public void setCUSTOMERIDICORPSHORTR1TWSNType(CUSTOMERIDICORPSHORTR1TWSNType value) {
        this.customeridicorpshortr1TWSNType = value;
    }

}
