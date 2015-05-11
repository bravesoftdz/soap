
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cronProductResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cronProductResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cronProducts" type="{http://service.canonapi.cxrus.org/}cronProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cronProductResponse", propOrder = {
    "cronProducts",
    "status"
})
public class CronProductResponse {

    @XmlElement(nillable = true)
    protected List<CronProduct> cronProducts;
    protected int status;

    /**
     * Gets the value of the cronProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cronProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCronProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CronProduct }
     * 
     * 
     */
    public List<CronProduct> getCronProducts() {
        if (cronProducts == null) {
            cronProducts = new ArrayList<CronProduct>();
        }
        return this.cronProducts;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

}
