
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for advanceFinderSubCategoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advanceFinderSubCategoryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceMax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceMin" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="subcategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sysnameList" type="{http://service.canonapi.cxrus.org/}advanceFinderProductInformationResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advanceFinderSubCategoryResult", propOrder = {
    "priceMax",
    "priceMin",
    "sort",
    "subcategoryName",
    "sysnameList"
})
public class AdvanceFinderSubCategoryResult {

    protected BigDecimal priceMax;
    protected BigDecimal priceMin;
    protected BigDecimal sort;
    protected String subcategoryName;
    @XmlElement(nillable = true)
    protected List<AdvanceFinderProductInformationResult> sysnameList;

    /**
     * Gets the value of the priceMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceMax() {
        return priceMax;
    }

    /**
     * Sets the value of the priceMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceMax(BigDecimal value) {
        this.priceMax = value;
    }

    /**
     * Gets the value of the priceMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceMin() {
        return priceMin;
    }

    /**
     * Sets the value of the priceMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceMin(BigDecimal value) {
        this.priceMin = value;
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
     * Gets the value of the subcategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcategoryName() {
        return subcategoryName;
    }

    /**
     * Sets the value of the subcategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcategoryName(String value) {
        this.subcategoryName = value;
    }

    /**
     * Gets the value of the sysnameList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sysnameList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSysnameList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvanceFinderProductInformationResult }
     * 
     * 
     */
    public List<AdvanceFinderProductInformationResult> getSysnameList() {
        if (sysnameList == null) {
            sysnameList = new ArrayList<AdvanceFinderProductInformationResult>();
        }
        return this.sysnameList;
    }

}
