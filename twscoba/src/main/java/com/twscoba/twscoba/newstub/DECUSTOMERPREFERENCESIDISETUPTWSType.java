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
 * <p>Java class for DECUSTOMERPREFERENCESIDISETUPTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DECUSTOMERPREFERENCESIDISETUPTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gMESSAGEGROUP" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mMESSAGEGROUP" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MESSAGEGROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="sgCARRIER" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CARRIER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CARRIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="REQUIRED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
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
 *         &lt;element name="NOTIFSMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOTIFSMSAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOTIFEMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOTIFEMAILAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOTIFACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOTIFUPDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOTIFSIGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "DECUSTOMERPREFERENCESIDISETUPTWSType", propOrder = {
    "gmessagegroup",
    "notifsms",
    "notifsmsamt",
    "notifemail",
    "notifemailamt",
    "notifacct",
    "notifupdate",
    "notifsign"
})
public class DECUSTOMERPREFERENCESIDISETUPTWSType {

    @XmlElement(name = "gMESSAGEGROUP")
    protected DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP gmessagegroup;
    @XmlElement(name = "NOTIFSMS")
    protected String notifsms;
    @XmlElement(name = "NOTIFSMSAMT")
    protected String notifsmsamt;
    @XmlElement(name = "NOTIFEMAIL")
    protected String notifemail;
    @XmlElement(name = "NOTIFEMAILAMT")
    protected String notifemailamt;
    @XmlElement(name = "NOTIFACCT")
    protected String notifacct;
    @XmlElement(name = "NOTIFUPDATE")
    protected String notifupdate;
    @XmlElement(name = "NOTIFSIGN")
    protected String notifsign;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the gmessagegroup property.
     * 
     * @return
     *     possible object is
     *     {@link DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP }
     *     
     */
    public DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP getGMESSAGEGROUP() {
        return gmessagegroup;
    }

    /**
     * Sets the value of the gmessagegroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP }
     *     
     */
    public void setGMESSAGEGROUP(DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP value) {
        this.gmessagegroup = value;
    }

