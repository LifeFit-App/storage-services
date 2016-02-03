
package com.lifefit.soap.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LifeFit", targetNamespace = "http://ws.soap.lifefit.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LifeFit {


    /**
     * 
     * @param lifeStatus
     * @param personId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "status", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonHealthMeasure", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.UpdatePersonHealthMeasure")
    @ResponseWrapper(localName = "updatePersonHealthMeasureResponse", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.UpdatePersonHealthMeasureResponse")
    @Action(input = "http://ws.soap.lifefit.com/LifeFit/updatePersonHealthMeasureRequest", output = "http://ws.soap.lifefit.com/LifeFit/updatePersonHealthMeasureResponse")
    public boolean updatePersonHealthMeasure(
        @WebParam(name = "lifeStatus", targetNamespace = "")
        LifeStatus lifeStatus,
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param measureId
     * @param personId
     * @return
     *     returns java.util.List<com.lifefit.soap.ws.HealthMeasureHistory>
     */
    @WebMethod
    @WebResult(name = "healthMeasureHistory", targetNamespace = "")
    @RequestWrapper(localName = "getHealthMeasureHistory", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.GetHealthMeasureHistory")
    @ResponseWrapper(localName = "getHealthMeasureHistoryResponse", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.GetHealthMeasureHistoryResponse")
    @Action(input = "http://ws.soap.lifefit.com/LifeFit/getHealthMeasureHistoryRequest", output = "http://ws.soap.lifefit.com/LifeFit/getHealthMeasureHistoryResponse")
    public List<HealthMeasureHistory> getHealthMeasureHistory(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureId", targetNamespace = "")
        int measureId);

    /**
     * 
     * @param healthMeasureHistory
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "status", targetNamespace = "")
    @RequestWrapper(localName = "saveHealthMeasureHistory", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.SaveHealthMeasureHistory")
    @ResponseWrapper(localName = "saveHealthMeasureHistoryResponse", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.SaveHealthMeasureHistoryResponse")
    @Action(input = "http://ws.soap.lifefit.com/LifeFit/saveHealthMeasureHistoryRequest", output = "http://ws.soap.lifefit.com/LifeFit/saveHealthMeasureHistoryResponse")
    public boolean saveHealthMeasureHistory(
        @WebParam(name = "healthMeasureHistory", targetNamespace = "")
        HealthMeasureHistory healthMeasureHistory);

    /**
     * 
     * @param lifeStatus
     * @param personId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "status", targetNamespace = "")
    @RequestWrapper(localName = "savePersonHealthMeasure", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.SavePersonHealthMeasure")
    @ResponseWrapper(localName = "savePersonHealthMeasureResponse", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.SavePersonHealthMeasureResponse")
    @Action(input = "http://ws.soap.lifefit.com/LifeFit/savePersonHealthMeasureRequest", output = "http://ws.soap.lifefit.com/LifeFit/savePersonHealthMeasureResponse")
    public boolean savePersonHealthMeasure(
        @WebParam(name = "lifeStatus", targetNamespace = "")
        LifeStatus lifeStatus,
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param pass
     * @param email
     * @return
     *     returns com.lifefit.soap.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "authenticateUser", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.AuthenticateUser")
    @ResponseWrapper(localName = "authenticateUserResponse", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.AuthenticateUserResponse")
    @Action(input = "http://ws.soap.lifefit.com/LifeFit/authenticateUserRequest", output = "http://ws.soap.lifefit.com/LifeFit/authenticateUserResponse")
    public Person authenticateUser(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "pass", targetNamespace = "")
        String pass);

    /**
     * 
     * @param measureId
     * @param personId
     * @return
     *     returns com.lifefit.soap.ws.LifeStatus
     */
    @WebMethod
    @WebResult(name = "healthMeasure", targetNamespace = "")
    @RequestWrapper(localName = "getPersonHealthMeasureById", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.GetPersonHealthMeasureById")
    @ResponseWrapper(localName = "getPersonHealthMeasureByIdResponse", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.GetPersonHealthMeasureByIdResponse")
    @Action(input = "http://ws.soap.lifefit.com/LifeFit/getPersonHealthMeasureByIdRequest", output = "http://ws.soap.lifefit.com/LifeFit/getPersonHealthMeasureByIdResponse")
    public LifeStatus getPersonHealthMeasureById(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureId", targetNamespace = "")
        int measureId);

    /**
     * 
     * @param lifeStatus
     * @param personId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "status", targetNamespace = "")
    @RequestWrapper(localName = "deletePersonHealthMeasure", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.DeletePersonHealthMeasure")
    @ResponseWrapper(localName = "deletePersonHealthMeasureResponse", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.DeletePersonHealthMeasureResponse")
    @Action(input = "http://ws.soap.lifefit.com/LifeFit/deletePersonHealthMeasureRequest", output = "http://ws.soap.lifefit.com/LifeFit/deletePersonHealthMeasureResponse")
    public boolean deletePersonHealthMeasure(
        @WebParam(name = "lifeStatus", targetNamespace = "")
        LifeStatus lifeStatus,
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param personId
     * @return
     *     returns com.lifefit.soap.ws.Goal
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "getPersonGoal", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.GetPersonGoal")
    @ResponseWrapper(localName = "getPersonGoalResponse", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.GetPersonGoalResponse")
    @Action(input = "http://ws.soap.lifefit.com/LifeFit/getPersonGoalRequest", output = "http://ws.soap.lifefit.com/LifeFit/getPersonGoalResponse")
    public Goal getPersonGoal(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @return
     *     returns java.util.List<com.lifefit.soap.ws.Measure>
     */
    @WebMethod
    @WebResult(name = "measureTypes", targetNamespace = "")
    @RequestWrapper(localName = "getMeasureTypeList", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.GetMeasureTypeList")
    @ResponseWrapper(localName = "getMeasureTypeListResponse", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.GetMeasureTypeListResponse")
    @Action(input = "http://ws.soap.lifefit.com/LifeFit/getMeasureTypeListRequest", output = "http://ws.soap.lifefit.com/LifeFit/getMeasureTypeListResponse")
    public List<Measure> getMeasureTypeList();

    /**
     * 
     * @param personId
     * @return
     *     returns com.lifefit.soap.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.ReadPersonResponse")
    @Action(input = "http://ws.soap.lifefit.com/LifeFit/readPersonRequest", output = "http://ws.soap.lifefit.com/LifeFit/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param goal
     * @param personId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "status", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonGoal", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.UpdatePersonGoal")
    @ResponseWrapper(localName = "updatePersonGoalResponse", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.UpdatePersonGoalResponse")
    @Action(input = "http://ws.soap.lifefit.com/LifeFit/updatePersonGoalRequest", output = "http://ws.soap.lifefit.com/LifeFit/updatePersonGoalResponse")
    public boolean updatePersonGoal(
        @WebParam(name = "goal", targetNamespace = "")
        Goal goal,
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param measureName
     * @return
     *     returns com.lifefit.soap.ws.Measure
     */
    @WebMethod
    @WebResult(name = "measure", targetNamespace = "")
    @RequestWrapper(localName = "getMeasureByName", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.GetMeasureByName")
    @ResponseWrapper(localName = "getMeasureByNameResponse", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.GetMeasureByNameResponse")
    @Action(input = "http://ws.soap.lifefit.com/LifeFit/getMeasureByNameRequest", output = "http://ws.soap.lifefit.com/LifeFit/getMeasureByNameResponse")
    public Measure getMeasureByName(
        @WebParam(name = "measureName", targetNamespace = "")
        String measureName);

    /**
     * 
     * @return
     *     returns java.util.List<com.lifefit.soap.ws.Person>
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "")
    @RequestWrapper(localName = "getPeopleList", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.GetPeopleList")
    @ResponseWrapper(localName = "getPeopleListResponse", targetNamespace = "http://ws.soap.lifefit.com/", className = "com.lifefit.soap.ws.GetPeopleListResponse")
    @Action(input = "http://ws.soap.lifefit.com/LifeFit/getPeopleListRequest", output = "http://ws.soap.lifefit.com/LifeFit/getPeopleListResponse")
    public List<Person> getPeopleList();

}
