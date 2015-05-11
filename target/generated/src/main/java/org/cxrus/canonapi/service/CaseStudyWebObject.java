
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.java.dev.jaxb.array.StringArray;


/**
 * <p>Java class for caseStudyWebObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="caseStudyWebObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contents" type="{http://service.canonapi.cxrus.org/}caseStudyObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="countryFilter" type="{http://jaxb.dev.java.net/array}stringArray" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="industryFilter" type="{http://jaxb.dev.java.net/array}stringArray" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productCategoryFilter" type="{http://jaxb.dev.java.net/array}stringArray" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "caseStudyWebObject", propOrder = {
    "contents",
    "countryFilter",
    "industryFilter",
    "productCategoryFilter"
})
public class CaseStudyWebObject {

    @XmlElement(nillable = true)
    protected List<CaseStudyObject> contents;
    @XmlElement(nillable = true)
    protected List<StringArray> countryFilter;
    @XmlElement(nillable = true)
    protected List<StringArray> industryFilter;
    @XmlElement(nillable = true)
    protected List<StringArray> productCategoryFilter;

    /**
     * Gets the value of the contents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseStudyObject }
     * 
     * 
     */
    public List<CaseStudyObject> getContents() {
        if (contents == null) {
            contents = new ArrayList<CaseStudyObject>();
        }
        return this.contents;
    }

    /**
     * Gets the value of the countryFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringArray }
     * 
     * 
     */
    public List<StringArray> getCountryFilter() {
        if (countryFilter == null) {
            countryFilter = new ArrayList<StringArray>();
        }
        return this.countryFilter;
    }

    /**
     * Gets the value of the industryFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringArray }
     * 
     * 
     */
    public List<StringArray> getIndustryFilter() {
        if (industryFilter == null) {
            industryFilter = new ArrayList<StringArray>();
        }
        return this.industryFilter;
    }

    /**
     * Gets the value of the productCategoryFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCategoryFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCategoryFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringArray }
     * 
     * 
     */
    public List<StringArray> getProductCategoryFilter() {
        if (productCategoryFilter == null) {
            productCategoryFilter = new ArrayList<StringArray>();
        }
        return this.productCategoryFilter;
    }

}
