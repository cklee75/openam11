//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.common.jaxb.utility;


/**
 * This type extends AnnotatedDateTime to add a Delay attribute.
 * 
 * Java content class for ReceivedType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/liberty/utility.xsd line 96)
 * <p>
 * <pre>
 * &lt;complexType name="ReceivedType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://schemas.xmlsoap.org/ws/2003/06/utility>AttributedDateTime">
 *       &lt;attribute name="Actor" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Delay" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ReceivedType
    extends com.sun.identity.liberty.ws.common.jaxb.utility.AttributedDateTime
{


    /**
     * Gets the value of the actor property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getActor();

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setActor(java.lang.String value);

    /**
     * Gets the value of the delay property.
     * 
     */
    int getDelay();

    /**
     * Sets the value of the delay property.
     * 
     */
    void setDelay(int value);

}
