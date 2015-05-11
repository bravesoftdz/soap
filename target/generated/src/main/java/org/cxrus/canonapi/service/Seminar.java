
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seminar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seminar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="topic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="venue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seminar", propOrder = {
    "customField1",
    "customField2",
    "customField3",
    "date",
    "id",
    "timing",
    "topic",
    "venue"
})
public class Seminar {

    protected String customField1;
    protected String customField2;
    protected String customField3;
    protected String date;
    protected int id;
    protected String timing;
    protected String topic;
    protected String venue;

    /**
     * Gets the value of the customField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField1() {
        return customField1;
    }

    /**
     * Sets the value of the customField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField1(String value) {
        this.customField1 = value;
    }

    /**
     * Gets the value of the customField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField2() {
        return customField2;
    }

    /**
     * Sets the value of the customField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField2(String value) {
        this.customField2 = value;
    }

    /**
     * Gets the value of the customField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField3() {
        return customField3;
    }

    /**
     * Sets the value of the customField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField3(String value) {
        this.customField3 = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the timing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiming() {
        return timing;
    }

    /**
     * Sets the value of the timing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiming(String value) {
        this.timing = value;
    }

    /**
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    /**
     * Gets the value of the venue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenue() {
        return venue;
    }

    /**
     * Sets the value of the venue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenue(String value) {
        this.venue = value;
    }

}
