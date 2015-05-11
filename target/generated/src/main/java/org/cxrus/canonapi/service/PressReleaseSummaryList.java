
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pressReleaseSummaryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pressReleaseSummaryList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monthlyPressReleases" type="{http://service.canonapi.cxrus.org/}pressReleaseDatedList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pressReleaseCategories" type="{http://service.canonapi.cxrus.org/}pressReleaseCategory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pressReleaseSummaryList", propOrder = {
    "monthlyPressReleases",
    "pressReleaseCategories"
})
public class PressReleaseSummaryList {

    @XmlElement(nillable = true)
    protected List<PressReleaseDatedList> monthlyPressReleases;
    @XmlElement(nillable = true)
    protected List<PressReleaseCategory> pressReleaseCategories;

    /**
     * Gets the value of the monthlyPressReleases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthlyPressReleases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthlyPressReleases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PressReleaseDatedList }
     * 
     * 
     */
    public List<PressReleaseDatedList> getMonthlyPressReleases() {
        if (monthlyPressReleases == null) {
            monthlyPressReleases = new ArrayList<PressReleaseDatedList>();
        }
        return this.monthlyPressReleases;
    }

    /**
     * Gets the value of the pressReleaseCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pressReleaseCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPressReleaseCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PressReleaseCategory }
     * 
     * 
     */
    public List<PressReleaseCategory> getPressReleaseCategories() {
        if (pressReleaseCategories == null) {
            pressReleaseCategories = new ArrayList<PressReleaseCategory>();
        }
        return this.pressReleaseCategories;
    }

}
