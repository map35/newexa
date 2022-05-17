//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.12 at 03:47:20 PM WIB 
//


package com.accservice.accservice.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenAccountMudharabah complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenAccountMudharabah"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebRequestCommon" type="{T24WebServicesImpl}webRequestCommon" minOccurs="0"/&gt;
 *         &lt;element name="OfsFunction" type="{T24WebServicesImpl}ofsFunction" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNTIDIACMUDOPENR2TWSType" type="{T24WebServicesImpl}ACCOUNTIDIACMUDOPENR2TWSType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenAccountMudharabah", propOrder = {
    "webRequestCommon",
    "ofsFunction",
    "accountidiacmudopenr2TWSType"
})
public class OpenAccountMudharabah {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "OfsFunction")
    protected OfsFunction ofsFunction;
    @XmlElement(name = "ACCOUNTIDIACMUDOPENR2TWSType")
    protected ACCOUNTIDIACMUDOPENR2TWSType accountidiacmudopenr2TWSType;

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
     * Gets the value of the accountidiacmudopenr2TWSType property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTIDIACMUDOPENR2TWSType }
     *     
     */
    public ACCOUNTIDIACMUDOPENR2TWSType getACCOUNTIDIACMUDOPENR2TWSType() {
        return accountidiacmudopenr2TWSType;
    }

    /**
     * Sets the value of the accountidiacmudopenr2TWSType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTIDIACMUDOPENR2TWSType }
     *     
     */
    public void setACCOUNTIDIACMUDOPENR2TWSType(ACCOUNTIDIACMUDOPENR2TWSType value) {
        this.accountidiacmudopenr2TWSType = value;
    }

}
