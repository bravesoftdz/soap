
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for highlightSegmentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="highlightSegmentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="content1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "highlightSegmentResult", propOrder = {
    "content1",
    "content2",
    "segment"
})
public class HighlightSegmentResult {

    protected String content1;
    protected String content2;
    protected String segment;

    /**
     * Gets the value of the content1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent1() {
        return content1;
    }

    /**
     * Sets the value of the content1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent1(String value) {
        this.content1 = value;
    }

    /**
     * Gets the value of the content2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent2() {
        return content2;
    }

    /**
     * Sets the value of the content2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent2(String value) {
        this.content2 = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment(String value) {
        this.segment = value;
    }

}
