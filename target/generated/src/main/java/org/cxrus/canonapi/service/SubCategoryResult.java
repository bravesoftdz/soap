
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subCategoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subCategoryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bigBannerInfoList" type="{http://service.canonapi.cxrus.org/}subCategoryBigBannerInformationResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="brandingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandingImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandingTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goDirectTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageBusinessSolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="introduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productInfoList" type="{http://service.canonapi.cxrus.org/}subCategoryProductInformationResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smallBannerInfoList" type="{http://service.canonapi.cxrus.org/}subCategorySmallBannerInformationResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="systemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subCategoryResult", propOrder = {
    "bigBannerInfoList",
    "brandingDescription",
    "brandingImage",
    "brandingTitle",
    "catSystemName",
    "content",
    "goDirectTo",
    "imageBusinessSolution",
    "imageMedium",
    "introduction",
    "longName",
    "metaDescription",
    "metaKeywords",
    "productInfoList",
    "shortName",
    "smallBannerInfoList",
    "sort",
    "systemName",
    "type"
})
public class SubCategoryResult {

    @XmlElement(nillable = true)
    protected List<SubCategoryBigBannerInformationResult> bigBannerInfoList;
    protected String brandingDescription;
    protected String brandingImage;
    protected String brandingTitle;
    protected String catSystemName;
    protected String content;
    protected String goDirectTo;
    protected String imageBusinessSolution;
    protected String imageMedium;
    protected String introduction;
    protected String longName;
    protected String metaDescription;
    protected String metaKeywords;
    @XmlElement(nillable = true)
    protected List<SubCategoryProductInformationResult> productInfoList;
    protected String shortName;
    @XmlElement(nillable = true)
    protected List<SubCategorySmallBannerInformationResult> smallBannerInfoList;
    protected BigDecimal sort;
    protected String systemName;
    protected String type;

    /**
     * Gets the value of the bigBannerInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bigBannerInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBigBannerInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubCategoryBigBannerInformationResult }
     * 
     * 
     */
    public List<SubCategoryBigBannerInformationResult> getBigBannerInfoList() {
        if (bigBannerInfoList == null) {
            bigBannerInfoList = new ArrayList<SubCategoryBigBannerInformationResult>();
        }
        return this.bigBannerInfoList;
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
     * Gets the value of the brandingImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandingImage() {
        return brandingImage;
    }

    /**
     * Sets the value of the brandingImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandingImage(String value) {
        this.brandingImage = value;
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
     * Gets the value of the catSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatSystemName() {
        return catSystemName;
    }

    /**
     * Sets the value of the catSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatSystemName(String value) {
        this.catSystemName = value;
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
     * Gets the value of the goDirectTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoDirectTo() {
        return goDirectTo;
    }

    /**
     * Sets the value of the goDirectTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoDirectTo(String value) {
        this.goDirectTo = value;
    }

    /**
     * Gets the value of the imageBusinessSolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageBusinessSolution() {
        return imageBusinessSolution;
    }

    /**
     * Sets the value of the imageBusinessSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageBusinessSolution(String value) {
        this.imageBusinessSolution = value;
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
     * Gets the value of the introduction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * Sets the value of the introduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroduction(String value) {
        this.introduction = value;
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
     * Gets the value of the metaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDescription() {
        return metaDescription;
    }

    /**
     * Sets the value of the metaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDescription(String value) {
        this.metaDescription = value;
    }

    /**
     * Gets the value of the metaKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaKeywords() {
        return metaKeywords;
    }

    /**
     * Sets the value of the metaKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaKeywords(String value) {
        this.metaKeywords = value;
    }

    /**
     * Gets the value of the productInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubCategoryProductInformationResult }
     * 
     * 
     */
    public List<SubCategoryProductInformationResult> getProductInfoList() {
        if (productInfoList == null) {
            productInfoList = new ArrayList<SubCategoryProductInformationResult>();
        }
        return this.productInfoList;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the smallBannerInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smallBannerInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmallBannerInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubCategorySmallBannerInformationResult }
     * 
     * 
     */
    public List<SubCategorySmallBannerInformationResult> getSmallBannerInfoList() {
        if (smallBannerInfoList == null) {
            smallBannerInfoList = new ArrayList<SubCategorySmallBannerInformationResult>();
        }
        return this.smallBannerInfoList;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSort(BigDecimal value) {
        this.sort = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
