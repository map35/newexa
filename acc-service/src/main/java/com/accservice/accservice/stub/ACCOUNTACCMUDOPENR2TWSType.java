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
 * <p>Java class for ACCOUNTACCMUDOPENR2TWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACCOUNTACCMUDOPENR2TWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NoCIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrintedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassbookY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlternateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gJOINTHOLDER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mJOINTHOLDER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="JointHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RelationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="sgJOINTNOTES" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="JointNotes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *         &lt;element name="NOREFERAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MUDNISBAHBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZAKAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QQNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gE.SERVICES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ESERVICES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAXABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACOPENPURPOSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OTHACCPURPOSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REFOUTSOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REFPROGRAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EVENTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCTRECVBONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ACCOUNTACCMUDOPENR2TWSType", propOrder = {
    "noCIF",
    "productCode",
    "printedName",
    "currency",
    "accountOfficer",
    "passbookY",
    "alternateNumber",
    "gjointholder",
    "noreferal",
    "mudnisbahbank",
    "zakat",
    "qqname",
    "geservices",
    "taxable",
    "acopenpurpose",
    "othaccpurpose",
    "refoutsource",
    "refprogram",
    "eventcode",
    "acctrecvbonus"
})
public class ACCOUNTACCMUDOPENR2TWSType {

