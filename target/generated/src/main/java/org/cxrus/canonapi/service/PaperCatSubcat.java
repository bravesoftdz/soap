
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paperCatSubcat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paperCatSubcat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subcatName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paperCatSubcat", propOrder = {
    "catName",
    "subcatName"
})
public class PaperCatSubcat {

    protected String catName;
    @XmlElement(nillable = true)
    protected List<String> subcatName;

    /**
     * Gets the value of the catName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatName() {
        return catName;
    }

    /**
     * Sets the value of the catName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatName(String value) {
        this.catName = value;
    }

    /**
     * Gets the value of the subcatName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subcatName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubcatName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubcatName() {
        if (subcatName == null) {
            subcatName = new ArrayList<String>();
        }
        return this.subcatName;
    }

}
