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
 * <p>Java class for EBCOMPANYCHANGEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EBCOMPANYCHANGEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="APPLICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONTRACTKEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EFFECTIVEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMPANYFROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMPANYTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gRESULTDESC" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RESULTDESC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gLINKCONTRACTS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LINKCONTRACTS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RESERVED9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESERVED8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESERVED7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESERVED6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESERVED5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESERVED4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESERVED3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESERVED2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESERVED1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="RECORDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gINPUTTER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INPUTTER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gDATETIME" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUTHORISER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEPTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUDITORCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUDITDATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "EBCOMPANYCHANGEType", propOrder = {
    "application",
    "product",
    "contractkey",
    "effectivedate",
    "companyfrom",
    "companyto",
    "result",
    "gresultdesc",
    "glinkcontracts",
    "reserved9",
    "reserved8",
    "reserved7",
    "reserved6",
    "reserved5",
    "reserved4",
    "reserved3",
    "reserved2",
    "reserved1",
    "goverride",
    "recordstatus",
    "currno",
    "ginputter",
    "gdatetime",
    "authoriser",
    "cocode",
    "deptcode",
    "auditorcode",
    "auditdatetime"
})
public class EBCOMPANYCHANGEType {

    @XmlElement(name = "APPLICATION")
    protected String application;
    @XmlElement(name = "PRODUCT")
    protected String product;
    @XmlElement(name = "CONTRACTKEY")
    protected String contractkey;
    @XmlElement(name = "EFFECTIVEDATE")
    protected String effectivedate;
    @XmlElement(name = "COMPANYFROM")
    protected String companyfrom;
    @XmlElement(name = "COMPANYTO")
    protected String companyto;
    @XmlElement(name = "RESULT")
    protected String result;
    @XmlElement(name = "gRESULTDESC")
    protected EBCOMPANYCHANGEType.GRESULTDESC gresultdesc;
    @XmlElement(name = "gLINKCONTRACTS")
    protected EBCOMPANYCHANGEType.GLINKCONTRACTS glinkcontracts;
    @XmlElement(name = "RESERVED9")
    protected String reserved9;
    @XmlElement(name = "RESERVED8")
    protected String reserved8;
    @XmlElement(name = "RESERVED7")
    protected String reserved7;
    @XmlElement(name = "RESERVED6")
    protected String reserved6;
    @XmlElement(name = "RESERVED5")
    protected String reserved5;
    @XmlElement(name = "RESERVED4")
    protected String reserved4;
    @XmlElement(name = "RESERVED3")
    protected String reserved3;
    @XmlElement(name = "RESERVED2")
    protected String reserved2;
    @XmlElement(name = "RESERVED1")
    protected String reserved1;
    @XmlElement(name = "gOVERRIDE")
    protected EBCOMPANYCHANGEType.GOVERRIDE goverride;
    @XmlElement(name = "RECORDSTATUS")
    protected String recordstatus;
    @XmlElement(name = "CURRNO")
    protected String currno;
    @XmlElement(name = "gINPUTTER")
    protected EBCOMPANYCHANGEType.GINPUTTER ginputter;
    @XmlElement(name = "gDATETIME")
    protected EBCOMPANYCHANGEType.GDATETIME gdatetime;
    @XmlElement(name = "AUTHORISER")
    protected String authoriser;
    @XmlElement(name = "COCODE")
    protected String cocode;
    @XmlElement(name = "DEPTCODE")
    protected String deptcode;
    @XmlElement(name = "AUDITORCODE")
    protected String auditorcode;
    @XmlElement(name = "AUDITDATETIME")
    protected String auditdatetime;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLICATION() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLICATION(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCT() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCT(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the contractkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTKEY() {
        return contractkey;
    }

    /**
     * Sets the value of the contractkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTKEY(String value) {
        this.contractkey = value;
    }

    /**
     * Gets the value of the effectivedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEFFECTIVEDATE() {
        return effectivedate;
    }

    /**
     * Sets the value of the effectivedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEFFECTIVEDATE(String value) {
        this.effectivedate = value;
    }

    /**
     * Gets the value of the companyfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANYFROM() {
        return companyfrom;
    }

    /**
     * Sets the value of the companyfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANYFROM(String value) {
        this.companyfrom = value;
    }

    /**
     * Gets the value of the companyto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANYTO() {
        return companyto;
    }

    /**
     * Sets the value of the companyto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANYTO(String value) {
        this.companyto = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESULT() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESULT(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the gresultdesc property.
     * 
     * @return
     *     possible object is
     *     {@link EBCOMPANYCHANGEType.GRESULTDESC }
     *     
     */
    public EBCOMPANYCHANGEType.GRESULTDESC getGRESULTDESC() {
        return gresultdesc;
    }

    /**
     * Sets the value of the gresultdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBCOMPANYCHANGEType.GRESULTDESC }
     *     
     */
    public void setGRESULTDESC(EBCOMPANYCHANGEType.GRESULTDESC value) {
        this.gresultdesc = value;
    }

    /**
     * Gets the value of the glinkcontracts property.
     * 
     * @return
     *     possible object is
     *     {@link EBCOMPANYCHANGEType.GLINKCONTRACTS }
     *     
     */
    public EBCOMPANYCHANGEType.GLINKCONTRACTS getGLINKCONTRACTS() {
        return glinkcontracts;
    }

    /**
     * Sets the value of the glinkcontracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBCOMPANYCHANGEType.GLINKCONTRACTS }
     *     
     */
    public void setGLINKCONTRACTS(EBCOMPANYCHANGEType.GLINKCONTRACTS value) {
        this.glinkcontracts = value;
    }

    /**
     * Gets the value of the reserved9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED9() {
        return reserved9;
    }

    /**
     * Sets the value of the reserved9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED9(String value) {
        this.reserved9 = value;
    }

    /**
     * Gets the value of the reserved8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED8() {
        return reserved8;
    }

    /**
     * Sets the value of the reserved8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED8(String value) {
        this.reserved8 = value;
    }

    /**
     * Gets the value of the reserved7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED7() {
        return reserved7;
    }

    /**
     * Sets the value of the reserved7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED7(String value) {
        this.reserved7 = value;
    }

    /**
     * Gets the value of the reserved6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED6() {
        return reserved6;
    }

    /**
     * Sets the value of the reserved6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED6(String value) {
        this.reserved6 = value;
    }

    /**
     * Gets the value of the reserved5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED5() {
        return reserved5;
    }

    /**
     * Sets the value of the reserved5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED5(String value) {
        this.reserved5 = value;
    }

    /**
     * Gets the value of the reserved4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED4() {
        return reserved4;
    }

    /**
     * Sets the value of the reserved4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED4(String value) {
        this.reserved4 = value;
    }

    /**
     * Gets the value of the reserved3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED3() {
        return reserved3;
    }

    /**
     * Sets the value of the reserved3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED3(String value) {
        this.reserved3 = value;
    }

    /**
     * Gets the value of the reserved2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED2() {
        return reserved2;
    }

    /**
     * Sets the value of the reserved2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED2(String value) {
        this.reserved2 = value;
    }

    /**
     * Gets the value of the reserved1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED1() {
        return reserved1;
    }

    /**
     * Sets the value of the reserved1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED1(String value) {
        this.reserved1 = value;
    }

    /**
     * Gets the value of the goverride property.
     * 
     * @return
     *     possible object is
     *     {@link EBCOMPANYCHANGEType.GOVERRIDE }
     *     
     */
    public EBCOMPANYCHANGEType.GOVERRIDE getGOVERRIDE() {
        return goverride;
    }

    /**
     * Sets the value of the goverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBCOMPANYCHANGEType.GOVERRIDE }
     *     
     */
    public void setGOVERRIDE(EBCOMPANYCHANGEType.GOVERRIDE value) {
        this.goverride = value;
    }

    /**
     * Gets the value of the recordstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECORDSTATUS() {
        return recordstatus;
    }

    /**
     * Sets the value of the recordstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECORDSTATUS(String value) {
        this.recordstatus = value;
    }

    /**
     * Gets the value of the currno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRNO() {
        return currno;
    }

    /**
     * Sets the value of the currno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRNO(String value) {
        this.currno = value;
    }

    /**
     * Gets the value of the ginputter property.
     * 
     * @return
     *     possible object is
     *     {@link EBCOMPANYCHANGEType.GINPUTTER }
     *     
     */
    public EBCOMPANYCHANGEType.GINPUTTER getGINPUTTER() {
        return ginputter;
    }

    /**
     * Sets the value of the ginputter property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBCOMPANYCHANGEType.GINPUTTER }
     *     
     */
    public void setGINPUTTER(EBCOMPANYCHANGEType.GINPUTTER value) {
        this.ginputter = value;
    }

    /**
     * Gets the value of the gdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link EBCOMPANYCHANGEType.GDATETIME }
     *     
     */
    public EBCOMPANYCHANGEType.GDATETIME getGDATETIME() {
        return gdatetime;
    }

    /**
     * Sets the value of the gdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBCOMPANYCHANGEType.GDATETIME }
     *     
     */
    public void setGDATETIME(EBCOMPANYCHANGEType.GDATETIME value) {
        this.gdatetime = value;
    }

    /**
     * Gets the value of the authoriser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHORISER() {
        return authoriser;
    }

    /**
     * Sets the value of the authoriser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHORISER(String value) {
        this.authoriser = value;
    }

    /**
     * Gets the value of the cocode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOCODE() {
        return cocode;
    }

    /**
     * Sets the value of the cocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOCODE(String value) {
        this.cocode = value;
    }

    /**
     * Gets the value of the deptcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPTCODE() {
        return deptcode;
    }

    /**
     * Sets the value of the deptcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPTCODE(String value) {
        this.deptcode = value;
    }

    /**
     * Gets the value of the auditorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDITORCODE() {
        return auditorcode;
    }

    /**
     * Sets the value of the auditorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDITORCODE(String value) {
        this.auditorcode = value;
    }

    /**
     * Gets the value of the auditdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDITDATETIME() {
        return auditdatetime;
    }

    /**
     * Sets the value of the auditdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDITDATETIME(String value) {
        this.auditdatetime = value;
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
     *         &lt;element name="DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "datetime"
    })
    public static class GDATETIME {

        @XmlElement(name = "DATETIME")
        protected List<String> datetime;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the datetime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datetime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATETIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDATETIME() {
            if (datetime == null) {
                datetime = new ArrayList<String>();
            }
            return this.datetime;
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
     *         &lt;element name="INPUTTER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "inputter"
    })
    public static class GINPUTTER {

        @XmlElement(name = "INPUTTER")
        protected List<String> inputter;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inputter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inputter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINPUTTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINPUTTER() {
            if (inputter == null) {
                inputter = new ArrayList<String>();
            }
            return this.inputter;
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
     *         &lt;element name="LINKCONTRACTS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "linkcontracts"
    })
    public static class GLINKCONTRACTS {

        @XmlElement(name = "LINKCONTRACTS")
        protected List<String> linkcontracts;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the linkcontracts property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linkcontracts property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLINKCONTRACTS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLINKCONTRACTS() {
            if (linkcontracts == null) {
                linkcontracts = new ArrayList<String>();
            }
            return this.linkcontracts;
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
     *         &lt;element name="RESULTDESC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "resultdesc"
    })
    public static class GRESULTDESC {

        @XmlElement(name = "RESULTDESC")
        protected List<String> resultdesc;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the resultdesc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resultdesc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRESULTDESC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRESULTDESC() {
            if (resultdesc == null) {
                resultdesc = new ArrayList<String>();
            }
            return this.resultdesc;
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
