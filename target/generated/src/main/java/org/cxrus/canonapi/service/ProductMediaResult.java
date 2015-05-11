
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productMediaResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productMediaResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productAwardList" type="{http://service.canonapi.cxrus.org/}productAwardResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productExtSiteList" type="{http://service.canonapi.cxrus.org/}productExternalSiteResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productImageList" type="{http://service.canonapi.cxrus.org/}productImageResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productOverviewList" type="{http://service.canonapi.cxrus.org/}productOverviewResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productSampleCatList" type="{http://service.canonapi.cxrus.org/}productSampleCategoryResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productSmallBannerList" type="{http://service.canonapi.cxrus.org/}productMediaSmallBannerResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productVideoList" type="{http://service.canonapi.cxrus.org/}productVideoResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sysname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productMediaResult", propOrder = {
    "productAwardList",
    "productExtSiteList",
    "productImageList",
    "productOverviewList",
    "productSampleCatList",
    "productSmallBannerList",
    "productVideoList",
    "sysname"
})
public class ProductMediaResult {

    @XmlElement(nillable = true)
    protected List<ProductAwardResult> productAwardList;
    @XmlElement(nillable = true)
    protected List<ProductExternalSiteResult> productExtSiteList;
    @XmlElement(nillable = true)
    protected List<ProductImageResult> productImageList;
    @XmlElement(nillable = true)
    protected List<ProductOverviewResult> productOverviewList;
    @XmlElement(nillable = true)
    protected List<ProductSampleCategoryResult> productSampleCatList;
    @XmlElement(nillable = true)
    protected List<ProductMediaSmallBannerResult> productSmallBannerList;
    @XmlElement(nillable = true)
    protected List<ProductVideoResult> productVideoList;
    protected String sysname;

    /**
     * Gets the value of the productAwardList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productAwardList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductAwardList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductAwardResult }
     * 
     * 
     */
    public List<ProductAwardResult> getProductAwardList() {
        if (productAwardList == null) {
            productAwardList = new ArrayList<ProductAwardResult>();
        }
        return this.productAwardList;
    }

    /**
     * Gets the value of the productExtSiteList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productExtSiteList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductExtSiteList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductExternalSiteResult }
     * 
     * 
     */
    public List<ProductExternalSiteResult> getProductExtSiteList() {
        if (productExtSiteList == null) {
            productExtSiteList = new ArrayList<ProductExternalSiteResult>();
        }
        return this.productExtSiteList;
    }

    /**
     * Gets the value of the productImageList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productImageList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductImageList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductImageResult }
     * 
     * 
     */
    public List<ProductImageResult> getProductImageList() {
        if (productImageList == null) {
            productImageList = new ArrayList<ProductImageResult>();
        }
        return this.productImageList;
    }

    /**
     * Gets the value of the productOverviewList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOverviewList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOverviewList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOverviewResult }
     * 
     * 
     */
    public List<ProductOverviewResult> getProductOverviewList() {
        if (productOverviewList == null) {
            productOverviewList = new ArrayList<ProductOverviewResult>();
        }
        return this.productOverviewList;
    }

    /**
     * Gets the value of the productSampleCatList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSampleCatList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSampleCatList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSampleCategoryResult }
     * 
     * 
     */
    public List<ProductSampleCategoryResult> getProductSampleCatList() {
        if (productSampleCatList == null) {
            productSampleCatList = new ArrayList<ProductSampleCategoryResult>();
        }
        return this.productSampleCatList;
    }

    /**
     * Gets the value of the productSmallBannerList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSmallBannerList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSmallBannerList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMediaSmallBannerResult }
     * 
     * 
     */
    public List<ProductMediaSmallBannerResult> getProductSmallBannerList() {
        if (productSmallBannerList == null) {
            productSmallBannerList = new ArrayList<ProductMediaSmallBannerResult>();
        }
        return this.productSmallBannerList;
    }

    /**
     * Gets the value of the productVideoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productVideoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductVideoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductVideoResult }
     * 
     * 
     */
    public List<ProductVideoResult> getProductVideoList() {
        if (productVideoList == null) {
            productVideoList = new ArrayList<ProductVideoResult>();
        }
        return this.productVideoList;
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

}
