
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoryLinkV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="categoryLinkV2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.canonapi.cxrus.org/}categoryLink">
 *       &lt;sequence>
 *         &lt;element name="hideMenu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categoryLinkV2", propOrder = {
    "hideMenu"
})
@XmlSeeAlso({
    CategoryLinkV3 .class
})
public class CategoryLinkV2
    extends CategoryLink
{

    protected String hideMenu;

    /**
     * Gets the value of the hideMenu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHideMenu() {
        return hideMenu;
    }

    /**
     * Sets the value of the hideMenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHideMenu(String value) {
        this.hideMenu = value;
    }

}
