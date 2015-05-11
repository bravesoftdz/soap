
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consumableWebFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consumableWebFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.canonapi.cxrus.org/}consumableWebFilterLite">
 *       &lt;sequence>
 *         &lt;element name="catLongName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subcatLongName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subcatSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consumableWebFilter", propOrder = {
    "catLongName",
    "catSystemName",
    "subcatLongName",
    "subcatSystemName"
})
public class ConsumableWebFilter
    extends ConsumableWebFilterLite
{

    protected String catLongName;
    protected String catSystemName;
    protected String subcatLongName;
    protected String subcatSystemName;

    /**
     * Gets the value of the catLongName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatLongName() {
        return catLongName;
    }

    /**
     * Sets the value of the catLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatLongName(String value) {
        this.catLongName = value;
    }

    /**
     * Gets the value of the catSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatSystemName() {
        return catSystemName;
    }

    /**
     * Sets the value of the catSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatSystemName(String value) {
        this.catSystemName = value;
    }

    /**
     * Gets the value of the subcatLongName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcatLongName() {
        return subcatLongName;
    }

    /**
     * Sets the value of the subcatLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcatLongName(String value) {
        this.subcatLongName = value;
    }

    /**
     * Gets the value of the subcatSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcatSystemName() {
        return subcatSystemName;
    }

    /**
     * Sets the value of the subcatSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcatSystemName(String value) {
        this.subcatSystemName = value;
    }

}
