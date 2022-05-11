//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.28 at 08:49:18 PM WIB 
//


package com.accservice.accservice.stub;

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
 * <p>Java class for IDIECUSTFINPORTFOLIOTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIECUSTFINPORTFOLIOTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERORECORDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gIDIECUSTFINPORTFOLIOTWSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIECUSTFINPORTFOLIOTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NOPEMBIAYAAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TGLBUKA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TGLTUTUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NILAIPEMB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OUTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="KOLBSM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OSMRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OSPD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OUTSTANDING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRODTYPEFIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACCTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SCHDDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LOANTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="KOLCIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OSBAGHAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "IDIECUSTFINPORTFOLIOTWSType", propOrder = {
    "zerorecords",
    "gidiecustfinportfoliotwsDetailType"
})
public class IDIECUSTFINPORTFOLIOTWSType {

    @XmlElement(name = "ZERORECORDS")
    protected String zerorecords;
    @XmlElement(name = "gIDIECUSTFINPORTFOLIOTWSDetailType")
    protected IDIECUSTFINPORTFOLIOTWSType.GIDIECUSTFINPORTFOLIOTWSDetailType gidiecustfinportfoliotwsDetailType;

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
     * Gets the value of the gidiecustfinportfoliotwsDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIECUSTFINPORTFOLIOTWSType.GIDIECUSTFINPORTFOLIOTWSDetailType }
     *     
     */
    public IDIECUSTFINPORTFOLIOTWSType.GIDIECUSTFINPORTFOLIOTWSDetailType getGIDIECUSTFINPORTFOLIOTWSDetailType() {
        return gidiecustfinportfoliotwsDetailType;
    }

    /**
     * Sets the value of the gidiecustfinportfoliotwsDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIECUSTFINPORTFOLIOTWSType.GIDIECUSTFINPORTFOLIOTWSDetailType }
     *     
     */
    public void setGIDIECUSTFINPORTFOLIOTWSDetailType(IDIECUSTFINPORTFOLIOTWSType.GIDIECUSTFINPORTFOLIOTWSDetailType value) {
        this.gidiecustfinportfoliotwsDetailType = value;
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
     *         &lt;element name="mIDIECUSTFINPORTFOLIOTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NOPEMBIAYAAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TGLBUKA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TGLTUTUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NILAIPEMB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OUTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="KOLBSM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OSMRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OSPD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OUTSTANDING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRODTYPEFIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACCTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SCHDDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LOANTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="KOLCIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OSBAGHAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "midiecustfinportfoliotwsDetailType"
    })
    public static class GIDIECUSTFINPORTFOLIOTWSDetailType {

        @XmlElement(name = "mIDIECUSTFINPORTFOLIOTWSDetailType")
        protected List<IDIECUSTFINPORTFOLIOTWSType.GIDIECUSTFINPORTFOLIOTWSDetailType.MIDIECUSTFINPORTFOLIOTWSDetailType> midiecustfinportfoliotwsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midiecustfinportfoliotwsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midiecustfinportfoliotwsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIECUSTFINPORTFOLIOTWSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIECUSTFINPORTFOLIOTWSType.GIDIECUSTFINPORTFOLIOTWSDetailType.MIDIECUSTFINPORTFOLIOTWSDetailType }
         * 
         * 
         */
        public List<IDIECUSTFINPORTFOLIOTWSType.GIDIECUSTFINPORTFOLIOTWSDetailType.MIDIECUSTFINPORTFOLIOTWSDetailType> getMIDIECUSTFINPORTFOLIOTWSDetailType() {
            if (midiecustfinportfoliotwsDetailType == null) {
                midiecustfinportfoliotwsDetailType = new ArrayList<IDIECUSTFINPORTFOLIOTWSType.GIDIECUSTFINPORTFOLIOTWSDetailType.MIDIECUSTFINPORTFOLIOTWSDetailType>();
            }
            return this.midiecustfinportfoliotwsDetailType;
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
         *         &lt;element name="NOPEMBIAYAAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TGLBUKA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TGLTUTUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NILAIPEMB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OUTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="KOLBSM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OSMRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OSPD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OUTSTANDING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRODTYPEFIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACCTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SCHDDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LOANTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="KOLCIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OSBAGHAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "nopembiayaan",
            "tglbuka",
            "tgltutup",
            "nilaipemb",
            "outs",
            "kolbsm",
            "osmrg",
            "ospd",
            "outstanding",
            "prodtypefin",
            "acctname",
            "schddate",
            "category",
            "currency",
            "loantype",
            "kolcif",
            "osbaghas"
        })
        public static class MIDIECUSTFINPORTFOLIOTWSDetailType {

            @XmlElement(name = "NOPEMBIAYAAN")
            protected String nopembiayaan;
            @XmlElement(name = "TGLBUKA")
            protected String tglbuka;
            @XmlElement(name = "TGLTUTUP")
            protected String tgltutup;
            @XmlElement(name = "NILAIPEMB")
            protected String nilaipemb;
            @XmlElement(name = "OUTS")
            protected String outs;
            @XmlElement(name = "KOLBSM")
            protected String kolbsm;
            @XmlElement(name = "OSMRG")
            protected String osmrg;
            @XmlElement(name = "OSPD")
            protected String ospd;
            @XmlElement(name = "OUTSTANDING")
            protected String outstanding;
            @XmlElement(name = "PRODTYPEFIN")
            protected String prodtypefin;
            @XmlElement(name = "ACCTNAME")
            protected String acctname;
            @XmlElement(name = "SCHDDATE")
            protected String schddate;
            @XmlElement(name = "CATEGORY")
            protected String category;
            @XmlElement(name = "CURRENCY")
            protected String currency;
            @XmlElement(name = "LOANTYPE")
            protected String loantype;
            @XmlElement(name = "KOLCIF")
            protected String kolcif;
            @XmlElement(name = "OSBAGHAS")
            protected String osbaghas;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the nopembiayaan property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOPEMBIAYAAN() {
                return nopembiayaan;
            }

            /**
             * Sets the value of the nopembiayaan property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOPEMBIAYAAN(String value) {
                this.nopembiayaan = value;
            }

            /**
             * Gets the value of the tglbuka property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTGLBUKA() {
                return tglbuka;
            }

            /**
             * Sets the value of the tglbuka property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTGLBUKA(String value) {
                this.tglbuka = value;
            }

            /**
             * Gets the value of the tgltutup property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTGLTUTUP() {
                return tgltutup;
            }

            /**
             * Sets the value of the tgltutup property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTGLTUTUP(String value) {
                this.tgltutup = value;
            }

            /**
             * Gets the value of the nilaipemb property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNILAIPEMB() {
                return nilaipemb;
            }

            /**
             * Sets the value of the nilaipemb property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNILAIPEMB(String value) {
                this.nilaipemb = value;
            }

            /**
             * Gets the value of the outs property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOUTS() {
                return outs;
            }

            /**
             * Sets the value of the outs property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOUTS(String value) {
                this.outs = value;
            }

            /**
             * Gets the value of the kolbsm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKOLBSM() {
                return kolbsm;
            }

            /**
             * Sets the value of the kolbsm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKOLBSM(String value) {
                this.kolbsm = value;
            }

            /**
             * Gets the value of the osmrg property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOSMRG() {
                return osmrg;
            }

            /**
             * Sets the value of the osmrg property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOSMRG(String value) {
                this.osmrg = value;
            }

            /**
             * Gets the value of the ospd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOSPD() {
                return ospd;
            }

            /**
             * Sets the value of the ospd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOSPD(String value) {
                this.ospd = value;
            }

            /**
             * Gets the value of the outstanding property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOUTSTANDING() {
                return outstanding;
            }

            /**
             * Sets the value of the outstanding property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOUTSTANDING(String value) {
                this.outstanding = value;
            }

            /**
             * Gets the value of the prodtypefin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRODTYPEFIN() {
                return prodtypefin;
            }

            /**
             * Sets the value of the prodtypefin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRODTYPEFIN(String value) {
                this.prodtypefin = value;
            }

            /**
             * Gets the value of the acctname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCTNAME() {
                return acctname;
            }

            /**
             * Sets the value of the acctname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCTNAME(String value) {
                this.acctname = value;
            }

            /**
             * Gets the value of the schddate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSCHDDATE() {
                return schddate;
            }

            /**
             * Sets the value of the schddate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSCHDDATE(String value) {
                this.schddate = value;
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
             * Gets the value of the loantype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLOANTYPE() {
                return loantype;
            }

            /**
             * Sets the value of the loantype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLOANTYPE(String value) {
                this.loantype = value;
            }

            /**
             * Gets the value of the kolcif property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKOLCIF() {
                return kolcif;
            }

            /**
             * Sets the value of the kolcif property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKOLCIF(String value) {
                this.kolcif = value;
            }

            /**
             * Gets the value of the osbaghas property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOSBAGHAS() {
                return osbaghas;
            }

            /**
             * Sets the value of the osbaghas property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOSBAGHAS(String value) {
                this.osbaghas = value;
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
