
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productAdditionalBoxResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productAdditionalBoxResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boxlist" type="{http://service.canonapi.cxrus.org/}boxResult" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "productAdditionalBoxResult", propOrder = {
    "boxlist",
    "sysname"
})
public class ProductAdditionalBoxResult {

    @XmlElement(nillable = true)
    protected List<BoxResult> boxlist;
    protected String sysname;

    /**
     * Gets the value of the boxlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boxlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoxlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoxResult }
     * 
     * 
     */
    public List<BoxResult> getBoxlist() {
        if (boxlist == null) {
            boxlist = new ArrayList<BoxResult>();
        }
        return this.boxlist;
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
