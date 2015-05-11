
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for industryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="industryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brochure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brochureSynopsis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageLarge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industrySolutionList" type="{http://service.canonapi.cxrus.org/}industrySolutionResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetImageMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subCategoryInfoList" type="{http://service.canonapi.cxrus.org/}bsiSubCategoryInfoResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "industryResult", propOrder = {
    "brochure",
    "brochureSynopsis",
    "content",
    "imageLarge",
    "industrySolutionList",
    "name",
    "snippetContent",
    "snippetImageMedium",
    "snippetTitle",
    "subCategoryInfoList"
})
public class IndustryResult {

    protected String brochure;
    protected String brochureSynopsis;
    protected String content;
    protected String imageLarge;
    @XmlElement(nillable = true)
    protected List<IndustrySolutionResult> industrySolutionList;
    protected String name;
    protected String snippetContent;
    protected String snippetImageMedium;
    protected String snippetTitle;
    @XmlElement(nillable = true)
    protected List<BsiSubCategoryInfoResult> subCategoryInfoList;

    /**
     * Gets the value of the brochure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrochure() {
        return brochure;
    }

    /**
     * Sets the value of the brochure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrochure(String value) {
        this.brochure = value;
    }

    /**
     * Gets the value of the brochureSynopsis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrochureSynopsis() {
        return brochureSynopsis;
    }

    /**
     * Sets the value of the brochureSynopsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrochureSynopsis(String value) {
        this.brochureSynopsis = value;
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
     * Gets the value of the imageLarge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageLarge() {
        return imageLarge;
    }

    /**
     * Sets the value of the imageLarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageLarge(String value) {
        this.imageLarge = value;
    }

    /**
     * Gets the value of the industrySolutionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industrySolutionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustrySolutionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustrySolutionResult }
     * 
     * 
     */
    public List<IndustrySolutionResult> getIndustrySolutionList() {
        if (industrySolutionList == null) {
            industrySolutionList = new ArrayList<IndustrySolutionResult>();
        }
        return this.industrySolutionList;
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
     * Gets the value of the snippetContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetContent() {
        return snippetContent;
    }

    /**
     * Sets the value of the snippetContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetContent(String value) {
        this.snippetContent = value;
    }

    /**
     * Gets the value of the snippetImageMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetImageMedium() {
        return snippetImageMedium;
    }

    /**
     * Sets the value of the snippetImageMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetImageMedium(String value) {
        this.snippetImageMedium = value;
    }

    /**
     * Gets the value of the snippetTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetTitle() {
        return snippetTitle;
    }

    /**
     * Sets the value of the snippetTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetTitle(String value) {
        this.snippetTitle = value;
    }

    /**
     * Gets the value of the subCategoryInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subCategoryInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubCategoryInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsiSubCategoryInfoResult }
     * 
     * 
     */
    public List<BsiSubCategoryInfoResult> getSubCategoryInfoList() {
        if (subCategoryInfoList == null) {
            subCategoryInfoList = new ArrayList<BsiSubCategoryInfoResult>();
        }
        return this.subCategoryInfoList;
    }

}
