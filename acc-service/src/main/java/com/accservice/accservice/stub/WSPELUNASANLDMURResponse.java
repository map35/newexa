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
 * <p>Java class for WSPELUNASANLDMURResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPELUNASANLDMURResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/&gt;
 *         &lt;element name="LDLOANSANDDEPOSITSType" type="{T24WebServicesImpl}LDLOANSANDDEPOSITSType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPELUNASANLDMURResponse", propOrder = {
    "status",
    "ldloansanddepositsType"
})
public class WSPELUNASANLDMURResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "LDLOANSANDDEPOSITSType")
    protected LDLOANSANDDEPOSITSType ldloansanddepositsType;

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
     * Gets the value of the ldloansanddepositsType property.
     * 
     * @return
     *     possible object is
     *     {@link LDLOANSANDDEPOSITSType }
     *     
     */
    public LDLOANSANDDEPOSITSType getLDLOANSANDDEPOSITSType() {
        return ldloansanddepositsType;
    }

    /**
     * Sets the value of the ldloansanddepositsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDLOANSANDDEPOSITSType }
     *     
     */
    public void setLDLOANSANDDEPOSITSType(LDLOANSANDDEPOSITSType value) {
        this.ldloansanddepositsType = value;
    }

}
