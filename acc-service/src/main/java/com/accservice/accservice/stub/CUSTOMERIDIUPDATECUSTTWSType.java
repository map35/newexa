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
 * <p>Java class for CUSTOMERIDIUPDATECUSTTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUSTOMERIDIUPDATECUSTTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gOFFPHONE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OFFPHONE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DATEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gSMS1" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SMS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gEMAIL1" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gTAXID" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TAXID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLACEBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LEGALTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LEGALIDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gADDR.PHONE.AREA" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mADDR.PHONE.AREA" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ADDRPHONEAREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDRPHONENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CUSTOMERIDIUPDATECUSTTWSType", propOrder = {
    "goffphone",
    "dateofbirth",
    "gsms1",
    "gemail1",
    "gtaxid",
    "placebirth",
    "legaltype",
    "legalidno",
    "gaddrphonearea"
})
public class CUSTOMERIDIUPDATECUSTTWSType {

    @XmlElement(name = "gOFFPHONE")
    protected CUSTOMERIDIUPDATECUSTTWSType.GOFFPHONE goffphone;
    @XmlElement(name = "DATEOFBIRTH")
    protected String dateofbirth;
    @XmlElement(name = "gSMS1")
    protected CUSTOMERIDIUPDATECUSTTWSType.GSMS1 gsms1;
    @XmlElement(name = "gEMAIL1")
    protected CUSTOMERIDIUPDATECUSTTWSType.GEMAIL1 gemail1;
    @XmlElement(name = "gTAXID")
    protected CUSTOMERIDIUPDATECUSTTWSType.GTAXID gtaxid;
    @XmlElement(name = "PLACEBIRTH")
    protected String placebirth;
    @XmlElement(name = "LEGALTYPE")
    protected String legaltype;
    @XmlElement(name = "LEGALIDNO")
    protected String legalidno;
    @XmlElement(name = "gADDR.PHONE.AREA")
    protected CUSTOMERIDIUPDATECUSTTWSType.GADDRPHONEAREA gaddrphonearea;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the goffphone property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMERIDIUPDATECUSTTWSType.GOFFPHONE }
     *     
     */
    public CUSTOMERIDIUPDATECUSTTWSType.GOFFPHONE getGOFFPHONE() {
        return goffphone;
    }

    /**
     * Sets the value of the goffphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMERIDIUPDATECUSTTWSType.GOFFPHONE }
     *     
     */
    public void setGOFFPHONE(CUSTOMERIDIUPDATECUSTTWSType.GOFFPHONE value) {
        this.goffphone = value;
    }

    /**
     * Gets the value of the dateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEOFBIRTH() {
        return dateofbirth;
    }

    /**
     * Sets the value of the dateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEOFBIRTH(String value) {
        this.dateofbirth = value;
    }

    /**
     * Gets the value of the gsms1 property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMERIDIUPDATECUSTTWSType.GSMS1 }
     *     
     */
    public CUSTOMERIDIUPDATECUSTTWSType.GSMS1 getGSMS1() {
        return gsms1;
    }

    /**
     * Sets the value of the gsms1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMERIDIUPDATECUSTTWSType.GSMS1 }
     *     
     */
    public void setGSMS1(CUSTOMERIDIUPDATECUSTTWSType.GSMS1 value) {
        this.gsms1 = value;
    }

    /**
     * Gets the value of the gemail1 property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMERIDIUPDATECUSTTWSType.GEMAIL1 }
     *     
     */
    public CUSTOMERIDIUPDATECUSTTWSType.GEMAIL1 getGEMAIL1() {
        return gemail1;
    }

    /**
     * Sets the value of the gemail1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMERIDIUPDATECUSTTWSType.GEMAIL1 }
     *     
     */
    public void setGEMAIL1(CUSTOMERIDIUPDATECUSTTWSType.GEMAIL1 value) {
        this.gemail1 = value;
    }

    /**
     * Gets the value of the gtaxid property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMERIDIUPDATECUSTTWSType.GTAXID }
     *     
     */
    public CUSTOMERIDIUPDATECUSTTWSType.GTAXID getGTAXID() {
        return gtaxid;
    }

    /**
     * Sets the value of the gtaxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMERIDIUPDATECUSTTWSType.GTAXID }
     *     
     */
    public void setGTAXID(CUSTOMERIDIUPDATECUSTTWSType.GTAXID value) {
        this.gtaxid = value;
    }

    /**
     * Gets the value of the placebirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLACEBIRTH() {
        return placebirth;
    }

    /**
     * Sets the value of the placebirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLACEBIRTH(String value) {
        this.placebirth = value;
    }

    /**
     * Gets the value of the legaltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEGALTYPE() {
        return legaltype;
    }

    /**
     * Sets the value of the legaltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEGALTYPE(String value) {
        this.legaltype = value;
    }

    /**
     * Gets the value of the legalidno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEGALIDNO() {
        return legalidno;
    }

    /**
     * Sets the value of the legalidno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEGALIDNO(String value) {
        this.legalidno = value;
    }

    /**
     * Gets the value of the gaddrphonearea property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMERIDIUPDATECUSTTWSType.GADDRPHONEAREA }
     *     
     */
    public CUSTOMERIDIUPDATECUSTTWSType.GADDRPHONEAREA getGADDRPHONEAREA() {
        return gaddrphonearea;
    }

    /**
     * Sets the value of the gaddrphonearea property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMERIDIUPDATECUSTTWSType.GADDRPHONEAREA }
     *     
     */
    public void setGADDRPHONEAREA(CUSTOMERIDIUPDATECUSTTWSType.GADDRPHONEAREA value) {
        this.gaddrphonearea = value;
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
     *         &lt;element name="mADDR.PHONE.AREA" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ADDRPHONEAREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDRPHONENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "maddrphonearea"
    })
    public static class GADDRPHONEAREA {

        @XmlElement(name = "mADDR.PHONE.AREA")
        protected List<CUSTOMERIDIUPDATECUSTTWSType.GADDRPHONEAREA.MADDRPHONEAREA> maddrphonearea;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the maddrphonearea property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the maddrphonearea property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMADDRPHONEAREA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CUSTOMERIDIUPDATECUSTTWSType.GADDRPHONEAREA.MADDRPHONEAREA }
         * 
         * 
         */
        public List<CUSTOMERIDIUPDATECUSTTWSType.GADDRPHONEAREA.MADDRPHONEAREA> getMADDRPHONEAREA() {
            if (maddrphonearea == null) {
                maddrphonearea = new ArrayList<CUSTOMERIDIUPDATECUSTTWSType.GADDRPHONEAREA.MADDRPHONEAREA>();
            }
            return this.maddrphonearea;
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
         *         &lt;element name="ADDRPHONEAREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDRPHONENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "addrphonearea",
            "addrphoneno"
        })
        public static class MADDRPHONEAREA {

            @XmlElement(name = "ADDRPHONEAREA")
            protected String addrphonearea;
            @XmlElement(name = "ADDRPHONENO")
            protected String addrphoneno;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the addrphonearea property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDRPHONEAREA() {
                return addrphonearea;
            }

            /**
             * Sets the value of the addrphonearea property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDRPHONEAREA(String value) {
                this.addrphonearea = value;
            }

            /**
             * Gets the value of the addrphoneno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDRPHONENO() {
                return addrphoneno;
            }

            /**
             * Sets the value of the addrphoneno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDRPHONENO(String value) {
                this.addrphoneno = value;
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
     *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "email"
    })
    public static class GEMAIL1 {

        @XmlElement(name = "EMAIL")
        protected List<String> email;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the email property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the email property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEMAIL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEMAIL() {
            if (email == null) {
                email = new ArrayList<String>();
            }
            return this.email;
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
     *         &lt;element name="OFFPHONE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "offphone"
    })
    public static class GOFFPHONE {

        @XmlElement(name = "OFFPHONE")
        protected List<String> offphone;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the offphone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offphone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOFFPHONE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOFFPHONE() {
            if (offphone == null) {
                offphone = new ArrayList<String>();
            }
            return this.offphone;
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
     *         &lt;element name="SMS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "sms"
    })
    public static class GSMS1 {

        @XmlElement(name = "SMS")
        protected List<String> sms;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the sms property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sms property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSMS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSMS() {
            if (sms == null) {
                sms = new ArrayList<String>();
            }
            return this.sms;
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
     *         &lt;element name="TAXID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "taxid"
    })
    public static class GTAXID {

        @XmlElement(name = "TAXID")
        protected List<String> taxid;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the taxid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTAXID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTAXID() {
            if (taxid == null) {
                taxid = new ArrayList<String>();
            }
            return this.taxid;
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
