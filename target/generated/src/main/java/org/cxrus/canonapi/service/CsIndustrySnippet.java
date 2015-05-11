
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for csIndustrySnippet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="csIndustrySnippet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentCaseStudy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasEnabledIndustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasIndustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "csIndustrySnippet", propOrder = {
    "contentCaseStudy",
    "hasEnabledIndustry",
    "hasIndustry",
    "imageMedium",
    "systemName"
})
public class CsIndustrySnippet {

    protected String contentCaseStudy;
    protected String hasEnabledIndustry;
    protected String hasIndustry;
    protected String imageMedium;
    protected String systemName;

    /**
     * Gets the value of the contentCaseStudy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentCaseStudy() {
        return contentCaseStudy;
    }

    /**
     * Sets the value of the contentCaseStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentCaseStudy(String value) {
        this.contentCaseStudy = value;
    }

    /**
     * Gets the value of the hasEnabledIndustry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasEnabledIndustry() {
        return hasEnabledIndustry;
    }

    /**
     * Sets the value of the hasEnabledIndustry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasEnabledIndustry(String value) {
        this.hasEnabledIndustry = value;
    }

    /**
     * Gets the value of the hasIndustry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasIndustry() {
        return hasIndustry;
    }

    /**
     * Sets the value of the hasIndustry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasIndustry(String value) {
        this.hasIndustry = value;
    }

    /**
     * Gets the value of the imageMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageMedium() {
        return imageMedium;
    }

    /**
     * Sets the value of the imageMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageMedium(String value) {
        this.imageMedium = value;
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

}
