
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subCategoryObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subCategoryObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bigBanners" type="{http://service.canonapi.cxrus.org/}subCategoryBigBanner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="brandingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandingImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandingTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryLongName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categorySystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaKeyWords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smallBanners" type="{http://service.canonapi.cxrus.org/}subCategorySmallBanner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="systemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subCategoryObject", propOrder = {
    "bigBanners",
    "brandingDescription",
    "brandingImageUrl",
    "brandingTitle",
    "categoryLongName",
    "categoryShortName",
    "categorySystemName",
    "content",
    "longName",
    "metaDesc",
    "metaKeyWords",
    "smallBanners",
    "systemName"
})
public class SubCategoryObject {

    @XmlElement(nillable = true)
    protected List<SubCategoryBigBanner> bigBanners;
    protected String brandingDescription;
    protected String brandingImageUrl;
    protected String brandingTitle;
    protected String categoryLongName;
    protected String categoryShortName;
    protected String categorySystemName;
    protected String content;
    protected String longName;
    protected String metaDesc;
    protected String metaKeyWords;
    @XmlElement(nillable = true)
    protected List<SubCategorySmallBanner> smallBanners;
    protected String systemName;

    /**
     * Gets the value of the bigBanners property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bigBanners property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBigBanners().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubCategoryBigBanner }
     * 
     * 
     */
    public List<SubCategoryBigBanner> getBigBanners() {
        if (bigBanners == null) {
            bigBanners = new ArrayList<SubCategoryBigBanner>();
        }
        return this.bigBanners;
    }

    /**
     * Gets the value of the brandingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandingDescription() {
        return brandingDescription;
    }

    /**
     * Sets the value of the brandingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandingDescription(String value) {
        this.brandingDescription = value;
    }

    /**
     * Gets the value of the brandingImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandingImageUrl() {
        return brandingImageUrl;
    }

    /**
     * Sets the value of the brandingImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandingImageUrl(String value) {
        this.brandingImageUrl = value;
    }

    /**
     * Gets the value of the brandingTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandingTitle() {
        return brandingTitle;
    }

    /**
     * Sets the value of the brandingTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandingTitle(String value) {
        this.brandingTitle = value;
    }

    /**
     * Gets the value of the categoryLongName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryLongName() {
        return categoryLongName;
    }

    /**
     * Sets the value of the categoryLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryLongName(String value) {
        this.categoryLongName = value;
    }

    /**
     * Gets the value of the categoryShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryShortName() {
        return categoryShortName;
    }

    /**
     * Sets the value of the categoryShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryShortName(String value) {
        this.categoryShortName = value;
    }

    /**
     * Gets the value of the categorySystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorySystemName() {
        return categorySystemName;
    }

    /**
     * Sets the value of the categorySystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorySystemName(String value) {
        this.categorySystemName = value;
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
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongName(String value) {
        this.longName = value;
    }

    /**
     * Gets the value of the metaDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDesc() {
        return metaDesc;
    }

    /**
     * Sets the value of the metaDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDesc(String value) {
        this.metaDesc = value;
    }

    /**
     * Gets the value of the metaKeyWords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaKeyWords() {
        return metaKeyWords;
    }

    /**
     * Sets the value of the metaKeyWords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaKeyWords(String value) {
        this.metaKeyWords = value;
    }

    /**
     * Gets the value of the smallBanners property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smallBanners property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmallBanners().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubCategorySmallBanner }
     * 
     * 
     */
    public List<SubCategorySmallBanner> getSmallBanners() {
        if (smallBanners == null) {
            smallBanners = new ArrayList<SubCategorySmallBanner>();
        }
        return this.smallBanners;
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

}
