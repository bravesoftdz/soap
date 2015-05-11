
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProductBySystemName_v4Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProductBySystemName_v4Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.canonapi.cxrus.org/}productObjectV4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductBySystemName_v4Response", propOrder = {
    "_return"
})
public class GetProductBySystemNameV4Response {

    @XmlElement(name = "return")
    protected ProductObjectV4 _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ProductObjectV4 }
     *     
     */
    public ProductObjectV4 getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductObjectV4 }
     *     
     */
    public void setReturn(ProductObjectV4 value) {
        this._return = value;
    }

}
