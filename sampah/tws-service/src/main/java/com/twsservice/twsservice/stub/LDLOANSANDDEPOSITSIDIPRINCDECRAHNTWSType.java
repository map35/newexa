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
 * <p>Java class for LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NomorCIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gAMOUNT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PokokBerjalan" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TanggalMulai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TanggalJatuhTempo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RekPmbyrnPokok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RekPmbyrnUjroh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NominalBayarPokok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gCOLL.CODE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mCOLL.CODE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="COLLCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PERCENTALLOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="PARTPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUPORTIONAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTALCAPITAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType", propOrder = {
    "nomorCIF",
    "gamount",
    "tanggalMulai",
    "tanggalJatuhTempo",
    "rekPmbyrnPokok",
    "rekPmbyrnUjroh",
    "nominalBayarPokok",
    "gcollcode",
    "partpay",
    "cuportionamt",
    "totalcapital"
})
public class LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType {

    @XmlElement(name = "NomorCIF")
    protected String nomorCIF;
    @XmlElement(name = "gAMOUNT")
    protected LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType.GAMOUNT gamount;
    @XmlElement(name = "TanggalMulai")
    protected String tanggalMulai;
    @XmlElement(name = "TanggalJatuhTempo")
    protected String tanggalJatuhTempo;
    @XmlElement(name = "RekPmbyrnPokok")
    protected String rekPmbyrnPokok;
    @XmlElement(name = "RekPmbyrnUjroh")
    protected String rekPmbyrnUjroh;
    @XmlElement(name = "NominalBayarPokok")
    protected String nominalBayarPokok;
    @XmlElement(name = "gCOLL.CODE")
    protected LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType.GCOLLCODE gcollcode;
    @XmlElement(name = "PARTPAY")
    protected String partpay;
    @XmlElement(name = "CUPORTIONAMT")
    protected String cuportionamt;
    @XmlElement(name = "TOTALCAPITAL")
    protected String totalcapital;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the nomorCIF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomorCIF() {
        return nomorCIF;
    }

    /**
     * Sets the value of the nomorCIF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomorCIF(String value) {
        this.nomorCIF = value;
    }

    /**
     * Gets the value of the gamount property.
     * 
     * @return
     *     possible object is
     *     {@link LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType.GAMOUNT }
     *     
     */
    public LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType.GAMOUNT getGAMOUNT() {
        return gamount;
    }

    /**
     * Sets the value of the gamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType.GAMOUNT }
     *     
     */
    public void setGAMOUNT(LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType.GAMOUNT value) {
        this.gamount = value;
    }

    /**
     * Gets the value of the tanggalMulai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalMulai() {
        return tanggalMulai;
    }

    /**
     * Sets the value of the tanggalMulai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalMulai(String value) {
        this.tanggalMulai = value;
    }

    /**
     * Gets the value of the tanggalJatuhTempo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalJatuhTempo() {
        return tanggalJatuhTempo;
    }

    /**
     * Sets the value of the tanggalJatuhTempo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalJatuhTempo(String value) {
        this.tanggalJatuhTempo = value;
    }

    /**
     * Gets the value of the rekPmbyrnPokok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRekPmbyrnPokok() {
        return rekPmbyrnPokok;
    }

    /**
     * Sets the value of the rekPmbyrnPokok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRekPmbyrnPokok(String value) {
        this.rekPmbyrnPokok = value;
    }

    /**
     * Gets the value of the rekPmbyrnUjroh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRekPmbyrnUjroh() {
        return rekPmbyrnUjroh;
    }

    /**
     * Sets the value of the rekPmbyrnUjroh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRekPmbyrnUjroh(String value) {
        this.rekPmbyrnUjroh = value;
    }

    /**
     * Gets the value of the nominalBayarPokok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominalBayarPokok() {
        return nominalBayarPokok;
    }

    /**
     * Sets the value of the nominalBayarPokok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominalBayarPokok(String value) {
        this.nominalBayarPokok = value;
    }

    /**
     * Gets the value of the gcollcode property.
     * 
     * @return
     *     possible object is
     *     {@link LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType.GCOLLCODE }
     *     
     */
    public LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType.GCOLLCODE getGCOLLCODE() {
        return gcollcode;
    }

    /**
     * Sets the value of the gcollcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType.GCOLLCODE }
     *     
     */
    public void setGCOLLCODE(LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType.GCOLLCODE value) {
        this.gcollcode = value;
    }

    /**
     * Gets the value of the partpay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTPAY() {
        return partpay;
    }

    /**
     * Sets the value of the partpay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTPAY(String value) {
        this.partpay = value;
    }

    /**
     * Gets the value of the cuportionamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUPORTIONAMT() {
        return cuportionamt;
    }

    /**
     * Sets the value of the cuportionamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUPORTIONAMT(String value) {
        this.cuportionamt = value;
    }

    /**
     * Gets the value of the totalcapital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALCAPITAL() {
        return totalcapital;
    }

    /**
     * Sets the value of the totalcapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALCAPITAL(String value) {
        this.totalcapital = value;
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
     *         &lt;element name="PokokBerjalan" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "pokokBerjalan"
    })
    public static class GAMOUNT {

        @XmlElement(name = "PokokBerjalan")
        protected List<String> pokokBerjalan;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the pokokBerjalan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pokokBerjalan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPokokBerjalan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPokokBerjalan() {
            if (pokokBerjalan == null) {
                pokokBerjalan = new ArrayList<String>();
            }
            return this.pokokBerjalan;
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
     *         &lt;element name="mCOLL.CODE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="COLLCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PERCENTALLOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mcollcode"
    })
    public static class GCOLLCODE {

        @XmlElement(name = "mCOLL.CODE")
        protected List<LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType.GCOLLCODE.MCOLLCODE> mcollcode;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mcollcode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcollcode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCOLLCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType.GCOLLCODE.MCOLLCODE }
         * 
         * 
         */
        public List<LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType.GCOLLCODE.MCOLLCODE> getMCOLLCODE() {
            if (mcollcode == null) {
                mcollcode = new ArrayList<LDLOANSANDDEPOSITSIDIPRINCDECRAHNTWSType.GCOLLCODE.MCOLLCODE>();
            }
            return this.mcollcode;
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
         *         &lt;element name="COLLCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PERCENTALLOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "collcode",
            "percentalloc"
        })
        public static class MCOLLCODE {

            @XmlElement(name = "COLLCODE")
            protected String collcode;
            @XmlElement(name = "PERCENTALLOC")
            protected String percentalloc;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the collcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOLLCODE() {
                return collcode;
            }

            /**
             * Sets the value of the collcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOLLCODE(String value) {
                this.collcode = value;
            }

            /**
             * Gets the value of the percentalloc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPERCENTALLOC() {
                return percentalloc;
            }

            /**
             * Sets the value of the percentalloc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPERCENTALLOC(String value) {
                this.percentalloc = value;
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