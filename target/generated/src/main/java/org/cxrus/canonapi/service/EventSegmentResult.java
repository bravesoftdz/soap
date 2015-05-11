
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventSegmentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventSegmentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventList" type="{http://service.canonapi.cxrus.org/}eventResult" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "eventSegmentResult", propOrder = {
    "eventList",
    "segment"
})
public class EventSegmentResult {

    @XmlElement(nillable = true)
    protected List<EventResult> eventList;
    protected String segment;

    /**
     * Gets the value of the eventList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventResult }
     * 
     * 
     */
    public List<EventResult> getEventList() {
        if (eventList == null) {
            eventList = new ArrayList<EventResult>();
        }
        return this.eventList;
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