    /**
     * Gets the value of the notifsms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFSMS() {
        return notifsms;
    }

    /**
     * Sets the value of the notifsms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFSMS(String value) {
        this.notifsms = value;
    }

    /**
     * Gets the value of the notifsmsamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFSMSAMT() {
        return notifsmsamt;
    }

    /**
     * Sets the value of the notifsmsamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFSMSAMT(String value) {
        this.notifsmsamt = value;
    }

    /**
     * Gets the value of the notifemail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFEMAIL() {
        return notifemail;
    }

    /**
     * Sets the value of the notifemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFEMAIL(String value) {
        this.notifemail = value;
    }

    /**
     * Gets the value of the notifemailamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFEMAILAMT() {
        return notifemailamt;
    }

    /**
     * Sets the value of the notifemailamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFEMAILAMT(String value) {
        this.notifemailamt = value;
    }

    /**
     * Gets the value of the notifacct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFACCT() {
        return notifacct;
    }

    /**
     * Sets the value of the notifacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFACCT(String value) {
        this.notifacct = value;
    }

    /**
     * Gets the value of the notifupdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFUPDATE() {
        return notifupdate;
    }

    /**
     * Sets the value of the notifupdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFUPDATE(String value) {
        this.notifupdate = value;
    }

    /**
     * Gets the value of the notifsign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFSIGN() {
        return notifsign;
    }

    /**
     * Sets the value of the notifsign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFSIGN(String value) {
        this.notifsign = value;
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
     *         &lt;element name="mMESSAGEGROUP" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MESSAGEGROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="sgCARRIER" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CARRIER" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CARRIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="REQUIRED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
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
        "mmessagegroup"
    })
    public static class GMESSAGEGROUP {

        @XmlElement(name = "mMESSAGEGROUP")
        protected List<DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP.MMESSAGEGROUP> mmessagegroup;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mmessagegroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mmessagegroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMMESSAGEGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP.MMESSAGEGROUP }
         * 
         * 
         */
        public List<DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP.MMESSAGEGROUP> getMMESSAGEGROUP() {
            if (mmessagegroup == null) {
                mmessagegroup = new ArrayList<DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP.MMESSAGEGROUP>();
            }
            return this.mmessagegroup;
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
         *         &lt;element name="MESSAGEGROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="sgCARRIER" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CARRIER" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CARRIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="REQUIRED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
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
            "messagegroup",
            "sgCARRIER"
        })
        public static class MMESSAGEGROUP {

            @XmlElement(name = "MESSAGEGROUP")
            protected String messagegroup;
            protected DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP.MMESSAGEGROUP.SgCARRIER sgCARRIER;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the messagegroup property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMESSAGEGROUP() {
                return messagegroup;
            }

            /**
             * Sets the value of the messagegroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMESSAGEGROUP(String value) {
                this.messagegroup = value;
            }

            /**
             * Gets the value of the sgCARRIER property.
             * 
             * @return
             *     possible object is
             *     {@link DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP.MMESSAGEGROUP.SgCARRIER }
             *     
             */
            public DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP.MMESSAGEGROUP.SgCARRIER getSgCARRIER() {
                return sgCARRIER;
            }

            /**
             * Sets the value of the sgCARRIER property.
             * 
             * @param value
             *     allowed object is
             *     {@link DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP.MMESSAGEGROUP.SgCARRIER }
             *     
             */
            public void setSgCARRIER(DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP.MMESSAGEGROUP.SgCARRIER value) {
                this.sgCARRIER = value;
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
             *         &lt;element name="CARRIER" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CARRIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="REQUIRED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
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
                "carrier"
            })
            public static class SgCARRIER {

                @XmlElement(name = "CARRIER")
                protected List<DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP.MMESSAGEGROUP.SgCARRIER.CARRIER> carrier;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the carrier property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the carrier property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCARRIER().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP.MMESSAGEGROUP.SgCARRIER.CARRIER }
                 * 
                 * 
                 */
                public List<DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP.MMESSAGEGROUP.SgCARRIER.CARRIER> getCARRIER() {
                    if (carrier == null) {
                        carrier = new ArrayList<DECUSTOMERPREFERENCESIDISETUPTWSType.GMESSAGEGROUP.MMESSAGEGROUP.SgCARRIER.CARRIER>();
                    }
                    return this.carrier;
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
                 *         &lt;element name="CARRIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="REQUIRED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "carrier",
                    "required",
                    "address",
                    "format",
                    "language"
                })
                public static class CARRIER {

                    @XmlElement(name = "CARRIER")
                    protected String carrier;
                    @XmlElement(name = "REQUIRED")
                    protected String required;
                    @XmlElement(name = "ADDRESS")
                    protected String address;
                    @XmlElement(name = "FORMAT")
                    protected String format;
                    @XmlElement(name = "LANGUAGE")
                    protected String language;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Gets the value of the carrier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCARRIER() {
                        return carrier;
                    }

                    /**
                     * Sets the value of the carrier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCARRIER(String value) {
                        this.carrier = value;
                    }

                    /**
                     * Gets the value of the required property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getREQUIRED() {
                        return required;
                    }

                    /**
                     * Sets the value of the required property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setREQUIRED(String value) {
                        this.required = value;
                    }

                    /**
                     * Gets the value of the address property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getADDRESS() {
                        return address;
                    }

                    /**
                     * Sets the value of the address property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setADDRESS(String value) {
                        this.address = value;
                    }

                    /**
                     * Gets the value of the format property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFORMAT() {
                        return format;
                    }

                    /**
                     * Sets the value of the format property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFORMAT(String value) {
                        this.format = value;
                    }

                    /**
                     * Gets the value of the language property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLANGUAGE() {
                        return language;
                    }

                    /**
                     * Sets the value of the language property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLANGUAGE(String value) {
                        this.language = value;
                    }

                    /**
                     * Gets the value of the s property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getS() {
                        return s;
                    }

                    /**
                     * Sets the value of the s property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setS(BigInteger value) {
                        this.s = value;
                    }

                }

            }

        }

    }

}
