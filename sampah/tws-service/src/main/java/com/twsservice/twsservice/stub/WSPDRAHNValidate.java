//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.27 at 10:10:29 AM WIB 
//


package com.twsservice.twsservice.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPDRAHN_Validate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPDRAHN_Validate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebRequestCommon" type="{T24WebServicesImpl}webRequestCommon" minOccurs="0"/&gt;
 *         &lt;element name="OfsFunction" type="{T24WebServicesImpl}ofsFunction" minOccurs="0"/&gt;
 *         &lt;element name="PDPAYMENTDUEIDIRHNTWSType" type="{T24WebServicesImpl}PDPAYMENTDUEIDIRHNTWSType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPDRAHN_Validate", propOrder = {
    "webRequestCommon",
    "ofsFunction",
    "pdpaymentdueidirhntwsType"
})
public class WSPDRAHNValidate {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "OfsFunction")
    protected OfsFunction ofsFunction;
    @XmlElement(name = "PDPAYMENTDUEIDIRHNTWSType")
    protected PDPAYMENTDUEIDIRHNTWSType pdpaymentdueidirhntwsType;

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
     * Gets the value of the pdpaymentdueidirhntwsType property.
     * 
     * @return
     *     possible object is
     *     {@link PDPAYMENTDUEIDIRHNTWSType }
     *     
     */
    public PDPAYMENTDUEIDIRHNTWSType getPDPAYMENTDUEIDIRHNTWSType() {
        return pdpaymentdueidirhntwsType;
    }

    /**
     * Sets the value of the pdpaymentdueidirhntwsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDPAYMENTDUEIDIRHNTWSType }
     *     
     */
    public void setPDPAYMENTDUEIDIRHNTWSType(PDPAYMENTDUEIDIRHNTWSType value) {
        this.pdpaymentdueidirhntwsType = value;
    }

}
