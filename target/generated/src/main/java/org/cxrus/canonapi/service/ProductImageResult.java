
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productImageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productImageResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imgLarge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgSmall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "productImageResult", propOrder = {
    "imgLarge",
    "imgSmall",
    "sort"
})
public class ProductImageResult {

    protected String imgLarge;
    protected String imgSmall;
    protected BigDecimal sort;

    /**
     * Gets the value of the imgLarge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgLarge() {
        return imgLarge;
    }

    /**
     * Sets the value of the imgLarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgLarge(String value) {
        this.imgLarge = value;
    }

    /**
     * Gets the value of the imgSmall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgSmall() {
        return imgSmall;
    }

    /**
     * Sets the value of the imgSmall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgSmall(String value) {
        this.imgSmall = value;
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
