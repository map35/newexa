//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.12 at 03:47:20 PM WIB 
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
 * <p>Java class for AZACCOUNTIDISPOPENPRINCTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AZACCOUNTIDISPOPENPRINCTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ALLINONEPRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRINCIPAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VALUEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MATURITYDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REPAYACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOMINATEDACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SCHEDULES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CALCULATIONBASE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FORWARDBACKWARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gTYPEOFSCHDLE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mTYPEOFSCHDLE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TYPEOFSCHDLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AMOUNT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FREQUENCY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMBER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="MUDPRINTEDNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MUDNISBAHBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MUDSPCNISBAH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MUDSPCRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MUDNISBAH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MUDNISBAHRTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZAKAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NROPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QQNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAXABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "AZACCOUNTIDISPOPENPRINCTWSType", propOrder = {
    "customer",
    "category",
    "currency",
    "allinoneproduct",
    "principal",
    "valuedate",
    "maturitydate",
    "repayaccount",
    "nominatedaccount",
    "schedules",
    "calculationbase",
    "forwardbackward",
    "gtypeofschdle",
    "mudprintednam",
    "mudnisbahbank",
    "mudspcnisbah",
    "mudspcrate",
    "mudnisbah",
    "mudnisbahrte",
    "zakat",
    "nroption",
    "qqname",
    "taxable"
})
public class AZACCOUNTIDISPOPENPRINCTWSType {

