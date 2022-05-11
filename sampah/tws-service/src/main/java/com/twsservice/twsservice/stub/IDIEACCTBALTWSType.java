//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.27 at 10:10:29 AM WIB 
//


package com.twsservice.twsservice.stub;

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
 * <p>Java class for IDIEACCTBALTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIEACCTBALTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BCUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HEADER3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gIDIEACCTBALTWSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIEACCTBALTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="HEADER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="USERDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COMPDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACCOUNTTITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COCODENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WORKBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LOCKAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MINBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="POSTINGRESTRICT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INACTIVMARKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OPENINGDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ALTACCTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "IDIEACCTBALTWSType", propOrder = {
    "bcust",
    "custdisp",
    "header3",
    "gidieacctbaltwsDetailType"
})
public class IDIEACCTBALTWSType {

    @XmlElement(name = "BCUST")
    protected String bcust;
    @XmlElement(name = "CUSTDISP")
    protected String custdisp;
    @XmlElement(name = "HEADER3")
    protected String header3;
    @XmlElement(name = "gIDIEACCTBALTWSDetailType")
    protected IDIEACCTBALTWSType.GIDIEACCTBALTWSDetailType gidieacctbaltwsDetailType;

    /**
     * Gets the value of the bcust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCUST() {
        return bcust;
    }

    /**
     * Sets the value of the bcust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCUST(String value) {
        this.bcust = value;
    }

    /**
     * Gets the value of the custdisp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTDISP() {
        return custdisp;
    }

    /**
     * Sets the value of the custdisp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTDISP(String value) {
        this.custdisp = value;
    }

    /**
     * Gets the value of the header3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHEADER3() {
        return header3;
    }

    /**
     * Sets the value of the header3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHEADER3(String value) {
        this.header3 = value;
    }

    /**
     * Gets the value of the gidieacctbaltwsDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIEACCTBALTWSType.GIDIEACCTBALTWSDetailType }
     *     
     */
    public IDIEACCTBALTWSType.GIDIEACCTBALTWSDetailType getGIDIEACCTBALTWSDetailType() {
        return gidieacctbaltwsDetailType;
    }

