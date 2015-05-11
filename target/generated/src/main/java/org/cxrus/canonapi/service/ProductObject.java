
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessories" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accessoryContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessoryTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalTab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brochure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categorySystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalSites" type="{http://service.canonapi.cxrus.org/}productExternalSite" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="feature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasProductDealer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasProductSpecs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasSubCategoryDealer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="intro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="largeImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="new" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="price1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productAwards" type="{http://service.canonapi.cxrus.org/}productAward" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productConsumableSubCategories" type="{http://service.canonapi.cxrus.org/}productConsumableSubCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productImages" type="{http://service.canonapi.cxrus.org/}productImage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productPapers" type="{http://service.canonapi.cxrus.org/}productPaper" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productPromotions" type="{http://service.canonapi.cxrus.org/}productPromotion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productVideos" type="{http://service.canonapi.cxrus.org/}productVideo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sellingPoint" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="smallBanners" type="{http://service.canonapi.cxrus.org/}productSmallBannerObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="smallImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subCategorySystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supportKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productObject", propOrder = {
    "accessories",
    "accessoryContent",
    "accessoryTitle",
    "additionalTab",
    "brochure",
    "categorySystemName",
    "externalSites",
    "feature",
    "hasProductDealer",
    "hasProductSpecs",
    "hasSubCategoryDealer",
    "intro",
    "largeImage",
    "logo",
    "longName",
    "metaDesc",
    "metaKeywords",
    "_new",
    "price1",
    "price2",
    "productAwards",
    "productConsumableSubCategories",
    "productImages",
    "productPapers",
    "productPromotions",
    "productVideos",
    "sellingPoint",
    "smallBanners",
    "smallImage",
    "specs",
    "subCategorySystemName",
    "supportKeyword",
    "systemName",
    "tagline"
})
public class ProductObject {

    @XmlElement(nillable = true)
    protected List<String> accessories;
    protected String accessoryContent;
    protected String accessoryTitle;
    protected String additionalTab;
    protected String brochure;
    protected String categorySystemName;
    @XmlElement(nillable = true)
    protected List<ProductExternalSite> externalSites;
    protected String feature;
    protected boolean hasProductDealer;
    protected boolean hasProductSpecs;
    protected boolean hasSubCategoryDealer;
    protected String intro;
    protected String largeImage;
    protected String logo;
    protected String longName;
    protected String metaDesc;
    protected String metaKeywords;
    @XmlElement(name = "new")
    protected boolean _new;
    protected String price1;
    protected String price2;
    @XmlElement(nillable = true)
    protected List<ProductAward> productAwards;
    @XmlElement(nillable = true)
    protected List<ProductConsumableSubCategory> productConsumableSubCategories;
    @XmlElement(nillable = true)
    protected List<ProductImage> productImages;
    @XmlElement(nillable = true)
    protected List<ProductPaper> productPapers;
    @XmlElement(nillable = true)
    protected List<ProductPromotion> productPromotions;
    @XmlElement(nillable = true)
    protected List<ProductVideo> productVideos;
    @XmlElement(nillable = true)
    protected List<String> sellingPoint;
    @XmlElement(nillable = true)
    protected List<ProductSmallBannerObject> smallBanners;
    protected String smallImage;
    protected String specs;
    protected String subCategorySystemName;
    protected String supportKeyword;
    protected String systemName;
    protected String tagline;

    /**
     * Gets the value of the accessories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccessories() {
        if (accessories == null) {
            accessories = new ArrayList<String>();
        }
        return this.accessories;
    }

    /**
     * Gets the value of the accessoryContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessoryContent() {
        return accessoryContent;
    }

    /**
     * Sets the value of the accessoryContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessoryContent(String value) {
        this.accessoryContent = value;
    }

    /**
     * Gets the value of the accessoryTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessoryTitle() {
        return accessoryTitle;
    }

    /**
     * Sets the value of the accessoryTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessoryTitle(String value) {
        this.accessoryTitle = value;
    }

    /**
     * Gets the value of the additionalTab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalTab() {
        return additionalTab;
    }

    /**
     * Sets the value of the additionalTab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalTab(String value) {
        this.additionalTab = value;
    }

    /**
     * Gets the value of the brochure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrochure() {
        return brochure;
    }

    /**
     * Sets the value of the brochure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrochure(String value) {
        this.brochure = value;
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
     * Gets the value of the externalSites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalSites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalSites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductExternalSite }
     * 
     * 
     */
    public List<ProductExternalSite> getExternalSites() {
        if (externalSites == null) {
            externalSites = new ArrayList<ProductExternalSite>();
        }
        return this.externalSites;
    }

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature(String value) {
        this.feature = value;
    }

    /**
     * Gets the value of the hasProductDealer property.
     * 
     */
    public boolean isHasProductDealer() {
        return hasProductDealer;
    }

    /**
     * Sets the value of the hasProductDealer property.
     * 
     */
    public void setHasProductDealer(boolean value) {
        this.hasProductDealer = value;
    }

