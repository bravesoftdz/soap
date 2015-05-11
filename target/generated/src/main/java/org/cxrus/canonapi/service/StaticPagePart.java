
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for staticPagePart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="staticPagePart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="staticPageSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "staticPagePart", propOrder = {
    "staticPageSystemName",
    "systemName"
})
public class StaticPagePart {

    protected String staticPageSystemName;
    @XmlElement(nillable = true)
    protected List<String> systemName;

    /**
     * Gets the value of the staticPageSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaticPageSystemName() {
        return staticPageSystemName;
    }

    /**
     * Sets the value of the staticPageSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaticPageSystemName(String value) {
        this.staticPageSystemName = value;
    }

    /**
     * Gets the value of the systemName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSystemName() {
        if (systemName == null) {
            systemName = new ArrayList<String>();
        }
        return this.systemName;
    }

}
