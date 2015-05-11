
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pressClippingSummaryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pressClippingSummaryList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monthlyPressClippings" type="{http://service.canonapi.cxrus.org/}pressClippingDatedList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pressClippingCategories" type="{http://service.canonapi.cxrus.org/}pressClippingCategory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pressClippingSummaryList", propOrder = {
    "monthlyPressClippings",
    "pressClippingCategories"
})
public class PressClippingSummaryList {

    @XmlElement(nillable = true)
    protected List<PressClippingDatedList> monthlyPressClippings;
    @XmlElement(nillable = true)
    protected List<PressClippingCategory> pressClippingCategories;

    /**
     * Gets the value of the monthlyPressClippings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthlyPressClippings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthlyPressClippings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PressClippingDatedList }
     * 
     * 
     */
    public List<PressClippingDatedList> getMonthlyPressClippings() {
        if (monthlyPressClippings == null) {
            monthlyPressClippings = new ArrayList<PressClippingDatedList>();
        }
        return this.monthlyPressClippings;
    }

    /**
     * Gets the value of the pressClippingCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pressClippingCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPressClippingCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PressClippingCategory }
     * 
     * 
     */
    public List<PressClippingCategory> getPressClippingCategories() {
        if (pressClippingCategories == null) {
            pressClippingCategories = new ArrayList<PressClippingCategory>();
        }
        return this.pressClippingCategories;
    }

}
