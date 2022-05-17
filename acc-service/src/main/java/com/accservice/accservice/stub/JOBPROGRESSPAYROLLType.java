//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.12 at 03:47:20 PM WIB 
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
 * <p>Java class for JOBPROGRESSPAYROLLType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JOBPROGRESSPAYROLLType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gJOBPROGRESSPAYROLLDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mJOBPROGRESSPAYROLLDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PROCESSJOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="STARTTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ENDTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="THROUGHPUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LASTTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CONTROLLIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROCESSED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COMPLETED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SERVICESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "JOBPROGRESSPAYROLLType", propOrder = {
    "gjobprogresspayrollDetailType"
})
public class JOBPROGRESSPAYROLLType {

    @XmlElement(name = "gJOBPROGRESSPAYROLLDetailType")
    protected JOBPROGRESSPAYROLLType.GJOBPROGRESSPAYROLLDetailType gjobprogresspayrollDetailType;

    /**
     * Gets the value of the gjobprogresspayrollDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link JOBPROGRESSPAYROLLType.GJOBPROGRESSPAYROLLDetailType }
     *     
     */
    public JOBPROGRESSPAYROLLType.GJOBPROGRESSPAYROLLDetailType getGJOBPROGRESSPAYROLLDetailType() {
        return gjobprogresspayrollDetailType;
    }

    /**
     * Sets the value of the gjobprogresspayrollDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JOBPROGRESSPAYROLLType.GJOBPROGRESSPAYROLLDetailType }
     *     
     */
    public void setGJOBPROGRESSPAYROLLDetailType(JOBPROGRESSPAYROLLType.GJOBPROGRESSPAYROLLDetailType value) {
        this.gjobprogresspayrollDetailType = value;
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
     *         &lt;element name="mJOBPROGRESSPAYROLLDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PROCESSJOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STARTTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ENDTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="THROUGHPUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LASTTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CONTROLLIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROCESSED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COMPLETED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SERVICESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mjobprogresspayrollDetailType"
    })
    public static class GJOBPROGRESSPAYROLLDetailType {

        @XmlElement(name = "mJOBPROGRESSPAYROLLDetailType")
        protected List<JOBPROGRESSPAYROLLType.GJOBPROGRESSPAYROLLDetailType.MJOBPROGRESSPAYROLLDetailType> mjobprogresspayrollDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mjobprogresspayrollDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mjobprogresspayrollDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMJOBPROGRESSPAYROLLDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JOBPROGRESSPAYROLLType.GJOBPROGRESSPAYROLLDetailType.MJOBPROGRESSPAYROLLDetailType }
         * 
         * 
         */
        public List<JOBPROGRESSPAYROLLType.GJOBPROGRESSPAYROLLDetailType.MJOBPROGRESSPAYROLLDetailType> getMJOBPROGRESSPAYROLLDetailType() {
            if (mjobprogresspayrollDetailType == null) {
                mjobprogresspayrollDetailType = new ArrayList<JOBPROGRESSPAYROLLType.GJOBPROGRESSPAYROLLDetailType.MJOBPROGRESSPAYROLLDetailType>();
            }
            return this.mjobprogresspayrollDetailType;
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
         *         &lt;element name="PROCESSJOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STARTTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ENDTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="THROUGHPUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LASTTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CONTROLLIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROCESSED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COMPLETED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SERVICESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "processjob",
            "starttime",
            "endtime",
            "throughput",
            "lasttime",
            "controllist",
            "processed",
            "completed",
            "servicestatus"
        })
        public static class MJOBPROGRESSPAYROLLDetailType {

            @XmlElement(name = "PROCESSJOB")
            protected String processjob;
            @XmlElement(name = "STARTTIME")
            protected String starttime;
            @XmlElement(name = "ENDTIME")
            protected String endtime;
            @XmlElement(name = "THROUGHPUT")
            protected String throughput;
            @XmlElement(name = "LASTTIME")
            protected String lasttime;
            @XmlElement(name = "CONTROLLIST")
            protected String controllist;
            @XmlElement(name = "PROCESSED")
            protected String processed;
            @XmlElement(name = "COMPLETED")
            protected String completed;
            @XmlElement(name = "SERVICESTATUS")
            protected String servicestatus;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the processjob property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROCESSJOB() {
                return processjob;
            }

            /**
             * Sets the value of the processjob property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROCESSJOB(String value) {
                this.processjob = value;
            }

            /**
             * Gets the value of the starttime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTARTTIME() {
                return starttime;
            }

            /**
             * Sets the value of the starttime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTARTTIME(String value) {
                this.starttime = value;
            }

            /**
             * Gets the value of the endtime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getENDTIME() {
                return endtime;
            }

            /**
             * Sets the value of the endtime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setENDTIME(String value) {
                this.endtime = value;
            }

            /**
             * Gets the value of the throughput property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTHROUGHPUT() {
                return throughput;
            }

            /**
             * Sets the value of the throughput property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTHROUGHPUT(String value) {
                this.throughput = value;
            }

            /**
             * Gets the value of the lasttime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLASTTIME() {
                return lasttime;
            }

            /**
             * Sets the value of the lasttime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLASTTIME(String value) {
                this.lasttime = value;
            }

            /**
             * Gets the value of the controllist property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCONTROLLIST() {
                return controllist;
            }

            /**
             * Sets the value of the controllist property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCONTROLLIST(String value) {
                this.controllist = value;
            }

            /**
             * Gets the value of the processed property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROCESSED() {
                return processed;
            }

            /**
             * Sets the value of the processed property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROCESSED(String value) {
                this.processed = value;
            }

            /**
             * Gets the value of the completed property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMPLETED() {
                return completed;
            }

            /**
             * Sets the value of the completed property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMPLETED(String value) {
                this.completed = value;
            }

            /**
             * Gets the value of the servicestatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSERVICESTATUS() {
                return servicestatus;
            }

            /**
             * Sets the value of the servicestatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSERVICESTATUS(String value) {
                this.servicestatus = value;
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
