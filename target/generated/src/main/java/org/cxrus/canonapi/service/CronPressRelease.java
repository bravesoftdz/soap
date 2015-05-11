
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cronPressRelease complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cronPressRelease">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pressReleaseCategory" type="{http://service.canonapi.cxrus.org/}cronPressReleaseCategory" minOccurs="0"/>
 *         &lt;element name="pressReleaseId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="productPressReleases" type="{http://service.canonapi.cxrus.org/}cronProductPressRelease" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="publish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cronPressRelease", propOrder = {
    "content",
    "endDate",
    "pressReleaseCategory",
    "pressReleaseId",
    "productPressReleases",
    "publish",
    "startDate",
    "status",
    "systemName",
    "title"
})
public class CronPressRelease {

    protected String content;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected CronPressReleaseCategory pressReleaseCategory;
    protected BigDecimal pressReleaseId;
    @XmlElement(nillable = true)
    protected List<CronProductPressRelease> productPressReleases;
    protected String publish;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected String status;
    protected String systemName;
    protected String title;

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
     * Gets the value of the pressReleaseCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CronPressReleaseCategory }
     *     
     */
    public CronPressReleaseCategory getPressReleaseCategory() {
        return pressReleaseCategory;
    }

    /**
     * Sets the value of the pressReleaseCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CronPressReleaseCategory }
     *     
     */
    public void setPressReleaseCategory(CronPressReleaseCategory value) {
        this.pressReleaseCategory = value;
    }

    /**
     * Gets the value of the pressReleaseId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPressReleaseId() {
        return pressReleaseId;
    }

    /**
     * Sets the value of the pressReleaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPressReleaseId(BigDecimal value) {
        this.pressReleaseId = value;
    }

    /**
     * Gets the value of the productPressReleases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPressReleases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPressReleases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CronProductPressRelease }
     * 
     * 
     */
    public List<CronProductPressRelease> getProductPressReleases() {
        if (productPressReleases == null) {
            productPressReleases = new ArrayList<CronProductPressRelease>();
        }
        return this.productPressReleases;
    }

    /**
     * Gets the value of the publish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublish() {
        return publish;
    }

    /**
     * Sets the value of the publish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublish(String value) {
        this.publish = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
