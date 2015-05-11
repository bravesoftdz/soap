
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for photoLibraryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="photoLibraryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categorySystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productResultList" type="{http://service.canonapi.cxrus.org/}photoLibraryProductResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "photoLibraryResult", propOrder = {
    "categoryName",
    "categorySystemName",
    "imgMedium",
    "productResultList"
})
public class PhotoLibraryResult {

    protected String categoryName;
    protected String categorySystemName;
    protected String imgMedium;
    @XmlElement(nillable = true)
    protected List<PhotoLibraryProductResult> productResultList;

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
     * Gets the value of the categorySystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorySystemName() {
        return categorySystemName;
    }

    /**
     * Sets the value of the categorySystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorySystemName(String value) {
        this.categorySystemName = value;
    }

    /**
     * Gets the value of the imgMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgMedium() {
        return imgMedium;
    }

    /**
     * Sets the value of the imgMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgMedium(String value) {
        this.imgMedium = value;
    }

    /**
     * Gets the value of the productResultList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productResultList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductResultList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhotoLibraryProductResult }
     * 
     * 
     */
    public List<PhotoLibraryProductResult> getProductResultList() {
        if (productResultList == null) {
            productResultList = new ArrayList<PhotoLibraryProductResult>();
        }
        return this.productResultList;
    }

}
