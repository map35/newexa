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
 * <p>Java class for LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NoCIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gAMOUNT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TanggalKontrak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TanggalPelunasan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RekeningPokok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNTINCREASE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AMTVDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHRGACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gCHARGE.CODE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mCHARGE.CODE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CHARGECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CHRGAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="TOTCHRGAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EQVRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MRGAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FLAGSUBROGASI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType", propOrder = {
    "noCIF",
    "currency",
    "gamount",
    "tanggalKontrak",
    "tanggalPelunasan",
    "rekeningPokok",
    "amountincrease",
    "amtvdate",
    "chrgacct",
    "gchargecode",
    "totchrgamt",
    "eqvrate",
    "mrgamt",
    "flagsubrogasi"
})
public class LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType {

    @XmlElement(name = "NoCIF")
    protected String noCIF;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "gAMOUNT")
    protected LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType.GAMOUNT gamount;
    @XmlElement(name = "TanggalKontrak")
    protected String tanggalKontrak;
    @XmlElement(name = "TanggalPelunasan")
    protected String tanggalPelunasan;
    @XmlElement(name = "RekeningPokok")
    protected String rekeningPokok;
    @XmlElement(name = "AMOUNTINCREASE")
    protected String amountincrease;
    @XmlElement(name = "AMTVDATE")
    protected String amtvdate;
    @XmlElement(name = "CHRGACCT")
    protected String chrgacct;
    @XmlElement(name = "gCHARGE.CODE")
    protected LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType.GCHARGECODE gchargecode;
    @XmlElement(name = "TOTCHRGAMT")
    protected String totchrgamt;
    @XmlElement(name = "EQVRATE")
    protected String eqvrate;
    @XmlElement(name = "MRGAMT")
    protected String mrgamt;
    @XmlElement(name = "FLAGSUBROGASI")
    protected String flagsubrogasi;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the noCIF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCIF() {
        return noCIF;
    }

    /**
     * Sets the value of the noCIF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCIF(String value) {
        this.noCIF = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
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
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the gamount property.
     * 
     * @return
     *     possible object is
     *     {@link LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType.GAMOUNT }
     *     
     */
    public LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType.GAMOUNT getGAMOUNT() {
        return gamount;
    }

    /**
     * Sets the value of the gamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType.GAMOUNT }
     *     
     */
    public void setGAMOUNT(LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType.GAMOUNT value) {
        this.gamount = value;
    }

    /**
     * Gets the value of the tanggalKontrak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalKontrak() {
        return tanggalKontrak;
    }

    /**
     * Sets the value of the tanggalKontrak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalKontrak(String value) {
        this.tanggalKontrak = value;
    }

    /**
     * Gets the value of the tanggalPelunasan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalPelunasan() {
        return tanggalPelunasan;
    }

    /**
     * Sets the value of the tanggalPelunasan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalPelunasan(String value) {
        this.tanggalPelunasan = value;
    }

    /**
     * Gets the value of the rekeningPokok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRekeningPokok() {
        return rekeningPokok;
    }

    /**
     * Sets the value of the rekeningPokok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRekeningPokok(String value) {
        this.rekeningPokok = value;
    }

    /**
     * Gets the value of the amountincrease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNTINCREASE() {
        return amountincrease;
    }

    /**
     * Sets the value of the amountincrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNTINCREASE(String value) {
        this.amountincrease = value;
    }

    /**
     * Gets the value of the amtvdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMTVDATE() {
        return amtvdate;
    }

    /**
     * Sets the value of the amtvdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMTVDATE(String value) {
        this.amtvdate = value;
    }

    /**
     * Gets the value of the chrgacct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHRGACCT() {
        return chrgacct;
    }

    /**
     * Sets the value of the chrgacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHRGACCT(String value) {
        this.chrgacct = value;
    }

    /**
     * Gets the value of the gchargecode property.
     * 
     * @return
     *     possible object is
     *     {@link LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType.GCHARGECODE }
     *     
     */
    public LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType.GCHARGECODE getGCHARGECODE() {
        return gchargecode;
    }

    /**
     * Sets the value of the gchargecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType.GCHARGECODE }
     *     
     */
    public void setGCHARGECODE(LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType.GCHARGECODE value) {
        this.gchargecode = value;
    }

    /**
     * Gets the value of the totchrgamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTCHRGAMT() {
        return totchrgamt;
    }

    /**
     * Sets the value of the totchrgamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTCHRGAMT(String value) {
        this.totchrgamt = value;
    }

    /**
     * Gets the value of the eqvrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQVRATE() {
        return eqvrate;
    }

    /**
     * Sets the value of the eqvrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQVRATE(String value) {
        this.eqvrate = value;
    }

    /**
     * Gets the value of the mrgamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRGAMT() {
        return mrgamt;
    }

    /**
     * Sets the value of the mrgamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRGAMT(String value) {
        this.mrgamt = value;
    }

    /**
     * Gets the value of the flagsubrogasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGSUBROGASI() {
        return flagsubrogasi;
    }

    /**
     * Sets the value of the flagsubrogasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGSUBROGASI(String value) {
        this.flagsubrogasi = value;
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
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "amount"
    })
    public static class GAMOUNT {

        @XmlElement(name = "Amount")
        protected List<String> amount;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the amount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAmount() {
            if (amount == null) {
                amount = new ArrayList<String>();
            }
            return this.amount;
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
     *         &lt;element name="mCHARGE.CODE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CHARGECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CHRGAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mchargecode"
    })
    public static class GCHARGECODE {

        @XmlElement(name = "mCHARGE.CODE")
        protected List<LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType.GCHARGECODE.MCHARGECODE> mchargecode;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mchargecode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mchargecode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCHARGECODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType.GCHARGECODE.MCHARGECODE }
         * 
         * 
         */
        public List<LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType.GCHARGECODE.MCHARGECODE> getMCHARGECODE() {
            if (mchargecode == null) {
                mchargecode = new ArrayList<LDLOANSANDDEPOSITSIDIMUSMUTEARLYMATTWSType.GCHARGECODE.MCHARGECODE>();
            }
            return this.mchargecode;
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
         *         &lt;element name="CHARGECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CHRGAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "chargecode",
            "chrgamt"
        })
        public static class MCHARGECODE {

            @XmlElement(name = "CHARGECODE")
            protected String chargecode;
            @XmlElement(name = "CHRGAMT")
            protected String chrgamt;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the chargecode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHARGECODE() {
                return chargecode;
            }

            /**
             * Sets the value of the chargecode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHARGECODE(String value) {
                this.chargecode = value;
            }

            /**
             * Gets the value of the chrgamt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHRGAMT() {
                return chrgamt;
            }

            /**
             * Sets the value of the chrgamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHRGAMT(String value) {
                this.chrgamt = value;
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
