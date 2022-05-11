//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.28 at 04:01:46 PM WIB 
//


package com.twscoba.twscoba.newstub;

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
 * <p>Java class for ACCOUNTIDIACEWALLETOPENTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACCOUNTIDIACEWALLETOPENTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNTTITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNTOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PASSBOOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ALTACCTID1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOREFERAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="BONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ACCOUNTIDIACEWALLETOPENTWSType", propOrder = {
    "customer",
    "category",
    "accounttitle1",
    "currency",
    "accountofficer",
    "passbook",
    "altacctid1",
    "noreferal",
    "zakat",
    "qqname",
    "geservices",
    "taxable",
    "bonus",
    "acopenpurpose",
    "othaccpurpose",
    "refoutsource",
    "refprogram",
    "eventcode",
    "acctrecvbonus"
})
public class ACCOUNTIDIACEWALLETOPENTWSType {

    @XmlElement(name = "CUSTOMER")
    protected String customer;
    @XmlElement(name = "CATEGORY")
    protected String category;
    @XmlElement(name = "ACCOUNTTITLE1")
    protected String accounttitle1;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "ACCOUNTOFFICER")
    protected String accountofficer;
    @XmlElement(name = "PASSBOOK")
    protected String passbook;
    @XmlElement(name = "ALTACCTID1")
    protected String altacctid1;
    @XmlElement(name = "NOREFERAL")
    protected String noreferal;
    @XmlElement(name = "ZAKAT")
    protected String zakat;
    @XmlElement(name = "QQNAME")
    protected String qqname;
    @XmlElement(name = "gE.SERVICES")
    protected ACCOUNTIDIACEWALLETOPENTWSType.GESERVICES geservices;
    @XmlElement(name = "TAXABLE")
    protected String taxable;
    @XmlElement(name = "BONUS")
    protected String bonus;
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
     * Gets the value of the accounttitle1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTTITLE1() {
        return accounttitle1;
    }

    /**
     * Sets the value of the accounttitle1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTTITLE1(String value) {
        this.accounttitle1 = value;
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
     * Gets the value of the accountofficer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTOFFICER() {
        return accountofficer;
    }

    /**
     * Sets the value of the accountofficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTOFFICER(String value) {
        this.accountofficer = value;
    }

    /**
     * Gets the value of the passbook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSBOOK() {
        return passbook;
    }

    /**
     * Sets the value of the passbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSBOOK(String value) {
        this.passbook = value;
    }

    /**
     * Gets the value of the altacctid1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALTACCTID1() {
        return altacctid1;
    }

    /**
     * Sets the value of the altacctid1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALTACCTID1(String value) {
        this.altacctid1 = value;
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
     *     {@link ACCOUNTIDIACEWALLETOPENTWSType.GESERVICES }
     *     
     */
    public ACCOUNTIDIACEWALLETOPENTWSType.GESERVICES getGESERVICES() {
        return geservices;
    }

    /**
     * Sets the value of the geservices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTIDIACEWALLETOPENTWSType.GESERVICES }
     *     
     */
    public void setGESERVICES(ACCOUNTIDIACEWALLETOPENTWSType.GESERVICES value) {
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
     * Gets the value of the bonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBONUS() {
        return bonus;
    }

    /**
     * Sets the value of the bonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBONUS(String value) {
        this.bonus = value;
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

}
