
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for homepageWebObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="homepageWebObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessSection" type="{http://service.canonapi.cxrus.org/}homepageContent" minOccurs="0"/>
 *         &lt;element name="personalSection" type="{http://service.canonapi.cxrus.org/}homepageContent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "homepageWebObject", propOrder = {
    "businessSection",
    "personalSection"
})
public class HomepageWebObject {

    protected HomepageContent businessSection;
    protected HomepageContent personalSection;

    /**
     * Gets the value of the businessSection property.
     * 
     * @return
     *     possible object is
     *     {@link HomepageContent }
     *     
     */
    public HomepageContent getBusinessSection() {
        return businessSection;
    }

    /**
     * Sets the value of the businessSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomepageContent }
     *     
     */
    public void setBusinessSection(HomepageContent value) {
        this.businessSection = value;
    }

    /**
     * Gets the value of the personalSection property.
     * 
     * @return
     *     possible object is
     *     {@link HomepageContent }
     *     
     */
    public HomepageContent getPersonalSection() {
        return personalSection;
    }

    /**
     * Sets the value of the personalSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomepageContent }
     *     
     */
    public void setPersonalSection(HomepageContent value) {
        this.personalSection = value;
    }

}
