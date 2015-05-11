
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paperSubcatPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paperSubcatPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sizes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subcatName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paperSubcatPrice", propOrder = {
    "sizes",
    "subcatName"
})
public class PaperSubcatPrice {

    @XmlElement(nillable = true)
    protected List<String> sizes;
    protected String subcatName;

    /**
     * Gets the value of the sizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSizes() {
        if (sizes == null) {
            sizes = new ArrayList<String>();
        }
        return this.sizes;
    }

    /**
     * Gets the value of the subcatName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcatName() {
        return subcatName;
    }

    /**
     * Sets the value of the subcatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcatName(String value) {
        this.subcatName = value;
    }

}
