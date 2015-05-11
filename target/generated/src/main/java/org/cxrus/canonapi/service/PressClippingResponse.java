
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pressClippingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pressClippingResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.canonapi.cxrus.org/}requestResponse">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://service.canonapi.cxrus.org/}pressClippingLiveStagingResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pressClippingResponse", propOrder = {
    "result"
})
public class PressClippingResponse
    extends RequestResponse
{

    @XmlElement(nillable = true)
    protected List<PressClippingLiveStagingResult> result;

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PressClippingLiveStagingResult }
     * 
     * 
     */
    public List<PressClippingLiveStagingResult> getResult() {
        if (result == null) {
            result = new ArrayList<PressClippingLiveStagingResult>();
        }
        return this.result;
    }

}
