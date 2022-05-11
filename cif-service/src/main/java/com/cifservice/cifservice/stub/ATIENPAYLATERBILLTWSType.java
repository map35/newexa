//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.10 at 10:25:48 AM WIB 
//


package com.cifservice.cifservice.stub;

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
 * <p>Java class for ATIENPAYLATERBILLTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATIENPAYLATERBILLTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERORECORDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gATIENPAYLATERBILLTWSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mATIENPAYLATERBILLTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RECNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SHORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="VAACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAYLATERLIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AVAILAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TOTALOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BILLDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AMTPOKOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AMTMARGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AMTFEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AMTDENDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TOTAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DESCPAYLATER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ATIENPAYLATERBILLTWSType", propOrder = {
    "zerorecords",
    "gatienpaylaterbilltwsDetailType"
})
public class ATIENPAYLATERBILLTWSType {

    @XmlElement(name = "ZERORECORDS")
    protected String zerorecords;
    @XmlElement(name = "gATIENPAYLATERBILLTWSDetailType")
    protected ATIENPAYLATERBILLTWSType.GATIENPAYLATERBILLTWSDetailType gatienpaylaterbilltwsDetailType;

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
     * Gets the value of the gatienpaylaterbilltwsDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link ATIENPAYLATERBILLTWSType.GATIENPAYLATERBILLTWSDetailType }
     *     
     */
    public ATIENPAYLATERBILLTWSType.GATIENPAYLATERBILLTWSDetailType getGATIENPAYLATERBILLTWSDetailType() {
        return gatienpaylaterbilltwsDetailType;
    }

    /**
     * Sets the value of the gatienpaylaterbilltwsDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATIENPAYLATERBILLTWSType.GATIENPAYLATERBILLTWSDetailType }
     *     
     */
    public void setGATIENPAYLATERBILLTWSDetailType(ATIENPAYLATERBILLTWSType.GATIENPAYLATERBILLTWSDetailType value) {
        this.gatienpaylaterbilltwsDetailType = value;
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
     *         &lt;element name="mATIENPAYLATERBILLTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RECNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SHORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="VAACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAYLATERLIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AVAILAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TOTALOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BILLDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AMTPOKOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AMTMARGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AMTFEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AMTDENDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TOTAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DESCPAYLATER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "matienpaylaterbilltwsDetailType"
    })
    public static class GATIENPAYLATERBILLTWSDetailType {

        @XmlElement(name = "mATIENPAYLATERBILLTWSDetailType")
        protected List<ATIENPAYLATERBILLTWSType.GATIENPAYLATERBILLTWSDetailType.MATIENPAYLATERBILLTWSDetailType> matienpaylaterbilltwsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the matienpaylaterbilltwsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the matienpaylaterbilltwsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMATIENPAYLATERBILLTWSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ATIENPAYLATERBILLTWSType.GATIENPAYLATERBILLTWSDetailType.MATIENPAYLATERBILLTWSDetailType }
         * 
         * 
         */
        public List<ATIENPAYLATERBILLTWSType.GATIENPAYLATERBILLTWSDetailType.MATIENPAYLATERBILLTWSDetailType> getMATIENPAYLATERBILLTWSDetailType() {
            if (matienpaylaterbilltwsDetailType == null) {
                matienpaylaterbilltwsDetailType = new ArrayList<ATIENPAYLATERBILLTWSType.GATIENPAYLATERBILLTWSDetailType.MATIENPAYLATERBILLTWSDetailType>();
            }
            return this.matienpaylaterbilltwsDetailType;
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
         *         &lt;element name="RECNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SHORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="VAACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAYLATERLIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AVAILAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TOTALOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BILLDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AMTPOKOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AMTMARGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AMTFEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AMTDENDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TOTAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DESCPAYLATER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "recnum",
            "cif",
            "shortname",
            "vaacct",
            "curr",
            "paylaterlimit",
            "availamt",
            "totalos",
            "ldid",
            "billdate",
            "amtpokok",
            "amtmargin",
            "amtfee",
            "amtdenda",
            "totamt",
            "descpaylater"
        })
        public static class MATIENPAYLATERBILLTWSDetailType {

            @XmlElement(name = "RECNUM")
            protected String recnum;
            @XmlElement(name = "CIF")
            protected String cif;
            @XmlElement(name = "SHORTNAME")
            protected String shortname;
            @XmlElement(name = "VAACCT")
            protected String vaacct;
            @XmlElement(name = "CURR")
            protected String curr;
            @XmlElement(name = "PAYLATERLIMIT")
            protected String paylaterlimit;
            @XmlElement(name = "AVAILAMT")
            protected String availamt;
            @XmlElement(name = "TOTALOS")
            protected String totalos;
            @XmlElement(name = "LDID")
            protected String ldid;
            @XmlElement(name = "BILLDATE")
            protected String billdate;
            @XmlElement(name = "AMTPOKOK")
            protected String amtpokok;
            @XmlElement(name = "AMTMARGIN")
            protected String amtmargin;
            @XmlElement(name = "AMTFEE")
            protected String amtfee;
            @XmlElement(name = "AMTDENDA")
            protected String amtdenda;
            @XmlElement(name = "TOTAMT")
            protected String totamt;
            @XmlElement(name = "DESCPAYLATER")
            protected String descpaylater;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the recnum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRECNUM() {
                return recnum;
            }

            /**
             * Sets the value of the recnum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRECNUM(String value) {
                this.recnum = value;
            }

            /**
             * Gets the value of the cif property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCIF() {
                return cif;
            }

            /**
             * Sets the value of the cif property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCIF(String value) {
                this.cif = value;
            }

            /**
             * Gets the value of the shortname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSHORTNAME() {
                return shortname;
            }

            /**
             * Sets the value of the shortname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSHORTNAME(String value) {
                this.shortname = value;
            }

            /**
             * Gets the value of the vaacct property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVAACCT() {
                return vaacct;
            }

            /**
             * Sets the value of the vaacct property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVAACCT(String value) {
                this.vaacct = value;
            }

            /**
             * Gets the value of the curr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCURR() {
                return curr;
            }

            /**
             * Sets the value of the curr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCURR(String value) {
                this.curr = value;
            }

            /**
             * Gets the value of the paylaterlimit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYLATERLIMIT() {
                return paylaterlimit;
            }

            /**
             * Sets the value of the paylaterlimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYLATERLIMIT(String value) {
                this.paylaterlimit = value;
            }

            /**
             * Gets the value of the availamt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAVAILAMT() {
                return availamt;
            }

            /**
             * Sets the value of the availamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAVAILAMT(String value) {
                this.availamt = value;
            }

            /**
             * Gets the value of the totalos property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTOTALOS() {
                return totalos;
            }

            /**
             * Sets the value of the totalos property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTOTALOS(String value) {
                this.totalos = value;
            }

            /**
             * Gets the value of the ldid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLDID() {
                return ldid;
            }

            /**
             * Sets the value of the ldid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLDID(String value) {
                this.ldid = value;
            }

            /**
             * Gets the value of the billdate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBILLDATE() {
                return billdate;
            }

            /**
             * Sets the value of the billdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBILLDATE(String value) {
                this.billdate = value;
            }

            /**
             * Gets the value of the amtpokok property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAMTPOKOK() {
                return amtpokok;
            }

            /**
             * Sets the value of the amtpokok property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAMTPOKOK(String value) {
                this.amtpokok = value;
            }

            /**
             * Gets the value of the amtmargin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAMTMARGIN() {
                return amtmargin;
            }

            /**
             * Sets the value of the amtmargin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAMTMARGIN(String value) {
                this.amtmargin = value;
            }

            /**
             * Gets the value of the amtfee property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAMTFEE() {
                return amtfee;
            }

            /**
             * Sets the value of the amtfee property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAMTFEE(String value) {
                this.amtfee = value;
            }

            /**
             * Gets the value of the amtdenda property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAMTDENDA() {
                return amtdenda;
            }

            /**
             * Sets the value of the amtdenda property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAMTDENDA(String value) {
                this.amtdenda = value;
            }

            /**
             * Gets the value of the totamt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTOTAMT() {
                return totamt;
            }

            /**
             * Sets the value of the totamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTOTAMT(String value) {
                this.totamt = value;
            }

            /**
             * Gets the value of the descpaylater property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDESCPAYLATER() {
                return descpaylater;
            }

            /**
             * Sets the value of the descpaylater property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDESCPAYLATER(String value) {
                this.descpaylater = value;
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
