
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for homepageKeyProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="homepageKeyProduct">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.canonapi.cxrus.org/}homepageMoreProduct">
 *       &lt;sequence>
 *         &lt;element name="imageSmall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "homepageKeyProduct", propOrder = {
    "imageSmall"
})
public class HomepageKeyProduct
    extends HomepageMoreProduct
{

    protected String imageSmall;

    /**
     * Gets the value of the imageSmall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageSmall() {
        return imageSmall;
    }

    /**
     * Sets the value of the imageSmall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageSmall(String value) {
        this.imageSmall = value;
    }

}
