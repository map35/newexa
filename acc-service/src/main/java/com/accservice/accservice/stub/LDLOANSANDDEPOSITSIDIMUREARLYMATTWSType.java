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
 * <p>Java class for LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType"&gt;
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
 *         &lt;element name="Kategori" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gINTERESTRATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MarginRate" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RekeningPokok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RekeningMargin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PenurunanPokok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TglPenunrunanPokok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gNEWINTRATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NEWINTRATE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INTRATEVDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="SISAMARGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTPAID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATRBFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTATRBAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType", propOrder = {
    "noCIF",
    "currency",
    "gamount",
    "tglKontrak",
    "tglPelunasan",
    "kategori",
    "ginterestrate",
    "rekeningPokok",
    "rekeningMargin",
    "penurunanPokok",
    "tglPenunrunanPokok",
    "gnewintrate",
    "intratevdate",
    "chrgacct",
    "gchargecode",
    "totchrgamt",
    "prodtype",
    "earlymatdisc",
    "sisamargin",
    "totpaid",
    "atrbflag",
    "totatrbamt",
    "flagsubrogasi"
})
public class LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType {

    @XmlElement(name = "NoCIF")
    protected String noCIF;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "gAMOUNT")
    protected LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GAMOUNT gamount;
    @XmlElement(name = "TglKontrak")
    protected String tglKontrak;
    @XmlElement(name = "TglPelunasan")
    protected String tglPelunasan;
    @XmlElement(name = "Kategori")
    protected String kategori;
    @XmlElement(name = "gINTERESTRATE")
    protected LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GINTERESTRATE ginterestrate;
    @XmlElement(name = "RekeningPokok")
    protected String rekeningPokok;
    @XmlElement(name = "RekeningMargin")
    protected String rekeningMargin;
    @XmlElement(name = "PenurunanPokok")
    protected String penurunanPokok;
    @XmlElement(name = "TglPenunrunanPokok")
    protected String tglPenunrunanPokok;
    @XmlElement(name = "gNEWINTRATE")
    protected LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GNEWINTRATE gnewintrate;
    @XmlElement(name = "INTRATEVDATE")
    protected String intratevdate;
    @XmlElement(name = "CHRGACCT")
    protected String chrgacct;
    @XmlElement(name = "gCHARGE.CODE")
    protected LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GCHARGECODE gchargecode;
    @XmlElement(name = "TOTCHRGAMT")
    protected String totchrgamt;
    @XmlElement(name = "PRODTYPE")
    protected String prodtype;
    @XmlElement(name = "EARLYMATDISC")
    protected String earlymatdisc;
    @XmlElement(name = "SISAMARGIN")
    protected String sisamargin;
    @XmlElement(name = "TOTPAID")
    protected String totpaid;
    @XmlElement(name = "ATRBFLAG")
    protected String atrbflag;
    @XmlElement(name = "TOTATRBAMT")
    protected String totatrbamt;
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
     *     {@link LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GAMOUNT }
     *     
     */
    public LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GAMOUNT getGAMOUNT() {
        return gamount;
    }

    /**
     * Sets the value of the gamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GAMOUNT }
     *     
     */
    public void setGAMOUNT(LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GAMOUNT value) {
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
     * Gets the value of the kategori property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKategori() {
        return kategori;
    }

    /**
     * Sets the value of the kategori property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKategori(String value) {
        this.kategori = value;
    }

    /**
     * Gets the value of the ginterestrate property.
     * 
     * @return
     *     possible object is
     *     {@link LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GINTERESTRATE }
     *     
     */
    public LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GINTERESTRATE getGINTERESTRATE() {
        return ginterestrate;
    }

    /**
     * Sets the value of the ginterestrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GINTERESTRATE }
     *     
     */
    public void setGINTERESTRATE(LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GINTERESTRATE value) {
        this.ginterestrate = value;
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
     * Gets the value of the rekeningMargin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRekeningMargin() {
        return rekeningMargin;
    }

    /**
     * Sets the value of the rekeningMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRekeningMargin(String value) {
        this.rekeningMargin = value;
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
     * Gets the value of the gnewintrate property.
     * 
     * @return
     *     possible object is
     *     {@link LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GNEWINTRATE }
     *     
     */
    public LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GNEWINTRATE getGNEWINTRATE() {
        return gnewintrate;
    }

    /**
     * Sets the value of the gnewintrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GNEWINTRATE }
     *     
     */
    public void setGNEWINTRATE(LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GNEWINTRATE value) {
        this.gnewintrate = value;
    }

    /**
     * Gets the value of the intratevdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTRATEVDATE() {
        return intratevdate;
    }

    /**
     * Sets the value of the intratevdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTRATEVDATE(String value) {
        this.intratevdate = value;
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
     *     {@link LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GCHARGECODE }
     *     
     */
    public LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GCHARGECODE getGCHARGECODE() {
        return gchargecode;
    }

    /**
     * Sets the value of the gchargecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GCHARGECODE }
     *     
     */
    public void setGCHARGECODE(LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GCHARGECODE value) {
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
     * Gets the value of the atrbflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATRBFLAG() {
        return atrbflag;
    }

    /**
     * Sets the value of the atrbflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATRBFLAG(String value) {
        this.atrbflag = value;
    }

    /**
     * Gets the value of the totatrbamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTATRBAMT() {
        return totatrbamt;
    }

    /**
     * Sets the value of the totatrbamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTATRBAMT(String value) {
        this.totatrbamt = value;
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
        protected List<LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GCHARGECODE.MCHARGECODE> mchargecode;
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
         * {@link LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GCHARGECODE.MCHARGECODE }
         * 
         * 
         */
        public List<LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GCHARGECODE.MCHARGECODE> getMCHARGECODE() {
            if (mchargecode == null) {
                mchargecode = new ArrayList<LDLOANSANDDEPOSITSIDIMUREARLYMATTWSType.GCHARGECODE.MCHARGECODE>();
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
     *         &lt;element name="MarginRate" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "marginRate"
    })
    public static class GINTERESTRATE {

        @XmlElement(name = "MarginRate")
        protected List<String> marginRate;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the marginRate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the marginRate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMarginRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMarginRate() {
            if (marginRate == null) {
                marginRate = new ArrayList<String>();
            }
            return this.marginRate;
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
     *         &lt;element name="NEWINTRATE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "newintrate"
    })
    public static class GNEWINTRATE {

        @XmlElement(name = "NEWINTRATE")
        protected List<String> newintrate;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the newintrate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the newintrate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNEWINTRATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNEWINTRATE() {
            if (newintrate == null) {
                newintrate = new ArrayList<String>();
            }
            return this.newintrate;
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
