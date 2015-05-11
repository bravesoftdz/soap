
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for advanceFinderResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advanceFinderResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advanceFinderSubCategoryList" type="{http://service.canonapi.cxrus.org/}advanceFinderSubCategoryResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advanceFinderResult", propOrder = {
    "advanceFinderSubCategoryList",
    "categoryName",
    "isAnd",
    "isPrice",
    "sort"
})
public class AdvanceFinderResult {

    @XmlElement(nillable = true)
    protected List<AdvanceFinderSubCategoryResult> advanceFinderSubCategoryList;
    protected String categoryName;
    protected String isAnd;
    protected String isPrice;
    protected BigDecimal sort;

    /**
     * Gets the value of the advanceFinderSubCategoryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advanceFinderSubCategoryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvanceFinderSubCategoryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvanceFinderSubCategoryResult }
     * 
     * 
     */
    public List<AdvanceFinderSubCategoryResult> getAdvanceFinderSubCategoryList() {
        if (advanceFinderSubCategoryList == null) {
            advanceFinderSubCategoryList = new ArrayList<AdvanceFinderSubCategoryResult>();
        }
        return this.advanceFinderSubCategoryList;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the isAnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAnd() {
        return isAnd;
    }

    /**
     * Sets the value of the isAnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAnd(String value) {
        this.isAnd = value;
    }

    /**
     * Gets the value of the isPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrice() {
        return isPrice;
    }

    /**
     * Sets the value of the isPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrice(String value) {
        this.isPrice = value;
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

}