    /**
     * Gets the value of the hasProductSpecs property.
     * 
     */
    public boolean isHasProductSpecs() {
        return hasProductSpecs;
    }

    /**
     * Sets the value of the hasProductSpecs property.
     * 
     */
    public void setHasProductSpecs(boolean value) {
        this.hasProductSpecs = value;
    }

    /**
     * Gets the value of the hasSubCategoryDealer property.
     * 
     */
    public boolean isHasSubCategoryDealer() {
        return hasSubCategoryDealer;
    }

    /**
     * Sets the value of the hasSubCategoryDealer property.
     * 
     */
    public void setHasSubCategoryDealer(boolean value) {
        this.hasSubCategoryDealer = value;
    }

    /**
     * Gets the value of the intro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntro() {
        return intro;
    }

    /**
     * Sets the value of the intro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntro(String value) {
        this.intro = value;
    }

    /**
     * Gets the value of the largeImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargeImage() {
        return largeImage;
    }

    /**
     * Sets the value of the largeImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargeImage(String value) {
        this.largeImage = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogo(String value) {
        this.logo = value;
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
     * Gets the value of the new property.
     * 
     */
    public boolean isNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     */
    public void setNew(boolean value) {
        this._new = value;
    }

    /**
     * Gets the value of the price1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice1() {
        return price1;
    }

    /**
     * Sets the value of the price1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice1(String value) {
        this.price1 = value;
    }

    /**
     * Gets the value of the price2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice2() {
        return price2;
    }

    /**
     * Sets the value of the price2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice2(String value) {
        this.price2 = value;
    }

    /**
     * Gets the value of the productAwards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productAwards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductAwards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductAward }
     * 
     * 
     */
    public List<ProductAward> getProductAwards() {
        if (productAwards == null) {
            productAwards = new ArrayList<ProductAward>();
        }
        return this.productAwards;
    }

    /**
     * Gets the value of the productConsumableSubCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productConsumableSubCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductConsumableSubCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductConsumableSubCategory }
     * 
     * 
     */
    public List<ProductConsumableSubCategory> getProductConsumableSubCategories() {
        if (productConsumableSubCategories == null) {
            productConsumableSubCategories = new ArrayList<ProductConsumableSubCategory>();
        }
        return this.productConsumableSubCategories;
    }

    /**
     * Gets the value of the productImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductImage }
     * 
     * 
     */
    public List<ProductImage> getProductImages() {
        if (productImages == null) {
            productImages = new ArrayList<ProductImage>();
        }
        return this.productImages;
    }

    /**
     * Gets the value of the productPapers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPapers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPapers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPaper }
     * 
     * 
     */
    public List<ProductPaper> getProductPapers() {
        if (productPapers == null) {
            productPapers = new ArrayList<ProductPaper>();
        }
        return this.productPapers;
    }

    /**
     * Gets the value of the productPromotions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPromotions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPromotions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPromotion }
     * 
     * 
     */
    public List<ProductPromotion> getProductPromotions() {
        if (productPromotions == null) {
            productPromotions = new ArrayList<ProductPromotion>();
        }
        return this.productPromotions;
    }

    /**
     * Gets the value of the productVideos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productVideos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductVideos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductVideo }
     * 
     * 
     */
    public List<ProductVideo> getProductVideos() {
        if (productVideos == null) {
            productVideos = new ArrayList<ProductVideo>();
        }
        return this.productVideos;
    }

    /**
     * Gets the value of the sellingPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellingPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellingPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSellingPoint() {
        if (sellingPoint == null) {
            sellingPoint = new ArrayList<String>();
        }
        return this.sellingPoint;
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
     * {@link ProductSmallBannerObject }
     * 
     * 
     */
    public List<ProductSmallBannerObject> getSmallBanners() {
        if (smallBanners == null) {
            smallBanners = new ArrayList<ProductSmallBannerObject>();
        }
        return this.smallBanners;
    }

    /**
     * Gets the value of the smallImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallImage() {
        return smallImage;
    }

    /**
     * Sets the value of the smallImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallImage(String value) {
        this.smallImage = value;
    }

    /**
     * Gets the value of the specs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecs() {
        return specs;
    }

    /**
     * Sets the value of the specs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecs(String value) {
        this.specs = value;
    }

    /**
     * Gets the value of the subCategorySystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCategorySystemName() {
        return subCategorySystemName;
    }

    /**
     * Sets the value of the subCategorySystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCategorySystemName(String value) {
        this.subCategorySystemName = value;
    }

    /**
     * Gets the value of the supportKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportKeyword() {
        return supportKeyword;
    }

    /**
     * Sets the value of the supportKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportKeyword(String value) {
        this.supportKeyword = value;
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
     * Gets the value of the tagline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagline() {
        return tagline;
    }

    /**
     * Sets the value of the tagline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagline(String value) {
        this.tagline = value;
    }

}
