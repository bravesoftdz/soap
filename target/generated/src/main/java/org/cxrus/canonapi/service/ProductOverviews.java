
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productOverviews complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productOverviews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="largeImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smallImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "productOverviews", propOrder = {
    "createdBy",
    "identName",
    "largeImage",
    "smallImage",
    "sort"
})
public class ProductOverviews {

    protected String createdBy;
    protected String identName;
    protected String largeImage;
    protected String smallImage;
    protected BigDecimal sort;

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the identName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentName() {
        return identName;
    }

    /**
     * Sets the value of the identName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentName(String value) {
        this.identName = value;
    }

    /**
     * Gets the value of the largeImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargeImage() {
        return largeImage;
    }

    /**
     * Sets the value of the largeImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargeImage(String value) {
        this.largeImage = value;
    }

    /**
     * Gets the value of the smallImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallImage() {
        return smallImage;
    }

    /**
     * Sets the value of the smallImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallImage(String value) {
        this.smallImage = value;
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
