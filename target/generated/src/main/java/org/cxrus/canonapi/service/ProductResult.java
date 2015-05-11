
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for productResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessoryContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessoryTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalTab" type="{http://service.canonapi.cxrus.org/}productAdditionalTab" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="brochure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="feature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgLarge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgSmall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="introEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="price2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceRmks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodComp" type="{http://service.canonapi.cxrus.org/}productProductComparision" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prodCompSug" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellingPoints" type="{http://service.canonapi.cxrus.org/}productSellingPointObj" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smallBanner" type="{http://service.canonapi.cxrus.org/}productSmallBanner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="spec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="supportKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sysName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productResult", propOrder = {
    "accessoryContent",
    "accessoryTitle",
    "additionalTab",
    "brochure",
    "endDt",
    "feature",
    "imgLarge",
    "imgMedium",
    "imgSmall",
    "intro",
    "introEmail",
    "logo",
    "longName",
    "metaDescr",
    "metaKeywords",
    "price1",
    "price2",
    "priceRmks",
    "prodComp",
    "prodCompSug",
    "remarks",
    "sellingPoints",
    "shortName",
    "showPrice",
    "smallBanner",
    "spec",
    "startDt",
    "supportKeyword",
    "sysName",
    "tagline"
})
public class ProductResult {

    protected String accessoryContent;
    protected String accessoryTitle;
    @XmlElement(nillable = true)
    protected List<ProductAdditionalTab> additionalTab;
    protected String brochure;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDt;
    protected String feature;
    protected String imgLarge;
    protected String imgMedium;
    protected String imgSmall;
    protected String intro;
    protected String introEmail;
    protected String logo;
    protected String longName;
    protected String metaDescr;
    protected String metaKeywords;
    protected BigDecimal price1;
    protected BigDecimal price2;
    protected String priceRmks;
    @XmlElement(nillable = true)
    protected List<ProductProductComparision> prodComp;
    @XmlElement(nillable = true)
    protected List<String> prodCompSug;
    protected String remarks;
    @XmlElement(nillable = true)
    protected List<ProductSellingPointObj> sellingPoints;
    protected String shortName;
    protected String showPrice;
    @XmlElement(nillable = true)
    protected List<ProductSmallBanner> smallBanner;
    protected String spec;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDt;
    protected String supportKeyword;
    protected String sysName;
    protected String tagline;

    /**
     * Gets the value of the accessoryContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessoryContent() {
        return accessoryContent;
    }

    /**
     * Sets the value of the accessoryContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessoryContent(String value) {
        this.accessoryContent = value;
    }

    /**
     * Gets the value of the accessoryTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessoryTitle() {
        return accessoryTitle;
    }

    /**
     * Sets the value of the accessoryTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessoryTitle(String value) {
        this.accessoryTitle = value;
    }

    /**
     * Gets the value of the additionalTab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTab().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductAdditionalTab }
     * 
     * 
     */
    public List<ProductAdditionalTab> getAdditionalTab() {
        if (additionalTab == null) {
            additionalTab = new ArrayList<ProductAdditionalTab>();
        }
        return this.additionalTab;
    }

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
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDt(XMLGregorianCalendar value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature(String value) {
        this.feature = value;
    }

    /**
     * Gets the value of the imgLarge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgLarge() {
        return imgLarge;
    }

    /**
     * Sets the value of the imgLarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgLarge(String value) {
        this.imgLarge = value;
    }

    /**
     * Gets the value of the imgMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgMedium() {
        return imgMedium;
    }

    /**
     * Sets the value of the imgMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgMedium(String value) {
        this.imgMedium = value;
    }

    /**
     * Gets the value of the imgSmall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgSmall() {
        return imgSmall;
    }

    /**
     * Sets the value of the imgSmall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgSmall(String value) {
        this.imgSmall = value;
    }

    /**
     * Gets the value of the intro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntro() {
        return intro;
    }

    /**
     * Sets the value of the intro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntro(String value) {
        this.intro = value;
    }

    /**
     * Gets the value of the introEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroEmail() {
        return introEmail;
    }

    /**
     * Sets the value of the introEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroEmail(String value) {
        this.introEmail = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogo(String value) {
        this.logo = value;
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
     * Gets the value of the metaDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDescr() {
        return metaDescr;
    }

    /**
     * Sets the value of the metaDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDescr(String value) {
        this.metaDescr = value;
    }

    /**
     * Gets the value of the metaKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaKeywords() {
        return metaKeywords;
    }

    /**
     * Sets the value of the metaKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaKeywords(String value) {
        this.metaKeywords = value;
    }

    /**
     * Gets the value of the price1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice1() {
        return price1;
    }

    /**
     * Sets the value of the price1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice1(BigDecimal value) {
        this.price1 = value;
    }

    /**
     * Gets the value of the price2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice2() {
        return price2;
    }

    /**
     * Sets the value of the price2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice2(BigDecimal value) {
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
     * Gets the value of the prodComp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodComp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdComp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductProductComparision }
     * 
     * 
     */
    public List<ProductProductComparision> getProdComp() {
        if (prodComp == null) {
            prodComp = new ArrayList<ProductProductComparision>();
        }
        return this.prodComp;
    }

    /**
     * Gets the value of the prodCompSug property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodCompSug property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdCompSug().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProdCompSug() {
        if (prodCompSug == null) {
            prodCompSug = new ArrayList<String>();
        }
        return this.prodCompSug;
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
     * Gets the value of the showPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowPrice() {
        return showPrice;
    }

    /**
     * Sets the value of the showPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowPrice(String value) {
        this.showPrice = value;
    }

    /**
     * Gets the value of the smallBanner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smallBanner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmallBanner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSmallBanner }
     * 
     * 
     */
    public List<ProductSmallBanner> getSmallBanner() {
        if (smallBanner == null) {
            smallBanner = new ArrayList<ProductSmallBanner>();
        }
        return this.smallBanner;
    }

    /**
     * Gets the value of the spec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpec() {
        return spec;
    }

    /**
     * Sets the value of the spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpec(String value) {
        this.spec = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
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

    /**
     * Gets the value of the sysName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysName() {
        return sysName;
    }

    /**
     * Sets the value of the sysName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysName(String value) {
        this.sysName = value;
    }

    /**
     * Gets the value of the tagline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagline() {
        return tagline;
    }

    /**
     * Sets the value of the tagline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagline(String value) {
        this.tagline = value;
    }

}
