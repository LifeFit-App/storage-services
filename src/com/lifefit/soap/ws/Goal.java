
package com.lifefit.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for goal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="goal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idGoal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goalTarget" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="person" type="{http://ws.soap.lifefit.com/}person" minOccurs="0"/>
 *         &lt;element name="measure" type="{http://ws.soap.lifefit.com/}measure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goal", propOrder = {
    "idGoal",
    "goalTarget",
    "person",
    "measure"
})
public class Goal {

    protected int idGoal;
    protected double goalTarget;
    protected Person person;
    protected Measure measure;

    /**
     * Gets the value of the idGoal property.
     * 
     */
    public int getIdGoal() {
        return idGoal;
    }

    /**
     * Sets the value of the idGoal property.
     * 
     */
    public void setIdGoal(int value) {
        this.idGoal = value;
    }

    /**
     * Gets the value of the goalTarget property.
     * 
     */
    public double getGoalTarget() {
        return goalTarget;
    }

    /**
     * Sets the value of the goalTarget property.
     * 
     */
    public void setGoalTarget(double value) {
        this.goalTarget = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the measure property.
     * 
     * @return
     *     possible object is
     *     {@link Measure }
     *     
     */
    public Measure getMeasure() {
        return measure;
    }

    /**
     * Sets the value of the measure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Measure }
     *     
     */
    public void setMeasure(Measure value) {
        this.measure = value;
    }

}
