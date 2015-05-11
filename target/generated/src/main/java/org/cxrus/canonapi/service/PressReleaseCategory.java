
package org.cxrus.canonapi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pressReleaseCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pressReleaseCategory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.canonapi.cxrus.org/}pressClippingCategory">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pressReleaseCategory")
public class PressReleaseCategory
    extends PressClippingCategory
{


}
