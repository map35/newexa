//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.28 at 03:22:51 PM WIB 
//


package com.twsservice.twsservice.newstub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for successIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="successIndicator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="TWSError"/&gt;
 *     &lt;enumeration value="T24Error"/&gt;
 *     &lt;enumeration value="T24Override"/&gt;
 *     &lt;enumeration value="T24Offline"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "successIndicator")
@XmlEnum
public enum SuccessIndicator {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("TWSError")
    TWS_ERROR("TWSError"),
    @XmlEnumValue("T24Error")
    T_24_ERROR("T24Error"),
    @XmlEnumValue("T24Override")
    T_24_OVERRIDE("T24Override"),
    @XmlEnumValue("T24Offline")
    T_24_OFFLINE("T24Offline");
    private final String value;

    SuccessIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuccessIndicator fromValue(String v) {
        for (SuccessIndicator c: SuccessIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
