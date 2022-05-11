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
 * <p>Java class for FUNDSTRANSFERIDISKNOUTCRTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FUNDSTRANSFERIDISKNOUTCRTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DebitAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DebitCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransferAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gPAYMENTDETAILS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PaymentDetails" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RekeningBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KodeBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *                             &lt;element name="JenisBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NominalBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="ProfitDeptCentre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BENNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BENACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SKNRECEIVBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESIDEYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NATIONSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SKNBNKTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SKNCITYCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SKNRECREGION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SKNTXNCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gSKN.SENDER.NAME" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SKNSENDERNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MSGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SKNCUSTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "FUNDSTRANSFERIDISKNOUTCRTWSType", propOrder = {
    "transactionType",
    "debitAccountNumber",
    "debitCurrency",
    "transferAmount",
    "gpaymentdetails",
    "rekeningBiaya",
    "kodeBiaya",
    "gcommissiontype",
    "profitDeptCentre",
    "benname",
    "benacc",
    "sknreceivbank",
    "resideyn",
    "nationstatus",
    "sknbnktype",
    "skncitycode",
    "sknrecregion",
    "province",
    "skntxncode",
    "gsknsendername",
    "msgid",
    "skncusttype"
})
public class FUNDSTRANSFERIDISKNOUTCRTWSType {

    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "DebitAccountNumber")
    protected String debitAccountNumber;
    @XmlElement(name = "DebitCurrency")
    protected String debitCurrency;
    @XmlElement(name = "TransferAmount")
    protected String transferAmount;
    @XmlElement(name = "gPAYMENTDETAILS")
    protected FUNDSTRANSFERIDISKNOUTCRTWSType.GPAYMENTDETAILS gpaymentdetails;
    @XmlElement(name = "RekeningBiaya")
    protected String rekeningBiaya;
    @XmlElement(name = "KodeBiaya")
    protected String kodeBiaya;
    @XmlElement(name = "gCOMMISSIONTYPE")
    protected FUNDSTRANSFERIDISKNOUTCRTWSType.GCOMMISSIONTYPE gcommissiontype;
    @XmlElement(name = "ProfitDeptCentre")
    protected String profitDeptCentre;
    @XmlElement(name = "BENNAME")
    protected String benname;
    @XmlElement(name = "BENACC")
    protected String benacc;
    @XmlElement(name = "SKNRECEIVBANK")
    protected String sknreceivbank;
    @XmlElement(name = "RESIDEYN")
    protected String resideyn;
    @XmlElement(name = "NATIONSTATUS")
    protected String nationstatus;
    @XmlElement(name = "SKNBNKTYPE")
    protected String sknbnktype;
    @XmlElement(name = "SKNCITYCODE")
    protected String skncitycode;
    @XmlElement(name = "SKNRECREGION")
    protected String sknrecregion;
    @XmlElement(name = "PROVINCE")
    protected String province;
    @XmlElement(name = "SKNTXNCODE")
    protected String skntxncode;
    @XmlElement(name = "gSKN.SENDER.NAME")
    protected FUNDSTRANSFERIDISKNOUTCRTWSType.GSKNSENDERNAME gsknsendername;
    @XmlElement(name = "MSGID")
    protected String msgid;
    @XmlElement(name = "SKNCUSTTYPE")
    protected String skncusttype;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the debitAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAccountNumber() {
        return debitAccountNumber;
    }

    /**
     * Sets the value of the debitAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAccountNumber(String value) {
        this.debitAccountNumber = value;
    }

    /**
     * Gets the value of the debitCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitCurrency() {
        return debitCurrency;
    }

    /**
     * Sets the value of the debitCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitCurrency(String value) {
        this.debitCurrency = value;
    }

    /**
     * Gets the value of the transferAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferAmount() {
        return transferAmount;
    }

    /**
     * Sets the value of the transferAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferAmount(String value) {
        this.transferAmount = value;
    }

    /**
     * Gets the value of the gpaymentdetails property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERIDISKNOUTCRTWSType.GPAYMENTDETAILS }
     *     
     */
    public FUNDSTRANSFERIDISKNOUTCRTWSType.GPAYMENTDETAILS getGPAYMENTDETAILS() {
        return gpaymentdetails;
    }

    /**
     * Sets the value of the gpaymentdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERIDISKNOUTCRTWSType.GPAYMENTDETAILS }
     *     
     */
    public void setGPAYMENTDETAILS(FUNDSTRANSFERIDISKNOUTCRTWSType.GPAYMENTDETAILS value) {
        this.gpaymentdetails = value;
    }

    /**
     * Gets the value of the rekeningBiaya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRekeningBiaya() {
        return rekeningBiaya;
    }

    /**
     * Sets the value of the rekeningBiaya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRekeningBiaya(String value) {
        this.rekeningBiaya = value;
    }

    /**
     * Gets the value of the kodeBiaya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeBiaya() {
        return kodeBiaya;
    }

    /**
     * Sets the value of the kodeBiaya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeBiaya(String value) {
        this.kodeBiaya = value;
    }

    /**
     * Gets the value of the gcommissiontype property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERIDISKNOUTCRTWSType.GCOMMISSIONTYPE }
     *     
     */
    public FUNDSTRANSFERIDISKNOUTCRTWSType.GCOMMISSIONTYPE getGCOMMISSIONTYPE() {
        return gcommissiontype;
    }

    /**
     * Sets the value of the gcommissiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERIDISKNOUTCRTWSType.GCOMMISSIONTYPE }
     *     
     */
    public void setGCOMMISSIONTYPE(FUNDSTRANSFERIDISKNOUTCRTWSType.GCOMMISSIONTYPE value) {
        this.gcommissiontype = value;
    }

    /**
     * Gets the value of the profitDeptCentre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitDeptCentre() {
        return profitDeptCentre;
    }

    /**
     * Sets the value of the profitDeptCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitDeptCentre(String value) {
        this.profitDeptCentre = value;
    }

    /**
     * Gets the value of the benname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENNAME() {
        return benname;
    }

    /**
     * Sets the value of the benname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENNAME(String value) {
        this.benname = value;
    }

    /**
     * Gets the value of the benacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENACC() {
        return benacc;
    }

    /**
     * Sets the value of the benacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENACC(String value) {
        this.benacc = value;
    }

    /**
     * Gets the value of the sknreceivbank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKNRECEIVBANK() {
        return sknreceivbank;
    }

    /**
     * Sets the value of the sknreceivbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKNRECEIVBANK(String value) {
        this.sknreceivbank = value;
    }

    /**
     * Gets the value of the resideyn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESIDEYN() {
        return resideyn;
    }

    /**
     * Sets the value of the resideyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESIDEYN(String value) {
        this.resideyn = value;
    }

    /**
     * Gets the value of the nationstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNATIONSTATUS() {
        return nationstatus;
    }

    /**
     * Sets the value of the nationstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNATIONSTATUS(String value) {
        this.nationstatus = value;
    }

    /**
     * Gets the value of the sknbnktype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKNBNKTYPE() {
        return sknbnktype;
    }

    /**
     * Sets the value of the sknbnktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKNBNKTYPE(String value) {
        this.sknbnktype = value;
    }

    /**
     * Gets the value of the skncitycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKNCITYCODE() {
        return skncitycode;
    }

    /**
     * Sets the value of the skncitycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKNCITYCODE(String value) {
        this.skncitycode = value;
    }

    /**
     * Gets the value of the sknrecregion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKNRECREGION() {
        return sknrecregion;
    }

    /**
     * Sets the value of the sknrecregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKNRECREGION(String value) {
        this.sknrecregion = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVINCE() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVINCE(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the skntxncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKNTXNCODE() {
        return skntxncode;
    }

    /**
     * Sets the value of the skntxncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKNTXNCODE(String value) {
        this.skntxncode = value;
    }

    /**
     * Gets the value of the gsknsendername property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERIDISKNOUTCRTWSType.GSKNSENDERNAME }
     *     
     */
    public FUNDSTRANSFERIDISKNOUTCRTWSType.GSKNSENDERNAME getGSKNSENDERNAME() {
        return gsknsendername;
    }

    /**
     * Sets the value of the gsknsendername property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERIDISKNOUTCRTWSType.GSKNSENDERNAME }
     *     
     */
    public void setGSKNSENDERNAME(FUNDSTRANSFERIDISKNOUTCRTWSType.GSKNSENDERNAME value) {
        this.gsknsendername = value;
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
     * Gets the value of the skncusttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKNCUSTTYPE() {
        return skncusttype;
    }

    /**
     * Sets the value of the skncusttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKNCUSTTYPE(String value) {
        this.skncusttype = value;
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
     *                   &lt;element name="JenisBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NominalBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        protected List<FUNDSTRANSFERIDISKNOUTCRTWSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE> mcommissiontype;
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
         * {@link FUNDSTRANSFERIDISKNOUTCRTWSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE }
         * 
         * 
         */
        public List<FUNDSTRANSFERIDISKNOUTCRTWSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE> getMCOMMISSIONTYPE() {
            if (mcommissiontype == null) {
                mcommissiontype = new ArrayList<FUNDSTRANSFERIDISKNOUTCRTWSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE>();
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
         *         &lt;element name="JenisBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NominalBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "jenisBiaya",
            "nominalBiaya"
        })
        public static class MCOMMISSIONTYPE {

            @XmlElement(name = "JenisBiaya")
            protected String jenisBiaya;
            @XmlElement(name = "NominalBiaya")
            protected String nominalBiaya;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the jenisBiaya property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJenisBiaya() {
                return jenisBiaya;
            }

            /**
             * Sets the value of the jenisBiaya property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJenisBiaya(String value) {
                this.jenisBiaya = value;
            }

            /**
             * Gets the value of the nominalBiaya property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNominalBiaya() {
                return nominalBiaya;
            }

            /**
             * Sets the value of the nominalBiaya property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNominalBiaya(String value) {
                this.nominalBiaya = value;
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
     *         &lt;element name="PaymentDetails" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "paymentDetails"
    })
    public static class GPAYMENTDETAILS {

        @XmlElement(name = "PaymentDetails")
        protected List<String> paymentDetails;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the paymentDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPaymentDetails() {
            if (paymentDetails == null) {
                paymentDetails = new ArrayList<String>();
            }
            return this.paymentDetails;
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
     *         &lt;element name="SKNSENDERNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "sknsendername"
    })
    public static class GSKNSENDERNAME {

        @XmlElement(name = "SKNSENDERNAME")
        protected List<String> sknsendername;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the sknsendername property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sknsendername property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSKNSENDERNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSKNSENDERNAME() {
            if (sknsendername == null) {
                sknsendername = new ArrayList<String>();
            }
            return this.sknsendername;
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
