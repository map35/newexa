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
 * <p>Java class for IDIEIMAGEVIEWTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIEIMAGEVIEWTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERODISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gIDIEIMAGEVIEWTWSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIEIMAGEVIEWTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IMAGETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IMAGEAPPLICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IMAGEREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SHORTDESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IMAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDIEIMAGEVIEWTWSType", propOrder = {
    "zerodisplay",
    "gidieimageviewtwsDetailType"
})
public class IDIEIMAGEVIEWTWSType {

    @XmlElement(name = "ZERODISPLAY")
    protected String zerodisplay;
    @XmlElement(name = "gIDIEIMAGEVIEWTWSDetailType")
    protected IDIEIMAGEVIEWTWSType.GIDIEIMAGEVIEWTWSDetailType gidieimageviewtwsDetailType;

    /**
     * Gets the value of the zerodisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZERODISPLAY() {
        return zerodisplay;
    }

    /**
     * Sets the value of the zerodisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZERODISPLAY(String value) {
        this.zerodisplay = value;
    }

    /**
     * Gets the value of the gidieimageviewtwsDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIEIMAGEVIEWTWSType.GIDIEIMAGEVIEWTWSDetailType }
     *     
     */
    public IDIEIMAGEVIEWTWSType.GIDIEIMAGEVIEWTWSDetailType getGIDIEIMAGEVIEWTWSDetailType() {
        return gidieimageviewtwsDetailType;
    }

    /**
     * Sets the value of the gidieimageviewtwsDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIEIMAGEVIEWTWSType.GIDIEIMAGEVIEWTWSDetailType }
     *     
     */
    public void setGIDIEIMAGEVIEWTWSDetailType(IDIEIMAGEVIEWTWSType.GIDIEIMAGEVIEWTWSDetailType value) {
        this.gidieimageviewtwsDetailType = value;
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
     *         &lt;element name="mIDIEIMAGEVIEWTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IMAGETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IMAGEAPPLICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IMAGEREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SHORTDESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IMAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "midieimageviewtwsDetailType"
    })
    public static class GIDIEIMAGEVIEWTWSDetailType {

        @XmlElement(name = "mIDIEIMAGEVIEWTWSDetailType")
        protected List<IDIEIMAGEVIEWTWSType.GIDIEIMAGEVIEWTWSDetailType.MIDIEIMAGEVIEWTWSDetailType> midieimageviewtwsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midieimageviewtwsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midieimageviewtwsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIEIMAGEVIEWTWSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIEIMAGEVIEWTWSType.GIDIEIMAGEVIEWTWSDetailType.MIDIEIMAGEVIEWTWSDetailType }
         * 
         * 
         */
        public List<IDIEIMAGEVIEWTWSType.GIDIEIMAGEVIEWTWSDetailType.MIDIEIMAGEVIEWTWSDetailType> getMIDIEIMAGEVIEWTWSDetailType() {
            if (midieimageviewtwsDetailType == null) {
                midieimageviewtwsDetailType = new ArrayList<IDIEIMAGEVIEWTWSType.GIDIEIMAGEVIEWTWSDetailType.MIDIEIMAGEVIEWTWSDetailType>();
            }
            return this.midieimageviewtwsDetailType;
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
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IMAGETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IMAGEAPPLICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IMAGEREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SHORTDESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IMAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "id",
            "imagetype",
            "imageapplication",
            "imagereference",
            "shortdescription",
            "image",
            "path"
        })
        public static class MIDIEIMAGEVIEWTWSDetailType {

            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "IMAGETYPE")
            protected String imagetype;
            @XmlElement(name = "IMAGEAPPLICATION")
            protected String imageapplication;
            @XmlElement(name = "IMAGEREFERENCE")
            protected String imagereference;
            @XmlElement(name = "SHORTDESCRIPTION")
            protected String shortdescription;
            @XmlElement(name = "IMAGE")
            protected String image;
            @XmlElement(name = "PATH")
            protected String path;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
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
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the imagetype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIMAGETYPE() {
                return imagetype;
            }

            /**
             * Sets the value of the imagetype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIMAGETYPE(String value) {
                this.imagetype = value;
            }

            /**
             * Gets the value of the imageapplication property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIMAGEAPPLICATION() {
                return imageapplication;
            }

            /**
             * Sets the value of the imageapplication property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIMAGEAPPLICATION(String value) {
                this.imageapplication = value;
            }

            /**
             * Gets the value of the imagereference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIMAGEREFERENCE() {
                return imagereference;
            }

            /**
             * Sets the value of the imagereference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIMAGEREFERENCE(String value) {
                this.imagereference = value;
            }

            /**
             * Gets the value of the shortdescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSHORTDESCRIPTION() {
                return shortdescription;
            }

            /**
             * Sets the value of the shortdescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSHORTDESCRIPTION(String value) {
                this.shortdescription = value;
            }

            /**
             * Gets the value of the image property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIMAGE() {
                return image;
            }

            /**
             * Sets the value of the image property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIMAGE(String value) {
                this.image = value;
            }

            /**
             * Gets the value of the path property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPATH() {
                return path;
            }

            /**
             * Sets the value of the path property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPATH(String value) {
                this.path = value;
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
