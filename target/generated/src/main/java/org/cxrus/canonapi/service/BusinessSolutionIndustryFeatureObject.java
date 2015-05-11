
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessSolutionIndustryFeatureObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessSolutionIndustryFeatureObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brochure" type="{http://service.canonapi.cxrus.org/}bsifBrochure" minOccurs="0"/>
 *         &lt;element name="caseStudy" type="{http://service.canonapi.cxrus.org/}bsifCaseStudy" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageLarge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relateds" type="{http://service.canonapi.cxrus.org/}bsifRelated" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="snippet" type="{http://service.canonapi.cxrus.org/}bsifSnippet" minOccurs="0"/>
 *         &lt;element name="solutions" type="{http://service.canonapi.cxrus.org/}bsifSolution" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessSolutionIndustryFeatureObject", propOrder = {
    "brochure",
    "caseStudy",
    "content",
    "imageLarge",
    "name",
    "relateds",
    "snippet",
    "solutions",
    "title"
})
public class BusinessSolutionIndustryFeatureObject {

    protected BsifBrochure brochure;
    protected BsifCaseStudy caseStudy;
    protected String content;
    protected String imageLarge;
    protected String name;
    @XmlElement(nillable = true)
    protected List<BsifRelated> relateds;
    protected BsifSnippet snippet;
    @XmlElement(nillable = true)
    protected List<BsifSolution> solutions;
    protected String title;

    /**
     * Gets the value of the brochure property.
     * 
     * @return
     *     possible object is
     *     {@link BsifBrochure }
     *     
     */
    public BsifBrochure getBrochure() {
        return brochure;
    }

    /**
     * Sets the value of the brochure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsifBrochure }
     *     
     */
    public void setBrochure(BsifBrochure value) {
        this.brochure = value;
    }

    /**
     * Gets the value of the caseStudy property.
     * 
     * @return
     *     possible object is
     *     {@link BsifCaseStudy }
     *     
     */
    public BsifCaseStudy getCaseStudy() {
        return caseStudy;
    }

    /**
     * Sets the value of the caseStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsifCaseStudy }
     *     
     */
    public void setCaseStudy(BsifCaseStudy value) {
        this.caseStudy = value;
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
     * Gets the value of the relateds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relateds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelateds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsifRelated }
     * 
     * 
     */
    public List<BsifRelated> getRelateds() {
        if (relateds == null) {
            relateds = new ArrayList<BsifRelated>();
        }
        return this.relateds;
    }

    /**
     * Gets the value of the snippet property.
     * 
     * @return
     *     possible object is
     *     {@link BsifSnippet }
     *     
     */
    public BsifSnippet getSnippet() {
        return snippet;
    }

    /**
     * Sets the value of the snippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsifSnippet }
     *     
     */
    public void setSnippet(BsifSnippet value) {
        this.snippet = value;
    }

    /**
     * Gets the value of the solutions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solutions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolutions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsifSolution }
     * 
     * 
     */
    public List<BsifSolution> getSolutions() {
        if (solutions == null) {
            solutions = new ArrayList<BsifSolution>();
        }
        return this.solutions;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
