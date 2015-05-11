
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoryLinkV3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="categoryLinkV3">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.canonapi.cxrus.org/}categoryLinkV2">
 *       &lt;sequence>
 *         &lt;element name="isCustom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categoryLinkV3", propOrder = {
    "isCustom",
    "url",
    "urlType"
})
public class CategoryLinkV3
    extends CategoryLinkV2
{

    protected String isCustom;
    protected String url;
    protected String urlType;

    /**
     * Gets the value of the isCustom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCustom() {
        return isCustom;
    }

    /**
     * Sets the value of the isCustom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCustom(String value) {
        this.isCustom = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the urlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlType() {
        return urlType;
    }

    /**
     * Sets the value of the urlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlType(String value) {
        this.urlType = value;
    }

}
