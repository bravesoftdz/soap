
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productPaper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productPaper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mediumImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paperCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paperSubCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paperUnits" type="{http://service.canonapi.cxrus.org/}productPaperUnit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productPaper", propOrder = {
    "description",
    "mediumImage",
    "paperCategory",
    "paperSubCategory",
    "paperUnits"
})
public class ProductPaper {

    protected String description;
    protected String mediumImage;
    protected String paperCategory;
    protected String paperSubCategory;
    @XmlElement(nillable = true)
    protected List<ProductPaperUnit> paperUnits;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the mediumImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumImage() {
        return mediumImage;
    }

    /**
     * Sets the value of the mediumImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumImage(String value) {
        this.mediumImage = value;
    }

    /**
     * Gets the value of the paperCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaperCategory() {
        return paperCategory;
    }

    /**
     * Sets the value of the paperCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaperCategory(String value) {
        this.paperCategory = value;
    }

    /**
     * Gets the value of the paperSubCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaperSubCategory() {
        return paperSubCategory;
    }

    /**
     * Sets the value of the paperSubCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaperSubCategory(String value) {
        this.paperSubCategory = value;
    }

    /**
     * Gets the value of the paperUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paperUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaperUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPaperUnit }
     * 
     * 
     */
    public List<ProductPaperUnit> getPaperUnits() {
        if (paperUnits == null) {
            paperUnits = new ArrayList<ProductPaperUnit>();
        }
        return this.paperUnits;
    }

}
