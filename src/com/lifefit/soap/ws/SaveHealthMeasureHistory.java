
package com.lifefit.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveHealthMeasureHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveHealthMeasureHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="healthMeasureHistory" type="{http://ws.soap.lifefit.com/}healthMeasureHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveHealthMeasureHistory", propOrder = {
    "healthMeasureHistory"
})
public class SaveHealthMeasureHistory {

    protected HealthMeasureHistory healthMeasureHistory;

    /**
     * Gets the value of the healthMeasureHistory property.
     * 
     * @return
     *     possible object is
     *     {@link HealthMeasureHistory }
     *     
     */
    public HealthMeasureHistory getHealthMeasureHistory() {
        return healthMeasureHistory;
    }

    /**
     * Sets the value of the healthMeasureHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthMeasureHistory }
     *     
     */
    public void setHealthMeasureHistory(HealthMeasureHistory value) {
        this.healthMeasureHistory = value;
    }

}
