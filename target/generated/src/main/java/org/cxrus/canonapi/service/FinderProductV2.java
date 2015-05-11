
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for finderProductV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="finderProductV2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.canonapi.cxrus.org/}finderProduct">
 *       &lt;sequence>
 *         &lt;element name="priceRmks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "finderProductV2", propOrder = {
    "priceRmks"
})
public class FinderProductV2
    extends FinderProduct
{

    protected String priceRmks;

    /**
     * Gets the value of the priceRmks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceRmks() {
        return priceRmks;
    }

    /**
     * Sets the value of the priceRmks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceRmks(String value) {
        this.priceRmks = value;
    }

}
