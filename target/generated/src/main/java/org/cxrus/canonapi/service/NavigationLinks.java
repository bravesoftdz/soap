
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for navigationLinks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="navigationLinks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryLinks" type="{http://service.canonapi.cxrus.org/}categoryLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customCategoryLinks" type="{http://service.canonapi.cxrus.org/}customCategoryLink" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "navigationLinks", propOrder = {
    "categoryLinks",
    "customCategoryLinks"
})
public class NavigationLinks {

    @XmlElement(nillable = true)
    protected List<CategoryLink> categoryLinks;
    @XmlElement(nillable = true)
    protected List<CustomCategoryLink> customCategoryLinks;

    /**
     * Gets the value of the categoryLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryLink }
     * 
     * 
     */
    public List<CategoryLink> getCategoryLinks() {
        if (categoryLinks == null) {
            categoryLinks = new ArrayList<CategoryLink>();
        }
        return this.categoryLinks;
    }

    /**
     * Gets the value of the customCategoryLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customCategoryLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomCategoryLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomCategoryLink }
     * 
     * 
     */
    public List<CustomCategoryLink> getCustomCategoryLinks() {
        if (customCategoryLinks == null) {
            customCategoryLinks = new ArrayList<CustomCategoryLink>();
        }
        return this.customCategoryLinks;
    }

}
