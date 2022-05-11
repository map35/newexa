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
 * <p>Java class for IDIHINVSCHEDULEINVSCHTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIHINVSCHEDULEINVSCHTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENTAMOUNTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENTFREQUENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENTENDDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPTYACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gPAYMENTDETAILS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PAYMENTDETAILS1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COMMISIONCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *                             &lt;element name="COMMISSIONTYPE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COMMISSIONAMT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="gOVERRIDE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OVERRIDE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "IDIHINVSCHEDULEINVSCHTWSType", propOrder = {
    "currency",
    "currentamountbal",
    "currentfrequency",
    "currentenddate",
    "cptyacctno",
    "gpaymentdetails",
    "commisioncode",
    "gcommissiontype",
    "goverride"
})
public class IDIHINVSCHEDULEINVSCHTWSType {

    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "CURRENTAMOUNTBAL")
    protected String currentamountbal;
    @XmlElement(name = "CURRENTFREQUENCY")
    protected String currentfrequency;
    @XmlElement(name = "CURRENTENDDATE")
    protected String currentenddate;
    @XmlElement(name = "CPTYACCTNO")
    protected String cptyacctno;
    @XmlElement(name = "gPAYMENTDETAILS")
    protected IDIHINVSCHEDULEINVSCHTWSType.GPAYMENTDETAILS gpaymentdetails;
    @XmlElement(name = "COMMISIONCODE")
    protected String commisioncode;
    @XmlElement(name = "gCOMMISSIONTYPE")
    protected IDIHINVSCHEDULEINVSCHTWSType.GCOMMISSIONTYPE gcommissiontype;
    @XmlElement(name = "gOVERRIDE")
    protected IDIHINVSCHEDULEINVSCHTWSType.GOVERRIDE goverride;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCY() {
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
    public void setCURRENCY(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the currentamountbal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENTAMOUNTBAL() {
        return currentamountbal;
    }

    /**
     * Sets the value of the currentamountbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENTAMOUNTBAL(String value) {
        this.currentamountbal = value;
    }

    /**
     * Gets the value of the currentfrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENTFREQUENCY() {
        return currentfrequency;
    }

    /**
     * Sets the value of the currentfrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENTFREQUENCY(String value) {
        this.currentfrequency = value;
    }

    /**
     * Gets the value of the currentenddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENTENDDATE() {
        return currentenddate;
    }

    /**
     * Sets the value of the currentenddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENTENDDATE(String value) {
        this.currentenddate = value;
    }

    /**
     * Gets the value of the cptyacctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPTYACCTNO() {
        return cptyacctno;
    }

    /**
     * Sets the value of the cptyacctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPTYACCTNO(String value) {
        this.cptyacctno = value;
    }

    /**
     * Gets the value of the gpaymentdetails property.
     * 
     * @return
     *     possible object is
     *     {@link IDIHINVSCHEDULEINVSCHTWSType.GPAYMENTDETAILS }
     *     
     */
    public IDIHINVSCHEDULEINVSCHTWSType.GPAYMENTDETAILS getGPAYMENTDETAILS() {
        return gpaymentdetails;
    }

    /**
     * Sets the value of the gpaymentdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIHINVSCHEDULEINVSCHTWSType.GPAYMENTDETAILS }
     *     
     */
    public void setGPAYMENTDETAILS(IDIHINVSCHEDULEINVSCHTWSType.GPAYMENTDETAILS value) {
        this.gpaymentdetails = value;
    }

    /**
     * Gets the value of the commisioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMISIONCODE() {
        return commisioncode;
    }

    /**
     * Sets the value of the commisioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMISIONCODE(String value) {
        this.commisioncode = value;
    }

    /**
     * Gets the value of the gcommissiontype property.
     * 
     * @return
     *     possible object is
     *     {@link IDIHINVSCHEDULEINVSCHTWSType.GCOMMISSIONTYPE }
     *     
     */
    public IDIHINVSCHEDULEINVSCHTWSType.GCOMMISSIONTYPE getGCOMMISSIONTYPE() {
        return gcommissiontype;
    }

    /**
     * Sets the value of the gcommissiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIHINVSCHEDULEINVSCHTWSType.GCOMMISSIONTYPE }
     *     
     */
    public void setGCOMMISSIONTYPE(IDIHINVSCHEDULEINVSCHTWSType.GCOMMISSIONTYPE value) {
        this.gcommissiontype = value;
    }

    /**
     * Gets the value of the goverride property.
     * 
     * @return
     *     possible object is
     *     {@link IDIHINVSCHEDULEINVSCHTWSType.GOVERRIDE }
     *     
     */
    public IDIHINVSCHEDULEINVSCHTWSType.GOVERRIDE getGOVERRIDE() {
        return goverride;
    }

    /**
     * Sets the value of the goverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIHINVSCHEDULEINVSCHTWSType.GOVERRIDE }
     *     
     */
    public void setGOVERRIDE(IDIHINVSCHEDULEINVSCHTWSType.GOVERRIDE value) {
        this.goverride = value;
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
     *                   &lt;element name="COMMISSIONTYPE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COMMISSIONAMT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        protected List<IDIHINVSCHEDULEINVSCHTWSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE> mcommissiontype;
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
         * {@link IDIHINVSCHEDULEINVSCHTWSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE }
         * 
         * 
         */
        public List<IDIHINVSCHEDULEINVSCHTWSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE> getMCOMMISSIONTYPE() {
            if (mcommissiontype == null) {
                mcommissiontype = new ArrayList<IDIHINVSCHEDULEINVSCHTWSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE>();
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
         *         &lt;element name="COMMISSIONTYPE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COMMISSIONAMT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "commissiontype1",
            "commissionamt1"
        })
        public static class MCOMMISSIONTYPE {

            @XmlElement(name = "COMMISSIONTYPE1")
            protected String commissiontype1;
            @XmlElement(name = "COMMISSIONAMT1")
            protected String commissionamt1;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the commissiontype1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMMISSIONTYPE1() {
                return commissiontype1;
            }

            /**
             * Sets the value of the commissiontype1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMMISSIONTYPE1(String value) {
                this.commissiontype1 = value;
            }

            /**
             * Gets the value of the commissionamt1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMMISSIONAMT1() {
                return commissionamt1;
            }

            /**
             * Sets the value of the commissionamt1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMMISSIONAMT1(String value) {
                this.commissionamt1 = value;
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
     *         &lt;element name="OVERRIDE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "override"
    })
    public static class GOVERRIDE {

        @XmlElement(name = "OVERRIDE")
        protected List<String> override;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the override property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the override property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOVERRIDE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOVERRIDE() {
            if (override == null) {
                override = new ArrayList<String>();
            }
            return this.override;
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
     *         &lt;element name="PAYMENTDETAILS1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "paymentdetails1"
    })
    public static class GPAYMENTDETAILS {

        @XmlElement(name = "PAYMENTDETAILS1")
        protected List<String> paymentdetails1;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the paymentdetails1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentdetails1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPAYMENTDETAILS1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPAYMENTDETAILS1() {
            if (paymentdetails1 == null) {
                paymentdetails1 = new ArrayList<String>();
            }
            return this.paymentdetails1;
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
