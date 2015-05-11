
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dslrsSubcategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dslrsSubcategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DSCItemFilters" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DSCItems" type="{http://service.canonapi.cxrus.org/}dscItems" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasDealer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dslrsSubcategory", propOrder = {
    "dscItemFilters",
    "dscItems",
    "hasDealer"
})
public class DslrsSubcategory {

    @XmlElement(name = "DSCItemFilters", nillable = true)
    protected List<String> dscItemFilters;
    @XmlElement(name = "DSCItems", nillable = true)
    protected List<DscItems> dscItems;
    protected boolean hasDealer;

    /**
     * Gets the value of the dscItemFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dscItemFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSCItemFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDSCItemFilters() {
        if (dscItemFilters == null) {
            dscItemFilters = new ArrayList<String>();
        }
        return this.dscItemFilters;
    }

    /**
     * Gets the value of the dscItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dscItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSCItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DscItems }
     * 
     * 
     */
    public List<DscItems> getDSCItems() {
        if (dscItems == null) {
            dscItems = new ArrayList<DscItems>();
        }
        return this.dscItems;
    }

    /**
     * Gets the value of the hasDealer property.
     * 
     */
    public boolean isHasDealer() {
        return hasDealer;
    }

    /**
     * Sets the value of the hasDealer property.
     * 
     */
    public void setHasDealer(boolean value) {
        this.hasDealer = value;
    }

}
