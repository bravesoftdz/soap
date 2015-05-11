
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productBySubcategoryLiveStagingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productBySubcategoryLiveStagingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://service.canonapi.cxrus.org/}productBySubcategorySegmentResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="liveStagingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productBySubcategoryLiveStagingResult", propOrder = {
    "data",
    "liveStagingType"
})
public class ProductBySubcategoryLiveStagingResult {

    @XmlElement(nillable = true)
    protected List<ProductBySubcategorySegmentResult> data;
    protected String liveStagingType;

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductBySubcategorySegmentResult }
     * 
     * 
     */
    public List<ProductBySubcategorySegmentResult> getData() {
        if (data == null) {
            data = new ArrayList<ProductBySubcategorySegmentResult>();
        }
        return this.data;
    }

    /**
     * Gets the value of the liveStagingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiveStagingType() {
        return liveStagingType;
    }

    /**
     * Sets the value of the liveStagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiveStagingType(String value) {
        this.liveStagingType = value;
    }

}
