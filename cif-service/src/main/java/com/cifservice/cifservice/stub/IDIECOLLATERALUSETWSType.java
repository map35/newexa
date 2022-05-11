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
 * <p>Java class for IDIECOLLATERALUSETWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIECOLLATERALUSETWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TOTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FOOTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTALALOKASI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FOOTER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SISAALOKASI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FOOTER2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZERODISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gIDIECOLLATERALUSETWSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIECOLLATERALUSETWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BPAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="KOLCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COLLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EXECUTIONVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMINALVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYINGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OWNEVIDENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COLLLINK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AAREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AACOLLPRCTG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PERCENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "IDIECOLLATERALUSETWSType", propOrder = {
    "total",
    "footer",
    "totalalokasi",
    "footer1",
    "sisaalokasi",
    "footer2",
    "zerodisplay",
    "gidiecollateralusetwsDetailType"
})
public class IDIECOLLATERALUSETWSType {

    @XmlElement(name = "TOTAL")
    protected String total;
    @XmlElement(name = "FOOTER")
    protected String footer;
    @XmlElement(name = "TOTALALOKASI")
    protected String totalalokasi;
    @XmlElement(name = "FOOTER1")
    protected String footer1;
    @XmlElement(name = "SISAALOKASI")
    protected String sisaalokasi;
    @XmlElement(name = "FOOTER2")
    protected String footer2;
    @XmlElement(name = "ZERODISPLAY")
    protected String zerodisplay;
    @XmlElement(name = "gIDIECOLLATERALUSETWSDetailType")
    protected IDIECOLLATERALUSETWSType.GIDIECOLLATERALUSETWSDetailType gidiecollateralusetwsDetailType;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTAL() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTAL(String value) {
        this.total = value;
    }

    /**
     * Gets the value of the footer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOOTER() {
        return footer;
    }

    /**
     * Sets the value of the footer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOOTER(String value) {
        this.footer = value;
    }

    /**
     * Gets the value of the totalalokasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALALOKASI() {
        return totalalokasi;
    }

    /**
     * Sets the value of the totalalokasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALALOKASI(String value) {
        this.totalalokasi = value;
    }

    /**
     * Gets the value of the footer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOOTER1() {
        return footer1;
    }

    /**
     * Sets the value of the footer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOOTER1(String value) {
        this.footer1 = value;
    }

    /**
     * Gets the value of the sisaalokasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISAALOKASI() {
        return sisaalokasi;
    }

    /**
     * Sets the value of the sisaalokasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISAALOKASI(String value) {
        this.sisaalokasi = value;
    }

    /**
     * Gets the value of the footer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOOTER2() {
        return footer2;
    }

    /**
     * Sets the value of the footer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOOTER2(String value) {
        this.footer2 = value;
    }

    /**
     * Gets the value of the zerodisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZERODISPLAY() {
        return zerodisplay;
    }

    /**
     * Sets the value of the zerodisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZERODISPLAY(String value) {
        this.zerodisplay = value;
    }

    /**
     * Gets the value of the gidiecollateralusetwsDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIECOLLATERALUSETWSType.GIDIECOLLATERALUSETWSDetailType }
     *     
     */
    public IDIECOLLATERALUSETWSType.GIDIECOLLATERALUSETWSDetailType getGIDIECOLLATERALUSETWSDetailType() {
        return gidiecollateralusetwsDetailType;
    }

