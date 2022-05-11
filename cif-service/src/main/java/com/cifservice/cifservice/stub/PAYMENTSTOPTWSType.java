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
 * <p>Java class for PAYMENTSTOPTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAYMENTSTOPTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KCURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gPAYMSTOPTYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mPAYMSTOPTYPE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PAYMSTOPTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FIRSTCHEQUENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LASTCHEQUENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOOFLEAVES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CHEQUETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BENEFICIARY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="sgREMARKS" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *         &lt;element name="CUSTOMERNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PAYMENTSTOPTWSType", propOrder = {
    "kcurrency",
    "gpaymstoptype",
    "customerno"
})
public class PAYMENTSTOPTWSType {

    @XmlElement(name = "KCURRENCY")
    protected String kcurrency;
    @XmlElement(name = "gPAYMSTOPTYPE")
    protected PAYMENTSTOPTWSType.GPAYMSTOPTYPE gpaymstoptype;
    @XmlElement(name = "CUSTOMERNO")
    protected String customerno;
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
     * Gets the value of the gpaymstoptype property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTSTOPTWSType.GPAYMSTOPTYPE }
     *     
     */
    public PAYMENTSTOPTWSType.GPAYMSTOPTYPE getGPAYMSTOPTYPE() {
        return gpaymstoptype;
    }

    /**
     * Sets the value of the gpaymstoptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTSTOPTWSType.GPAYMSTOPTYPE }
     *     
     */
    public void setGPAYMSTOPTYPE(PAYMENTSTOPTWSType.GPAYMSTOPTYPE value) {
        this.gpaymstoptype = value;
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
     *         &lt;element name="mPAYMSTOPTYPE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PAYMSTOPTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FIRSTCHEQUENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LASTCHEQUENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOOFLEAVES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CHEQUETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BENEFICIARY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="sgREMARKS" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "mpaymstoptype"
    })
    public static class GPAYMSTOPTYPE {

        @XmlElement(name = "mPAYMSTOPTYPE")
        protected List<PAYMENTSTOPTWSType.GPAYMSTOPTYPE.MPAYMSTOPTYPE> mpaymstoptype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mpaymstoptype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mpaymstoptype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMPAYMSTOPTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PAYMENTSTOPTWSType.GPAYMSTOPTYPE.MPAYMSTOPTYPE }
         * 
         * 
         */
        public List<PAYMENTSTOPTWSType.GPAYMSTOPTYPE.MPAYMSTOPTYPE> getMPAYMSTOPTYPE() {
            if (mpaymstoptype == null) {
                mpaymstoptype = new ArrayList<PAYMENTSTOPTWSType.GPAYMSTOPTYPE.MPAYMSTOPTYPE>();
            }
            return this.mpaymstoptype;
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
         *         &lt;element name="PAYMSTOPTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FIRSTCHEQUENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LASTCHEQUENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOOFLEAVES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CHEQUETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BENEFICIARY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="sgREMARKS" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "paymstoptype",
            "firstchequeno",
            "lastchequeno",
            "noofleaves",
            "chequetype",
            "beneficiary",
            "sgREMARKS"
        })
        public static class MPAYMSTOPTYPE {

            @XmlElement(name = "PAYMSTOPTYPE")
            protected String paymstoptype;
            @XmlElement(name = "FIRSTCHEQUENO")
            protected String firstchequeno;
            @XmlElement(name = "LASTCHEQUENO")
            protected String lastchequeno;
            @XmlElement(name = "NOOFLEAVES")
            protected String noofleaves;
            @XmlElement(name = "CHEQUETYPE")
            protected String chequetype;
            @XmlElement(name = "BENEFICIARY")
            protected String beneficiary;
            protected PAYMENTSTOPTWSType.GPAYMSTOPTYPE.MPAYMSTOPTYPE.SgREMARKS sgREMARKS;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the paymstoptype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYMSTOPTYPE() {
                return paymstoptype;
            }

            /**
             * Sets the value of the paymstoptype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYMSTOPTYPE(String value) {
                this.paymstoptype = value;
            }

            /**
             * Gets the value of the firstchequeno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFIRSTCHEQUENO() {
                return firstchequeno;
            }

            /**
             * Sets the value of the firstchequeno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFIRSTCHEQUENO(String value) {
                this.firstchequeno = value;
            }

            /**
             * Gets the value of the lastchequeno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLASTCHEQUENO() {
                return lastchequeno;
            }

            /**
             * Sets the value of the lastchequeno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLASTCHEQUENO(String value) {
                this.lastchequeno = value;
            }

            /**
             * Gets the value of the noofleaves property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOOFLEAVES() {
                return noofleaves;
            }

            /**
             * Sets the value of the noofleaves property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOOFLEAVES(String value) {
                this.noofleaves = value;
            }

            /**
             * Gets the value of the chequetype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHEQUETYPE() {
                return chequetype;
            }

            /**
             * Sets the value of the chequetype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHEQUETYPE(String value) {
                this.chequetype = value;
            }

            /**
             * Gets the value of the beneficiary property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBENEFICIARY() {
                return beneficiary;
            }

            /**
             * Sets the value of the beneficiary property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBENEFICIARY(String value) {
                this.beneficiary = value;
            }

            /**
             * Gets the value of the sgREMARKS property.
             * 
             * @return
             *     possible object is
             *     {@link PAYMENTSTOPTWSType.GPAYMSTOPTYPE.MPAYMSTOPTYPE.SgREMARKS }
             *     
             */
            public PAYMENTSTOPTWSType.GPAYMSTOPTYPE.MPAYMSTOPTYPE.SgREMARKS getSgREMARKS() {
                return sgREMARKS;
            }

            /**
             * Sets the value of the sgREMARKS property.
             * 
             * @param value
             *     allowed object is
             *     {@link PAYMENTSTOPTWSType.GPAYMSTOPTYPE.MPAYMSTOPTYPE.SgREMARKS }
             *     
             */
            public void setSgREMARKS(PAYMENTSTOPTWSType.GPAYMSTOPTYPE.MPAYMSTOPTYPE.SgREMARKS value) {
                this.sgREMARKS = value;
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
             *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                "remarks"
            })
            public static class SgREMARKS {

                @XmlElement(name = "REMARKS")
                protected List<String> remarks;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the remarks property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the remarks property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getREMARKS().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getREMARKS() {
                    if (remarks == null) {
                        remarks = new ArrayList<String>();
                    }
                    return this.remarks;
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

            }

        }

    }

}
