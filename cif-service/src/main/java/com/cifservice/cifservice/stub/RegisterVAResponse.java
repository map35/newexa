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
 * <p>Java class for RegisterVAResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterVAResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/&gt;
 *         &lt;element name="IDIHVIRTUALACCOUNTType" type="{T24WebServicesImpl}IDIHVIRTUALACCOUNTType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterVAResponse", propOrder = {
    "status",
    "idihvirtualaccountType"
})
public class RegisterVAResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "IDIHVIRTUALACCOUNTType")
    protected IDIHVIRTUALACCOUNTType idihvirtualaccountType;

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
     * Gets the value of the idihvirtualaccountType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIHVIRTUALACCOUNTType }
     *     
     */
    public IDIHVIRTUALACCOUNTType getIDIHVIRTUALACCOUNTType() {
        return idihvirtualaccountType;
    }

    /**
     * Sets the value of the idihvirtualaccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIHVIRTUALACCOUNTType }
     *     
     */
    public void setIDIHVIRTUALACCOUNTType(IDIHVIRTUALACCOUNTType value) {
        this.idihvirtualaccountType = value;
    }

}
