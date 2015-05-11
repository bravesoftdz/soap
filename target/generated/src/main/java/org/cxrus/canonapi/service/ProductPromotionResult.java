
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for productPromotionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productPromotionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="hideEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hideRedemptionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productPriceResultList" type="{http://service.canonapi.cxrus.org/}productPriceResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="redemptionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productPromotionResult", propOrder = {
    "endDate",
    "hideEndDate",
    "hideRedemptionDate",
    "productPriceResultList",
    "redemptionDate",
    "startDate"
})
public class ProductPromotionResult {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String hideEndDate;
    protected String hideRedemptionDate;
    @XmlElement(nillable = true)
    protected List<ProductPriceResult> productPriceResultList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar redemptionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the hideEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHideEndDate() {
        return hideEndDate;
    }

    /**
     * Sets the value of the hideEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHideEndDate(String value) {
        this.hideEndDate = value;
    }

    /**
     * Gets the value of the hideRedemptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHideRedemptionDate() {
        return hideRedemptionDate;
    }

    /**
     * Sets the value of the hideRedemptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHideRedemptionDate(String value) {
        this.hideRedemptionDate = value;
    }

    /**
     * Gets the value of the productPriceResultList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPriceResultList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPriceResultList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPriceResult }
     * 
     * 
     */
    public List<ProductPriceResult> getProductPriceResultList() {
        if (productPriceResultList == null) {
            productPriceResultList = new ArrayList<ProductPriceResult>();
        }
        return this.productPriceResultList;
    }

    /**
     * Gets the value of the redemptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRedemptionDate() {
        return redemptionDate;
    }

    /**
     * Sets the value of the redemptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRedemptionDate(XMLGregorianCalendar value) {
        this.redemptionDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

}
