//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.27 at 10:10:29 AM WIB 
//


package com.twsservice.twsservice.stub;

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
 * <p>Java class for TMBLNGROUPLIMITIDICHANNELAGENTTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMBLNGROUPLIMITIDICHANNELAGENTTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gDESCRIPTION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaximumAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gLIMITLINES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mLIMITLINES" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LimitLines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="UtilisedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="MAINCUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXPDATELIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTOSLIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTAVAILAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PKSNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SKKPNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SKKPDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gTENOR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mTENOR" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TENOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FEEAGENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FEEAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="AGENTACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TMBLNGROUPLIMITIDICHANNELAGENTTWSType", propOrder = {
    "gdescription",
    "currency",
    "maximumAmount",
    "glimitlines",
    "maincus",
    "expdatelim",
    "totoslimit",
    "totavailamt",
    "pksno",
    "skkpno",
    "skkpdate",
    "gtenor",
    "agentacct"
})
public class TMBLNGROUPLIMITIDICHANNELAGENTTWSType {

    @XmlElement(name = "gDESCRIPTION")
    protected TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GDESCRIPTION gdescription;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "MaximumAmount")
    protected String maximumAmount;
    @XmlElement(name = "gLIMITLINES")
    protected TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GLIMITLINES glimitlines;
    @XmlElement(name = "MAINCUS")
    protected String maincus;
    @XmlElement(name = "EXPDATELIM")
    protected String expdatelim;
    @XmlElement(name = "TOTOSLIMIT")
    protected String totoslimit;
    @XmlElement(name = "TOTAVAILAMT")
    protected String totavailamt;
    @XmlElement(name = "PKSNO")
    protected String pksno;
    @XmlElement(name = "SKKPNO")
    protected String skkpno;
    @XmlElement(name = "SKKPDATE")
    protected String skkpdate;
    @XmlElement(name = "gTENOR")
    protected TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GTENOR gtenor;
    @XmlElement(name = "AGENTACCT")
    protected String agentacct;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the gdescription property.
     * 
     * @return
     *     possible object is
     *     {@link TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GDESCRIPTION }
     *     
     */
    public TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GDESCRIPTION getGDESCRIPTION() {
        return gdescription;
    }

    /**
     * Sets the value of the gdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GDESCRIPTION }
     *     
     */
    public void setGDESCRIPTION(TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GDESCRIPTION value) {
        this.gdescription = value;
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
     * Gets the value of the maximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Sets the value of the maximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAmount(String value) {
        this.maximumAmount = value;
    }

    /**
     * Gets the value of the glimitlines property.
     * 
     * @return
     *     possible object is
     *     {@link TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GLIMITLINES }
     *     
     */
    public TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GLIMITLINES getGLIMITLINES() {
        return glimitlines;
    }

    /**
     * Sets the value of the glimitlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GLIMITLINES }
     *     
     */
    public void setGLIMITLINES(TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GLIMITLINES value) {
        this.glimitlines = value;
    }

    /**
     * Gets the value of the maincus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAINCUS() {
        return maincus;
    }

    /**
     * Sets the value of the maincus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAINCUS(String value) {
        this.maincus = value;
    }

    /**
     * Gets the value of the expdatelim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPDATELIM() {
        return expdatelim;
    }

    /**
     * Sets the value of the expdatelim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPDATELIM(String value) {
        this.expdatelim = value;
    }

    /**
     * Gets the value of the totoslimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTOSLIMIT() {
        return totoslimit;
    }

    /**
     * Sets the value of the totoslimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTOSLIMIT(String value) {
        this.totoslimit = value;
    }

    /**
     * Gets the value of the totavailamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTAVAILAMT() {
        return totavailamt;
    }

    /**
     * Sets the value of the totavailamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTAVAILAMT(String value) {
        this.totavailamt = value;
    }

    /**
     * Gets the value of the pksno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPKSNO() {
        return pksno;
    }

    /**
     * Sets the value of the pksno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPKSNO(String value) {
        this.pksno = value;
    }

    /**
     * Gets the value of the skkpno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKKPNO() {
        return skkpno;
    }

    /**
     * Sets the value of the skkpno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKKPNO(String value) {
        this.skkpno = value;
    }

    /**
     * Gets the value of the skkpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKKPDATE() {
        return skkpdate;
    }

    /**
     * Sets the value of the skkpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKKPDATE(String value) {
        this.skkpdate = value;
    }

    /**
     * Gets the value of the gtenor property.
     * 
     * @return
     *     possible object is
     *     {@link TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GTENOR }
     *     
     */
    public TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GTENOR getGTENOR() {
        return gtenor;
    }

    /**
     * Sets the value of the gtenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GTENOR }
     *     
     */
    public void setGTENOR(TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GTENOR value) {
        this.gtenor = value;
    }

    /**
     * Gets the value of the agentacct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGENTACCT() {
        return agentacct;
    }

    /**
     * Sets the value of the agentacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGENTACCT(String value) {
        this.agentacct = value;
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
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "description"
    })
    public static class GDESCRIPTION {

        @XmlElement(name = "Description")
        protected List<String> description;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDescription() {
            if (description == null) {
                description = new ArrayList<String>();
            }
            return this.description;
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
     *         &lt;element name="mLIMITLINES" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LimitLines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="UtilisedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mlimitlines"
    })
    public static class GLIMITLINES {

        @XmlElement(name = "mLIMITLINES")
        protected List<TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GLIMITLINES.MLIMITLINES> mlimitlines;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mlimitlines property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mlimitlines property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMLIMITLINES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GLIMITLINES.MLIMITLINES }
         * 
         * 
         */
        public List<TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GLIMITLINES.MLIMITLINES> getMLIMITLINES() {
            if (mlimitlines == null) {
                mlimitlines = new ArrayList<TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GLIMITLINES.MLIMITLINES>();
            }
            return this.mlimitlines;
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
         *         &lt;element name="LimitLines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="UtilisedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "limitLines",
            "utilisedAmount"
        })
        public static class MLIMITLINES {

            @XmlElement(name = "LimitLines")
            protected String limitLines;
            @XmlElement(name = "UtilisedAmount")
            protected String utilisedAmount;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the limitLines property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLimitLines() {
                return limitLines;
            }

            /**
             * Sets the value of the limitLines property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLimitLines(String value) {
                this.limitLines = value;
            }

            /**
             * Gets the value of the utilisedAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUtilisedAmount() {
                return utilisedAmount;
            }

            /**
             * Sets the value of the utilisedAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUtilisedAmount(String value) {
                this.utilisedAmount = value;
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
     *         &lt;element name="mTENOR" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TENOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FEEAGENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FEEAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mtenor"
    })
    public static class GTENOR {

        @XmlElement(name = "mTENOR")
        protected List<TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GTENOR.MTENOR> mtenor;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtenor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtenor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTENOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GTENOR.MTENOR }
         * 
         * 
         */
        public List<TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GTENOR.MTENOR> getMTENOR() {
            if (mtenor == null) {
                mtenor = new ArrayList<TMBLNGROUPLIMITIDICHANNELAGENTTWSType.GTENOR.MTENOR>();
            }
            return this.mtenor;
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
         *         &lt;element name="TENOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FEEAGENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FEEAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "tenor",
            "feeagent",
            "feeamount"
        })
        public static class MTENOR {

            @XmlElement(name = "TENOR")
            protected String tenor;
            @XmlElement(name = "FEEAGENT")
            protected String feeagent;
            @XmlElement(name = "FEEAMOUNT")
            protected String feeamount;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the tenor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTENOR() {
                return tenor;
            }

            /**
             * Sets the value of the tenor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTENOR(String value) {
                this.tenor = value;
            }

            /**
             * Gets the value of the feeagent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFEEAGENT() {
                return feeagent;
            }

            /**
             * Sets the value of the feeagent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFEEAGENT(String value) {
                this.feeagent = value;
            }

            /**
             * Gets the value of the feeamount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFEEAMOUNT() {
                return feeamount;
            }

            /**
             * Sets the value of the feeamount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFEEAMOUNT(String value) {
                this.feeamount = value;
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
