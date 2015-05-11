
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for advancedFinderComparisonCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advancedFinderComparisonCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="andComparison" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="comparisonSubCategories" type="{http://service.canonapi.cxrus.org/}advancedFinderComparisonSubCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceComparison" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advancedFinderComparisonCategory", propOrder = {
    "andComparison",
    "comparisonSubCategories",
    "name",
    "priceComparison"
})
public class AdvancedFinderComparisonCategory {

    protected boolean andComparison;
    @XmlElement(nillable = true)
    protected List<AdvancedFinderComparisonSubCategory> comparisonSubCategories;
    protected String name;
    protected boolean priceComparison;

    /**
     * Gets the value of the andComparison property.
     * 
     */
    public boolean isAndComparison() {
        return andComparison;
    }

    /**
     * Sets the value of the andComparison property.
     * 
     */
    public void setAndComparison(boolean value) {
        this.andComparison = value;
    }

    /**
     * Gets the value of the comparisonSubCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparisonSubCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparisonSubCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvancedFinderComparisonSubCategory }
     * 
     * 
     */
    public List<AdvancedFinderComparisonSubCategory> getComparisonSubCategories() {
        if (comparisonSubCategories == null) {
            comparisonSubCategories = new ArrayList<AdvancedFinderComparisonSubCategory>();
        }
        return this.comparisonSubCategories;
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
     * Gets the value of the priceComparison property.
     * 
     */
    public boolean isPriceComparison() {
        return priceComparison;
    }

    /**
     * Sets the value of the priceComparison property.
     * 
     */
    public void setPriceComparison(boolean value) {
        this.priceComparison = value;
    }

}
