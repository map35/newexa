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
 * <p>Java class for UpdateCustTWS_ValidateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCustTWS_ValidateResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMERType" type="{T24WebServicesImpl}CUSTOMERType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCustTWS_ValidateResponse", propOrder = {
    "status",
    "customerType"
})
public class UpdateCustTWSValidateResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "CUSTOMERType")
    protected CUSTOMERType customerType;

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
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMERType }
     *     
     */
    public CUSTOMERType getCUSTOMERType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMERType }
     *     
     */
    public void setCUSTOMERType(CUSTOMERType value) {
        this.customerType = value;
    }

}
