
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for homepageLiveStagingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="homepageLiveStagingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="liveStagingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segmentData" type="{http://service.canonapi.cxrus.org/}homepageResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "homepageLiveStagingResult", propOrder = {
    "liveStagingType",
    "segmentData"
})
public class HomepageLiveStagingResult {

    protected String liveStagingType;
    @XmlElement(nillable = true)
    protected List<HomepageResult> segmentData;

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
     * Gets the value of the segmentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HomepageResult }
     * 
     * 
     */
    public List<HomepageResult> getSegmentData() {
        if (segmentData == null) {
            segmentData = new ArrayList<HomepageResult>();
        }
        return this.segmentData;
    }

}
