
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productObjectV3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productObjectV3">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.canonapi.cxrus.org/}productObjectV2">
 *       &lt;sequence>
 *         &lt;element name="extDealerShowUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extDealerUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extDealerUrlOrientation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product360views" type="{http://service.canonapi.cxrus.org/}product360View" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productOverviewses" type="{http://service.canonapi.cxrus.org/}productOverviews" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productObjectV3", propOrder = {
    "extDealerShowUrl",
    "extDealerUrl",
    "extDealerUrlOrientation",
    "product360Views",
    "productOverviewses"
})
@XmlSeeAlso({
    ProductObjectV4 .class
})
public class ProductObjectV3
    extends ProductObjectV2
{

    protected String extDealerShowUrl;
    protected String extDealerUrl;
    protected String extDealerUrlOrientation;
    @XmlElement(name = "product360views", nillable = true)
    protected List<Product360View> product360Views;
    @XmlElement(nillable = true)
    protected List<ProductOverviews> productOverviewses;

    /**
     * Gets the value of the extDealerShowUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtDealerShowUrl() {
        return extDealerShowUrl;
    }

    /**
     * Sets the value of the extDealerShowUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtDealerShowUrl(String value) {
        this.extDealerShowUrl = value;
    }

    /**
     * Gets the value of the extDealerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtDealerUrl() {
        return extDealerUrl;
    }

    /**
     * Sets the value of the extDealerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtDealerUrl(String value) {
        this.extDealerUrl = value;
    }

    /**
     * Gets the value of the extDealerUrlOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtDealerUrlOrientation() {
        return extDealerUrlOrientation;
    }

    /**
     * Sets the value of the extDealerUrlOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtDealerUrlOrientation(String value) {
        this.extDealerUrlOrientation = value;
    }

    /**
     * Gets the value of the product360Views property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product360Views property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct360Views().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product360View }
     * 
     * 
     */
    public List<Product360View> getProduct360Views() {
        if (product360Views == null) {
            product360Views = new ArrayList<Product360View>();
        }
        return this.product360Views;
    }

    /**
     * Gets the value of the productOverviewses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOverviewses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOverviewses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOverviews }
     * 
     * 
     */
    public List<ProductOverviews> getProductOverviewses() {
        if (productOverviewses == null) {
            productOverviewses = new ArrayList<ProductOverviews>();
        }
        return this.productOverviewses;
    }

}
