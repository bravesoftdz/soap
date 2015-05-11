
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for comparisonObjectV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="comparisonObjectV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maincats" type="{http://service.canonapi.cxrus.org/}comparisonMaincatObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productOptionGroups" type="{http://service.canonapi.cxrus.org/}comparisonProductOptionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comparisonObjectV2", propOrder = {
    "maincats",
    "productOptionGroups"
})
public class ComparisonObjectV2 {

    @XmlElement(nillable = true)
    protected List<ComparisonMaincatObject> maincats;
    @XmlElement(nillable = true)
    protected List<ComparisonProductOptionGroup> productOptionGroups;

    /**
     * Gets the value of the maincats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maincats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaincats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComparisonMaincatObject }
     * 
     * 
     */
    public List<ComparisonMaincatObject> getMaincats() {
        if (maincats == null) {
            maincats = new ArrayList<ComparisonMaincatObject>();
        }
        return this.maincats;
    }

    /**
     * Gets the value of the productOptionGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOptionGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOptionGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComparisonProductOptionGroup }
     * 
     * 
     */
    public List<ComparisonProductOptionGroup> getProductOptionGroups() {
        if (productOptionGroups == null) {
            productOptionGroups = new ArrayList<ComparisonProductOptionGroup>();
        }
        return this.productOptionGroups;
    }

}
