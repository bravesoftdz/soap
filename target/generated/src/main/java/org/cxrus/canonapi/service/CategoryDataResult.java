
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoryDataResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="categoryDataResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bigBannerList" type="{http://service.canonapi.cxrus.org/}bigBannerResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hideMenu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgSmall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedCat1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedCat2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedCat3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smallBannerList" type="{http://service.canonapi.cxrus.org/}smallBannerResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="snippetName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetName4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetName5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetUrl1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetUrl2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetUrl3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetUrl4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetUrl5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="subcatCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subcatFirstEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sysName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categoryDataResult", propOrder = {
    "bigBannerList",
    "hideMenu",
    "imgMedium",
    "imgSmall",
    "longName",
    "metaDescr",
    "metaKeywords",
    "relatedCat1",
    "relatedCat2",
    "relatedCat3",
    "selectTitle",
    "shortName",
    "smallBannerList",
    "snippetName1",
    "snippetName2",
    "snippetName3",
    "snippetName4",
    "snippetName5",
    "snippetTitle",
    "snippetUrl1",
    "snippetUrl2",
    "snippetUrl3",
    "snippetUrl4",
    "snippetUrl5",
    "sort",
    "subcatCount",
    "subcatFirstEntry",
    "sysName"
})
public class CategoryDataResult {

    @XmlElement(nillable = true)
    protected List<BigBannerResult> bigBannerList;
    protected String hideMenu;
    protected String imgMedium;
    protected String imgSmall;
    protected String longName;
    protected String metaDescr;
    protected String metaKeywords;
    protected String relatedCat1;
    protected String relatedCat2;
    protected String relatedCat3;
    protected String selectTitle;
    protected String shortName;
    @XmlElement(nillable = true)
    protected List<SmallBannerResult> smallBannerList;
    protected String snippetName1;
    protected String snippetName2;
    protected String snippetName3;
    protected String snippetName4;
    protected String snippetName5;
    protected String snippetTitle;
    protected String snippetUrl1;
    protected String snippetUrl2;
    protected String snippetUrl3;
    protected String snippetUrl4;
    protected String snippetUrl5;
    protected BigDecimal sort;
    protected int subcatCount;
    protected String subcatFirstEntry;
    protected String sysName;

    /**
     * Gets the value of the bigBannerList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bigBannerList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBigBannerList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigBannerResult }
     * 
     * 
     */
    public List<BigBannerResult> getBigBannerList() {
        if (bigBannerList == null) {
            bigBannerList = new ArrayList<BigBannerResult>();
        }
        return this.bigBannerList;
    }

    /**
     * Gets the value of the hideMenu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHideMenu() {
        return hideMenu;
    }

    /**
     * Sets the value of the hideMenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHideMenu(String value) {
        this.hideMenu = value;
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
     * Gets the value of the relatedCat1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedCat1() {
        return relatedCat1;
    }

    /**
     * Sets the value of the relatedCat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedCat1(String value) {
        this.relatedCat1 = value;
    }

    /**
     * Gets the value of the relatedCat2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedCat2() {
        return relatedCat2;
    }

    /**
     * Sets the value of the relatedCat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedCat2(String value) {
        this.relatedCat2 = value;
    }

    /**
     * Gets the value of the relatedCat3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedCat3() {
        return relatedCat3;
    }

    /**
     * Sets the value of the relatedCat3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedCat3(String value) {
        this.relatedCat3 = value;
    }

    /**
     * Gets the value of the selectTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectTitle() {
        return selectTitle;
    }

    /**
     * Sets the value of the selectTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectTitle(String value) {
        this.selectTitle = value;
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
     * Gets the value of the smallBannerList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smallBannerList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmallBannerList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmallBannerResult }
     * 
     * 
     */
    public List<SmallBannerResult> getSmallBannerList() {
        if (smallBannerList == null) {
            smallBannerList = new ArrayList<SmallBannerResult>();
        }
        return this.smallBannerList;
    }

    /**
     * Gets the value of the snippetName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetName1() {
        return snippetName1;
    }

    /**
     * Sets the value of the snippetName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetName1(String value) {
        this.snippetName1 = value;
    }

    /**
     * Gets the value of the snippetName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetName2() {
        return snippetName2;
    }

    /**
     * Sets the value of the snippetName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetName2(String value) {
        this.snippetName2 = value;
    }

    /**
     * Gets the value of the snippetName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetName3() {
        return snippetName3;
    }

    /**
     * Sets the value of the snippetName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetName3(String value) {
        this.snippetName3 = value;
    }

    /**
     * Gets the value of the snippetName4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetName4() {
        return snippetName4;
    }

    /**
     * Sets the value of the snippetName4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetName4(String value) {
        this.snippetName4 = value;
    }

    /**
     * Gets the value of the snippetName5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetName5() {
        return snippetName5;
    }

    /**
     * Sets the value of the snippetName5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetName5(String value) {
        this.snippetName5 = value;
    }

    /**
     * Gets the value of the snippetTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetTitle() {
        return snippetTitle;
    }

    /**
     * Sets the value of the snippetTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetTitle(String value) {
        this.snippetTitle = value;
    }

    /**
     * Gets the value of the snippetUrl1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetUrl1() {
        return snippetUrl1;
    }

    /**
     * Sets the value of the snippetUrl1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetUrl1(String value) {
        this.snippetUrl1 = value;
    }

    /**
     * Gets the value of the snippetUrl2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetUrl2() {
        return snippetUrl2;
    }

    /**
     * Sets the value of the snippetUrl2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetUrl2(String value) {
        this.snippetUrl2 = value;
    }

    /**
     * Gets the value of the snippetUrl3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetUrl3() {
        return snippetUrl3;
    }

    /**
     * Sets the value of the snippetUrl3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetUrl3(String value) {
        this.snippetUrl3 = value;
    }

    /**
     * Gets the value of the snippetUrl4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetUrl4() {
        return snippetUrl4;
    }

    /**
     * Sets the value of the snippetUrl4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetUrl4(String value) {
        this.snippetUrl4 = value;
    }

    /**
     * Gets the value of the snippetUrl5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetUrl5() {
        return snippetUrl5;
    }

    /**
     * Sets the value of the snippetUrl5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetUrl5(String value) {
        this.snippetUrl5 = value;
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

    /**
     * Gets the value of the subcatCount property.
     * 
     */
    public int getSubcatCount() {
        return subcatCount;
    }

    /**
     * Sets the value of the subcatCount property.
     * 
     */
    public void setSubcatCount(int value) {
        this.subcatCount = value;
    }

    /**
     * Gets the value of the subcatFirstEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcatFirstEntry() {
        return subcatFirstEntry;
    }

    /**
     * Sets the value of the subcatFirstEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcatFirstEntry(String value) {
        this.subcatFirstEntry = value;
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

}
