
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productFinderResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productFinderResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advancefinderlist" type="{http://service.canonapi.cxrus.org/}advanceFinderResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simplefinderlist" type="{http://service.canonapi.cxrus.org/}simpleFinderResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sysname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productFinderResult", propOrder = {
    "advancefinderlist",
    "name",
    "productType",
    "simplefinderlist",
    "sysname",
    "type"
})
public class ProductFinderResult {

    @XmlElement(nillable = true)
    protected List<AdvanceFinderResult> advancefinderlist;
    protected String name;
    protected String productType;
    @XmlElement(nillable = true)
    protected List<SimpleFinderResult> simplefinderlist;
    protected String sysname;
    protected String type;

    /**
     * Gets the value of the advancefinderlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advancefinderlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvancefinderlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvanceFinderResult }
     * 
     * 
     */
    public List<AdvanceFinderResult> getAdvancefinderlist() {
        if (advancefinderlist == null) {
            advancefinderlist = new ArrayList<AdvanceFinderResult>();
        }
        return this.advancefinderlist;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the simplefinderlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simplefinderlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimplefinderlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleFinderResult }
     * 
     * 
     */
    public List<SimpleFinderResult> getSimplefinderlist() {
        if (simplefinderlist == null) {
            simplefinderlist = new ArrayList<SimpleFinderResult>();
        }
        return this.simplefinderlist;
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

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
