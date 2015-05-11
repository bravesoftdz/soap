
package org.cxrus.canonapi.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paperGUIManager complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paperGUIManager">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productPaperCatRelationList" type="{http://service.canonapi.cxrus.org/}paperGUIProductPaperCatRelation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productPaperSubcatRelation" type="{http://service.canonapi.cxrus.org/}paperGUIProductPaperSubcatRelation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paperGUIManager", propOrder = {
    "productPaperCatRelationList",
    "productPaperSubcatRelation"
})
public class PaperGUIManager {

    @XmlElement(nillable = true)
    protected List<PaperGUIProductPaperCatRelation> productPaperCatRelationList;
    @XmlElement(nillable = true)
    protected List<PaperGUIProductPaperSubcatRelation> productPaperSubcatRelation;

    /**
     * Gets the value of the productPaperCatRelationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPaperCatRelationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPaperCatRelationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaperGUIProductPaperCatRelation }
     * 
     * 
     */
    public List<PaperGUIProductPaperCatRelation> getProductPaperCatRelationList() {
        if (productPaperCatRelationList == null) {
            productPaperCatRelationList = new ArrayList<PaperGUIProductPaperCatRelation>();
        }
        return this.productPaperCatRelationList;
    }

    /**
     * Gets the value of the productPaperSubcatRelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPaperSubcatRelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPaperSubcatRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaperGUIProductPaperSubcatRelation }
     * 
     * 
     */
    public List<PaperGUIProductPaperSubcatRelation> getProductPaperSubcatRelation() {
        if (productPaperSubcatRelation == null) {
            productPaperSubcatRelation = new ArrayList<PaperGUIProductPaperSubcatRelation>();
        }
        return this.productPaperSubcatRelation;
    }

}
