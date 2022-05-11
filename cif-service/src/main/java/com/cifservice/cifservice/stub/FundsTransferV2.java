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
 * <p>Java class for FundsTransferV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundsTransferV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebRequestCommon" type="{T24WebServicesImpl}webRequestCommon" minOccurs="0"/&gt;
 *         &lt;element name="OfsFunction" type="{T24WebServicesImpl}ofsFunction" minOccurs="0"/&gt;
 *         &lt;element name="FUNDSTRANSFERIDIACCTTRFCMSV2Type" type="{T24WebServicesImpl}FUNDSTRANSFERIDIACCTTRFCMSV2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundsTransferV2", propOrder = {
    "webRequestCommon",
    "ofsFunction",
    "fundstransferidiaccttrfcmsv2Type"
})
public class FundsTransferV2 {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "OfsFunction")
    protected OfsFunction ofsFunction;
    @XmlElement(name = "FUNDSTRANSFERIDIACCTTRFCMSV2Type")
    protected FUNDSTRANSFERIDIACCTTRFCMSV2Type fundstransferidiaccttrfcmsv2Type;

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
     * Gets the value of the fundstransferidiaccttrfcmsv2Type property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERIDIACCTTRFCMSV2Type }
     *     
     */
    public FUNDSTRANSFERIDIACCTTRFCMSV2Type getFUNDSTRANSFERIDIACCTTRFCMSV2Type() {
        return fundstransferidiaccttrfcmsv2Type;
    }

    /**
     * Sets the value of the fundstransferidiaccttrfcmsv2Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERIDIACCTTRFCMSV2Type }
     *     
     */
    public void setFUNDSTRANSFERIDIACCTTRFCMSV2Type(FUNDSTRANSFERIDIACCTTRFCMSV2Type value) {
        this.fundstransferidiaccttrfcmsv2Type = value;
    }

}
