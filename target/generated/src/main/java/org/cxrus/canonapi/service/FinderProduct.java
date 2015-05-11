
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for finderProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="finderProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categorySystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountPrice1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountPrice2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finderSubCategoryIds" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasSpecs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="imagePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="introduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="new" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="price1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellingPoints" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subCategorySystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "finderProduct", propOrder = {
    "categorySystemName",
    "discountPrice1",
    "discountPrice2",
    "finderSubCategoryIds",
    "hasSpecs",
    "imagePath",
    "introduction",
    "name",
    "_new",
    "price1",
    "price2",
    "sellingPoints",
    "subCategorySystemName",
    "systemName",
    "tagline"
})
@XmlSeeAlso({
    FinderProductV3 .class,
    FinderProductV2 .class
})
public class FinderProduct {

    protected String categorySystemName;
    protected String discountPrice1;
    protected String discountPrice2;
    @XmlElement(nillable = true)
    protected List<BigDecimal> finderSubCategoryIds;
    protected boolean hasSpecs;
    protected String imagePath;
    protected String introduction;
    protected String name;
    @XmlElement(name = "new")
    protected boolean _new;
    protected String price1;
    protected String price2;
    @XmlElement(nillable = true)
    protected List<String> sellingPoints;
    protected String subCategorySystemName;
    protected String systemName;
    protected String tagline;

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
     * Gets the value of the discountPrice1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPrice1() {
        return discountPrice1;
    }

    /**
     * Sets the value of the discountPrice1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPrice1(String value) {
        this.discountPrice1 = value;
    }

    /**
     * Gets the value of the discountPrice2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPrice2() {
        return discountPrice2;
    }

    /**
     * Sets the value of the discountPrice2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPrice2(String value) {
        this.discountPrice2 = value;
    }

    /**
     * Gets the value of the finderSubCategoryIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finderSubCategoryIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinderSubCategoryIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getFinderSubCategoryIds() {
        if (finderSubCategoryIds == null) {
            finderSubCategoryIds = new ArrayList<BigDecimal>();
        }
        return this.finderSubCategoryIds;
    }

    /**
     * Gets the value of the hasSpecs property.
     * 
     */
    public boolean isHasSpecs() {
        return hasSpecs;
    }

    /**
     * Sets the value of the hasSpecs property.
     * 
     */
    public void setHasSpecs(boolean value) {
        this.hasSpecs = value;
    }

    /**
     * Gets the value of the imagePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Sets the value of the imagePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePath(String value) {
        this.imagePath = value;
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
     * Gets the value of the sellingPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellingPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellingPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSellingPoints() {
        if (sellingPoints == null) {
            sellingPoints = new ArrayList<String>();
        }
        return this.sellingPoints;
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