    @XmlElement(name = "NoCIF")
    protected String noCIF;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "PrintedName")
    protected String printedName;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "AccountOfficer")
    protected String accountOfficer;
    @XmlElement(name = "PassbookY")
    protected String passbookY;
    @XmlElement(name = "AlternateNumber")
    protected String alternateNumber;
    @XmlElement(name = "gJOINTHOLDER")
    protected ACCOUNTACCMUDOPENR2TWSType.GJOINTHOLDER gjointholder;
    @XmlElement(name = "NOREFERAL")
    protected String noreferal;
    @XmlElement(name = "MUDNISBAHBANK")
    protected String mudnisbahbank;
    @XmlElement(name = "ZAKAT")
    protected String zakat;
    @XmlElement(name = "QQNAME")
    protected String qqname;
    @XmlElement(name = "gE.SERVICES")
    protected ACCOUNTACCMUDOPENR2TWSType.GESERVICES geservices;
    @XmlElement(name = "TAXABLE")
    protected String taxable;
    @XmlElement(name = "ACOPENPURPOSE")
    protected String acopenpurpose;
    @XmlElement(name = "OTHACCPURPOSE")
    protected String othaccpurpose;
    @XmlElement(name = "REFOUTSOURCE")
    protected String refoutsource;
    @XmlElement(name = "REFPROGRAM")
    protected String refprogram;
    @XmlElement(name = "EVENTCODE")
    protected String eventcode;
    @XmlElement(name = "ACCTRECVBONUS")
    protected String acctrecvbonus;
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
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the printedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintedName() {
        return printedName;
    }

    /**
     * Sets the value of the printedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintedName(String value) {
        this.printedName = value;
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
     * Gets the value of the accountOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOfficer() {
        return accountOfficer;
    }

    /**
     * Sets the value of the accountOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOfficer(String value) {
        this.accountOfficer = value;
    }

    /**
     * Gets the value of the passbookY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassbookY() {
        return passbookY;
    }

    /**
     * Sets the value of the passbookY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassbookY(String value) {
        this.passbookY = value;
    }

    /**
     * Gets the value of the alternateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateNumber() {
        return alternateNumber;
    }

    /**
     * Sets the value of the alternateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateNumber(String value) {
        this.alternateNumber = value;
    }

    /**
     * Gets the value of the gjointholder property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTACCMUDOPENR2TWSType.GJOINTHOLDER }
     *     
     */
    public ACCOUNTACCMUDOPENR2TWSType.GJOINTHOLDER getGJOINTHOLDER() {
        return gjointholder;
    }

    /**
     * Sets the value of the gjointholder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTACCMUDOPENR2TWSType.GJOINTHOLDER }
     *     
     */
    public void setGJOINTHOLDER(ACCOUNTACCMUDOPENR2TWSType.GJOINTHOLDER value) {
        this.gjointholder = value;
    }

    /**
     * Gets the value of the noreferal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOREFERAL() {
        return noreferal;
    }

    /**
     * Sets the value of the noreferal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOREFERAL(String value) {
        this.noreferal = value;
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
     * Gets the value of the geservices property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTACCMUDOPENR2TWSType.GESERVICES }
     *     
     */
    public ACCOUNTACCMUDOPENR2TWSType.GESERVICES getGESERVICES() {
        return geservices;
    }

    /**
     * Sets the value of the geservices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTACCMUDOPENR2TWSType.GESERVICES }
     *     
     */
    public void setGESERVICES(ACCOUNTACCMUDOPENR2TWSType.GESERVICES value) {
        this.geservices = value;
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
     * Gets the value of the acopenpurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACOPENPURPOSE() {
        return acopenpurpose;
    }

    /**
     * Sets the value of the acopenpurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACOPENPURPOSE(String value) {
        this.acopenpurpose = value;
    }

    /**
     * Gets the value of the othaccpurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTHACCPURPOSE() {
        return othaccpurpose;
    }

    /**
     * Sets the value of the othaccpurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTHACCPURPOSE(String value) {
        this.othaccpurpose = value;
    }

    /**
     * Gets the value of the refoutsource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFOUTSOURCE() {
        return refoutsource;
    }

    /**
     * Sets the value of the refoutsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFOUTSOURCE(String value) {
        this.refoutsource = value;
    }

    /**
     * Gets the value of the refprogram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFPROGRAM() {
        return refprogram;
    }

    /**
     * Sets the value of the refprogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFPROGRAM(String value) {
        this.refprogram = value;
    }

    /**
     * Gets the value of the eventcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTCODE() {
        return eventcode;
    }

    /**
     * Sets the value of the eventcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTCODE(String value) {
        this.eventcode = value;
    }

    /**
     * Gets the value of the acctrecvbonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTRECVBONUS() {
        return acctrecvbonus;
    }

    /**
     * Sets the value of the acctrecvbonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTRECVBONUS(String value) {
        this.acctrecvbonus = value;
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
     *         &lt;element name="ESERVICES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "eservices"
    })
    public static class GESERVICES {

        @XmlElement(name = "ESERVICES")
        protected List<String> eservices;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the eservices property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eservices property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESERVICES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getESERVICES() {
            if (eservices == null) {
                eservices = new ArrayList<String>();
            }
            return this.eservices;
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
     *         &lt;element name="mJOINTHOLDER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="JointHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RelationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="sgJOINTNOTES" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="JointNotes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
        "mjointholder"
    })
    public static class GJOINTHOLDER {

        @XmlElement(name = "mJOINTHOLDER")
        protected List<ACCOUNTACCMUDOPENR2TWSType.GJOINTHOLDER.MJOINTHOLDER> mjointholder;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mjointholder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mjointholder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMJOINTHOLDER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACCOUNTACCMUDOPENR2TWSType.GJOINTHOLDER.MJOINTHOLDER }
         * 
         * 
         */
        public List<ACCOUNTACCMUDOPENR2TWSType.GJOINTHOLDER.MJOINTHOLDER> getMJOINTHOLDER() {
            if (mjointholder == null) {
                mjointholder = new ArrayList<ACCOUNTACCMUDOPENR2TWSType.GJOINTHOLDER.MJOINTHOLDER>();
            }
            return this.mjointholder;
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
         *         &lt;element name="JointHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RelationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="sgJOINTNOTES" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="JointNotes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "jointHolder",
            "relationCode",
            "sgJOINTNOTES"
        })
        public static class MJOINTHOLDER {

            @XmlElement(name = "JointHolder")
            protected String jointHolder;
            @XmlElement(name = "RelationCode")
            protected String relationCode;
            protected ACCOUNTACCMUDOPENR2TWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES sgJOINTNOTES;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the jointHolder property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJointHolder() {
                return jointHolder;
            }

            /**
             * Sets the value of the jointHolder property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJointHolder(String value) {
                this.jointHolder = value;
            }

            /**
             * Gets the value of the relationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelationCode() {
                return relationCode;
            }

            /**
             * Sets the value of the relationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelationCode(String value) {
                this.relationCode = value;
            }

            /**
             * Gets the value of the sgJOINTNOTES property.
             * 
             * @return
             *     possible object is
             *     {@link ACCOUNTACCMUDOPENR2TWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES }
             *     
             */
            public ACCOUNTACCMUDOPENR2TWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES getSgJOINTNOTES() {
                return sgJOINTNOTES;
            }

            /**
             * Sets the value of the sgJOINTNOTES property.
             * 
             * @param value
             *     allowed object is
             *     {@link ACCOUNTACCMUDOPENR2TWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES }
             *     
             */
            public void setSgJOINTNOTES(ACCOUNTACCMUDOPENR2TWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES value) {
                this.sgJOINTNOTES = value;
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
             *         &lt;element name="JointNotes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "jointNotes"
            })
            public static class SgJOINTNOTES {

                @XmlElement(name = "JointNotes")
                protected List<String> jointNotes;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the jointNotes property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the jointNotes property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getJointNotes().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getJointNotes() {
                    if (jointNotes == null) {
                        jointNotes = new ArrayList<String>();
                    }
                    return this.jointNotes;
                }

                /**
                 * Gets the value of the sg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Sets the value of the sg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
                }

            }

        }

    }

}
