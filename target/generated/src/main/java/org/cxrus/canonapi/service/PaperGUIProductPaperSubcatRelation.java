
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paperGUIProductPaperSubcatRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paperGUIProductPaperSubcatRelation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paperSubcatPrice" type="{http://service.canonapi.cxrus.org/}paperSubcatPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paperGUIProductPaperSubcatRelation", propOrder = {
    "paperSubcatPrice",
    "productName"
})
public class PaperGUIProductPaperSubcatRelation {

    @XmlElement(nillable = true)
    protected List<PaperSubcatPrice> paperSubcatPrice;
    protected String productName;

    /**
     * Gets the value of the paperSubcatPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paperSubcatPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaperSubcatPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaperSubcatPrice }
     * 
     * 
     */
    public List<PaperSubcatPrice> getPaperSubcatPrice() {
        if (paperSubcatPrice == null) {
            paperSubcatPrice = new ArrayList<PaperSubcatPrice>();
        }
        return this.paperSubcatPrice;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

}
