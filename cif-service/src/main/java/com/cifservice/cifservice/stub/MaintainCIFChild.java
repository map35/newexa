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
 * <p>Java class for MaintainCIFChild complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintainCIFChild"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebRequestCommon" type="{T24WebServicesImpl}webRequestCommon" minOccurs="0"/&gt;
 *         &lt;element name="OfsFunction" type="{T24WebServicesImpl}ofsFunction" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMERIDIRETAILCHILDMAINTTWSType" type="{T24WebServicesImpl}CUSTOMERIDIRETAILCHILDMAINTTWSType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintainCIFChild", propOrder = {
    "webRequestCommon",
    "ofsFunction",
    "customeridiretailchildmainttwsType"
})
public class MaintainCIFChild {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "OfsFunction")
    protected OfsFunction ofsFunction;
    @XmlElement(name = "CUSTOMERIDIRETAILCHILDMAINTTWSType")
    protected CUSTOMERIDIRETAILCHILDMAINTTWSType customeridiretailchildmainttwsType;

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
     * Gets the value of the customeridiretailchildmainttwsType property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMERIDIRETAILCHILDMAINTTWSType }
     *     
     */
    public CUSTOMERIDIRETAILCHILDMAINTTWSType getCUSTOMERIDIRETAILCHILDMAINTTWSType() {
        return customeridiretailchildmainttwsType;
    }

    /**
     * Sets the value of the customeridiretailchildmainttwsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMERIDIRETAILCHILDMAINTTWSType }
     *     
     */
    public void setCUSTOMERIDIRETAILCHILDMAINTTWSType(CUSTOMERIDIRETAILCHILDMAINTTWSType value) {
        this.customeridiretailchildmainttwsType = value;
    }

}
