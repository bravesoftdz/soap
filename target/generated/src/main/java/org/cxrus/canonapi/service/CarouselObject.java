
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carouselObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carouselObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catSysName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productFinders" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="products" type="{http://service.canonapi.cxrus.org/}carouselProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subCatSysName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carouselObject", propOrder = {
    "catSysName",
    "productFinders",
    "products",
    "subCatSysName"
})
public class CarouselObject {

    protected String catSysName;
    @XmlElement(nillable = true)
    protected List<String> productFinders;
    @XmlElement(nillable = true)
    protected List<CarouselProduct> products;
    protected String subCatSysName;

    /**
     * Gets the value of the catSysName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatSysName() {
        return catSysName;
    }

    /**
     * Sets the value of the catSysName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatSysName(String value) {
        this.catSysName = value;
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
     * {@link CarouselProduct }
     * 
     * 
     */
    public List<CarouselProduct> getProducts() {
        if (products == null) {
            products = new ArrayList<CarouselProduct>();
        }
        return this.products;
    }

    /**
     * Gets the value of the subCatSysName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCatSysName() {
        return subCatSysName;
    }

    /**
     * Sets the value of the subCatSysName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCatSysName(String value) {
        this.subCatSysName = value;
    }

}
