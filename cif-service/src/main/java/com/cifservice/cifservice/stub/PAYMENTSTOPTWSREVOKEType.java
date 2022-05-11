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
 * <p>Java class for PAYMENTSTOPTWSREVOKEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAYMENTSTOPTWSREVOKEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KCURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMERNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gMODPSCHQNO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mMODPSCHQNO" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MODPSCHQNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MODCHQTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MODPSDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAYMENTSTOPTWSREVOKEType", propOrder = {
    "kcurrency",
    "customerno",
    "gmodpschqno"
})
public class PAYMENTSTOPTWSREVOKEType {

    @XmlElement(name = "KCURRENCY")
    protected String kcurrency;
    @XmlElement(name = "CUSTOMERNO")
    protected String customerno;
    @XmlElement(name = "gMODPSCHQNO")
    protected PAYMENTSTOPTWSREVOKEType.GMODPSCHQNO gmodpschqno;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the kcurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCURRENCY() {
        return kcurrency;
    }

    /**
     * Sets the value of the kcurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCURRENCY(String value) {
        this.kcurrency = value;
    }

    /**
     * Gets the value of the customerno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERNO() {
        return customerno;
    }

    /**
     * Sets the value of the customerno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERNO(String value) {
        this.customerno = value;
    }

    /**
     * Gets the value of the gmodpschqno property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTSTOPTWSREVOKEType.GMODPSCHQNO }
     *     
     */
    public PAYMENTSTOPTWSREVOKEType.GMODPSCHQNO getGMODPSCHQNO() {
        return gmodpschqno;
    }

    /**
     * Sets the value of the gmodpschqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTSTOPTWSREVOKEType.GMODPSCHQNO }
     *     
     */
    public void setGMODPSCHQNO(PAYMENTSTOPTWSREVOKEType.GMODPSCHQNO value) {
        this.gmodpschqno = value;
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
     *         &lt;element name="mMODPSCHQNO" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MODPSCHQNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MODCHQTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MODPSDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mmodpschqno"
    })
    public static class GMODPSCHQNO {

        @XmlElement(name = "mMODPSCHQNO")
        protected List<PAYMENTSTOPTWSREVOKEType.GMODPSCHQNO.MMODPSCHQNO> mmodpschqno;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mmodpschqno property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mmodpschqno property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMMODPSCHQNO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PAYMENTSTOPTWSREVOKEType.GMODPSCHQNO.MMODPSCHQNO }
         * 
         * 
         */
        public List<PAYMENTSTOPTWSREVOKEType.GMODPSCHQNO.MMODPSCHQNO> getMMODPSCHQNO() {
            if (mmodpschqno == null) {
                mmodpschqno = new ArrayList<PAYMENTSTOPTWSREVOKEType.GMODPSCHQNO.MMODPSCHQNO>();
            }
            return this.mmodpschqno;
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
         *         &lt;element name="MODPSCHQNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MODCHQTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MODPSDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "modpschqno",
            "modchqtype",
            "modpsdate"
        })
        public static class MMODPSCHQNO {

            @XmlElement(name = "MODPSCHQNO")
            protected String modpschqno;
            @XmlElement(name = "MODCHQTYPE")
            protected String modchqtype;
            @XmlElement(name = "MODPSDATE")
            protected String modpsdate;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the modpschqno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMODPSCHQNO() {
                return modpschqno;
            }

            /**
             * Sets the value of the modpschqno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMODPSCHQNO(String value) {
                this.modpschqno = value;
            }

            /**
             * Gets the value of the modchqtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMODCHQTYPE() {
                return modchqtype;
            }

            /**
             * Sets the value of the modchqtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMODCHQTYPE(String value) {
                this.modchqtype = value;
            }

            /**
             * Gets the value of the modpsdate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMODPSDATE() {
                return modpsdate;
            }

            /**
             * Sets the value of the modpsdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMODPSDATE(String value) {
                this.modpsdate = value;
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
