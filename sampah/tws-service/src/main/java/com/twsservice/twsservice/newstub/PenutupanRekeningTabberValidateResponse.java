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
 * <p>Java class for PenutupanRekeningTabber_ValidateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PenutupanRekeningTabber_ValidateResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/&gt;
 *         &lt;element name="AZACCOUNTType" type="{T24WebServicesImpl}AZACCOUNTType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenutupanRekeningTabber_ValidateResponse", propOrder = {
    "status",
    "azaccountType"
})
public class PenutupanRekeningTabberValidateResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "AZACCOUNTType")
    protected AZACCOUNTType azaccountType;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the azaccountType property.
     * 
     * @return
     *     possible object is
     *     {@link AZACCOUNTType }
     *     
     */
    public AZACCOUNTType getAZACCOUNTType() {
        return azaccountType;
    }

    /**
     * Sets the value of the azaccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AZACCOUNTType }
     *     
     */
    public void setAZACCOUNTType(AZACCOUNTType value) {
        this.azaccountType = value;
    }

}
