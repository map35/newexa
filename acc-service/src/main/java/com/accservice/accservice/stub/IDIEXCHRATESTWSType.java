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
 * <p>Java class for IDIEXCHRATESTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIEXCHRATESTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gIDIEXCHRATESTWSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIEXCHRATESTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CURRENCYMARKETCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CURRENCYMARKETNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BUYRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SELLRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MIDRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "IDIEXCHRATESTWSType", propOrder = {
    "gidiexchratestwsDetailType"
})
public class IDIEXCHRATESTWSType {

    @XmlElement(name = "gIDIEXCHRATESTWSDetailType")
    protected IDIEXCHRATESTWSType.GIDIEXCHRATESTWSDetailType gidiexchratestwsDetailType;

    /**
     * Gets the value of the gidiexchratestwsDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIEXCHRATESTWSType.GIDIEXCHRATESTWSDetailType }
     *     
     */
    public IDIEXCHRATESTWSType.GIDIEXCHRATESTWSDetailType getGIDIEXCHRATESTWSDetailType() {
        return gidiexchratestwsDetailType;
    }

    /**
     * Sets the value of the gidiexchratestwsDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIEXCHRATESTWSType.GIDIEXCHRATESTWSDetailType }
     *     
     */
    public void setGIDIEXCHRATESTWSDetailType(IDIEXCHRATESTWSType.GIDIEXCHRATESTWSDetailType value) {
        this.gidiexchratestwsDetailType = value;
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
     *         &lt;element name="mIDIEXCHRATESTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CURRENCYMARKETCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CURRENCYMARKETNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BUYRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SELLRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MIDRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "midiexchratestwsDetailType"
    })
    public static class GIDIEXCHRATESTWSDetailType {

        @XmlElement(name = "mIDIEXCHRATESTWSDetailType")
        protected List<IDIEXCHRATESTWSType.GIDIEXCHRATESTWSDetailType.MIDIEXCHRATESTWSDetailType> midiexchratestwsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midiexchratestwsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midiexchratestwsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIEXCHRATESTWSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIEXCHRATESTWSType.GIDIEXCHRATESTWSDetailType.MIDIEXCHRATESTWSDetailType }
         * 
         * 
         */
        public List<IDIEXCHRATESTWSType.GIDIEXCHRATESTWSDetailType.MIDIEXCHRATESTWSDetailType> getMIDIEXCHRATESTWSDetailType() {
            if (midiexchratestwsDetailType == null) {
                midiexchratestwsDetailType = new ArrayList<IDIEXCHRATESTWSType.GIDIEXCHRATESTWSDetailType.MIDIEXCHRATESTWSDetailType>();
            }
            return this.midiexchratestwsDetailType;
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
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CURRENCYMARKETCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CURRENCYMARKETNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BUYRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SELLRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MIDRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "id",
            "currencymarketcode",
            "currencymarketname",
            "buyrate",
            "sellrate",
            "midrate"
        })
        public static class MIDIEXCHRATESTWSDetailType {

            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "CURRENCYMARKETCODE")
            protected String currencymarketcode;
            @XmlElement(name = "CURRENCYMARKETNAME")
            protected String currencymarketname;
            @XmlElement(name = "BUYRATE")
            protected String buyrate;
            @XmlElement(name = "SELLRATE")
            protected String sellrate;
            @XmlElement(name = "MIDRATE")
            protected String midrate;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
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
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the currencymarketcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCURRENCYMARKETCODE() {
                return currencymarketcode;
            }

            /**
             * Sets the value of the currencymarketcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCURRENCYMARKETCODE(String value) {
                this.currencymarketcode = value;
            }

            /**
             * Gets the value of the currencymarketname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCURRENCYMARKETNAME() {
                return currencymarketname;
            }

            /**
             * Sets the value of the currencymarketname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCURRENCYMARKETNAME(String value) {
                this.currencymarketname = value;
            }

            /**
             * Gets the value of the buyrate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBUYRATE() {
                return buyrate;
            }

            /**
             * Sets the value of the buyrate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBUYRATE(String value) {
                this.buyrate = value;
            }

            /**
             * Gets the value of the sellrate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSELLRATE() {
                return sellrate;
            }

            /**
             * Sets the value of the sellrate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSELLRATE(String value) {
                this.sellrate = value;
            }

            /**
             * Gets the value of the midrate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMIDRATE() {
                return midrate;
            }

            /**
             * Sets the value of the midrate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMIDRATE(String value) {
                this.midrate = value;
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
