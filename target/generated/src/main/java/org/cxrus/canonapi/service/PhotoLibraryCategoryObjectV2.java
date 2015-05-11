
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for photoLibraryCategoryObjectV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="photoLibraryCategoryObjectV2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.canonapi.cxrus.org/}photoLibraryCategoryObject">
 *       &lt;sequence>
 *         &lt;element name="productSystemNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "photoLibraryCategoryObjectV2", propOrder = {
    "productSystemNames"
})
public class PhotoLibraryCategoryObjectV2
    extends PhotoLibraryCategoryObject
{

    @XmlElement(nillable = true)
    protected List<String> productSystemNames;

    /**
     * Gets the value of the productSystemNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSystemNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSystemNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductSystemNames() {
        if (productSystemNames == null) {
            productSystemNames = new ArrayList<String>();
        }
        return this.productSystemNames;
    }

}