    /**
     * Sets the value of the gidiecollateralusetwsDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIECOLLATERALUSETWSType.GIDIECOLLATERALUSETWSDetailType }
     *     
     */
    public void setGIDIECOLLATERALUSETWSDetailType(IDIECOLLATERALUSETWSType.GIDIECOLLATERALUSETWSDetailType value) {
        this.gidiecollateralusetwsDetailType = value;
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
     *         &lt;element name="mIDIECOLLATERALUSETWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BPAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="KOLCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COLLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EXECUTIONVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMINALVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYINGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OWNEVIDENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COLLLINK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AAREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AACOLLPRCTG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PERCENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "midiecollateralusetwsDetailType"
    })
    public static class GIDIECOLLATERALUSETWSDetailType {

        @XmlElement(name = "mIDIECOLLATERALUSETWSDetailType")
        protected List<IDIECOLLATERALUSETWSType.GIDIECOLLATERALUSETWSDetailType.MIDIECOLLATERALUSETWSDetailType> midiecollateralusetwsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midiecollateralusetwsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midiecollateralusetwsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIECOLLATERALUSETWSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIECOLLATERALUSETWSType.GIDIECOLLATERALUSETWSDetailType.MIDIECOLLATERALUSETWSDetailType }
         * 
         * 
         */
        public List<IDIECOLLATERALUSETWSType.GIDIECOLLATERALUSETWSDetailType.MIDIECOLLATERALUSETWSDetailType> getMIDIECOLLATERALUSETWSDetailType() {
            if (midiecollateralusetwsDetailType == null) {
                midiecollateralusetwsDetailType = new ArrayList<IDIECOLLATERALUSETWSType.GIDIECOLLATERALUSETWSDetailType.MIDIECOLLATERALUSETWSDetailType>();
            }
            return this.midiecollateralusetwsDetailType;
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
         *         &lt;element name="BPAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="KOLCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COLLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EXECUTIONVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMINALVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYINGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OWNEVIDENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COLLLINK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AAREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AACOLLPRCTG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PERCENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "bpage",
            "kolcode",
            "custname",
            "colltype",
            "executionvalue",
            "nominalvalue",
            "tyingtype",
            "ownevidence",
            "colllink",
            "aareference",
            "aacollprctg",
            "percent"
        })
        public static class MIDIECOLLATERALUSETWSDetailType {

            @XmlElement(name = "BPAGE")
            protected String bpage;
            @XmlElement(name = "KOLCODE")
            protected String kolcode;
            @XmlElement(name = "CUSTNAME")
            protected String custname;
            @XmlElement(name = "COLLTYPE")
            protected String colltype;
            @XmlElement(name = "EXECUTIONVALUE")
            protected String executionvalue;
            @XmlElement(name = "NOMINALVALUE")
            protected String nominalvalue;
            @XmlElement(name = "TYINGTYPE")
            protected String tyingtype;
            @XmlElement(name = "OWNEVIDENCE")
            protected String ownevidence;
            @XmlElement(name = "COLLLINK")
            protected String colllink;
            @XmlElement(name = "AAREFERENCE")
            protected String aareference;
            @XmlElement(name = "AACOLLPRCTG")
            protected String aacollprctg;
            @XmlElement(name = "PERCENT")
            protected String percent;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the bpage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBPAGE() {
                return bpage;
            }

            /**
             * Sets the value of the bpage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBPAGE(String value) {
                this.bpage = value;
            }

            /**
             * Gets the value of the kolcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKOLCODE() {
                return kolcode;
            }

            /**
             * Sets the value of the kolcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKOLCODE(String value) {
                this.kolcode = value;
            }

            /**
             * Gets the value of the custname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUSTNAME() {
                return custname;
            }

            /**
             * Sets the value of the custname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUSTNAME(String value) {
                this.custname = value;
            }

            /**
             * Gets the value of the colltype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOLLTYPE() {
                return colltype;
            }

            /**
             * Sets the value of the colltype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOLLTYPE(String value) {
                this.colltype = value;
            }

            /**
             * Gets the value of the executionvalue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXECUTIONVALUE() {
                return executionvalue;
            }

            /**
             * Sets the value of the executionvalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXECUTIONVALUE(String value) {
                this.executionvalue = value;
            }

            /**
             * Gets the value of the nominalvalue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMINALVALUE() {
                return nominalvalue;
            }

            /**
             * Sets the value of the nominalvalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMINALVALUE(String value) {
                this.nominalvalue = value;
            }

            /**
             * Gets the value of the tyingtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYINGTYPE() {
                return tyingtype;
            }

            /**
             * Sets the value of the tyingtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYINGTYPE(String value) {
                this.tyingtype = value;
            }

            /**
             * Gets the value of the ownevidence property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOWNEVIDENCE() {
                return ownevidence;
            }

            /**
             * Sets the value of the ownevidence property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOWNEVIDENCE(String value) {
                this.ownevidence = value;
            }

            /**
             * Gets the value of the colllink property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOLLLINK() {
                return colllink;
            }

            /**
             * Sets the value of the colllink property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOLLLINK(String value) {
                this.colllink = value;
            }

            /**
             * Gets the value of the aareference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAAREFERENCE() {
                return aareference;
            }

            /**
             * Sets the value of the aareference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAAREFERENCE(String value) {
                this.aareference = value;
            }

            /**
             * Gets the value of the aacollprctg property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAACOLLPRCTG() {
                return aacollprctg;
            }

            /**
             * Sets the value of the aacollprctg property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAACOLLPRCTG(String value) {
                this.aacollprctg = value;
            }

            /**
             * Gets the value of the percent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPERCENT() {
                return percent;
            }

            /**
             * Sets the value of the percent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPERCENT(String value) {
                this.percent = value;
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
