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
 * <p>Java class for IDIENOFILEFTSEEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIENOFILEFTSEEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERORCDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gIDIENOFILEFTSEEDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIENOFILEFTSEEDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DEBITACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DEBITAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CREDITACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CREDITAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RECORDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "IDIENOFILEFTSEEType", propOrder = {
    "zerorcdesc",
    "gidienofileftseeDetailType"
})
public class IDIENOFILEFTSEEType {

    @XmlElement(name = "ZERORCDESC")
    protected String zerorcdesc;
    @XmlElement(name = "gIDIENOFILEFTSEEDetailType")
    protected IDIENOFILEFTSEEType.GIDIENOFILEFTSEEDetailType gidienofileftseeDetailType;

    /**
     * Gets the value of the zerorcdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZERORCDESC() {
        return zerorcdesc;
    }

    /**
     * Sets the value of the zerorcdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZERORCDESC(String value) {
        this.zerorcdesc = value;
    }

    /**
     * Gets the value of the gidienofileftseeDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIENOFILEFTSEEType.GIDIENOFILEFTSEEDetailType }
     *     
     */
    public IDIENOFILEFTSEEType.GIDIENOFILEFTSEEDetailType getGIDIENOFILEFTSEEDetailType() {
        return gidienofileftseeDetailType;
    }

    /**
     * Sets the value of the gidienofileftseeDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIENOFILEFTSEEType.GIDIENOFILEFTSEEDetailType }
     *     
     */
    public void setGIDIENOFILEFTSEEDetailType(IDIENOFILEFTSEEType.GIDIENOFILEFTSEEDetailType value) {
        this.gidienofileftseeDetailType = value;
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
     *         &lt;element name="mIDIENOFILEFTSEEDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DEBITACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DEBITAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CREDITACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CREDITAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RECORDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "midienofileftseeDetailType"
    })
    public static class GIDIENOFILEFTSEEDetailType {

        @XmlElement(name = "mIDIENOFILEFTSEEDetailType")
        protected List<IDIENOFILEFTSEEType.GIDIENOFILEFTSEEDetailType.MIDIENOFILEFTSEEDetailType> midienofileftseeDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midienofileftseeDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midienofileftseeDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIENOFILEFTSEEDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIENOFILEFTSEEType.GIDIENOFILEFTSEEDetailType.MIDIENOFILEFTSEEDetailType }
         * 
         * 
         */
        public List<IDIENOFILEFTSEEType.GIDIENOFILEFTSEEDetailType.MIDIENOFILEFTSEEDetailType> getMIDIENOFILEFTSEEDetailType() {
            if (midienofileftseeDetailType == null) {
                midienofileftseeDetailType = new ArrayList<IDIENOFILEFTSEEType.GIDIENOFILEFTSEEDetailType.MIDIENOFILEFTSEEDetailType>();
            }
            return this.midienofileftseeDetailType;
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
         *         &lt;element name="FTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DEBITACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DEBITAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CREDITACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CREDITAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RECORDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "ftid",
            "debitacctno",
            "debitamount",
            "creditacctno",
            "creditamount",
            "recordstatus"
        })
        public static class MIDIENOFILEFTSEEDetailType {

            @XmlElement(name = "FTID")
            protected String ftid;
            @XmlElement(name = "DEBITACCTNO")
            protected String debitacctno;
            @XmlElement(name = "DEBITAMOUNT")
            protected String debitamount;
            @XmlElement(name = "CREDITACCTNO")
            protected String creditacctno;
            @XmlElement(name = "CREDITAMOUNT")
            protected String creditamount;
            @XmlElement(name = "RECORDSTATUS")
            protected String recordstatus;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the ftid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFTID() {
                return ftid;
            }

            /**
             * Sets the value of the ftid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFTID(String value) {
                this.ftid = value;
            }

            /**
             * Gets the value of the debitacctno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDEBITACCTNO() {
                return debitacctno;
            }

            /**
             * Sets the value of the debitacctno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDEBITACCTNO(String value) {
                this.debitacctno = value;
            }

            /**
             * Gets the value of the debitamount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDEBITAMOUNT() {
                return debitamount;
            }

            /**
             * Sets the value of the debitamount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDEBITAMOUNT(String value) {
                this.debitamount = value;
            }

            /**
             * Gets the value of the creditacctno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCREDITACCTNO() {
                return creditacctno;
            }

            /**
             * Sets the value of the creditacctno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCREDITACCTNO(String value) {
                this.creditacctno = value;
            }

            /**
             * Gets the value of the creditamount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCREDITAMOUNT() {
                return creditamount;
            }

            /**
             * Sets the value of the creditamount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCREDITAMOUNT(String value) {
                this.creditamount = value;
            }

            /**
             * Gets the value of the recordstatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRECORDSTATUS() {
                return recordstatus;
            }

            /**
             * Sets the value of the recordstatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRECORDSTATUS(String value) {
                this.recordstatus = value;
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
