
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dscItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dscItemInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brochure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="haveProductComp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="haveProductDealer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="imageLarge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageSmall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newProduct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="productIntro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productLongName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productSellingPt" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supportKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dscItemInfo", propOrder = {
    "brochure",
    "haveProductComp",
    "haveProductDealer",
    "imageLarge",
    "imageMedium",
    "imageSmall",
    "newProduct",
    "productIntro",
    "productLongName",
    "productPrice",
    "productSellingPt",
    "productShortName",
    "productSystemName",
    "supportKeyword"
})
public class DscItemInfo {

    protected String brochure;
    protected boolean haveProductComp;
    protected boolean haveProductDealer;
    protected String imageLarge;
    protected String imageMedium;
    protected String imageSmall;
    protected boolean newProduct;
    protected String productIntro;
    protected String productLongName;
    protected String productPrice;
    @XmlElement(nillable = true)
    protected List<String> productSellingPt;
    protected String productShortName;
    protected String productSystemName;
    protected String supportKeyword;

    /**
     * Gets the value of the brochure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrochure() {
        return brochure;
    }

    /**
     * Sets the value of the brochure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrochure(String value) {
        this.brochure = value;
    }

    /**
     * Gets the value of the haveProductComp property.
     * 
     */
    public boolean isHaveProductComp() {
        return haveProductComp;
    }

    /**
     * Sets the value of the haveProductComp property.
     * 
     */
    public void setHaveProductComp(boolean value) {
        this.haveProductComp = value;
    }

    /**
     * Gets the value of the haveProductDealer property.
     * 
     */
    public boolean isHaveProductDealer() {
        return haveProductDealer;
    }

    /**
     * Sets the value of the haveProductDealer property.
     * 
     */
    public void setHaveProductDealer(boolean value) {
        this.haveProductDealer = value;
    }

    /**
     * Gets the value of the imageLarge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageLarge() {
        return imageLarge;
    }

    /**
     * Sets the value of the imageLarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageLarge(String value) {
        this.imageLarge = value;
    }

    /**
     * Gets the value of the imageMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageMedium() {
        return imageMedium;
    }

    /**
     * Sets the value of the imageMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageMedium(String value) {
        this.imageMedium = value;
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
     * Gets the value of the newProduct property.
     * 
     */
    public boolean isNewProduct() {
        return newProduct;
    }

    /**
     * Sets the value of the newProduct property.
     * 
     */
    public void setNewProduct(boolean value) {
        this.newProduct = value;
    }

    /**
     * Gets the value of the productIntro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIntro() {
        return productIntro;
    }

    /**
     * Sets the value of the productIntro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIntro(String value) {
        this.productIntro = value;
    }

    /**
     * Gets the value of the productLongName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLongName() {
        return productLongName;
    }

    /**
     * Sets the value of the productLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLongName(String value) {
        this.productLongName = value;
    }

    /**
     * Gets the value of the productPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPrice() {
        return productPrice;
    }

    /**
     * Sets the value of the productPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPrice(String value) {
        this.productPrice = value;
    }

    /**
     * Gets the value of the productSellingPt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSellingPt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSellingPt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductSellingPt() {
        if (productSellingPt == null) {
            productSellingPt = new ArrayList<String>();
        }
        return this.productSellingPt;
    }

    /**
     * Gets the value of the productShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductShortName() {
        return productShortName;
    }

    /**
     * Sets the value of the productShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductShortName(String value) {
        this.productShortName = value;
    }

    /**
     * Gets the value of the productSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSystemName() {
        return productSystemName;
    }

    /**
     * Sets the value of the productSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSystemName(String value) {
        this.productSystemName = value;
    }

    /**
     * Gets the value of the supportKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportKeyword() {
        return supportKeyword;
    }

    /**
     * Sets the value of the supportKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportKeyword(String value) {
        this.supportKeyword = value;
    }

}
