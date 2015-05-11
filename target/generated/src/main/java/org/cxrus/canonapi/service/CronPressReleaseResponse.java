
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cronPressReleaseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cronPressReleaseResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cronPressReleases" type="{http://service.canonapi.cxrus.org/}cronPressRelease" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "cronPressReleaseResponse", propOrder = {
    "cronPressReleases",
    "status"
})
public class CronPressReleaseResponse {

    @XmlElement(nillable = true)
    protected List<CronPressRelease> cronPressReleases;
    protected int status;

    /**
     * Gets the value of the cronPressReleases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cronPressReleases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCronPressReleases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CronPressRelease }
     * 
     * 
     */
    public List<CronPressRelease> getCronPressReleases() {
        if (cronPressReleases == null) {
            cronPressReleases = new ArrayList<CronPressRelease>();
        }
        return this.cronPressReleases;
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
