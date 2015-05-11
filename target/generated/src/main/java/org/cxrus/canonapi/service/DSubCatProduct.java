
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dSubCatProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSubCatProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productLongName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regions" type="{http://service.canonapi.cxrus.org/}dRegion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSubCatProduct", propOrder = {
    "productLongName",
    "productSystemName",
    "regions"
})
public class DSubCatProduct {

    protected String productLongName;
    protected String productSystemName;
    @XmlElement(nillable = true)
    protected List<DRegion> regions;

    /**
     * Gets the value of the productLongName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLongName() {
        return productLongName;
    }

    /**
     * Sets the value of the productLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLongName(String value) {
        this.productLongName = value;
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

    /**
     * Gets the value of the regions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DRegion }
     * 
     * 
     */
    public List<DRegion> getRegions() {
        if (regions == null) {
            regions = new ArrayList<DRegion>();
        }
        return this.regions;
    }

}
