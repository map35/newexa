//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.28 at 04:01:46 PM WIB 
//


package com.twscoba.twscoba.newstub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenutupanRekDasarTabberResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PenutupanRekDasarTabberResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNTCLOSUREType" type="{T24WebServicesImpl}ACCOUNTCLOSUREType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenutupanRekDasarTabberResponse", propOrder = {
    "status",
    "accountclosureType"
})
public class PenutupanRekDasarTabberResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "ACCOUNTCLOSUREType")
    protected ACCOUNTCLOSUREType accountclosureType;

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
     * Gets the value of the accountclosureType property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTCLOSUREType }
     *     
     */
    public ACCOUNTCLOSUREType getACCOUNTCLOSUREType() {
        return accountclosureType;
    }

    /**
     * Sets the value of the accountclosureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTCLOSUREType }
     *     
     */
    public void setACCOUNTCLOSUREType(ACCOUNTCLOSUREType value) {
        this.accountclosureType = value;
    }

}
