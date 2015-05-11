
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dealerLiveStagingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dealerLiveStagingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="liveStagingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionList" type="{http://service.canonapi.cxrus.org/}dealerRegionResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dealerLiveStagingResult", propOrder = {
    "liveStagingType",
    "regionList"
})
public class DealerLiveStagingResult {

    protected String liveStagingType;
    @XmlElement(nillable = true)
    protected List<DealerRegionResult> regionList;

    /**
     * Gets the value of the liveStagingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiveStagingType() {
        return liveStagingType;
    }

    /**
     * Sets the value of the liveStagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiveStagingType(String value) {
        this.liveStagingType = value;
    }

    /**
     * Gets the value of the regionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DealerRegionResult }
     * 
     * 
     */
    public List<DealerRegionResult> getRegionList() {
        if (regionList == null) {
            regionList = new ArrayList<DealerRegionResult>();
        }
        return this.regionList;
    }

}
