
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productObjectV4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productObjectV4">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.canonapi.cxrus.org/}productObjectV3">
 *       &lt;sequence>
 *         &lt;element name="priceRmks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productSampleImageses" type="{http://service.canonapi.cxrus.org/}productSampleImages" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productObjectV4", propOrder = {
    "priceRmks",
    "productSampleImageses"
})
public class ProductObjectV4
    extends ProductObjectV3
{

    protected String priceRmks;
    @XmlElement(nillable = true)
    protected List<ProductSampleImages> productSampleImageses;

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

    /**
     * Gets the value of the productSampleImageses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSampleImageses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSampleImageses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSampleImages }
     * 
     * 
     */
    public List<ProductSampleImages> getProductSampleImageses() {
        if (productSampleImageses == null) {
            productSampleImageses = new ArrayList<ProductSampleImages>();
        }
        return this.productSampleImageses;
    }

}
