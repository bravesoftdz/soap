
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for industrySnippetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="industrySnippetResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentBusinessSolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentCaseStudy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasIndustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industryCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industryResult" type="{http://service.canonapi.cxrus.org/}industryResult" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "industrySnippetResult", propOrder = {
    "contentBusinessSolution",
    "contentCaseStudy",
    "hasIndustry",
    "imageMedium",
    "industryCategoryName",
    "industryResult",
    "name",
    "sort",
    "systemName"
})
public class IndustrySnippetResult {

    protected String contentBusinessSolution;
    protected String contentCaseStudy;
    protected String hasIndustry;
    protected String imageMedium;
    protected String industryCategoryName;
    protected IndustryResult industryResult;
    protected String name;
    protected BigDecimal sort;
    protected String systemName;

    /**
     * Gets the value of the contentBusinessSolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentBusinessSolution() {
        return contentBusinessSolution;
    }

    /**
     * Sets the value of the contentBusinessSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentBusinessSolution(String value) {
        this.contentBusinessSolution = value;
    }

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
     * Gets the value of the industryCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryCategoryName() {
        return industryCategoryName;
    }

    /**
     * Sets the value of the industryCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryCategoryName(String value) {
        this.industryCategoryName = value;
    }

    /**
     * Gets the value of the industryResult property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryResult }
     *     
     */
    public IndustryResult getIndustryResult() {
        return industryResult;
    }

    /**
     * Sets the value of the industryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryResult }
     *     
     */
    public void setIndustryResult(IndustryResult value) {
        this.industryResult = value;
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
