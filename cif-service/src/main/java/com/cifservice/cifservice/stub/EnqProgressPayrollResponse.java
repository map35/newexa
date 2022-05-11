//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.10 at 10:25:48 AM WIB 
//


package com.cifservice.cifservice.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnqProgressPayrollResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnqProgressPayrollResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/&gt;
 *         &lt;element name="JOBPROGRESSPAYROLLType" type="{T24WebServicesImpl}JOBPROGRESSPAYROLLType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnqProgressPayrollResponse", propOrder = {
    "status",
    "jobprogresspayrollType"
})
public class EnqProgressPayrollResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "JOBPROGRESSPAYROLLType")
    protected List<JOBPROGRESSPAYROLLType> jobprogresspayrollType;

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
     * Gets the value of the jobprogresspayrollType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobprogresspayrollType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJOBPROGRESSPAYROLLType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JOBPROGRESSPAYROLLType }
     * 
     * 
     */
    public List<JOBPROGRESSPAYROLLType> getJOBPROGRESSPAYROLLType() {
        if (jobprogresspayrollType == null) {
            jobprogresspayrollType = new ArrayList<JOBPROGRESSPAYROLLType>();
        }
        return this.jobprogresspayrollType;
    }

}
