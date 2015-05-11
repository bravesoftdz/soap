
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productAccessoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productAccessoryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessoryList" type="{http://service.canonapi.cxrus.org/}accessoryResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sysname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productAccessoryResult", propOrder = {
    "accessoryList",
    "sysname"
})
public class ProductAccessoryResult {

    @XmlElement(nillable = true)
    protected List<AccessoryResult> accessoryList;
    protected String sysname;

    /**
     * Gets the value of the accessoryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessoryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessoryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessoryResult }
     * 
     * 
     */
    public List<AccessoryResult> getAccessoryList() {
        if (accessoryList == null) {
            accessoryList = new ArrayList<AccessoryResult>();
        }
        return this.accessoryList;
    }

    /**
     * Gets the value of the sysname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysname() {
        return sysname;
    }

    /**
     * Sets the value of the sysname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysname(String value) {
        this.sysname = value;
    }

}
