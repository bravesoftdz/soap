
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paperGUIProductPaperCatRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paperGUIProductPaperCatRelation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paperCatSubcatList" type="{http://service.canonapi.cxrus.org/}paperCatSubcat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paperGUIProductPaperCatRelation", propOrder = {
    "paperCatSubcatList",
    "productName"
})
public class PaperGUIProductPaperCatRelation {

    @XmlElement(nillable = true)
    protected List<PaperCatSubcat> paperCatSubcatList;
    protected String productName;

    /**
     * Gets the value of the paperCatSubcatList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paperCatSubcatList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaperCatSubcatList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaperCatSubcat }
     * 
     * 
     */
    public List<PaperCatSubcat> getPaperCatSubcatList() {
        if (paperCatSubcatList == null) {
            paperCatSubcatList = new ArrayList<PaperCatSubcat>();
        }
        return this.paperCatSubcatList;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

}
