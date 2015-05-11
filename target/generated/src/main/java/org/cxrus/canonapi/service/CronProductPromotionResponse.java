
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cronProductPromotionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cronProductPromotionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cronProductPromotions" type="{http://service.canonapi.cxrus.org/}cronProductPromotion" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "cronProductPromotionResponse", propOrder = {
    "cronProductPromotions",
    "status"
})
public class CronProductPromotionResponse {

    @XmlElement(nillable = true)
    protected List<CronProductPromotion> cronProductPromotions;
    protected int status;

    /**
     * Gets the value of the cronProductPromotions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cronProductPromotions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCronProductPromotions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CronProductPromotion }
     * 
     * 
     */
    public List<CronProductPromotion> getCronProductPromotions() {
        if (cronProductPromotions == null) {
            cronProductPromotions = new ArrayList<CronProductPromotion>();
        }
        return this.cronProductPromotions;
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
