
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessSolutionFeatureFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessSolutionFeatureFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brochure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brochureSynopsis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgLarge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetImgMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="solution" type="{http://service.canonapi.cxrus.org/}businessSolutionFeatureFeatureSolution" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subCat" type="{http://service.canonapi.cxrus.org/}businessSolutionFeatureFeatureSubCat" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessSolutionFeatureFeature", propOrder = {
    "brochure",
    "brochureSynopsis",
    "content",
    "imgLarge",
    "name",
    "snippetContent",
    "snippetImgMedium",
    "snippetTitle",
    "solution",
    "subCat"
})
public class BusinessSolutionFeatureFeature {

    protected String brochure;
    protected String brochureSynopsis;
    protected String content;
    protected String imgLarge;
    protected String name;
    protected String snippetContent;
    protected String snippetImgMedium;
    protected String snippetTitle;
    @XmlElement(nillable = true)
    protected List<BusinessSolutionFeatureFeatureSolution> solution;
    @XmlElement(nillable = true)
    protected List<BusinessSolutionFeatureFeatureSubCat> subCat;

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
     * Gets the value of the snippetImgMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetImgMedium() {
        return snippetImgMedium;
    }

    /**
     * Sets the value of the snippetImgMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetImgMedium(String value) {
        this.snippetImgMedium = value;
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
     * Gets the value of the solution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessSolutionFeatureFeatureSolution }
     * 
     * 
     */
    public List<BusinessSolutionFeatureFeatureSolution> getSolution() {
        if (solution == null) {
            solution = new ArrayList<BusinessSolutionFeatureFeatureSolution>();
        }
        return this.solution;
    }

    /**
     * Gets the value of the subCat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subCat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubCat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessSolutionFeatureFeatureSubCat }
     * 
     * 
     */
    public List<BusinessSolutionFeatureFeatureSubCat> getSubCat() {
        if (subCat == null) {
            subCat = new ArrayList<BusinessSolutionFeatureFeatureSubCat>();
        }
        return this.subCat;
    }

}
