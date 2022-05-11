//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.28 at 03:22:51 PM WIB 
//


package com.twsservice.twsservice.newstub;

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
 * <p>Java class for IDIACCOUNTCMSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIACCOUNTCMSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERORECORDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gIDIACCOUNTCMSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIACCOUNTCMSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACCOUNTTITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CATEGORYNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="POSTINGRESTRICT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESTRICTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="STATUSDORMANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BRANCHNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDIACCOUNTCMSType", propOrder = {
    "zerorecords",
    "gidiaccountcmsDetailType"
})
public class IDIACCOUNTCMSType {

    @XmlElement(name = "ZERORECORDS")
    protected String zerorecords;
    @XmlElement(name = "gIDIACCOUNTCMSDetailType")
    protected IDIACCOUNTCMSType.GIDIACCOUNTCMSDetailType gidiaccountcmsDetailType;

    /**
     * Gets the value of the zerorecords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZERORECORDS() {
        return zerorecords;
    }

    /**
     * Sets the value of the zerorecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZERORECORDS(String value) {
        this.zerorecords = value;
    }

    /**
     * Gets the value of the gidiaccountcmsDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIACCOUNTCMSType.GIDIACCOUNTCMSDetailType }
     *     
     */
    public IDIACCOUNTCMSType.GIDIACCOUNTCMSDetailType getGIDIACCOUNTCMSDetailType() {
        return gidiaccountcmsDetailType;
    }

    /**
     * Sets the value of the gidiaccountcmsDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIACCOUNTCMSType.GIDIACCOUNTCMSDetailType }
     *     
     */
    public void setGIDIACCOUNTCMSDetailType(IDIACCOUNTCMSType.GIDIACCOUNTCMSDetailType value) {
        this.gidiaccountcmsDetailType = value;
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
     *         &lt;element name="mIDIACCOUNTCMSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACCOUNTTITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CATEGORYNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="POSTINGRESTRICT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESTRICTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STATUSDORMANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BRANCHNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "midiaccountcmsDetailType"
    })
    public static class GIDIACCOUNTCMSDetailType {

        @XmlElement(name = "mIDIACCOUNTCMSDetailType")
        protected List<IDIACCOUNTCMSType.GIDIACCOUNTCMSDetailType.MIDIACCOUNTCMSDetailType> midiaccountcmsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midiaccountcmsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midiaccountcmsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIACCOUNTCMSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIACCOUNTCMSType.GIDIACCOUNTCMSDetailType.MIDIACCOUNTCMSDetailType }
         * 
         * 
         */
        public List<IDIACCOUNTCMSType.GIDIACCOUNTCMSDetailType.MIDIACCOUNTCMSDetailType> getMIDIACCOUNTCMSDetailType() {
            if (midiaccountcmsDetailType == null) {
                midiaccountcmsDetailType = new ArrayList<IDIACCOUNTCMSType.GIDIACCOUNTCMSDetailType.MIDIACCOUNTCMSDetailType>();
            }
            return this.midiaccountcmsDetailType;
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
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACCOUNTTITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CATEGORYNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="POSTINGRESTRICT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESTRICTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STATUSDORMANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BRANCHNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "customer",
            "currency",
            "accounttitle1",
            "category",
            "categoryname",
            "postingrestrict",
            "restrictname",
            "statusdormant",
            "cocode",
            "branchname"
        })
        public static class MIDIACCOUNTCMSDetailType {

            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "CUSTOMER")
            protected String customer;
            @XmlElement(name = "CURRENCY")
            protected String currency;
            @XmlElement(name = "ACCOUNTTITLE1")
            protected String accounttitle1;
            @XmlElement(name = "CATEGORY")
            protected String category;
            @XmlElement(name = "CATEGORYNAME")
            protected String categoryname;
            @XmlElement(name = "POSTINGRESTRICT")
            protected String postingrestrict;
            @XmlElement(name = "RESTRICTNAME")
            protected String restrictname;
            @XmlElement(name = "STATUSDORMANT")
            protected String statusdormant;
            @XmlElement(name = "COCODE")
            protected String cocode;
            @XmlElement(name = "BRANCHNAME")
            protected String branchname;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
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
            public void setID(String value) {
                this.id = value;
            }

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
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCURRENCY() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCURRENCY(String value) {
                this.currency = value;
            }

            /**
             * Gets the value of the accounttitle1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTTITLE1() {
                return accounttitle1;
            }

            /**
             * Sets the value of the accounttitle1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTTITLE1(String value) {
                this.accounttitle1 = value;
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
             * Gets the value of the categoryname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCATEGORYNAME() {
                return categoryname;
            }

            /**
             * Sets the value of the categoryname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCATEGORYNAME(String value) {
                this.categoryname = value;
            }

            /**
             * Gets the value of the postingrestrict property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOSTINGRESTRICT() {
                return postingrestrict;
            }

            /**
             * Sets the value of the postingrestrict property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOSTINGRESTRICT(String value) {
                this.postingrestrict = value;
            }

            /**
             * Gets the value of the restrictname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESTRICTNAME() {
                return restrictname;
            }

            /**
             * Sets the value of the restrictname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESTRICTNAME(String value) {
                this.restrictname = value;
            }

            /**
             * Gets the value of the statusdormant property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTATUSDORMANT() {
                return statusdormant;
            }

            /**
             * Sets the value of the statusdormant property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTATUSDORMANT(String value) {
                this.statusdormant = value;
            }

            /**
             * Gets the value of the cocode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOCODE() {
                return cocode;
            }

            /**
             * Sets the value of the cocode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOCODE(String value) {
                this.cocode = value;
            }

            /**
             * Gets the value of the branchname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBRANCHNAME() {
                return branchname;
            }

            /**
             * Sets the value of the branchname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBRANCHNAME(String value) {
                this.branchname = value;
            }

            /**
             * Gets the value of the m property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getM() {
                return m;
            }

            /**
             * Sets the value of the m property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setM(BigInteger value) {
                this.m = value;
            }

        }

    }

}
