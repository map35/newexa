//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.28 at 04:01:46 PM WIB 
//


package com.twscoba.twscoba.newstub;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACCOUNTIDIMOVCIFTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACCOUNTIDIMOVCIFTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNTTITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gJOINTHOLDER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="JOINTHOLDER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACCOUNTIDIMOVCIFTWSType", propOrder = {
    "customer",
    "category",
    "accounttitle",
    "gjointholder"
})
public class ACCOUNTIDIMOVCIFTWSType {

    @XmlElement(name = "CUSTOMER")
    protected String customer;
    @XmlElement(name = "CATEGORY")
    protected String category;
    @XmlElement(name = "ACCOUNTTITLE")
    protected String accounttitle;
    @XmlElement(name = "gJOINTHOLDER")
    protected ACCOUNTIDIMOVCIFTWSType.GJOINTHOLDER gjointholder;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMER() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMER(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORY(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the accounttitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTTITLE() {
        return accounttitle;
    }

    /**
     * Sets the value of the accounttitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTTITLE(String value) {
        this.accounttitle = value;
    }

    /**
     * Gets the value of the gjointholder property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTIDIMOVCIFTWSType.GJOINTHOLDER }
     *     
     */
    public ACCOUNTIDIMOVCIFTWSType.GJOINTHOLDER getGJOINTHOLDER() {
        return gjointholder;
    }

    /**
     * Sets the value of the gjointholder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTIDIMOVCIFTWSType.GJOINTHOLDER }
     *     
     */
    public void setGJOINTHOLDER(ACCOUNTIDIMOVCIFTWSType.GJOINTHOLDER value) {
        this.gjointholder = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="JOINTHOLDER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "jointholder"
    })
    public static class GJOINTHOLDER {

        @XmlElement(name = "JOINTHOLDER")
        protected List<String> jointholder;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the jointholder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jointholder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJOINTHOLDER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getJOINTHOLDER() {
            if (jointholder == null) {
                jointholder = new ArrayList<String>();
            }
            return this.jointholder;
        }

        /**
         * Gets the value of the g property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getG() {
            return g;
        }

        /**
         * Sets the value of the g property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setG(BigInteger value) {
            this.g = value;
        }

    }

}
