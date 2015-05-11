
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for homepageMoreProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="homepageMoreProduct">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.canonapi.cxrus.org/}homepageLink">
 *       &lt;sequence>
 *         &lt;element name="directSubcatPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "homepageMoreProduct", propOrder = {
    "directSubcatPage"
})
@XmlSeeAlso({
    HomepageKeyProduct.class
})
public class HomepageMoreProduct
    extends HomepageLink
{

    protected String directSubcatPage;

    /**
     * Gets the value of the directSubcatPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectSubcatPage() {
        return directSubcatPage;
    }

    /**
     * Sets the value of the directSubcatPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectSubcatPage(String value) {
        this.directSubcatPage = value;
    }

}
