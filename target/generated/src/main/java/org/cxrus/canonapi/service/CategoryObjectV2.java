
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoryObjectV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="categoryObjectV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bigBanners" type="{http://service.canonapi.cxrus.org/}categoryBigBanner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="categoryMicrositeGroup" type="{http://service.canonapi.cxrus.org/}categoryMicrositeGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="products" type="{http://service.canonapi.cxrus.org/}categoryProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedCategories" type="{http://service.canonapi.cxrus.org/}categoryRelatedCat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smallBanners" type="{http://service.canonapi.cxrus.org/}categorySmallBanner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="snippetTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippets" type="{http://service.canonapi.cxrus.org/}categorySnippet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subCategories" type="{http://service.canonapi.cxrus.org/}categorySubCat" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "categoryObjectV2", propOrder = {
    "bigBanners",
    "categoryMicrositeGroup",
    "countryCode",
    "displayMode",
    "languageCode",
    "longName",
    "metaDesc",
    "metaKeywords",
    "products",
    "relatedCategories",
    "shortName",
    "smallBanners",
    "snippetTitle",
    "snippets",
    "subCategories",
    "systemName",
    "title"
})
public class CategoryObjectV2 {

    @XmlElement(nillable = true)
    protected List<CategoryBigBanner> bigBanners;
    @XmlElement(nillable = true)
    protected List<CategoryMicrositeGroup> categoryMicrositeGroup;
    protected String countryCode;
    protected String displayMode;
    protected String languageCode;
    protected String longName;
    protected String metaDesc;
    protected String metaKeywords;
    @XmlElement(nillable = true)
    protected List<CategoryProduct> products;
    @XmlElement(nillable = true)
    protected List<CategoryRelatedCat> relatedCategories;
    protected String shortName;
    @XmlElement(nillable = true)
    protected List<CategorySmallBanner> smallBanners;
    protected String snippetTitle;
    @XmlElement(nillable = true)
    protected List<CategorySnippet> snippets;
    @XmlElement(nillable = true)
    protected List<CategorySubCat> subCategories;
    protected String systemName;
    protected String title;

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
     * {@link CategoryBigBanner }
     * 
     * 
     */
    public List<CategoryBigBanner> getBigBanners() {
        if (bigBanners == null) {
            bigBanners = new ArrayList<CategoryBigBanner>();
        }
        return this.bigBanners;
    }

    /**
     * Gets the value of the categoryMicrositeGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryMicrositeGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryMicrositeGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryMicrositeGroup }
     * 
     * 
     */
    public List<CategoryMicrositeGroup> getCategoryMicrositeGroup() {
        if (categoryMicrositeGroup == null) {
            categoryMicrositeGroup = new ArrayList<CategoryMicrositeGroup>();
        }
        return this.categoryMicrositeGroup;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the displayMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayMode() {
        return displayMode;
    }

    /**
     * Sets the value of the displayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayMode(String value) {
        this.displayMode = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
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
     * Gets the value of the products property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the products property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryProduct }
     * 
     * 
     */
    public List<CategoryProduct> getProducts() {
        if (products == null) {
            products = new ArrayList<CategoryProduct>();
        }
        return this.products;
    }

    /**
     * Gets the value of the relatedCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryRelatedCat }
     * 
     * 
     */
    public List<CategoryRelatedCat> getRelatedCategories() {
        if (relatedCategories == null) {
            relatedCategories = new ArrayList<CategoryRelatedCat>();
        }
        return this.relatedCategories;
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
     * {@link CategorySmallBanner }
     * 
     * 
     */
    public List<CategorySmallBanner> getSmallBanners() {
        if (smallBanners == null) {
            smallBanners = new ArrayList<CategorySmallBanner>();
        }
        return this.smallBanners;
    }

    /**
     * Gets the value of the snippetTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetTitle() {
        return snippetTitle;
    }

    /**
     * Sets the value of the snippetTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetTitle(String value) {
        this.snippetTitle = value;
    }

    /**
     * Gets the value of the snippets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snippets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnippets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategorySnippet }
     * 
     * 
     */
    public List<CategorySnippet> getSnippets() {
        if (snippets == null) {
            snippets = new ArrayList<CategorySnippet>();
        }
        return this.snippets;
    }

    /**
     * Gets the value of the subCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategorySubCat }
     * 
     * 
     */
    public List<CategorySubCat> getSubCategories() {
        if (subCategories == null) {
            subCategories = new ArrayList<CategorySubCat>();
        }
        return this.subCategories;
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
