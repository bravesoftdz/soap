
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "requestResponse", propOrder = {
    "referenceNo",
    "status"
})
@XmlSeeAlso({
    ProductPromotionResponse.class,
    CaseStudyResponse.class,
    HighlightResponse.class,
    ProductAdditionalBoxResponse.class,
    EventResponse.class,
    StaticPageResponse.class,
    SubCategoryResponse.class,
    PaperResponse.class,
    ProductFinderResponse.class,
    AvailableStaticPagesResponse.class,
    HeaderFooterResponse.class,
    BusinessSolutionIndustryResponse.class,
    ProductAccessoryResponse.class,
    HomepageResponse.class,
    PhotoLibraryResponse.class,
    DealerResponse.class,
    BusinessSolutionFeatureResponse.class,
    BusinessSolutionResponse.class,
    PressClippingResponse.class,
    ProductMediaResponse.class,
    ProductBySubcategoryResponse.class,
    PressReleaseResponse.class,
    ConsumableResponse.class,
    ProductResponse.class,
    CategoryResponse.class
})
public class RequestResponse {

    protected String referenceNo;
    protected int status;

    /**
     * Gets the value of the referenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /**
     * Sets the value of the referenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNo(String value) {
        this.referenceNo = value;
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
