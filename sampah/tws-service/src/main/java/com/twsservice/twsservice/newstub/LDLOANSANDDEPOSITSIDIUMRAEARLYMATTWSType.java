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
 * <p>Java class for LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType"&gt;
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
 *                   &lt;element name="SisaOSPokok" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TglKontrak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TglPelunasan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RekeningPokok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RekeningUjroh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PenurunanPokok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TglPenunrunanPokok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="PRODTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EARLYMATDISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOTARYNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gINSR.NAME" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INSRNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KAPNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KJPPNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SISAMARGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTPAID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType", propOrder = {
    "noCIF",
    "currency",
    "gamount",
    "tglKontrak",
    "tglPelunasan",
    "category",
    "rekeningPokok",
    "rekeningUjroh",
    "penurunanPokok",
    "tglPenunrunanPokok",
    "chrgacct",
    "gchargecode",
    "totchrgamt",
    "prodtype",
    "earlymatdisc",
    "notaryname",
    "ginsrname",
    "kapname",
    "kjppname",
    "sisamargin",
    "totpaid"
})
public class LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType {

    @XmlElement(name = "NoCIF")
    protected String noCIF;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "gAMOUNT")
    protected LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GAMOUNT gamount;
    @XmlElement(name = "TglKontrak")
    protected String tglKontrak;
    @XmlElement(name = "TglPelunasan")
    protected String tglPelunasan;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "RekeningPokok")
    protected String rekeningPokok;
    @XmlElement(name = "RekeningUjroh")
    protected String rekeningUjroh;
    @XmlElement(name = "PenurunanPokok")
    protected String penurunanPokok;
    @XmlElement(name = "TglPenunrunanPokok")
    protected String tglPenunrunanPokok;
    @XmlElement(name = "CHRGACCT")
    protected String chrgacct;
    @XmlElement(name = "gCHARGE.CODE")
    protected LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GCHARGECODE gchargecode;
    @XmlElement(name = "TOTCHRGAMT")
    protected String totchrgamt;
    @XmlElement(name = "PRODTYPE")
    protected String prodtype;
    @XmlElement(name = "EARLYMATDISC")
    protected String earlymatdisc;
    @XmlElement(name = "NOTARYNAME")
    protected String notaryname;
    @XmlElement(name = "gINSR.NAME")
    protected LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GINSRNAME ginsrname;
    @XmlElement(name = "KAPNAME")
    protected String kapname;
    @XmlElement(name = "KJPPNAME")
    protected String kjppname;
    @XmlElement(name = "SISAMARGIN")
    protected String sisamargin;
    @XmlElement(name = "TOTPAID")
    protected String totpaid;
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
     *     {@link LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GAMOUNT }
     *     
     */
    public LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GAMOUNT getGAMOUNT() {
        return gamount;
    }

    /**
     * Sets the value of the gamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GAMOUNT }
     *     
     */
    public void setGAMOUNT(LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GAMOUNT value) {
        this.gamount = value;
    }

    /**
     * Gets the value of the tglKontrak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglKontrak() {
        return tglKontrak;
    }

    /**
     * Sets the value of the tglKontrak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglKontrak(String value) {
        this.tglKontrak = value;
    }

    /**
     * Gets the value of the tglPelunasan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglPelunasan() {
        return tglPelunasan;
    }

    /**
     * Sets the value of the tglPelunasan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglPelunasan(String value) {
        this.tglPelunasan = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
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
    public void setCategory(String value) {
        this.category = value;
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
     * Gets the value of the rekeningUjroh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRekeningUjroh() {
        return rekeningUjroh;
    }

    /**
     * Sets the value of the rekeningUjroh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRekeningUjroh(String value) {
        this.rekeningUjroh = value;
    }

    /**
     * Gets the value of the penurunanPokok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenurunanPokok() {
        return penurunanPokok;
    }

    /**
     * Sets the value of the penurunanPokok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenurunanPokok(String value) {
        this.penurunanPokok = value;
    }

    /**
     * Gets the value of the tglPenunrunanPokok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglPenunrunanPokok() {
        return tglPenunrunanPokok;
    }

    /**
     * Sets the value of the tglPenunrunanPokok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglPenunrunanPokok(String value) {
        this.tglPenunrunanPokok = value;
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
     *     {@link LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GCHARGECODE }
     *     
     */
    public LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GCHARGECODE getGCHARGECODE() {
        return gchargecode;
    }

    /**
     * Sets the value of the gchargecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GCHARGECODE }
     *     
     */
    public void setGCHARGECODE(LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GCHARGECODE value) {
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
     * Gets the value of the prodtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODTYPE() {
        return prodtype;
    }

    /**
     * Sets the value of the prodtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODTYPE(String value) {
        this.prodtype = value;
    }

    /**
     * Gets the value of the earlymatdisc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEARLYMATDISC() {
        return earlymatdisc;
    }

    /**
     * Sets the value of the earlymatdisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEARLYMATDISC(String value) {
        this.earlymatdisc = value;
    }

    /**
     * Gets the value of the notaryname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTARYNAME() {
        return notaryname;
    }

    /**
     * Sets the value of the notaryname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTARYNAME(String value) {
        this.notaryname = value;
    }

    /**
     * Gets the value of the ginsrname property.
     * 
     * @return
     *     possible object is
     *     {@link LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GINSRNAME }
     *     
     */
    public LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GINSRNAME getGINSRNAME() {
        return ginsrname;
    }

    /**
     * Sets the value of the ginsrname property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GINSRNAME }
     *     
     */
    public void setGINSRNAME(LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GINSRNAME value) {
        this.ginsrname = value;
    }

    /**
     * Gets the value of the kapname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKAPNAME() {
        return kapname;
    }

    /**
     * Sets the value of the kapname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKAPNAME(String value) {
        this.kapname = value;
    }

    /**
     * Gets the value of the kjppname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKJPPNAME() {
        return kjppname;
    }

    /**
     * Sets the value of the kjppname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKJPPNAME(String value) {
        this.kjppname = value;
    }

    /**
     * Gets the value of the sisamargin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISAMARGIN() {
        return sisamargin;
    }

    /**
     * Sets the value of the sisamargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISAMARGIN(String value) {
        this.sisamargin = value;
    }

    /**
     * Gets the value of the totpaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTPAID() {
        return totpaid;
    }

    /**
     * Sets the value of the totpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTPAID(String value) {
        this.totpaid = value;
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
     *         &lt;element name="SisaOSPokok" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "sisaOSPokok"
    })
    public static class GAMOUNT {

        @XmlElement(name = "SisaOSPokok")
        protected List<String> sisaOSPokok;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the sisaOSPokok property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sisaOSPokok property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSisaOSPokok().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSisaOSPokok() {
            if (sisaOSPokok == null) {
                sisaOSPokok = new ArrayList<String>();
            }
            return this.sisaOSPokok;
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
        protected List<LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GCHARGECODE.MCHARGECODE> mchargecode;
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
         * {@link LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GCHARGECODE.MCHARGECODE }
         * 
         * 
         */
        public List<LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GCHARGECODE.MCHARGECODE> getMCHARGECODE() {
            if (mchargecode == null) {
                mchargecode = new ArrayList<LDLOANSANDDEPOSITSIDIUMRAEARLYMATTWSType.GCHARGECODE.MCHARGECODE>();
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
     *         &lt;element name="INSRNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "insrname"
    })
    public static class GINSRNAME {

        @XmlElement(name = "INSRNAME")
        protected List<String> insrname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the insrname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the insrname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINSRNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINSRNAME() {
            if (insrname == null) {
                insrname = new ArrayList<String>();
            }
            return this.insrname;
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
