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
 * <p>Java class for FUNDSTRANSFERTWSCLSREKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FUNDSTRANSFERTWSCLSREKType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRANSACTIONTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEBITACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEBITCURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEBITAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEBITVALUEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CREDITACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CREDITCURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CREDITVALUEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TREASURYRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gPAYMENTDETAILS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PAYMENTDETAILS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COMMISSIONCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gCOMMISSIONTYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mCOMMISSIONTYPE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="COMMISSIONTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COMMISSIONAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="CUSTOMERSPREAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNTDEBITED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNTCREDITED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMERRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MSGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TICKETNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "FUNDSTRANSFERTWSCLSREKType", propOrder = {
    "transactiontype",
    "debitacctno",
    "debitcurrency",
    "debitamount",
    "debitvaluedate",
    "creditacctno",
    "creditcurrency",
    "creditvaluedate",
    "treasuryrate",
    "gpaymentdetails",
    "commissioncode",
    "gcommissiontype",
    "customerspread",
    "amountdebited",
    "amountcredited",
    "customerrate",
    "msgid",
    "ticketno"
})
public class FUNDSTRANSFERTWSCLSREKType {

    @XmlElement(name = "TRANSACTIONTYPE")
    protected String transactiontype;
    @XmlElement(name = "DEBITACCTNO")
    protected String debitacctno;
    @XmlElement(name = "DEBITCURRENCY")
    protected String debitcurrency;
    @XmlElement(name = "DEBITAMOUNT")
    protected String debitamount;
    @XmlElement(name = "DEBITVALUEDATE")
    protected String debitvaluedate;
    @XmlElement(name = "CREDITACCTNO")
    protected String creditacctno;
    @XmlElement(name = "CREDITCURRENCY")
    protected String creditcurrency;
    @XmlElement(name = "CREDITVALUEDATE")
    protected String creditvaluedate;
    @XmlElement(name = "TREASURYRATE")
    protected String treasuryrate;
    @XmlElement(name = "gPAYMENTDETAILS")
    protected FUNDSTRANSFERTWSCLSREKType.GPAYMENTDETAILS gpaymentdetails;
    @XmlElement(name = "COMMISSIONCODE")
    protected String commissioncode;
    @XmlElement(name = "gCOMMISSIONTYPE")
    protected FUNDSTRANSFERTWSCLSREKType.GCOMMISSIONTYPE gcommissiontype;
    @XmlElement(name = "CUSTOMERSPREAD")
    protected String customerspread;
    @XmlElement(name = "AMOUNTDEBITED")
    protected String amountdebited;
    @XmlElement(name = "AMOUNTCREDITED")
    protected String amountcredited;
    @XmlElement(name = "CUSTOMERRATE")
    protected String customerrate;
    @XmlElement(name = "MSGID")
    protected String msgid;
    @XmlElement(name = "TICKETNO")
    protected String ticketno;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the transactiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACTIONTYPE() {
        return transactiontype;
    }

    /**
     * Sets the value of the transactiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACTIONTYPE(String value) {
        this.transactiontype = value;
    }

    /**
     * Gets the value of the debitacctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBITACCTNO() {
        return debitacctno;
    }

    /**
     * Sets the value of the debitacctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBITACCTNO(String value) {
        this.debitacctno = value;
    }

    /**
     * Gets the value of the debitcurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBITCURRENCY() {
        return debitcurrency;
    }

    /**
     * Sets the value of the debitcurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBITCURRENCY(String value) {
        this.debitcurrency = value;
    }

    /**
     * Gets the value of the debitamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBITAMOUNT() {
        return debitamount;
    }

    /**
     * Sets the value of the debitamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBITAMOUNT(String value) {
        this.debitamount = value;
    }

    /**
     * Gets the value of the debitvaluedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBITVALUEDATE() {
        return debitvaluedate;
    }

    /**
     * Sets the value of the debitvaluedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBITVALUEDATE(String value) {
        this.debitvaluedate = value;
    }

    /**
     * Gets the value of the creditacctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITACCTNO() {
        return creditacctno;
    }

    /**
     * Sets the value of the creditacctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITACCTNO(String value) {
        this.creditacctno = value;
    }

    /**
     * Gets the value of the creditcurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITCURRENCY() {
        return creditcurrency;
    }

    /**
     * Sets the value of the creditcurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITCURRENCY(String value) {
        this.creditcurrency = value;
    }

    /**
     * Gets the value of the creditvaluedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITVALUEDATE() {
        return creditvaluedate;
    }

    /**
     * Sets the value of the creditvaluedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITVALUEDATE(String value) {
        this.creditvaluedate = value;
    }

    /**
     * Gets the value of the treasuryrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTREASURYRATE() {
        return treasuryrate;
    }

    /**
     * Sets the value of the treasuryrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTREASURYRATE(String value) {
        this.treasuryrate = value;
    }

    /**
     * Gets the value of the gpaymentdetails property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERTWSCLSREKType.GPAYMENTDETAILS }
     *     
     */
    public FUNDSTRANSFERTWSCLSREKType.GPAYMENTDETAILS getGPAYMENTDETAILS() {
        return gpaymentdetails;
    }

