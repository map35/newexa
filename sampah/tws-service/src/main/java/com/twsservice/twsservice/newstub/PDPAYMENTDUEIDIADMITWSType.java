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
 * <p>Java class for PDPAYMENTDUEIDIADMITWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDPAYMENTDUEIDIADMITWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OPERASI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gPAYMENTDTEDUE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mPAYMENTDTEDUE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TANGGALADJUSTMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TOTALTAGIHAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NILAIOUTSTANDING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="sgPAYTYPE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="JENISTAGIHAN" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="JENISTAGIHAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="PAYAMTORIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="NILAITAGIHAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="PAYAMTOSTX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="REPAIDAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="ADJUSTEDAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="TAGIHANBARU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="AMTDISCUJROH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PDPAYMENTDUEIDIADMITWSType", propOrder = {
    "operasi",
    "gpaymentdtedue",
    "amtdiscujroh"
})
public class PDPAYMENTDUEIDIADMITWSType {

    @XmlElement(name = "OPERASI")
    protected String operasi;
    @XmlElement(name = "gPAYMENTDTEDUE")
    protected PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE gpaymentdtedue;
    @XmlElement(name = "AMTDISCUJROH")
    protected String amtdiscujroh;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the operasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERASI() {
        return operasi;
    }

    /**
     * Sets the value of the operasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERASI(String value) {
        this.operasi = value;
    }

    /**
     * Gets the value of the gpaymentdtedue property.
     * 
     * @return
     *     possible object is
     *     {@link PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE }
     *     
     */
    public PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE getGPAYMENTDTEDUE() {
        return gpaymentdtedue;
    }

    /**
     * Sets the value of the gpaymentdtedue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE }
     *     
     */
    public void setGPAYMENTDTEDUE(PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE value) {
        this.gpaymentdtedue = value;
    }

