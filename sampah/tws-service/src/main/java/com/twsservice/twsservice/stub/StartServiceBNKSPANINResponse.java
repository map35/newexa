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
 * <p>Java class for StartServiceBNKSPANINResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StartServiceBNKSPANINResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/&gt;
 *         &lt;element name="TSASERVICEType" type="{T24WebServicesImpl}TSASERVICEType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartServiceBNKSPANINResponse", propOrder = {
    "status",
    "tsaserviceType"
})
public class StartServiceBNKSPANINResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "TSASERVICEType")
    protected TSASERVICEType tsaserviceType;

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
     * Gets the value of the tsaserviceType property.
     * 
     * @return
     *     possible object is
     *     {@link TSASERVICEType }
     *     
     */
    public TSASERVICEType getTSASERVICEType() {
        return tsaserviceType;
    }

    /**
     * Sets the value of the tsaserviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSASERVICEType }
     *     
     */
    public void setTSASERVICEType(TSASERVICEType value) {
        this.tsaserviceType = value;
    }

}
