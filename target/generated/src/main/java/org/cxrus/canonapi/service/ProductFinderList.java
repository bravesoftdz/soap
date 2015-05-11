
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productFinderList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productFinderList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advancedFinderCategories" type="{http://service.canonapi.cxrus.org/}advancedFinderComparisonCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="advancedFinderProducts" type="{http://service.canonapi.cxrus.org/}finderProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simpleFinders" type="{http://service.canonapi.cxrus.org/}simpleFinder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="systemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productFinderList", propOrder = {
    "advancedFinderCategories",
    "advancedFinderProducts",
    "name",
    "simpleFinders",
    "systemName",
    "type"
})
public class ProductFinderList {

    @XmlElement(nillable = true)
    protected List<AdvancedFinderComparisonCategory> advancedFinderCategories;
    @XmlElement(nillable = true)
    protected List<FinderProduct> advancedFinderProducts;
    protected String name;
    @XmlElement(nillable = true)
    protected List<SimpleFinder> simpleFinders;
    protected String systemName;
    protected String type;

    /**
     * Gets the value of the advancedFinderCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advancedFinderCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvancedFinderCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvancedFinderComparisonCategory }
     * 
     * 
     */
    public List<AdvancedFinderComparisonCategory> getAdvancedFinderCategories() {
        if (advancedFinderCategories == null) {
            advancedFinderCategories = new ArrayList<AdvancedFinderComparisonCategory>();
        }
        return this.advancedFinderCategories;
    }

    /**
     * Gets the value of the advancedFinderProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advancedFinderProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvancedFinderProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinderProduct }
     * 
     * 
     */
    public List<FinderProduct> getAdvancedFinderProducts() {
        if (advancedFinderProducts == null) {
            advancedFinderProducts = new ArrayList<FinderProduct>();
        }
        return this.advancedFinderProducts;
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
     * Gets the value of the simpleFinders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleFinders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleFinders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleFinder }
     * 
     * 
     */
    public List<SimpleFinder> getSimpleFinders() {
        if (simpleFinders == null) {
            simpleFinders = new ArrayList<SimpleFinder>();
        }
        return this.simpleFinders;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
