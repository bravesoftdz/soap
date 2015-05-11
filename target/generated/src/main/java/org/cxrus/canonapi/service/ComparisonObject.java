
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for comparisonObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="comparisonObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparedProducts" type="{http://service.canonapi.cxrus.org/}comparedProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="comparisonCategories" type="{http://service.canonapi.cxrus.org/}comparisonCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productFinders" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comparisonObject", propOrder = {
    "comparedProducts",
    "comparisonCategories",
    "productFinders"
})
public class ComparisonObject {

    @XmlElement(nillable = true)
    protected List<ComparedProduct> comparedProducts;
    @XmlElement(nillable = true)
    protected List<ComparisonCategory> comparisonCategories;
    @XmlElement(nillable = true)
    protected List<String> productFinders;

    /**
     * Gets the value of the comparedProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparedProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparedProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComparedProduct }
     * 
     * 
     */
    public List<ComparedProduct> getComparedProducts() {
        if (comparedProducts == null) {
            comparedProducts = new ArrayList<ComparedProduct>();
        }
        return this.comparedProducts;
    }

    /**
     * Gets the value of the comparisonCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparisonCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparisonCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComparisonCategory }
     * 
     * 
     */
    public List<ComparisonCategory> getComparisonCategories() {
        if (comparisonCategories == null) {
            comparisonCategories = new ArrayList<ComparisonCategory>();
        }
        return this.comparisonCategories;
    }

    /**
     * Gets the value of the productFinders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFinders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFinders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductFinders() {
        if (productFinders == null) {
            productFinders = new ArrayList<String>();
        }
        return this.productFinders;
    }

}
