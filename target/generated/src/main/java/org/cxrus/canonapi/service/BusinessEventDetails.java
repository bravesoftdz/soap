
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessEventDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessEventDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acknowledgeMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayCustomField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayCustomField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayCustomField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mastHead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seminarCustomField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seminarCustomField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seminarCustomField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seminars" type="{http://service.canonapi.cxrus.org/}seminar" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "businessEventDetails", propOrder = {
    "acknowledgeMessage",
    "country",
    "description",
    "displayCustomField1",
    "displayCustomField2",
    "displayCustomField3",
    "endDate",
    "endTime",
    "fullDescription",
    "id",
    "mastHead",
    "name",
    "seminarCustomField1",
    "seminarCustomField2",
    "seminarCustomField3",
    "seminars",
    "startDate",
    "startTime",
    "venue"
})
public class BusinessEventDetails {

    protected String acknowledgeMessage;
    protected String country;
    protected String description;
    protected String displayCustomField1;
    protected String displayCustomField2;
    protected String displayCustomField3;
    protected String endDate;
    protected String endTime;
    protected String fullDescription;
    protected int id;
    protected String mastHead;
    protected String name;
    protected String seminarCustomField1;
    protected String seminarCustomField2;
    protected String seminarCustomField3;
    @XmlElement(nillable = true)
    protected List<Seminar> seminars;
    protected String startDate;
    protected String startTime;
    protected String venue;

    /**
     * Gets the value of the acknowledgeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcknowledgeMessage() {
        return acknowledgeMessage;
    }

    /**
     * Sets the value of the acknowledgeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcknowledgeMessage(String value) {
        this.acknowledgeMessage = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the displayCustomField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCustomField1() {
        return displayCustomField1;
    }

    /**
     * Sets the value of the displayCustomField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCustomField1(String value) {
        this.displayCustomField1 = value;
    }

    /**
     * Gets the value of the displayCustomField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCustomField2() {
        return displayCustomField2;
    }

    /**
     * Sets the value of the displayCustomField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCustomField2(String value) {
        this.displayCustomField2 = value;
    }

    /**
     * Gets the value of the displayCustomField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCustomField3() {
        return displayCustomField3;
    }

    /**
     * Sets the value of the displayCustomField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCustomField3(String value) {
        this.displayCustomField3 = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the fullDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullDescription() {
        return fullDescription;
    }

    /**
     * Sets the value of the fullDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullDescription(String value) {
        this.fullDescription = value;
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
     * Gets the value of the mastHead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMastHead() {
        return mastHead;
    }

    /**
     * Sets the value of the mastHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMastHead(String value) {
        this.mastHead = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the seminarCustomField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeminarCustomField1() {
        return seminarCustomField1;
    }

    /**
     * Sets the value of the seminarCustomField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeminarCustomField1(String value) {
        this.seminarCustomField1 = value;
    }

    /**
     * Gets the value of the seminarCustomField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeminarCustomField2() {
        return seminarCustomField2;
    }

    /**
     * Sets the value of the seminarCustomField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeminarCustomField2(String value) {
        this.seminarCustomField2 = value;
    }

    /**
     * Gets the value of the seminarCustomField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeminarCustomField3() {
        return seminarCustomField3;
    }

    /**
     * Sets the value of the seminarCustomField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeminarCustomField3(String value) {
        this.seminarCustomField3 = value;
    }

    /**
     * Gets the value of the seminars property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seminars property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeminars().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Seminar }
     * 
     * 
     */
    public List<Seminar> getSeminars() {
        if (seminars == null) {
            seminars = new ArrayList<Seminar>();
        }
        return this.seminars;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
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
