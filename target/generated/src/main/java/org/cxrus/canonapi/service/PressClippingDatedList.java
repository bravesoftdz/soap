
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pressClippingDatedList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pressClippingDatedList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formattedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastArticleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pressClippings" type="{http://service.canonapi.cxrus.org/}pressClippingSummaryObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pressClippingDatedList", propOrder = {
    "formattedDate",
    "lastArticleDate",
    "pressClippings"
})
@XmlSeeAlso({
    PressReleaseDatedList.class
})
public class PressClippingDatedList {

    protected String formattedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastArticleDate;
    @XmlElement(nillable = true)
    protected List<PressClippingSummaryObject> pressClippings;

    /**
     * Gets the value of the formattedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedDate() {
        return formattedDate;
    }

    /**
     * Sets the value of the formattedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedDate(String value) {
        this.formattedDate = value;
    }

    /**
     * Gets the value of the lastArticleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastArticleDate() {
        return lastArticleDate;
    }

    /**
     * Sets the value of the lastArticleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastArticleDate(XMLGregorianCalendar value) {
        this.lastArticleDate = value;
    }

    /**
     * Gets the value of the pressClippings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pressClippings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPressClippings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PressClippingSummaryObject }
     * 
     * 
     */
    public List<PressClippingSummaryObject> getPressClippings() {
        if (pressClippings == null) {
            pressClippings = new ArrayList<PressClippingSummaryObject>();
        }
        return this.pressClippings;
    }

}
