//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.28 at 03:22:51 PM WIB 
//


package com.twsservice.twsservice.newstub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KhasanahkeTeller complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KhasanahkeTeller"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebRequestCommon" type="{T24WebServicesImpl}webRequestCommon" minOccurs="0"/&gt;
 *         &lt;element name="OfsFunction" type="{T24WebServicesImpl}ofsFunction" minOccurs="0"/&gt;
 *         &lt;element name="FUNDSTRANSFERIDIVAULTTOTILLType" type="{T24WebServicesImpl}FUNDSTRANSFERIDIVAULTTOTILLType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KhasanahkeTeller", propOrder = {
    "webRequestCommon",
    "ofsFunction",
    "fundstransferidivaulttotillType"
})
public class KhasanahkeTeller {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "OfsFunction")
    protected OfsFunction ofsFunction;
    @XmlElement(name = "FUNDSTRANSFERIDIVAULTTOTILLType")
    protected FUNDSTRANSFERIDIVAULTTOTILLType fundstransferidivaulttotillType;

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
     * Gets the value of the fundstransferidivaulttotillType property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERIDIVAULTTOTILLType }
     *     
     */
    public FUNDSTRANSFERIDIVAULTTOTILLType getFUNDSTRANSFERIDIVAULTTOTILLType() {
        return fundstransferidivaulttotillType;
    }

    /**
     * Sets the value of the fundstransferidivaulttotillType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERIDIVAULTTOTILLType }
     *     
     */
    public void setFUNDSTRANSFERIDIVAULTTOTILLType(FUNDSTRANSFERIDIVAULTTOTILLType value) {
        this.fundstransferidivaulttotillType = value;
    }

}
