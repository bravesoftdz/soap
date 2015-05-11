
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dealerObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dealerObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="products" type="{http://service.canonapi.cxrus.org/}dProductV2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="regions" type="{http://service.canonapi.cxrus.org/}dRegionShortInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subcategories" type="{http://service.canonapi.cxrus.org/}dSubCategoryV2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dealerObject", propOrder = {
    "products",
    "regions",
    "subcategories"
})
public class DealerObject {

    @XmlElement(nillable = true)
    protected List<DProductV2> products;
    @XmlElement(nillable = true)
    protected List<DRegionShortInfo> regions;
    @XmlElement(nillable = true)
    protected List<DSubCategoryV2> subcategories;

    /**
     * Gets the value of the products property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the products property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DProductV2 }
     * 
     * 
     */
    public List<DProductV2> getProducts() {
        if (products == null) {
            products = new ArrayList<DProductV2>();
        }
        return this.products;
    }

    /**
     * Gets the value of the regions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DRegionShortInfo }
     * 
     * 
     */
    public List<DRegionShortInfo> getRegions() {
        if (regions == null) {
            regions = new ArrayList<DRegionShortInfo>();
        }
        return this.regions;
    }

    /**
     * Gets the value of the subcategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subcategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubcategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSubCategoryV2 }
     * 
     * 
     */
    public List<DSubCategoryV2> getSubcategories() {
        if (subcategories == null) {
            subcategories = new ArrayList<DSubCategoryV2>();
        }
        return this.subcategories;
    }

}