    /**
     * Sets the value of the gidieacctbaltwsDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIEACCTBALTWSType.GIDIEACCTBALTWSDetailType }
     *     
     */
    public void setGIDIEACCTBALTWSDetailType(IDIEACCTBALTWSType.GIDIEACCTBALTWSDetailType value) {
        this.gidieacctbaltwsDetailType = value;
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
     *         &lt;element name="mIDIEACCTBALTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="HEADER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="USERDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COMPDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACCOUNTTITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COCODENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WORKBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LOCKAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MINBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="POSTINGRESTRICT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INACTIVMARKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OPENINGDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ALTACCTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "midieacctbaltwsDetailType"
    })
    public static class GIDIEACCTBALTWSDetailType {

        @XmlElement(name = "mIDIEACCTBALTWSDetailType")
        protected List<IDIEACCTBALTWSType.GIDIEACCTBALTWSDetailType.MIDIEACCTBALTWSDetailType> midieacctbaltwsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midieacctbaltwsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midieacctbaltwsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIEACCTBALTWSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIEACCTBALTWSType.GIDIEACCTBALTWSDetailType.MIDIEACCTBALTWSDetailType }
         * 
         * 
         */
        public List<IDIEACCTBALTWSType.GIDIEACCTBALTWSDetailType.MIDIEACCTBALTWSDetailType> getMIDIEACCTBALTWSDetailType() {
            if (midieacctbaltwsDetailType == null) {
                midieacctbaltwsDetailType = new ArrayList<IDIEACCTBALTWSType.GIDIEACCTBALTWSDetailType.MIDIEACCTBALTWSDetailType>();
            }
            return this.midieacctbaltwsDetailType;
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
         *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="HEADER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="USERDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COMPDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACCOUNTTITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COCODENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WORKBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LOCKAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MINBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="POSTINGRESTRICT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INACTIVMARKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OPENINGDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ALTACCTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "acc",
            "header1",
            "userdisp",
            "datedisp",
            "compdisp",
            "customer",
            "accounttitle1",
            "type",
            "ccy",
            "cocodename",
            "workbal",
            "lockamt",
            "minbal",
            "postingrestrict",
            "inactivmarker",
            "openingdate",
            "altacctid",
            "category",
            "cocode",
            "availbal"
        })
        public static class MIDIEACCTBALTWSDetailType {

            @XmlElement(name = "ACC")
            protected String acc;
            @XmlElement(name = "HEADER1")
            protected String header1;
            @XmlElement(name = "USERDISP")
            protected String userdisp;
            @XmlElement(name = "DATEDISP")
            protected String datedisp;
            @XmlElement(name = "COMPDISP")
            protected String compdisp;
            @XmlElement(name = "CUSTOMER")
            protected String customer;
            @XmlElement(name = "ACCOUNTTITLE1")
            protected String accounttitle1;
            @XmlElement(name = "TYPE")
            protected String type;
            @XmlElement(name = "CCY")
            protected String ccy;
            @XmlElement(name = "COCODENAME")
            protected String cocodename;
            @XmlElement(name = "WORKBAL")
            protected String workbal;
            @XmlElement(name = "LOCKAMT")
            protected String lockamt;
            @XmlElement(name = "MINBAL")
            protected String minbal;
            @XmlElement(name = "POSTINGRESTRICT")
            protected String postingrestrict;
            @XmlElement(name = "INACTIVMARKER")
            protected String inactivmarker;
            @XmlElement(name = "OPENINGDATE")
            protected String openingdate;
            @XmlElement(name = "ALTACCTID")
            protected String altacctid;
            @XmlElement(name = "CATEGORY")
            protected String category;
            @XmlElement(name = "COCODE")
            protected String cocode;
            @XmlElement(name = "AVAILBAL")
            protected String availbal;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the acc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACC() {
                return acc;
            }

            /**
             * Sets the value of the acc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACC(String value) {
                this.acc = value;
            }

            /**
             * Gets the value of the header1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHEADER1() {
                return header1;
            }

            /**
             * Sets the value of the header1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHEADER1(String value) {
                this.header1 = value;
            }

            /**
             * Gets the value of the userdisp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUSERDISP() {
                return userdisp;
            }

            /**
             * Sets the value of the userdisp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUSERDISP(String value) {
                this.userdisp = value;
            }

            /**
             * Gets the value of the datedisp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEDISP() {
                return datedisp;
            }

            /**
             * Sets the value of the datedisp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEDISP(String value) {
                this.datedisp = value;
            }

            /**
             * Gets the value of the compdisp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMPDISP() {
                return compdisp;
            }

            /**
             * Sets the value of the compdisp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMPDISP(String value) {
                this.compdisp = value;
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
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the ccy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCCY() {
                return ccy;
            }

            /**
             * Sets the value of the ccy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCCY(String value) {
                this.ccy = value;
            }

            /**
             * Gets the value of the cocodename property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOCODENAME() {
                return cocodename;
            }

            /**
             * Sets the value of the cocodename property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOCODENAME(String value) {
                this.cocodename = value;
            }

            /**
             * Gets the value of the workbal property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWORKBAL() {
                return workbal;
            }

            /**
             * Sets the value of the workbal property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWORKBAL(String value) {
                this.workbal = value;
            }

            /**
             * Gets the value of the lockamt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLOCKAMT() {
                return lockamt;
            }

            /**
             * Sets the value of the lockamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLOCKAMT(String value) {
                this.lockamt = value;
            }

            /**
             * Gets the value of the minbal property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMINBAL() {
                return minbal;
            }

            /**
             * Sets the value of the minbal property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMINBAL(String value) {
                this.minbal = value;
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
             * Gets the value of the inactivmarker property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINACTIVMARKER() {
                return inactivmarker;
            }

            /**
             * Sets the value of the inactivmarker property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINACTIVMARKER(String value) {
                this.inactivmarker = value;
            }

            /**
             * Gets the value of the openingdate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOPENINGDATE() {
                return openingdate;
            }

            /**
             * Sets the value of the openingdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOPENINGDATE(String value) {
                this.openingdate = value;
            }

            /**
             * Gets the value of the altacctid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getALTACCTID() {
                return altacctid;
            }

            /**
             * Sets the value of the altacctid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setALTACCTID(String value) {
                this.altacctid = value;
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
             * Gets the value of the availbal property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAVAILBAL() {
                return availbal;
            }

            /**
             * Sets the value of the availbal property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAVAILBAL(String value) {
                this.availbal = value;
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
