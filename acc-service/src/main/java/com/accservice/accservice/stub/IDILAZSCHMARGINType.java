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
 * <p>Java class for IDILAZSCHMARGINType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDILAZSCHMARGINType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AZSCHDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PERIODMARGINAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTALMARGINAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAXAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZAKATAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHARGEAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AZNEXTSCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BRCHCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BREAKAFTMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gINPUTTER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RESERVED5" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gDATETIME" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RESERVED4" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RESERVED3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESERVED2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESERVED1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OVERRIDE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "IDILAZSCHMARGINType", propOrder = {
    "azschdate",
    "periodmarginamt",
    "totalmarginamt",
    "taxamt",
    "zakatamt",
    "chargeamt",
    "aznextsch",
    "brchcode",
    "category",
    "breakaftmat",
    "ginputter",
    "gdatetime",
    "reserved3",
    "reserved2",
    "reserved1",
    "override"
})
public class IDILAZSCHMARGINType {

    @XmlElement(name = "AZSCHDATE")
    protected String azschdate;
    @XmlElement(name = "PERIODMARGINAMT")
    protected String periodmarginamt;
    @XmlElement(name = "TOTALMARGINAMT")
    protected String totalmarginamt;
    @XmlElement(name = "TAXAMT")
    protected String taxamt;
    @XmlElement(name = "ZAKATAMT")
    protected String zakatamt;
    @XmlElement(name = "CHARGEAMT")
    protected String chargeamt;
    @XmlElement(name = "AZNEXTSCH")
    protected String aznextsch;
    @XmlElement(name = "BRCHCODE")
    protected String brchcode;
    @XmlElement(name = "CATEGORY")
    protected String category;
    @XmlElement(name = "BREAKAFTMAT")
    protected String breakaftmat;
    @XmlElement(name = "gINPUTTER")
    protected IDILAZSCHMARGINType.GINPUTTER ginputter;
    @XmlElement(name = "gDATETIME")
    protected IDILAZSCHMARGINType.GDATETIME gdatetime;
    @XmlElement(name = "RESERVED3")
    protected String reserved3;
    @XmlElement(name = "RESERVED2")
    protected String reserved2;
    @XmlElement(name = "RESERVED1")
    protected String reserved1;
    @XmlElement(name = "OVERRIDE")
    protected String override;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the azschdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZSCHDATE() {
        return azschdate;
    }

    /**
     * Sets the value of the azschdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZSCHDATE(String value) {
        this.azschdate = value;
    }

    /**
     * Gets the value of the periodmarginamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERIODMARGINAMT() {
        return periodmarginamt;
    }

    /**
     * Sets the value of the periodmarginamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERIODMARGINAMT(String value) {
        this.periodmarginamt = value;
    }

    /**
     * Gets the value of the totalmarginamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALMARGINAMT() {
        return totalmarginamt;
    }

    /**
     * Sets the value of the totalmarginamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALMARGINAMT(String value) {
        this.totalmarginamt = value;
    }

    /**
     * Gets the value of the taxamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXAMT() {
        return taxamt;
    }

    /**
     * Sets the value of the taxamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXAMT(String value) {
        this.taxamt = value;
    }

    /**
     * Gets the value of the zakatamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZAKATAMT() {
        return zakatamt;
    }

    /**
     * Sets the value of the zakatamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZAKATAMT(String value) {
        this.zakatamt = value;
    }

    /**
     * Gets the value of the chargeamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARGEAMT() {
        return chargeamt;
    }

    /**
     * Sets the value of the chargeamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARGEAMT(String value) {
        this.chargeamt = value;
    }

    /**
     * Gets the value of the aznextsch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZNEXTSCH() {
        return aznextsch;
    }

    /**
     * Sets the value of the aznextsch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZNEXTSCH(String value) {
        this.aznextsch = value;
    }

    /**
     * Gets the value of the brchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRCHCODE() {
        return brchcode;
    }

    /**
     * Sets the value of the brchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRCHCODE(String value) {
        this.brchcode = value;
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
     * Gets the value of the breakaftmat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBREAKAFTMAT() {
        return breakaftmat;
    }

    /**
     * Sets the value of the breakaftmat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBREAKAFTMAT(String value) {
        this.breakaftmat = value;
    }

    /**
     * Gets the value of the ginputter property.
     * 
     * @return
     *     possible object is
     *     {@link IDILAZSCHMARGINType.GINPUTTER }
     *     
     */
    public IDILAZSCHMARGINType.GINPUTTER getGINPUTTER() {
        return ginputter;
    }

    /**
     * Sets the value of the ginputter property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDILAZSCHMARGINType.GINPUTTER }
     *     
     */
    public void setGINPUTTER(IDILAZSCHMARGINType.GINPUTTER value) {
        this.ginputter = value;
    }

    /**
     * Gets the value of the gdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link IDILAZSCHMARGINType.GDATETIME }
     *     
     */
    public IDILAZSCHMARGINType.GDATETIME getGDATETIME() {
        return gdatetime;
    }

    /**
     * Sets the value of the gdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDILAZSCHMARGINType.GDATETIME }
     *     
     */
    public void setGDATETIME(IDILAZSCHMARGINType.GDATETIME value) {
        this.gdatetime = value;
    }

    /**
     * Gets the value of the reserved3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED3() {
        return reserved3;
    }

    /**
     * Sets the value of the reserved3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED3(String value) {
        this.reserved3 = value;
    }

    /**
     * Gets the value of the reserved2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED2() {
        return reserved2;
    }

    /**
     * Sets the value of the reserved2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED2(String value) {
        this.reserved2 = value;
    }

    /**
     * Gets the value of the reserved1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED1() {
        return reserved1;
    }

    /**
     * Sets the value of the reserved1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED1(String value) {
        this.reserved1 = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVERRIDE() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVERRIDE(String value) {
        this.override = value;
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
     *         &lt;element name="RESERVED4" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "reserved4"
    })
    public static class GDATETIME {

        @XmlElement(name = "RESERVED4")
        protected List<String> reserved4;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the reserved4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reserved4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRESERVED4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRESERVED4() {
            if (reserved4 == null) {
                reserved4 = new ArrayList<String>();
            }
            return this.reserved4;
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
     *         &lt;element name="RESERVED5" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "reserved5"
    })
    public static class GINPUTTER {

        @XmlElement(name = "RESERVED5")
        protected List<String> reserved5;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the reserved5 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reserved5 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRESERVED5().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRESERVED5() {
            if (reserved5 == null) {
                reserved5 = new ArrayList<String>();
            }
            return this.reserved5;
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
