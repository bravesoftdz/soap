
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBusinessSolutionIndustryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBusinessSolutionIndustryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.canonapi.cxrus.org/}businessSolutionIndustryFeatureObject" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBusinessSolutionIndustryResponse", propOrder = {
    "_return"
})
public class GetBusinessSolutionIndustryResponse {

    @XmlElement(name = "return")
    protected BusinessSolutionIndustryFeatureObject _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessSolutionIndustryFeatureObject }
     *     
     */
    public BusinessSolutionIndustryFeatureObject getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSolutionIndustryFeatureObject }
     *     
     */
    public void setReturn(BusinessSolutionIndustryFeatureObject value) {
        this._return = value;
    }

}
