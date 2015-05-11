
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for headerFooterObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="headerFooterObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="footer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sitemap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="topmenu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "headerFooterObject", propOrder = {
    "footer",
    "header",
    "sitemap",
    "topmenu"
})
public class HeaderFooterObject {

    protected String footer;
    protected String header;
    protected String sitemap;
    protected String topmenu;

    /**
     * Gets the value of the footer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooter() {
        return footer;
    }

    /**
     * Sets the value of the footer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooter(String value) {
        this.footer = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the sitemap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitemap() {
        return sitemap;
    }

    /**
     * Sets the value of the sitemap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitemap(String value) {
        this.sitemap = value;
    }

    /**
     * Gets the value of the topmenu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopmenu() {
        return topmenu;
    }

    /**
     * Sets the value of the topmenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopmenu(String value) {
        this.topmenu = value;
    }

}
