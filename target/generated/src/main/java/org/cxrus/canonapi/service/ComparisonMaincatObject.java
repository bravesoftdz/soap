
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for comparisonMaincatObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="comparisonMaincatObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonCategories" type="{http://service.canonapi.cxrus.org/}comparisonCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="comparisonProductOptions" type="{http://service.canonapi.cxrus.org/}comparisonProductOption" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "comparisonMaincatObject", propOrder = {
    "comparisonCategories",
    "comparisonProductOptions",
    "sort",
    "systemName"
})
public class ComparisonMaincatObject {

    @XmlElement(nillable = true)
    protected List<ComparisonCategory> comparisonCategories;
    @XmlElement(nillable = true)
    protected List<ComparisonProductOption> comparisonProductOptions;
    protected BigDecimal sort;
    protected String systemName;

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
     * Gets the value of the comparisonProductOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparisonProductOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparisonProductOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComparisonProductOption }
     * 
     * 
     */
    public List<ComparisonProductOption> getComparisonProductOptions() {
        if (comparisonProductOptions == null) {
            comparisonProductOptions = new ArrayList<ComparisonProductOption>();
        }
        return this.comparisonProductOptions;
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

}
