
package org.cxrus.canonapi.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessSolutionBannerDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessSolutionBannerDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imgLarge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgSmall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rmks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tagLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessSolutionBannerDto", propOrder = {
    "imgLarge",
    "imgSmall",
    "rmks",
    "sort",
    "tagLine",
    "url",
    "urlType"
})
public class BusinessSolutionBannerDto {

    protected String imgLarge;
    protected String imgSmall;
    protected String rmks;
    protected BigDecimal sort;
    protected String tagLine;
    protected String url;
    protected String urlType;

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
     * Gets the value of the rmks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmks() {
        return rmks;
    }

    /**
     * Sets the value of the rmks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmks(String value) {
        this.rmks = value;
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
     * Gets the value of the tagLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagLine() {
        return tagLine;
    }

    /**
     * Sets the value of the tagLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagLine(String value) {
        this.tagLine = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the urlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlType() {
        return urlType;
    }

    /**
     * Sets the value of the urlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlType(String value) {
        this.urlType = value;
    }

}
