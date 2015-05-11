
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessSolutionFeatureResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessSolutionFeatureResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catSysName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feature" type="{http://service.canonapi.cxrus.org/}businessSolutionFeatureFeature" minOccurs="0"/>
 *         &lt;element name="imgMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sysName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessSolutionFeatureResult", propOrder = {
    "catSysName",
    "content",
    "feature",
    "imgMedium",
    "name",
    "sort",
    "sysName"
})
public class BusinessSolutionFeatureResult {

    protected String catSysName;
    protected String content;
    protected BusinessSolutionFeatureFeature feature;
    protected String imgMedium;
    protected String name;
    protected BigDecimal sort;
    protected String sysName;

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
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessSolutionFeatureFeature }
     *     
     */
    public BusinessSolutionFeatureFeature getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSolutionFeatureFeature }
     *     
     */
    public void setFeature(BusinessSolutionFeatureFeature value) {
        this.feature = value;
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
     * Gets the value of the sysName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysName() {
        return sysName;
    }

    /**
     * Sets the value of the sysName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysName(String value) {
        this.sysName = value;
    }

}
