
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categorySegmentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="categorySegmentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryResultList" type="{http://service.canonapi.cxrus.org/}categoryDataResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customCategoryList" type="{http://service.canonapi.cxrus.org/}customCategoryResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categorySegmentResult", propOrder = {
    "categoryResultList",
    "customCategoryList",
    "segment"
})
public class CategorySegmentResult {

    @XmlElement(nillable = true)
    protected List<CategoryDataResult> categoryResultList;
    @XmlElement(nillable = true)
    protected List<CustomCategoryResult> customCategoryList;
    protected String segment;

    /**
     * Gets the value of the categoryResultList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryResultList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryResultList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryDataResult }
     * 
     * 
     */
    public List<CategoryDataResult> getCategoryResultList() {
        if (categoryResultList == null) {
            categoryResultList = new ArrayList<CategoryDataResult>();
        }
        return this.categoryResultList;
    }

    /**
     * Gets the value of the customCategoryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customCategoryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomCategoryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomCategoryResult }
     * 
     * 
     */
    public List<CustomCategoryResult> getCustomCategoryList() {
        if (customCategoryList == null) {
            customCategoryList = new ArrayList<CustomCategoryResult>();
        }
        return this.customCategoryList;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment(String value) {
        this.segment = value;
    }

}
