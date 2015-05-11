
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for caseStudyIndustryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="caseStudyIndustryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseStudySubCatList" type="{http://service.canonapi.cxrus.org/}caseStudySubCategoryResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="imageMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="synopsis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="video" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "caseStudyIndustryResult", propOrder = {
    "caseStudySubCatList",
    "company",
    "content",
    "countryName",
    "endDate",
    "imageMedium",
    "industryName",
    "name",
    "pdf",
    "startDate",
    "synopsis",
    "systemName",
    "video"
})
public class CaseStudyIndustryResult {

    @XmlElement(nillable = true)
    protected List<CaseStudySubCategoryResult> caseStudySubCatList;
    protected String company;
    protected String content;
    protected String countryName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String imageMedium;
    protected String industryName;
    protected String name;
    protected String pdf;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected String synopsis;
    protected String systemName;
    protected String video;

    /**
     * Gets the value of the caseStudySubCatList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseStudySubCatList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseStudySubCatList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseStudySubCategoryResult }
     * 
     * 
     */
    public List<CaseStudySubCategoryResult> getCaseStudySubCatList() {
        if (caseStudySubCatList == null) {
            caseStudySubCatList = new ArrayList<CaseStudySubCategoryResult>();
        }
        return this.caseStudySubCatList;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the imageMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageMedium() {
        return imageMedium;
    }

    /**
     * Sets the value of the imageMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageMedium(String value) {
        this.imageMedium = value;
    }

    /**
     * Gets the value of the industryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryName() {
        return industryName;
    }

    /**
     * Sets the value of the industryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryName(String value) {
        this.industryName = value;
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
     * Gets the value of the pdf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdf() {
        return pdf;
    }

    /**
     * Sets the value of the pdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdf(String value) {
        this.pdf = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the synopsis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * Sets the value of the synopsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynopsis(String value) {
        this.synopsis = value;
    }

    /**
     * Gets the value of the systemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * Sets the value of the systemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemName(String value) {
        this.systemName = value;
    }

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideo(String value) {
        this.video = value;
    }

}
