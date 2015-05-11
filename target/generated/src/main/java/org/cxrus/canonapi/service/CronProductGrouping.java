
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cronProductGrouping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cronProductGrouping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categorySystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subCategoryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cronProductGrouping", propOrder = {
    "categoryCountryCode",
    "categoryStatus",
    "categorySystemName",
    "subCategoryStatus"
})
public class CronProductGrouping {

    protected String categoryCountryCode;
    protected String categoryStatus;
    protected String categorySystemName;
    protected String subCategoryStatus;

    /**
     * Gets the value of the categoryCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCountryCode() {
        return categoryCountryCode;
    }

    /**
     * Sets the value of the categoryCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCountryCode(String value) {
        this.categoryCountryCode = value;
    }

    /**
     * Gets the value of the categoryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryStatus() {
        return categoryStatus;
    }

    /**
     * Sets the value of the categoryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryStatus(String value) {
        this.categoryStatus = value;
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
     * Gets the value of the subCategoryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCategoryStatus() {
        return subCategoryStatus;
    }

    /**
     * Sets the value of the subCategoryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCategoryStatus(String value) {
        this.subCategoryStatus = value;
    }

}
