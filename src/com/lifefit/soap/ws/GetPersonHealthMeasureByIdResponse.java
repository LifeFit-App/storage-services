
package com.lifefit.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPersonHealthMeasureByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPersonHealthMeasureByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="healthMeasure" type="{http://ws.soap.lifefit.com/}lifeStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonHealthMeasureByIdResponse", propOrder = {
    "healthMeasure"
})
public class GetPersonHealthMeasureByIdResponse {

    protected LifeStatus healthMeasure;

    /**
     * Gets the value of the healthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link LifeStatus }
     *     
     */
    public LifeStatus getHealthMeasure() {
        return healthMeasure;
    }

    /**
     * Sets the value of the healthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeStatus }
     *     
     */
    public void setHealthMeasure(LifeStatus value) {
        this.healthMeasure = value;
    }

}
