
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
 * <p>Java class for ppPromotion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ppPromotion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="hideEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hideRedemptionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="products" type="{http://service.canonapi.cxrus.org/}ppProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="promotionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redemptionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ppPromotion", propOrder = {
    "endDate",
    "hideEndDate",
    "hideRedemptionDate",
    "products",
    "promotionId",
    "redemptionDate",
    "remarks",
    "startDate"
})
public class PpPromotion {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String hideEndDate;
    protected String hideRedemptionDate;
    @XmlElement(nillable = true)
    protected List<PpProduct> products;
    protected String promotionId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar redemptionDate;
    protected String remarks;
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
     * Gets the value of the products property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the products property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PpProduct }
     * 
     * 
     */
    public List<PpProduct> getProducts() {
        if (products == null) {
            products = new ArrayList<PpProduct>();
        }
        return this.products;
    }

    /**
     * Gets the value of the promotionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionId() {
        return promotionId;
    }

    /**
     * Sets the value of the promotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionId(String value) {
        this.promotionId = value;
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
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
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
