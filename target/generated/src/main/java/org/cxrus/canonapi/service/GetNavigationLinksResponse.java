
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNavigationLinksResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNavigationLinksResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.canonapi.cxrus.org/}navigationLinks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNavigationLinksResponse", propOrder = {
    "_return"
})
public class GetNavigationLinksResponse {

    @XmlElement(name = "return")
    protected NavigationLinks _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link NavigationLinks }
     *     
     */
    public NavigationLinks getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationLinks }
     *     
     */
    public void setReturn(NavigationLinks value) {
        this._return = value;
    }

}
