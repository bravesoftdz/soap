
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="longName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subCatSysNameList" type="{http://service.canonapi.cxrus.org/}dSubCategory" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "dProduct", propOrder = {
    "longName",
    "subCatSysNameList",
    "sysName"
})
public class DProduct {

    protected String longName;
    @XmlElement(nillable = true)
    protected List<DSubCategory> subCatSysNameList;
    protected String sysName;

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
     * Gets the value of the subCatSysNameList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subCatSysNameList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubCatSysNameList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSubCategory }
     * 
     * 
     */
    public List<DSubCategory> getSubCatSysNameList() {
        if (subCatSysNameList == null) {
            subCatSysNameList = new ArrayList<DSubCategory>();
        }
        return this.subCatSysNameList;
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
