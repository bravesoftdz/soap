
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for staticPageSegmentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="staticPageSegmentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://service.canonapi.cxrus.org/}staticPageResult" minOccurs="0"/>
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
@XmlType(name = "staticPageSegmentResult", propOrder = {
    "data",
    "segment"
})
public class StaticPageSegmentResult {

    protected StaticPageResult data;
    protected String segment;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link StaticPageResult }
     *     
     */
    public StaticPageResult getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticPageResult }
     *     
     */
    public void setData(StaticPageResult value) {
        this.data = value;
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
