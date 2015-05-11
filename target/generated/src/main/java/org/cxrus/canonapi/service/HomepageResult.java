
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for homepageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="homepageResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="banner" type="{http://service.canonapi.cxrus.org/}homepageBannerDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cat" type="{http://service.canonapi.cxrus.org/}homepageCat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="icon" type="{http://service.canonapi.cxrus.org/}homepageIcon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="moreCat" type="{http://service.canonapi.cxrus.org/}homepageMoreCat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="moreLink" type="{http://service.canonapi.cxrus.org/}homepageMoreLinkDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slide" type="{http://service.canonapi.cxrus.org/}homepageSlide" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "homepageResult", propOrder = {
    "banner",
    "cat",
    "icon",
    "moreCat",
    "moreLink",
    "segment",
    "slide"
})
public class HomepageResult {

    @XmlElement(nillable = true)
    protected List<HomepageBannerDto> banner;
    @XmlElement(nillable = true)
    protected List<HomepageCat> cat;
    @XmlElement(nillable = true)
    protected List<HomepageIcon> icon;
    @XmlElement(nillable = true)
    protected List<HomepageMoreCat> moreCat;
    @XmlElement(nillable = true)
    protected List<HomepageMoreLinkDto> moreLink;
    protected String segment;
    @XmlElement(nillable = true)
    protected List<HomepageSlide> slide;

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
     * {@link HomepageBannerDto }
     * 
     * 
     */
    public List<HomepageBannerDto> getBanner() {
        if (banner == null) {
            banner = new ArrayList<HomepageBannerDto>();
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
     * {@link HomepageCat }
     * 
     * 
     */
    public List<HomepageCat> getCat() {
        if (cat == null) {
            cat = new ArrayList<HomepageCat>();
        }
        return this.cat;
    }

    /**
     * Gets the value of the icon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIcon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HomepageIcon }
     * 
     * 
     */
    public List<HomepageIcon> getIcon() {
        if (icon == null) {
            icon = new ArrayList<HomepageIcon>();
        }
        return this.icon;
    }

    /**
     * Gets the value of the moreCat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moreCat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoreCat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HomepageMoreCat }
     * 
     * 
     */
    public List<HomepageMoreCat> getMoreCat() {
        if (moreCat == null) {
            moreCat = new ArrayList<HomepageMoreCat>();
        }
        return this.moreCat;
    }

    /**
     * Gets the value of the moreLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moreLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoreLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HomepageMoreLinkDto }
     * 
     * 
     */
    public List<HomepageMoreLinkDto> getMoreLink() {
        if (moreLink == null) {
            moreLink = new ArrayList<HomepageMoreLinkDto>();
        }
        return this.moreLink;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment(String value) {
        this.segment = value;
    }

    /**
     * Gets the value of the slide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HomepageSlide }
     * 
     * 
     */
    public List<HomepageSlide> getSlide() {
        if (slide == null) {
            slide = new ArrayList<HomepageSlide>();
        }
        return this.slide;
    }

}
