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
 * <p>Java class for IDIEAZMUDDEPTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIEAZMUDDEPTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERORECORDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gIDIEAZMUDDEPTWSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIEAZMUDDEPTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRINCIPAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="VALUEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MATURITYDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MUDTENOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MUDBILYET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MUDPRINTEDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INTERESTLIQUACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REPAYACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMINATEDACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MUDNISBAHBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MUDSPCNISBAH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MUDSPCRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MUDNISBAH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ZAKAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AROOPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TAXABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MUDARONISBAH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MUDAROSPCNSB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MUDAROSPCRTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MUDARONSBRTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CREATEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DESCPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "IDIEAZMUDDEPTWSType", propOrder = {
    "zerorecords",
    "gidieazmuddeptwsDetailType"
})
public class IDIEAZMUDDEPTWSType {

    @XmlElement(name = "ZERORECORDS")
    protected String zerorecords;
    @XmlElement(name = "gIDIEAZMUDDEPTWSDetailType")
    protected IDIEAZMUDDEPTWSType.GIDIEAZMUDDEPTWSDetailType gidieazmuddeptwsDetailType;

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
     * Gets the value of the gidieazmuddeptwsDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIEAZMUDDEPTWSType.GIDIEAZMUDDEPTWSDetailType }
     *     
     */
    public IDIEAZMUDDEPTWSType.GIDIEAZMUDDEPTWSDetailType getGIDIEAZMUDDEPTWSDetailType() {
        return gidieazmuddeptwsDetailType;
    }

    /**
     * Sets the value of the gidieazmuddeptwsDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIEAZMUDDEPTWSType.GIDIEAZMUDDEPTWSDetailType }
     *     
     */
    public void setGIDIEAZMUDDEPTWSDetailType(IDIEAZMUDDEPTWSType.GIDIEAZMUDDEPTWSDetailType value) {
        this.gidieazmuddeptwsDetailType = value;
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
     *         &lt;element name="mIDIEAZMUDDEPTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRINCIPAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="VALUEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MATURITYDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MUDTENOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MUDBILYET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MUDPRINTEDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INTERESTLIQUACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REPAYACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMINATEDACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MUDNISBAHBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MUDSPCNISBAH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MUDSPCRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MUDNISBAH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ZAKAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AROOPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TAXABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MUDARONISBAH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MUDAROSPCNSB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MUDAROSPCRTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MUDARONSBRTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CREATEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DESCPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "midieazmuddeptwsDetailType"
    })
    public static class GIDIEAZMUDDEPTWSDetailType {

        @XmlElement(name = "mIDIEAZMUDDEPTWSDetailType")
        protected List<IDIEAZMUDDEPTWSType.GIDIEAZMUDDEPTWSDetailType.MIDIEAZMUDDEPTWSDetailType> midieazmuddeptwsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midieazmuddeptwsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midieazmuddeptwsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIEAZMUDDEPTWSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIEAZMUDDEPTWSType.GIDIEAZMUDDEPTWSDetailType.MIDIEAZMUDDEPTWSDetailType }
         * 
         * 
         */
        public List<IDIEAZMUDDEPTWSType.GIDIEAZMUDDEPTWSDetailType.MIDIEAZMUDDEPTWSDetailType> getMIDIEAZMUDDEPTWSDetailType() {
            if (midieazmuddeptwsDetailType == null) {
                midieazmuddeptwsDetailType = new ArrayList<IDIEAZMUDDEPTWSType.GIDIEAZMUDDEPTWSDetailType.MIDIEAZMUDDEPTWSDetailType>();
            }
            return this.midieazmuddeptwsDetailType;
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
         *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRINCIPAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="VALUEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MATURITYDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MUDTENOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MUDBILYET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MUDPRINTEDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INTERESTLIQUACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REPAYACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMINATEDACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MUDNISBAHBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MUDSPCNISBAH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MUDSPCRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MUDNISBAH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ZAKAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AROOPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TAXABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MUDARONISBAH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MUDAROSPCNSB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MUDAROSPCRTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MUDARONSBRTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CREATEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DESCPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "category",
            "currency",
            "principal",
            "valuedate",
            "maturitydate",
            "mudtenor",
            "mudbilyet",
            "mudprintedname",
            "interestliquacct",
            "repayaccount",
            "nominatedaccount",
            "mudnisbahbank",
            "mudspcnisbah",
            "mudspcrate",
            "mudnisbah",
            "zakat",
            "arooption",
            "taxable",
            "mudaronisbah",
            "mudarospcnsb",
            "mudarospcrte",
            "mudaronsbrte",
            "createdate",
            "cocode",
            "descprod"
        })
        public static class MIDIEAZMUDDEPTWSDetailType {

            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "CUSTOMER")
            protected String customer;
            @XmlElement(name = "CATEGORY")
            protected String category;
            @XmlElement(name = "CURRENCY")
            protected String currency;
            @XmlElement(name = "PRINCIPAL")
            protected String principal;
            @XmlElement(name = "VALUEDATE")
            protected String valuedate;
            @XmlElement(name = "MATURITYDATE")
            protected String maturitydate;
            @XmlElement(name = "MUDTENOR")
            protected String mudtenor;
            @XmlElement(name = "MUDBILYET")
            protected String mudbilyet;
            @XmlElement(name = "MUDPRINTEDNAME")
            protected String mudprintedname;
            @XmlElement(name = "INTERESTLIQUACCT")
            protected String interestliquacct;
            @XmlElement(name = "REPAYACCOUNT")
            protected String repayaccount;
            @XmlElement(name = "NOMINATEDACCOUNT")
            protected String nominatedaccount;
            @XmlElement(name = "MUDNISBAHBANK")
            protected String mudnisbahbank;
            @XmlElement(name = "MUDSPCNISBAH")
            protected String mudspcnisbah;
            @XmlElement(name = "MUDSPCRATE")
            protected String mudspcrate;
            @XmlElement(name = "MUDNISBAH")
            protected String mudnisbah;
            @XmlElement(name = "ZAKAT")
            protected String zakat;
            @XmlElement(name = "AROOPTION")
            protected String arooption;
            @XmlElement(name = "TAXABLE")
            protected String taxable;
            @XmlElement(name = "MUDARONISBAH")
            protected String mudaronisbah;
            @XmlElement(name = "MUDAROSPCNSB")
            protected String mudarospcnsb;
            @XmlElement(name = "MUDAROSPCRTE")
            protected String mudarospcrte;
            @XmlElement(name = "MUDARONSBRTE")
            protected String mudaronsbrte;
            @XmlElement(name = "CREATEDATE")
            protected String createdate;
            @XmlElement(name = "COCODE")
            protected String cocode;
            @XmlElement(name = "DESCPROD")
            protected String descprod;
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
             * Gets the value of the principal property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRINCIPAL() {
                return principal;
            }

            /**
             * Sets the value of the principal property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRINCIPAL(String value) {
                this.principal = value;
            }

            /**
             * Gets the value of the valuedate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVALUEDATE() {
                return valuedate;
            }

            /**
             * Sets the value of the valuedate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVALUEDATE(String value) {
                this.valuedate = value;
            }

            /**
             * Gets the value of the maturitydate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMATURITYDATE() {
                return maturitydate;
            }

            /**
             * Sets the value of the maturitydate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMATURITYDATE(String value) {
                this.maturitydate = value;
            }

            /**
             * Gets the value of the mudtenor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMUDTENOR() {
                return mudtenor;
            }

            /**
             * Sets the value of the mudtenor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMUDTENOR(String value) {
                this.mudtenor = value;
            }

            /**
             * Gets the value of the mudbilyet property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMUDBILYET() {
                return mudbilyet;
            }

            /**
             * Sets the value of the mudbilyet property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMUDBILYET(String value) {
                this.mudbilyet = value;
            }

            /**
             * Gets the value of the mudprintedname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMUDPRINTEDNAME() {
                return mudprintedname;
            }

            /**
             * Sets the value of the mudprintedname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMUDPRINTEDNAME(String value) {
                this.mudprintedname = value;
            }

            /**
             * Gets the value of the interestliquacct property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINTERESTLIQUACCT() {
                return interestliquacct;
            }

            /**
             * Sets the value of the interestliquacct property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINTERESTLIQUACCT(String value) {
                this.interestliquacct = value;
            }

            /**
             * Gets the value of the repayaccount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREPAYACCOUNT() {
                return repayaccount;
            }

            /**
             * Sets the value of the repayaccount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREPAYACCOUNT(String value) {
                this.repayaccount = value;
            }

            /**
             * Gets the value of the nominatedaccount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMINATEDACCOUNT() {
                return nominatedaccount;
            }

            /**
             * Sets the value of the nominatedaccount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMINATEDACCOUNT(String value) {
                this.nominatedaccount = value;
            }

            /**
             * Gets the value of the mudnisbahbank property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMUDNISBAHBANK() {
                return mudnisbahbank;
            }

            /**
             * Sets the value of the mudnisbahbank property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMUDNISBAHBANK(String value) {
                this.mudnisbahbank = value;
            }

            /**
             * Gets the value of the mudspcnisbah property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMUDSPCNISBAH() {
                return mudspcnisbah;
            }

            /**
             * Sets the value of the mudspcnisbah property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMUDSPCNISBAH(String value) {
                this.mudspcnisbah = value;
            }

            /**
             * Gets the value of the mudspcrate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMUDSPCRATE() {
                return mudspcrate;
            }

            /**
             * Sets the value of the mudspcrate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMUDSPCRATE(String value) {
                this.mudspcrate = value;
            }

            /**
             * Gets the value of the mudnisbah property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMUDNISBAH() {
                return mudnisbah;
            }

            /**
             * Sets the value of the mudnisbah property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMUDNISBAH(String value) {
                this.mudnisbah = value;
            }

            /**
             * Gets the value of the zakat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZAKAT() {
                return zakat;
            }

            /**
             * Sets the value of the zakat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZAKAT(String value) {
                this.zakat = value;
            }

            /**
             * Gets the value of the arooption property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAROOPTION() {
                return arooption;
            }

            /**
             * Sets the value of the arooption property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAROOPTION(String value) {
                this.arooption = value;
            }

            /**
             * Gets the value of the taxable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTAXABLE() {
                return taxable;
            }

            /**
             * Sets the value of the taxable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTAXABLE(String value) {
                this.taxable = value;
            }

            /**
             * Gets the value of the mudaronisbah property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMUDARONISBAH() {
                return mudaronisbah;
            }

            /**
             * Sets the value of the mudaronisbah property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMUDARONISBAH(String value) {
                this.mudaronisbah = value;
            }

            /**
             * Gets the value of the mudarospcnsb property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMUDAROSPCNSB() {
                return mudarospcnsb;
            }

            /**
             * Sets the value of the mudarospcnsb property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMUDAROSPCNSB(String value) {
                this.mudarospcnsb = value;
            }

            /**
             * Gets the value of the mudarospcrte property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMUDAROSPCRTE() {
                return mudarospcrte;
            }

            /**
             * Sets the value of the mudarospcrte property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMUDAROSPCRTE(String value) {
                this.mudarospcrte = value;
            }

            /**
             * Gets the value of the mudaronsbrte property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMUDARONSBRTE() {
                return mudaronsbrte;
            }

            /**
             * Sets the value of the mudaronsbrte property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMUDARONSBRTE(String value) {
                this.mudaronsbrte = value;
            }

            /**
             * Gets the value of the createdate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCREATEDATE() {
                return createdate;
            }

            /**
             * Sets the value of the createdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCREATEDATE(String value) {
                this.createdate = value;
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
             * Gets the value of the descprod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDESCPROD() {
                return descprod;
            }

            /**
             * Sets the value of the descprod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDESCPROD(String value) {
                this.descprod = value;
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
