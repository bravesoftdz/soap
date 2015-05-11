
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product360View complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product360View">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="html5Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smallImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="swfUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product360View", propOrder = {
    "createdBy",
    "html5Url",
    "name",
    "smallImage",
    "sort",
    "swfUrl"
})
public class Product360View {

    protected String createdBy;
    protected String html5Url;
    protected String name;
    protected String smallImage;
    protected BigDecimal sort;
    protected String swfUrl;

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
     * Gets the value of the html5Url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtml5Url() {
        return html5Url;
    }

    /**
     * Sets the value of the html5Url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtml5Url(String value) {
        this.html5Url = value;
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

    /**
     * Gets the value of the swfUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwfUrl() {
        return swfUrl;
    }

    /**
     * Sets the value of the swfUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwfUrl(String value) {
        this.swfUrl = value;
    }

}
