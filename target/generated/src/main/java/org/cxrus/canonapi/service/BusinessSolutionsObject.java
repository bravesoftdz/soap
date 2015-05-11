
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessSolutionsObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessSolutionsObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bigBanners" type="{http://service.canonapi.cxrus.org/}bsBigBanner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="caseStudy" type="{http://service.canonapi.cxrus.org/}bsCaseStudy" minOccurs="0"/>
 *         &lt;element name="categories" type="{http://service.canonapi.cxrus.org/}bsCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="features" type="{http://service.canonapi.cxrus.org/}bsFeature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="industries" type="{http://service.canonapi.cxrus.org/}bsIndustry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="introduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessSolutionsObject", propOrder = {
    "additionalContent",
    "bigBanners",
    "caseStudy",
    "categories",
    "features",
    "industries",
    "introduction",
    "name"
})
public class BusinessSolutionsObject {

    protected String additionalContent;
    @XmlElement(nillable = true)
    protected List<BsBigBanner> bigBanners;
    protected BsCaseStudy caseStudy;
    @XmlElement(nillable = true)
    protected List<BsCategory> categories;
    @XmlElement(nillable = true)
    protected List<BsFeature> features;
    @XmlElement(nillable = true)
    protected List<BsIndustry> industries;
    protected String introduction;
    protected String name;

    /**
     * Gets the value of the additionalContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalContent() {
        return additionalContent;
    }

    /**
     * Sets the value of the additionalContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalContent(String value) {
        this.additionalContent = value;
    }

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
     * {@link BsBigBanner }
     * 
     * 
     */
    public List<BsBigBanner> getBigBanners() {
        if (bigBanners == null) {
            bigBanners = new ArrayList<BsBigBanner>();
        }
        return this.bigBanners;
    }

    /**
     * Gets the value of the caseStudy property.
     * 
     * @return
     *     possible object is
     *     {@link BsCaseStudy }
     *     
     */
    public BsCaseStudy getCaseStudy() {
        return caseStudy;
    }

    /**
     * Sets the value of the caseStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsCaseStudy }
     *     
     */
    public void setCaseStudy(BsCaseStudy value) {
        this.caseStudy = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsCategory }
     * 
     * 
     */
    public List<BsCategory> getCategories() {
        if (categories == null) {
            categories = new ArrayList<BsCategory>();
        }
        return this.categories;
    }

    /**
     * Gets the value of the features property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the features property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsFeature }
     * 
     * 
     */
    public List<BsFeature> getFeatures() {
        if (features == null) {
            features = new ArrayList<BsFeature>();
        }
        return this.features;
    }

    /**
     * Gets the value of the industries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsIndustry }
     * 
     * 
     */
    public List<BsIndustry> getIndustries() {
        if (industries == null) {
            industries = new ArrayList<BsIndustry>();
        }
        return this.industries;
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

}