    /**
     * Gets the value of the amtdiscujroh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMTDISCUJROH() {
        return amtdiscujroh;
    }

    /**
     * Sets the value of the amtdiscujroh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMTDISCUJROH(String value) {
        this.amtdiscujroh = value;
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
     *         &lt;element name="mPAYMENTDTEDUE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TANGGALADJUSTMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TOTALTAGIHAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NILAIOUTSTANDING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="sgPAYTYPE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="JENISTAGIHAN" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="JENISTAGIHAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="PAYAMTORIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="NILAITAGIHAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="PAYAMTOSTX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="REPAIDAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="ADJUSTEDAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="TAGIHANBARU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mpaymentdtedue"
    })
    public static class GPAYMENTDTEDUE {

        @XmlElement(name = "mPAYMENTDTEDUE")
        protected List<PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE.MPAYMENTDTEDUE> mpaymentdtedue;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mpaymentdtedue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mpaymentdtedue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMPAYMENTDTEDUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE.MPAYMENTDTEDUE }
         * 
         * 
         */
        public List<PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE.MPAYMENTDTEDUE> getMPAYMENTDTEDUE() {
            if (mpaymentdtedue == null) {
                mpaymentdtedue = new ArrayList<PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE.MPAYMENTDTEDUE>();
            }
            return this.mpaymentdtedue;
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
         *         &lt;element name="TANGGALADJUSTMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TOTALTAGIHAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NILAIOUTSTANDING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="sgPAYTYPE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="JENISTAGIHAN" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="JENISTAGIHAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="PAYAMTORIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="NILAITAGIHAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="PAYAMTOSTX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="REPAIDAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="ADJUSTEDAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="TAGIHANBARU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "tanggaladjustment",
            "totaltagihan",
            "nilaioutstanding",
            "sgPAYTYPE"
        })
        public static class MPAYMENTDTEDUE {

            @XmlElement(name = "TANGGALADJUSTMENT")
            protected String tanggaladjustment;
            @XmlElement(name = "TOTALTAGIHAN")
            protected String totaltagihan;
            @XmlElement(name = "NILAIOUTSTANDING")
            protected String nilaioutstanding;
            protected PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE.MPAYMENTDTEDUE.SgPAYTYPE sgPAYTYPE;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the tanggaladjustment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTANGGALADJUSTMENT() {
                return tanggaladjustment;
            }

            /**
             * Sets the value of the tanggaladjustment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTANGGALADJUSTMENT(String value) {
                this.tanggaladjustment = value;
            }

            /**
             * Gets the value of the totaltagihan property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTOTALTAGIHAN() {
                return totaltagihan;
            }

            /**
             * Sets the value of the totaltagihan property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTOTALTAGIHAN(String value) {
                this.totaltagihan = value;
            }

            /**
             * Gets the value of the nilaioutstanding property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNILAIOUTSTANDING() {
                return nilaioutstanding;
            }

            /**
             * Sets the value of the nilaioutstanding property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNILAIOUTSTANDING(String value) {
                this.nilaioutstanding = value;
            }

            /**
             * Gets the value of the sgPAYTYPE property.
             * 
             * @return
             *     possible object is
             *     {@link PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE.MPAYMENTDTEDUE.SgPAYTYPE }
             *     
             */
            public PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE.MPAYMENTDTEDUE.SgPAYTYPE getSgPAYTYPE() {
                return sgPAYTYPE;
            }

            /**
             * Sets the value of the sgPAYTYPE property.
             * 
             * @param value
             *     allowed object is
             *     {@link PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE.MPAYMENTDTEDUE.SgPAYTYPE }
             *     
             */
            public void setSgPAYTYPE(PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE.MPAYMENTDTEDUE.SgPAYTYPE value) {
                this.sgPAYTYPE = value;
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
             *         &lt;element name="JENISTAGIHAN" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="JENISTAGIHAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="PAYAMTORIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="NILAITAGIHAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="PAYAMTOSTX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="REPAIDAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="ADJUSTEDAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="TAGIHANBARU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "jenistagihan"
            })
            public static class SgPAYTYPE {

                @XmlElement(name = "JENISTAGIHAN")
                protected List<PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE.MPAYMENTDTEDUE.SgPAYTYPE.JENISTAGIHAN> jenistagihan;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the jenistagihan property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the jenistagihan property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getJENISTAGIHAN().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE.MPAYMENTDTEDUE.SgPAYTYPE.JENISTAGIHAN }
                 * 
                 * 
                 */
                public List<PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE.MPAYMENTDTEDUE.SgPAYTYPE.JENISTAGIHAN> getJENISTAGIHAN() {
                    if (jenistagihan == null) {
                        jenistagihan = new ArrayList<PDPAYMENTDUEIDIADMITWSType.GPAYMENTDTEDUE.MPAYMENTDTEDUE.SgPAYTYPE.JENISTAGIHAN>();
                    }
                    return this.jenistagihan;
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
                 *         &lt;element name="JENISTAGIHAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="PAYAMTORIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="NILAITAGIHAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="PAYAMTOSTX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="REPAIDAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="ADJUSTEDAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="TAGIHANBARU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "jenistagihan",
                    "payamtorig",
                    "nilaitagihan",
                    "payamtostx",
                    "repaidamt",
                    "adjustedamt",
                    "tagihanbaru"
                })
                public static class JENISTAGIHAN {

                    @XmlElement(name = "JENISTAGIHAN")
                    protected String jenistagihan;
                    @XmlElement(name = "PAYAMTORIG")
                    protected String payamtorig;
                    @XmlElement(name = "NILAITAGIHAN")
                    protected String nilaitagihan;
                    @XmlElement(name = "PAYAMTOSTX")
                    protected String payamtostx;
                    @XmlElement(name = "REPAIDAMT")
                    protected String repaidamt;
                    @XmlElement(name = "ADJUSTEDAMT")
                    protected String adjustedamt;
                    @XmlElement(name = "TAGIHANBARU")
                    protected String tagihanbaru;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Gets the value of the jenistagihan property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getJENISTAGIHAN() {
                        return jenistagihan;
                    }

                    /**
                     * Sets the value of the jenistagihan property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setJENISTAGIHAN(String value) {
                        this.jenistagihan = value;
                    }

                    /**
                     * Gets the value of the payamtorig property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPAYAMTORIG() {
                        return payamtorig;
                    }

                    /**
                     * Sets the value of the payamtorig property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPAYAMTORIG(String value) {
                        this.payamtorig = value;
                    }

                    /**
                     * Gets the value of the nilaitagihan property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNILAITAGIHAN() {
                        return nilaitagihan;
                    }

                    /**
                     * Sets the value of the nilaitagihan property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNILAITAGIHAN(String value) {
                        this.nilaitagihan = value;
                    }

                    /**
                     * Gets the value of the payamtostx property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPAYAMTOSTX() {
                        return payamtostx;
                    }

                    /**
                     * Sets the value of the payamtostx property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPAYAMTOSTX(String value) {
                        this.payamtostx = value;
                    }

                    /**
                     * Gets the value of the repaidamt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getREPAIDAMT() {
                        return repaidamt;
                    }

                    /**
                     * Sets the value of the repaidamt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setREPAIDAMT(String value) {
                        this.repaidamt = value;
                    }

                    /**
                     * Gets the value of the adjustedamt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getADJUSTEDAMT() {
                        return adjustedamt;
                    }

                    /**
                     * Sets the value of the adjustedamt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setADJUSTEDAMT(String value) {
                        this.adjustedamt = value;
                    }

                    /**
                     * Gets the value of the tagihanbaru property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTAGIHANBARU() {
                        return tagihanbaru;
                    }

                    /**
                     * Sets the value of the tagihanbaru property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTAGIHANBARU(String value) {
                        this.tagihanbaru = value;
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
