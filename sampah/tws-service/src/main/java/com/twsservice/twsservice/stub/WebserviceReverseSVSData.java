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
 * <p>Java class for WebserviceReverseSVSData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebserviceReverseSVSData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebRequestCommon" type="{T24WebServicesImpl}webRequestCommon" minOccurs="0"/&gt;
 *         &lt;element name="IMDOCUMENTIMAGEREVTWSType" type="{T24WebServicesImpl}transactionId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebserviceReverseSVSData", propOrder = {
    "webRequestCommon",
    "imdocumentimagerevtwsType"
})
public class WebserviceReverseSVSData {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "IMDOCUMENTIMAGEREVTWSType")
    protected TransactionId imdocumentimagerevtwsType;

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
     * Gets the value of the imdocumentimagerevtwsType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionId }
     *     
     */
    public TransactionId getIMDOCUMENTIMAGEREVTWSType() {
        return imdocumentimagerevtwsType;
    }

    /**
     * Sets the value of the imdocumentimagerevtwsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionId }
     *     
     */
    public void setIMDOCUMENTIMAGEREVTWSType(TransactionId value) {
        this.imdocumentimagerevtwsType = value;
    }

}