    /**
     * Sets the value of the gpaymentdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERTWSCLSREKType.GPAYMENTDETAILS }
     *     
     */
    public void setGPAYMENTDETAILS(FUNDSTRANSFERTWSCLSREKType.GPAYMENTDETAILS value) {
        this.gpaymentdetails = value;
    }

    /**
     * Gets the value of the commissioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMISSIONCODE() {
        return commissioncode;
    }

    /**
     * Sets the value of the commissioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMISSIONCODE(String value) {
        this.commissioncode = value;
    }

    /**
     * Gets the value of the gcommissiontype property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERTWSCLSREKType.GCOMMISSIONTYPE }
     *     
     */
    public FUNDSTRANSFERTWSCLSREKType.GCOMMISSIONTYPE getGCOMMISSIONTYPE() {
        return gcommissiontype;
    }

    /**
     * Sets the value of the gcommissiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERTWSCLSREKType.GCOMMISSIONTYPE }
     *     
     */
    public void setGCOMMISSIONTYPE(FUNDSTRANSFERTWSCLSREKType.GCOMMISSIONTYPE value) {
        this.gcommissiontype = value;
    }

    /**
     * Gets the value of the customerspread property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERSPREAD() {
        return customerspread;
    }

    /**
     * Sets the value of the customerspread property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERSPREAD(String value) {
        this.customerspread = value;
    }

    /**
     * Gets the value of the amountdebited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNTDEBITED() {
        return amountdebited;
    }

    /**
     * Sets the value of the amountdebited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNTDEBITED(String value) {
        this.amountdebited = value;
    }

    /**
     * Gets the value of the amountcredited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNTCREDITED() {
        return amountcredited;
    }

    /**
     * Sets the value of the amountcredited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNTCREDITED(String value) {
        this.amountcredited = value;
    }

    /**
     * Gets the value of the customerrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERRATE() {
        return customerrate;
    }

    /**
     * Sets the value of the customerrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERRATE(String value) {
        this.customerrate = value;
    }

    /**
     * Gets the value of the msgid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGID() {
        return msgid;
    }

    /**
     * Sets the value of the msgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGID(String value) {
        this.msgid = value;
    }

    /**
     * Gets the value of the ticketno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETNO() {
        return ticketno;
    }

    /**
     * Sets the value of the ticketno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETNO(String value) {
        this.ticketno = value;
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
     *         &lt;element name="mCOMMISSIONTYPE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="COMMISSIONTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COMMISSIONAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mcommissiontype"
    })
    public static class GCOMMISSIONTYPE {

        @XmlElement(name = "mCOMMISSIONTYPE")
        protected List<FUNDSTRANSFERTWSCLSREKType.GCOMMISSIONTYPE.MCOMMISSIONTYPE> mcommissiontype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mcommissiontype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcommissiontype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCOMMISSIONTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FUNDSTRANSFERTWSCLSREKType.GCOMMISSIONTYPE.MCOMMISSIONTYPE }
         * 
         * 
         */
        public List<FUNDSTRANSFERTWSCLSREKType.GCOMMISSIONTYPE.MCOMMISSIONTYPE> getMCOMMISSIONTYPE() {
            if (mcommissiontype == null) {
                mcommissiontype = new ArrayList<FUNDSTRANSFERTWSCLSREKType.GCOMMISSIONTYPE.MCOMMISSIONTYPE>();
            }
            return this.mcommissiontype;
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
         *         &lt;element name="COMMISSIONTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COMMISSIONAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "commissiontype",
            "commissionamt"
        })
        public static class MCOMMISSIONTYPE {

            @XmlElement(name = "COMMISSIONTYPE")
            protected String commissiontype;
            @XmlElement(name = "COMMISSIONAMT")
            protected String commissionamt;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the commissiontype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMMISSIONTYPE() {
                return commissiontype;
            }

            /**
             * Sets the value of the commissiontype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMMISSIONTYPE(String value) {
                this.commissiontype = value;
            }

            /**
             * Gets the value of the commissionamt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMMISSIONAMT() {
                return commissionamt;
            }

            /**
             * Sets the value of the commissionamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMMISSIONAMT(String value) {
                this.commissionamt = value;
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
     *         &lt;element name="PAYMENTDETAILS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "paymentdetails"
    })
    public static class GPAYMENTDETAILS {

        @XmlElement(name = "PAYMENTDETAILS")
        protected List<String> paymentdetails;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the paymentdetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentdetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPAYMENTDETAILS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPAYMENTDETAILS() {
            if (paymentdetails == null) {
                paymentdetails = new ArrayList<String>();
            }
            return this.paymentdetails;
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
