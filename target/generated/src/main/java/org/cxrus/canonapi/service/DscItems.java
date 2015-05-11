
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dscItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dscItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DSCFilterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DSCItemInfo" type="{http://service.canonapi.cxrus.org/}dscItemInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dscItems", propOrder = {
    "dscFilterName",
    "dscItemInfo"
})
public class DscItems {

    @XmlElement(name = "DSCFilterName")
    protected String dscFilterName;
    @XmlElement(name = "DSCItemInfo", nillable = true)
    protected List<DscItemInfo> dscItemInfo;

    /**
     * Gets the value of the dscFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSCFilterName() {
        return dscFilterName;
    }

    /**
     * Sets the value of the dscFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSCFilterName(String value) {
        this.dscFilterName = value;
    }

    /**
     * Gets the value of the dscItemInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dscItemInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSCItemInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DscItemInfo }
     * 
     * 
     */
    public List<DscItemInfo> getDSCItemInfo() {
        if (dscItemInfo == null) {
            dscItemInfo = new ArrayList<DscItemInfo>();
        }
        return this.dscItemInfo;
    }

}
