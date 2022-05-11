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
 * <p>Java class for PDPAYMENTDUEIDIRHNTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDPAYMENTDUEIDIRHNTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NoCIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Kategori" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTALOVERDUEAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gTOTOVRDUETYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mTOTOVRDUETYPE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TOTOVRDUETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TOTODTYPEAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="TanggalPembayaran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RekeningPembayaran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JumlahBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gREPAYTYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mREPAYTYPE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Default" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PDPAYMENTDUEIDIRHNTWSType", propOrder = {
    "noCIF",
    "kategori",
    "totaloverdueamt",
    "gtotovrduetype",
    "tanggalPembayaran",
    "rekeningPembayaran",
    "jumlahBayar",
    "grepaytype"
})
public class PDPAYMENTDUEIDIRHNTWSType {

    @XmlElement(name = "NoCIF")
    protected String noCIF;
    @XmlElement(name = "Kategori")
    protected String kategori;
    @XmlElement(name = "TOTALOVERDUEAMT")
    protected String totaloverdueamt;
    @XmlElement(name = "gTOTOVRDUETYPE")
    protected PDPAYMENTDUEIDIRHNTWSType.GTOTOVRDUETYPE gtotovrduetype;
    @XmlElement(name = "TanggalPembayaran")
    protected String tanggalPembayaran;
    @XmlElement(name = "RekeningPembayaran")
    protected String rekeningPembayaran;
    @XmlElement(name = "JumlahBayar")
    protected String jumlahBayar;
    @XmlElement(name = "gREPAYTYPE")
    protected PDPAYMENTDUEIDIRHNTWSType.GREPAYTYPE grepaytype;
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
     * Gets the value of the totaloverdueamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALOVERDUEAMT() {
        return totaloverdueamt;
    }

    /**
     * Sets the value of the totaloverdueamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALOVERDUEAMT(String value) {
        this.totaloverdueamt = value;
    }

    /**
     * Gets the value of the gtotovrduetype property.
     * 
     * @return
     *     possible object is
     *     {@link PDPAYMENTDUEIDIRHNTWSType.GTOTOVRDUETYPE }
     *     
     */
    public PDPAYMENTDUEIDIRHNTWSType.GTOTOVRDUETYPE getGTOTOVRDUETYPE() {
        return gtotovrduetype;
    }

    /**
     * Sets the value of the gtotovrduetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDPAYMENTDUEIDIRHNTWSType.GTOTOVRDUETYPE }
     *     
     */
    public void setGTOTOVRDUETYPE(PDPAYMENTDUEIDIRHNTWSType.GTOTOVRDUETYPE value) {
        this.gtotovrduetype = value;
    }

    /**
     * Gets the value of the tanggalPembayaran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalPembayaran() {
        return tanggalPembayaran;
    }

    /**
     * Sets the value of the tanggalPembayaran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalPembayaran(String value) {
        this.tanggalPembayaran = value;
    }

    /**
     * Gets the value of the rekeningPembayaran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRekeningPembayaran() {
        return rekeningPembayaran;
    }

    /**
     * Sets the value of the rekeningPembayaran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRekeningPembayaran(String value) {
        this.rekeningPembayaran = value;
    }

    /**
     * Gets the value of the jumlahBayar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJumlahBayar() {
        return jumlahBayar;
    }

    /**
     * Sets the value of the jumlahBayar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJumlahBayar(String value) {
        this.jumlahBayar = value;
    }

    /**
     * Gets the value of the grepaytype property.
     * 
     * @return
     *     possible object is
     *     {@link PDPAYMENTDUEIDIRHNTWSType.GREPAYTYPE }
     *     
     */
    public PDPAYMENTDUEIDIRHNTWSType.GREPAYTYPE getGREPAYTYPE() {
        return grepaytype;
    }

    /**
     * Sets the value of the grepaytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDPAYMENTDUEIDIRHNTWSType.GREPAYTYPE }
     *     
     */
    public void setGREPAYTYPE(PDPAYMENTDUEIDIRHNTWSType.GREPAYTYPE value) {
        this.grepaytype = value;
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
     *         &lt;element name="mREPAYTYPE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Default" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mrepaytype"
    })
    public static class GREPAYTYPE {

        @XmlElement(name = "mREPAYTYPE")
        protected List<PDPAYMENTDUEIDIRHNTWSType.GREPAYTYPE.MREPAYTYPE> mrepaytype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mrepaytype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mrepaytype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMREPAYTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PDPAYMENTDUEIDIRHNTWSType.GREPAYTYPE.MREPAYTYPE }
         * 
         * 
         */
        public List<PDPAYMENTDUEIDIRHNTWSType.GREPAYTYPE.MREPAYTYPE> getMREPAYTYPE() {
            if (mrepaytype == null) {
                mrepaytype = new ArrayList<PDPAYMENTDUEIDIRHNTWSType.GREPAYTYPE.MREPAYTYPE>();
            }
            return this.mrepaytype;
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
         *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Default" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "type",
            "amount",
            "_default",
            "taxAmount"
        })
        public static class MREPAYTYPE {

            @XmlElement(name = "Type")
            protected String type;
            @XmlElement(name = "Amount")
            protected String amount;
            @XmlElement(name = "Default")
            protected String _default;
            @XmlElement(name = "TaxAmount")
            protected String taxAmount;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmount(String value) {
                this.amount = value;
            }

            /**
             * Gets the value of the default property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefault() {
                return _default;
            }

            /**
             * Sets the value of the default property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefault(String value) {
                this._default = value;
            }

            /**
             * Gets the value of the taxAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxAmount() {
                return taxAmount;
            }

            /**
             * Sets the value of the taxAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxAmount(String value) {
                this.taxAmount = value;
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
     *         &lt;element name="mTOTOVRDUETYPE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TOTOVRDUETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TOTODTYPEAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mtotovrduetype"
    })
    public static class GTOTOVRDUETYPE {

        @XmlElement(name = "mTOTOVRDUETYPE")
        protected List<PDPAYMENTDUEIDIRHNTWSType.GTOTOVRDUETYPE.MTOTOVRDUETYPE> mtotovrduetype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtotovrduetype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtotovrduetype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTOTOVRDUETYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PDPAYMENTDUEIDIRHNTWSType.GTOTOVRDUETYPE.MTOTOVRDUETYPE }
         * 
         * 
         */
        public List<PDPAYMENTDUEIDIRHNTWSType.GTOTOVRDUETYPE.MTOTOVRDUETYPE> getMTOTOVRDUETYPE() {
            if (mtotovrduetype == null) {
                mtotovrduetype = new ArrayList<PDPAYMENTDUEIDIRHNTWSType.GTOTOVRDUETYPE.MTOTOVRDUETYPE>();
            }
            return this.mtotovrduetype;
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
         *         &lt;element name="TOTOVRDUETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TOTODTYPEAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "totovrduetype",
            "totodtypeamt"
        })
        public static class MTOTOVRDUETYPE {

            @XmlElement(name = "TOTOVRDUETYPE")
            protected String totovrduetype;
            @XmlElement(name = "TOTODTYPEAMT")
            protected String totodtypeamt;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the totovrduetype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTOTOVRDUETYPE() {
                return totovrduetype;
            }

            /**
             * Sets the value of the totovrduetype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTOTOVRDUETYPE(String value) {
                this.totovrduetype = value;
            }

            /**
             * Gets the value of the totodtypeamt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTOTODTYPEAMT() {
                return totodtypeamt;
            }

            /**
             * Sets the value of the totodtypeamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTOTODTYPEAMT(String value) {
                this.totodtypeamt = value;
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