    @XmlElement(name = "CUSTOMER")
    protected String customer;
    @XmlElement(name = "CATEGORY")
    protected String category;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "ALLINONEPRODUCT")
    protected String allinoneproduct;
    @XmlElement(name = "PRINCIPAL")
    protected String principal;
    @XmlElement(name = "VALUEDATE")
    protected String valuedate;
    @XmlElement(name = "MATURITYDATE")
    protected String maturitydate;
    @XmlElement(name = "REPAYACCOUNT")
    protected String repayaccount;
    @XmlElement(name = "NOMINATEDACCOUNT")
    protected String nominatedaccount;
    @XmlElement(name = "SCHEDULES")
    protected String schedules;
    @XmlElement(name = "CALCULATIONBASE")
    protected String calculationbase;
    @XmlElement(name = "FORWARDBACKWARD")
    protected String forwardbackward;
    @XmlElement(name = "gTYPEOFSCHDLE")
    protected AZACCOUNTIDISPOPENPRINCTWSType.GTYPEOFSCHDLE gtypeofschdle;
    @XmlElement(name = "MUDPRINTEDNAM")
    protected String mudprintednam;
    @XmlElement(name = "MUDNISBAHBANK")
    protected String mudnisbahbank;
    @XmlElement(name = "MUDSPCNISBAH")
    protected String mudspcnisbah;
    @XmlElement(name = "MUDSPCRATE")
    protected String mudspcrate;
    @XmlElement(name = "MUDNISBAH")
    protected String mudnisbah;
    @XmlElement(name = "MUDNISBAHRTE")
    protected String mudnisbahrte;
    @XmlElement(name = "ZAKAT")
    protected String zakat;
    @XmlElement(name = "NROPTION")
    protected String nroption;
    @XmlElement(name = "QQNAME")
    protected String qqname;
    @XmlElement(name = "TAXABLE")
    protected String taxable;
    @XmlAttribute(name = "id")
    protected String id;

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
     * Gets the value of the allinoneproduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLINONEPRODUCT() {
        return allinoneproduct;
    }

    /**
     * Sets the value of the allinoneproduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLINONEPRODUCT(String value) {
        this.allinoneproduct = value;
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
     * Gets the value of the schedules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCHEDULES() {
        return schedules;
    }

    /**
     * Sets the value of the schedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCHEDULES(String value) {
        this.schedules = value;
    }

    /**
     * Gets the value of the calculationbase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALCULATIONBASE() {
        return calculationbase;
    }

    /**
     * Sets the value of the calculationbase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALCULATIONBASE(String value) {
        this.calculationbase = value;
    }

    /**
     * Gets the value of the forwardbackward property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORWARDBACKWARD() {
        return forwardbackward;
    }

    /**
     * Sets the value of the forwardbackward property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORWARDBACKWARD(String value) {
        this.forwardbackward = value;
    }

    /**
     * Gets the value of the gtypeofschdle property.
     * 
     * @return
     *     possible object is
     *     {@link AZACCOUNTIDISPOPENPRINCTWSType.GTYPEOFSCHDLE }
     *     
     */
    public AZACCOUNTIDISPOPENPRINCTWSType.GTYPEOFSCHDLE getGTYPEOFSCHDLE() {
        return gtypeofschdle;
    }

    /**
     * Sets the value of the gtypeofschdle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AZACCOUNTIDISPOPENPRINCTWSType.GTYPEOFSCHDLE }
     *     
     */
    public void setGTYPEOFSCHDLE(AZACCOUNTIDISPOPENPRINCTWSType.GTYPEOFSCHDLE value) {
        this.gtypeofschdle = value;
    }

    /**
     * Gets the value of the mudprintednam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMUDPRINTEDNAM() {
        return mudprintednam;
    }

    /**
     * Sets the value of the mudprintednam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMUDPRINTEDNAM(String value) {
        this.mudprintednam = value;
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
     * Gets the value of the mudnisbahrte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMUDNISBAHRTE() {
        return mudnisbahrte;
    }

    /**
     * Sets the value of the mudnisbahrte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMUDNISBAHRTE(String value) {
        this.mudnisbahrte = value;
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
     * Gets the value of the nroption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNROPTION() {
        return nroption;
    }

    /**
     * Sets the value of the nroption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNROPTION(String value) {
        this.nroption = value;
    }

    /**
     * Gets the value of the qqname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQQNAME() {
        return qqname;
    }

    /**
     * Sets the value of the qqname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQQNAME(String value) {
        this.qqname = value;
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
     *         &lt;element name="mTYPEOFSCHDLE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPEOFSCHDLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AMOUNT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FREQUENCY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMBER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mtypeofschdle"
    })
    public static class GTYPEOFSCHDLE {

        @XmlElement(name = "mTYPEOFSCHDLE")
        protected List<AZACCOUNTIDISPOPENPRINCTWSType.GTYPEOFSCHDLE.MTYPEOFSCHDLE> mtypeofschdle;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtypeofschdle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtypeofschdle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTYPEOFSCHDLE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AZACCOUNTIDISPOPENPRINCTWSType.GTYPEOFSCHDLE.MTYPEOFSCHDLE }
         * 
         * 
         */
        public List<AZACCOUNTIDISPOPENPRINCTWSType.GTYPEOFSCHDLE.MTYPEOFSCHDLE> getMTYPEOFSCHDLE() {
            if (mtypeofschdle == null) {
                mtypeofschdle = new ArrayList<AZACCOUNTIDISPOPENPRINCTWSType.GTYPEOFSCHDLE.MTYPEOFSCHDLE>();
            }
            return this.mtypeofschdle;
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
         *         &lt;element name="TYPEOFSCHDLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AMOUNT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FREQUENCY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMBER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "typeofschdle1",
            "amount1",
            "frequency1",
            "number1"
        })
        public static class MTYPEOFSCHDLE {

            @XmlElement(name = "TYPEOFSCHDLE1")
            protected String typeofschdle1;
            @XmlElement(name = "AMOUNT1")
            protected String amount1;
            @XmlElement(name = "FREQUENCY1")
            protected String frequency1;
            @XmlElement(name = "NUMBER1")
            protected String number1;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the typeofschdle1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEOFSCHDLE1() {
                return typeofschdle1;
            }

            /**
             * Sets the value of the typeofschdle1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEOFSCHDLE1(String value) {
                this.typeofschdle1 = value;
            }

            /**
             * Gets the value of the amount1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAMOUNT1() {
                return amount1;
            }

            /**
             * Sets the value of the amount1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAMOUNT1(String value) {
                this.amount1 = value;
            }

            /**
             * Gets the value of the frequency1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFREQUENCY1() {
                return frequency1;
            }

            /**
             * Sets the value of the frequency1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFREQUENCY1(String value) {
                this.frequency1 = value;
            }

            /**
             * Gets the value of the number1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMBER1() {
                return number1;
            }

            /**
             * Sets the value of the number1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMBER1(String value) {
                this.number1 = value;
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
