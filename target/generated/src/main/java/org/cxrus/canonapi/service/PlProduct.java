
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for plProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="plProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discountPrice1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountPrice2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageSmall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="new" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="price1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceRmks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellingPoints" type="{http://service.canonapi.cxrus.org/}productSellingPointObj" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plProduct", propOrder = {
    "discountPrice1",
    "discountPrice2",
    "imageSmall",
    "longName",
    "_new",
    "price1",
    "price2",
    "priceRmks",
    "sellingPoints",
    "shortName",
    "systemName"
})
public class PlProduct {

    protected String discountPrice1;
    protected String discountPrice2;
    protected String imageSmall;
    protected String longName;
    @XmlElement(name = "new")
    protected boolean _new;
    protected String price1;
    protected String price2;
    protected String priceRmks;
    @XmlElement(nillable = true)
    protected List<ProductSellingPointObj> sellingPoints;
    protected String shortName;
    protected String systemName;

    /**
     * Gets the value of the discountPrice1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPrice1() {
        return discountPrice1;
    }

    /**
     * Sets the value of the discountPrice1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPrice1(String value) {
        this.discountPrice1 = value;
    }

    /**
     * Gets the value of the discountPrice2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPrice2() {
        return discountPrice2;
    }

    /**
     * Sets the value of the discountPrice2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPrice2(String value) {
        this.discountPrice2 = value;
    }

    /**
     * Gets the value of the imageSmall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageSmall() {
        return imageSmall;
    }

    /**
     * Sets the value of the imageSmall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageSmall(String value) {
        this.imageSmall = value;
    }

    /**
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongName(String value) {
        this.longName = value;
    }

    /**
     * Gets the value of the new property.
     * 
     */
    public boolean isNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     */
    public void setNew(boolean value) {
        this._new = value;
    }

    /**
     * Gets the value of the price1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice1() {
        return price1;
    }

    /**
     * Sets the value of the price1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice1(String value) {
        this.price1 = value;
    }

    /**
     * Gets the value of the price2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice2() {
        return price2;
    }

    /**
     * Sets the value of the price2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice2(String value) {
        this.price2 = value;
    }

    /**
     * Gets the value of the priceRmks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceRmks() {
        return priceRmks;
    }

    /**
     * Sets the value of the priceRmks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceRmks(String value) {
        this.priceRmks = value;
    }

    /**
     * Gets the value of the sellingPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellingPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellingPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSellingPointObj }
     * 
     * 
     */
    public List<ProductSellingPointObj> getSellingPoints() {
        if (sellingPoints == null) {
            sellingPoints = new ArrayList<ProductSellingPointObj>();
        }
        return this.sellingPoints;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the systemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * Sets the value of the systemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemName(String value) {
        this.systemName = value;
    }

}
