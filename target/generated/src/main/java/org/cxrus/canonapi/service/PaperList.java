
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paperList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paperList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paperPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="paperQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paperSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodList" type="{http://service.canonapi.cxrus.org/}paperProductInformationResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paperList", propOrder = {
    "paperPrice",
    "paperQty",
    "paperSize",
    "prodList",
    "sort"
})
public class PaperList {

    protected BigDecimal paperPrice;
    protected String paperQty;
    protected String paperSize;
    @XmlElement(nillable = true)
    protected List<PaperProductInformationResult> prodList;
    protected BigDecimal sort;

    /**
     * Gets the value of the paperPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaperPrice() {
        return paperPrice;
    }

    /**
     * Sets the value of the paperPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaperPrice(BigDecimal value) {
        this.paperPrice = value;
    }

    /**
     * Gets the value of the paperQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaperQty() {
        return paperQty;
    }

    /**
     * Sets the value of the paperQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaperQty(String value) {
        this.paperQty = value;
    }

    /**
     * Gets the value of the paperSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaperSize() {
        return paperSize;
    }

    /**
     * Sets the value of the paperSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaperSize(String value) {
        this.paperSize = value;
    }

    /**
     * Gets the value of the prodList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaperProductInformationResult }
     * 
     * 
     */
    public List<PaperProductInformationResult> getProdList() {
        if (prodList == null) {
            prodList = new ArrayList<PaperProductInformationResult>();
        }
        return this.prodList;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSort(BigDecimal value) {
        this.sort = value;
    }

}
