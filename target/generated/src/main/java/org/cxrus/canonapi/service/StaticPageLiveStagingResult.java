
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for staticPageLiveStagingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="staticPageLiveStagingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="liveStagingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultData" type="{http://service.canonapi.cxrus.org/}staticPageSegmentResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "staticPageLiveStagingResult", propOrder = {
    "liveStagingType",
    "resultData"
})
public class StaticPageLiveStagingResult {

    protected String liveStagingType;
    @XmlElement(nillable = true)
    protected List<StaticPageSegmentResult> resultData;

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
     * Gets the value of the resultData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaticPageSegmentResult }
     * 
     * 
     */
    public List<StaticPageSegmentResult> getResultData() {
        if (resultData == null) {
            resultData = new ArrayList<StaticPageSegmentResult>();
        }
        return this.resultData;
    }

}
