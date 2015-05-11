
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessSolutionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessSolutionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="banner" type="{http://service.canonapi.cxrus.org/}businessSolutionBannerDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cat" type="{http://service.canonapi.cxrus.org/}businessSolutionCat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="intro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="liveStagingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessSolutionResult", propOrder = {
    "additionalContent",
    "banner",
    "cat",
    "intro",
    "liveStagingType",
    "name"
})
public class BusinessSolutionResult {

    protected String additionalContent;
    @XmlElement(nillable = true)
    protected List<BusinessSolutionBannerDto> banner;
    @XmlElement(nillable = true)
    protected List<BusinessSolutionCat> cat;
    protected String intro;
    protected String liveStagingType;
    protected String name;

    /**
     * Gets the value of the additionalContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalContent() {
        return additionalContent;
    }

    /**
     * Sets the value of the additionalContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalContent(String value) {
        this.additionalContent = value;
    }

    /**
     * Gets the value of the banner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the banner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBanner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessSolutionBannerDto }
     * 
     * 
     */
    public List<BusinessSolutionBannerDto> getBanner() {
        if (banner == null) {
            banner = new ArrayList<BusinessSolutionBannerDto>();
        }
        return this.banner;
    }

    /**
     * Gets the value of the cat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessSolutionCat }
     * 
     * 
     */
    public List<BusinessSolutionCat> getCat() {
        if (cat == null) {
            cat = new ArrayList<BusinessSolutionCat>();
        }
        return this.cat;
    }

    /**
     * Gets the value of the intro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntro() {
        return intro;
    }

    /**
     * Sets the value of the intro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntro(String value) {
        this.intro = value;
    }

    /**
     * Gets the value of the liveStagingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiveStagingType() {
        return liveStagingType;
    }

    /**
     * Sets the value of the liveStagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiveStagingType(String value) {
        this.liveStagingType = value;
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

}
