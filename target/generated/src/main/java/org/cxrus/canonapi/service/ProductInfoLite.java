
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productInfoLite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productInfoLite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productInfoLite", propOrder = {
    "productRemarks",
    "productSystemName"
})
public class ProductInfoLite {

    protected String productRemarks;
    protected String productSystemName;

    /**
     * Gets the value of the productRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRemarks() {
        return productRemarks;
    }

    /**
     * Sets the value of the productRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRemarks(String value) {
        this.productRemarks = value;
    }

    /**
     * Gets the value of the productSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSystemName() {
        return productSystemName;
    }

    /**
     * Sets the value of the productSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSystemName(String value) {
        this.productSystemName = value;
    }

}
