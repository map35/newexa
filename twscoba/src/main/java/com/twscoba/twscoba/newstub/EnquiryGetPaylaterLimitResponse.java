//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.28 at 04:01:46 PM WIB 
//


package com.twscoba.twscoba.newstub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnquiryGetPaylaterLimitResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnquiryGetPaylaterLimitResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/&gt;
 *         &lt;element name="ATIENCUSPAYLATERSUMTWSType" type="{T24WebServicesImpl}ATIENCUSPAYLATERSUMTWSType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnquiryGetPaylaterLimitResponse", propOrder = {
    "status",
    "atiencuspaylatersumtwsType"
})
public class EnquiryGetPaylaterLimitResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "ATIENCUSPAYLATERSUMTWSType")
    protected List<ATIENCUSPAYLATERSUMTWSType> atiencuspaylatersumtwsType;

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
     * Gets the value of the atiencuspaylatersumtwsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atiencuspaylatersumtwsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATIENCUSPAYLATERSUMTWSType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATIENCUSPAYLATERSUMTWSType }
     * 
     * 
     */
    public List<ATIENCUSPAYLATERSUMTWSType> getATIENCUSPAYLATERSUMTWSType() {
        if (atiencuspaylatersumtwsType == null) {
            atiencuspaylatersumtwsType = new ArrayList<ATIENCUSPAYLATERSUMTWSType>();
        }
        return this.atiencuspaylatersumtwsType;
    }

}
