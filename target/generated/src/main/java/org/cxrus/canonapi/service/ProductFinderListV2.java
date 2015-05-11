
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productFinderListV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productFinderListV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advancedFinderCategories" type="{http://service.canonapi.cxrus.org/}advancedFinderComparisonCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="advancedFinderProducts" type="{http://service.canonapi.cxrus.org/}finderProductV2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simpleFinders" type="{http://service.canonapi.cxrus.org/}simpleFinderV2" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "productFinderListV2", propOrder = {
    "advancedFinderCategories",
    "advancedFinderProducts",
    "name",
    "simpleFinders",
    "systemName",
    "type"
})
public class ProductFinderListV2 {

    @XmlElement(nillable = true)
    protected List<AdvancedFinderComparisonCategory> advancedFinderCategories;
    @XmlElement(nillable = true)
    protected List<FinderProductV2> advancedFinderProducts;
    protected String name;
    @XmlElement(nillable = true)
    protected List<SimpleFinderV2> simpleFinders;
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
     * {@link FinderProductV2 }
     * 
     * 
     */
    public List<FinderProductV2> getAdvancedFinderProducts() {
        if (advancedFinderProducts == null) {
            advancedFinderProducts = new ArrayList<FinderProductV2>();
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
     * {@link SimpleFinderV2 }
     * 
     * 
     */
    public List<SimpleFinderV2> getSimpleFinders() {
        if (simpleFinders == null) {
            simpleFinders = new ArrayList<SimpleFinderV2>();
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
