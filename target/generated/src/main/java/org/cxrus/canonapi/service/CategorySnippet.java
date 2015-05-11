
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categorySnippet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="categorySnippet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="snippetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snippetUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categorySnippet", propOrder = {
    "snippetName",
    "snippetUrl"
})
public class CategorySnippet {

    protected String snippetName;
    protected String snippetUrl;

    /**
     * Gets the value of the snippetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetName() {
        return snippetName;
    }

    /**
     * Sets the value of the snippetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetName(String value) {
        this.snippetName = value;
    }

    /**
     * Gets the value of the snippetUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetUrl() {
        return snippetUrl;
    }

    /**
     * Sets the value of the snippetUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetUrl(String value) {
        this.snippetUrl = value;
    }

}
