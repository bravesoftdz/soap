
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for homepageContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="homepageContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homepageBanner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hpMicrositeList" type="{http://service.canonapi.cxrus.org/}homepageMicrosite" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hpblList" type="{http://service.canonapi.cxrus.org/}homepageBottomLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hpkpList" type="{http://service.canonapi.cxrus.org/}homepageKeyProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hpmlList" type="{http://service.canonapi.cxrus.org/}homepageMiscLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hpmpList" type="{http://service.canonapi.cxrus.org/}homepageMoreProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hpsbList" type="{http://service.canonapi.cxrus.org/}homepageSlidingBanner" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "homepageContent", propOrder = {
    "homepageBanner",
    "hpMicrositeList",
    "hpblList",
    "hpkpList",
    "hpmlList",
    "hpmpList",
    "hpsbList"
})
public class HomepageContent {

    protected String homepageBanner;
    @XmlElement(nillable = true)
    protected List<HomepageMicrosite> hpMicrositeList;
    @XmlElement(nillable = true)
    protected List<HomepageBottomLink> hpblList;
    @XmlElement(nillable = true)
    protected List<HomepageKeyProduct> hpkpList;
    @XmlElement(nillable = true)
    protected List<HomepageMiscLink> hpmlList;
    @XmlElement(nillable = true)
    protected List<HomepageMoreProduct> hpmpList;
    @XmlElement(nillable = true)
    protected List<HomepageSlidingBanner> hpsbList;

    /**
     * Gets the value of the homepageBanner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomepageBanner() {
        return homepageBanner;
    }

    /**
     * Sets the value of the homepageBanner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomepageBanner(String value) {
        this.homepageBanner = value;
    }

    /**
     * Gets the value of the hpMicrositeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hpMicrositeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHpMicrositeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HomepageMicrosite }
     * 
     * 
     */
    public List<HomepageMicrosite> getHpMicrositeList() {
        if (hpMicrositeList == null) {
            hpMicrositeList = new ArrayList<HomepageMicrosite>();
        }
        return this.hpMicrositeList;
    }

    /**
     * Gets the value of the hpblList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hpblList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHpblList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HomepageBottomLink }
     * 
     * 
     */
    public List<HomepageBottomLink> getHpblList() {
        if (hpblList == null) {
            hpblList = new ArrayList<HomepageBottomLink>();
        }
        return this.hpblList;
    }

    /**
     * Gets the value of the hpkpList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hpkpList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHpkpList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HomepageKeyProduct }
     * 
     * 
     */
    public List<HomepageKeyProduct> getHpkpList() {
        if (hpkpList == null) {
            hpkpList = new ArrayList<HomepageKeyProduct>();
        }
        return this.hpkpList;
    }

    /**
     * Gets the value of the hpmlList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hpmlList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHpmlList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HomepageMiscLink }
     * 
     * 
     */
    public List<HomepageMiscLink> getHpmlList() {
        if (hpmlList == null) {
            hpmlList = new ArrayList<HomepageMiscLink>();
        }
        return this.hpmlList;
    }

    /**
     * Gets the value of the hpmpList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hpmpList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHpmpList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HomepageMoreProduct }
     * 
     * 
     */
    public List<HomepageMoreProduct> getHpmpList() {
        if (hpmpList == null) {
            hpmpList = new ArrayList<HomepageMoreProduct>();
        }
        return this.hpmpList;
    }

    /**
     * Gets the value of the hpsbList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hpsbList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHpsbList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HomepageSlidingBanner }
     * 
     * 
     */
    public List<HomepageSlidingBanner> getHpsbList() {
        if (hpsbList == null) {
            hpsbList = new ArrayList<HomepageSlidingBanner>();
        }
        return this.hpsbList;
    }

}
