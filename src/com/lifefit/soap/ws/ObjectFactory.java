
package com.lifefit.soap.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lifefit.soap.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SaveHealthMeasureHistoryResponse_QNAME = new QName("http://ws.soap.lifefit.com/", "saveHealthMeasureHistoryResponse");
    private final static QName _UpdatePersonGoalResponse_QNAME = new QName("http://ws.soap.lifefit.com/", "updatePersonGoalResponse");
    private final static QName _GetMeasureTypeListResponse_QNAME = new QName("http://ws.soap.lifefit.com/", "getMeasureTypeListResponse");
    private final static QName _AuthenticateUserResponse_QNAME = new QName("http://ws.soap.lifefit.com/", "authenticateUserResponse");
    private final static QName _GetHealthMeasureHistory_QNAME = new QName("http://ws.soap.lifefit.com/", "getHealthMeasureHistory");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://ws.soap.lifefit.com/", "readPersonResponse");
    private final static QName _ReadPerson_QNAME = new QName("http://ws.soap.lifefit.com/", "readPerson");
    private final static QName _AuthenticateUser_QNAME = new QName("http://ws.soap.lifefit.com/", "authenticateUser");
    private final static QName _GetPeopleListResponse_QNAME = new QName("http://ws.soap.lifefit.com/", "getPeopleListResponse");
    private final static QName _GetPersonHealthMeasureById_QNAME = new QName("http://ws.soap.lifefit.com/", "getPersonHealthMeasureById");
    private final static QName _GetMeasureByName_QNAME = new QName("http://ws.soap.lifefit.com/", "getMeasureByName");
    private final static QName _GetPeopleList_QNAME = new QName("http://ws.soap.lifefit.com/", "getPeopleList");
    private final static QName _DeletePersonHealthMeasureResponse_QNAME = new QName("http://ws.soap.lifefit.com/", "deletePersonHealthMeasureResponse");
    private final static QName _GetPersonGoalResponse_QNAME = new QName("http://ws.soap.lifefit.com/", "getPersonGoalResponse");
    private final static QName _SavePersonHealthMeasure_QNAME = new QName("http://ws.soap.lifefit.com/", "savePersonHealthMeasure");
    private final static QName _GetMeasureTypeList_QNAME = new QName("http://ws.soap.lifefit.com/", "getMeasureTypeList");
    private final static QName _GetPersonHealthMeasureByIdResponse_QNAME = new QName("http://ws.soap.lifefit.com/", "getPersonHealthMeasureByIdResponse");
    private final static QName _GetMeasureByNameResponse_QNAME = new QName("http://ws.soap.lifefit.com/", "getMeasureByNameResponse");
    private final static QName _SavePersonHealthMeasureResponse_QNAME = new QName("http://ws.soap.lifefit.com/", "savePersonHealthMeasureResponse");
    private final static QName _UpdatePersonHealthMeasureResponse_QNAME = new QName("http://ws.soap.lifefit.com/", "updatePersonHealthMeasureResponse");
    private final static QName _DeletePersonHealthMeasure_QNAME = new QName("http://ws.soap.lifefit.com/", "deletePersonHealthMeasure");
    private final static QName _GetPersonGoal_QNAME = new QName("http://ws.soap.lifefit.com/", "getPersonGoal");
    private final static QName _UpdatePersonHealthMeasure_QNAME = new QName("http://ws.soap.lifefit.com/", "updatePersonHealthMeasure");
    private final static QName _UpdatePersonGoal_QNAME = new QName("http://ws.soap.lifefit.com/", "updatePersonGoal");
    private final static QName _GetHealthMeasureHistoryResponse_QNAME = new QName("http://ws.soap.lifefit.com/", "getHealthMeasureHistoryResponse");
    private final static QName _SaveHealthMeasureHistory_QNAME = new QName("http://ws.soap.lifefit.com/", "saveHealthMeasureHistory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lifefit.soap.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPersonHealthMeasureByIdResponse }
     * 
     */
    public GetPersonHealthMeasureByIdResponse createGetPersonHealthMeasureByIdResponse() {
        return new GetPersonHealthMeasureByIdResponse();
    }

    /**
     * Create an instance of {@link GetMeasureTypeList }
     * 
     */
    public GetMeasureTypeList createGetMeasureTypeList() {
        return new GetMeasureTypeList();
    }

    /**
     * Create an instance of {@link UpdatePersonHealthMeasureResponse }
     * 
     */
    public UpdatePersonHealthMeasureResponse createUpdatePersonHealthMeasureResponse() {
        return new UpdatePersonHealthMeasureResponse();
    }

    /**
     * Create an instance of {@link SavePersonHealthMeasureResponse }
     * 
     */
    public SavePersonHealthMeasureResponse createSavePersonHealthMeasureResponse() {
        return new SavePersonHealthMeasureResponse();
    }

    /**
     * Create an instance of {@link GetMeasureByNameResponse }
     * 
     */
    public GetMeasureByNameResponse createGetMeasureByNameResponse() {
        return new GetMeasureByNameResponse();
    }

    /**
     * Create an instance of {@link GetPersonGoal }
     * 
     */
    public GetPersonGoal createGetPersonGoal() {
        return new GetPersonGoal();
    }

    /**
     * Create an instance of {@link UpdatePersonHealthMeasure }
     * 
     */
    public UpdatePersonHealthMeasure createUpdatePersonHealthMeasure() {
        return new UpdatePersonHealthMeasure();
    }

    /**
     * Create an instance of {@link DeletePersonHealthMeasure }
     * 
     */
    public DeletePersonHealthMeasure createDeletePersonHealthMeasure() {
        return new DeletePersonHealthMeasure();
    }

    /**
     * Create an instance of {@link GetHealthMeasureHistoryResponse }
     * 
     */
    public GetHealthMeasureHistoryResponse createGetHealthMeasureHistoryResponse() {
        return new GetHealthMeasureHistoryResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonGoal }
     * 
     */
    public UpdatePersonGoal createUpdatePersonGoal() {
        return new UpdatePersonGoal();
    }

    /**
     * Create an instance of {@link SaveHealthMeasureHistory }
     * 
     */
    public SaveHealthMeasureHistory createSaveHealthMeasureHistory() {
        return new SaveHealthMeasureHistory();
    }

    /**
     * Create an instance of {@link UpdatePersonGoalResponse }
     * 
     */
    public UpdatePersonGoalResponse createUpdatePersonGoalResponse() {
        return new UpdatePersonGoalResponse();
    }

    /**
     * Create an instance of {@link SaveHealthMeasureHistoryResponse }
     * 
     */
    public SaveHealthMeasureHistoryResponse createSaveHealthMeasureHistoryResponse() {
        return new SaveHealthMeasureHistoryResponse();
    }

    /**
     * Create an instance of {@link GetMeasureTypeListResponse }
     * 
     */
    public GetMeasureTypeListResponse createGetMeasureTypeListResponse() {
        return new GetMeasureTypeListResponse();
    }

    /**
     * Create an instance of {@link AuthenticateUserResponse }
     * 
     */
    public AuthenticateUserResponse createAuthenticateUserResponse() {
        return new AuthenticateUserResponse();
    }

    /**
     * Create an instance of {@link GetHealthMeasureHistory }
     * 
     */
    public GetHealthMeasureHistory createGetHealthMeasureHistory() {
        return new GetHealthMeasureHistory();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link GetPeopleListResponse }
     * 
     */
    public GetPeopleListResponse createGetPeopleListResponse() {
        return new GetPeopleListResponse();
    }

    /**
     * Create an instance of {@link AuthenticateUser }
     * 
     */
    public AuthenticateUser createAuthenticateUser() {
        return new AuthenticateUser();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link GetPersonHealthMeasureById }
     * 
     */
    public GetPersonHealthMeasureById createGetPersonHealthMeasureById() {
        return new GetPersonHealthMeasureById();
    }

    /**
     * Create an instance of {@link DeletePersonHealthMeasureResponse }
     * 
     */
    public DeletePersonHealthMeasureResponse createDeletePersonHealthMeasureResponse() {
        return new DeletePersonHealthMeasureResponse();
    }

    /**
     * Create an instance of {@link GetPersonGoalResponse }
     * 
     */
    public GetPersonGoalResponse createGetPersonGoalResponse() {
        return new GetPersonGoalResponse();
    }

    /**
     * Create an instance of {@link SavePersonHealthMeasure }
     * 
     */
    public SavePersonHealthMeasure createSavePersonHealthMeasure() {
        return new SavePersonHealthMeasure();
    }

    /**
     * Create an instance of {@link GetPeopleList }
     * 
     */
    public GetPeopleList createGetPeopleList() {
        return new GetPeopleList();
    }

    /**
     * Create an instance of {@link GetMeasureByName }
     * 
     */
    public GetMeasureByName createGetMeasureByName() {
        return new GetMeasureByName();
    }

    /**
     * Create an instance of {@link LifeStatus }
     * 
     */
    public LifeStatus createLifeStatus() {
        return new LifeStatus();
    }

    /**
     * Create an instance of {@link HealthMeasureHistory }
     * 
     */
    public HealthMeasureHistory createHealthMeasureHistory() {
        return new HealthMeasureHistory();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveHealthMeasureHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "saveHealthMeasureHistoryResponse")
    public JAXBElement<SaveHealthMeasureHistoryResponse> createSaveHealthMeasureHistoryResponse(SaveHealthMeasureHistoryResponse value) {
        return new JAXBElement<SaveHealthMeasureHistoryResponse>(_SaveHealthMeasureHistoryResponse_QNAME, SaveHealthMeasureHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "updatePersonGoalResponse")
    public JAXBElement<UpdatePersonGoalResponse> createUpdatePersonGoalResponse(UpdatePersonGoalResponse value) {
        return new JAXBElement<UpdatePersonGoalResponse>(_UpdatePersonGoalResponse_QNAME, UpdatePersonGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureTypeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "getMeasureTypeListResponse")
    public JAXBElement<GetMeasureTypeListResponse> createGetMeasureTypeListResponse(GetMeasureTypeListResponse value) {
        return new JAXBElement<GetMeasureTypeListResponse>(_GetMeasureTypeListResponse_QNAME, GetMeasureTypeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "authenticateUserResponse")
    public JAXBElement<AuthenticateUserResponse> createAuthenticateUserResponse(AuthenticateUserResponse value) {
        return new JAXBElement<AuthenticateUserResponse>(_AuthenticateUserResponse_QNAME, AuthenticateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHealthMeasureHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "getHealthMeasureHistory")
    public JAXBElement<GetHealthMeasureHistory> createGetHealthMeasureHistory(GetHealthMeasureHistory value) {
        return new JAXBElement<GetHealthMeasureHistory>(_GetHealthMeasureHistory_QNAME, GetHealthMeasureHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "authenticateUser")
    public JAXBElement<AuthenticateUser> createAuthenticateUser(AuthenticateUser value) {
        return new JAXBElement<AuthenticateUser>(_AuthenticateUser_QNAME, AuthenticateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "getPeopleListResponse")
    public JAXBElement<GetPeopleListResponse> createGetPeopleListResponse(GetPeopleListResponse value) {
        return new JAXBElement<GetPeopleListResponse>(_GetPeopleListResponse_QNAME, GetPeopleListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonHealthMeasureById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "getPersonHealthMeasureById")
    public JAXBElement<GetPersonHealthMeasureById> createGetPersonHealthMeasureById(GetPersonHealthMeasureById value) {
        return new JAXBElement<GetPersonHealthMeasureById>(_GetPersonHealthMeasureById_QNAME, GetPersonHealthMeasureById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "getMeasureByName")
    public JAXBElement<GetMeasureByName> createGetMeasureByName(GetMeasureByName value) {
        return new JAXBElement<GetMeasureByName>(_GetMeasureByName_QNAME, GetMeasureByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "getPeopleList")
    public JAXBElement<GetPeopleList> createGetPeopleList(GetPeopleList value) {
        return new JAXBElement<GetPeopleList>(_GetPeopleList_QNAME, GetPeopleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonHealthMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "deletePersonHealthMeasureResponse")
    public JAXBElement<DeletePersonHealthMeasureResponse> createDeletePersonHealthMeasureResponse(DeletePersonHealthMeasureResponse value) {
        return new JAXBElement<DeletePersonHealthMeasureResponse>(_DeletePersonHealthMeasureResponse_QNAME, DeletePersonHealthMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "getPersonGoalResponse")
    public JAXBElement<GetPersonGoalResponse> createGetPersonGoalResponse(GetPersonGoalResponse value) {
        return new JAXBElement<GetPersonGoalResponse>(_GetPersonGoalResponse_QNAME, GetPersonGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonHealthMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "savePersonHealthMeasure")
    public JAXBElement<SavePersonHealthMeasure> createSavePersonHealthMeasure(SavePersonHealthMeasure value) {
        return new JAXBElement<SavePersonHealthMeasure>(_SavePersonHealthMeasure_QNAME, SavePersonHealthMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "getMeasureTypeList")
    public JAXBElement<GetMeasureTypeList> createGetMeasureTypeList(GetMeasureTypeList value) {
        return new JAXBElement<GetMeasureTypeList>(_GetMeasureTypeList_QNAME, GetMeasureTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonHealthMeasureByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "getPersonHealthMeasureByIdResponse")
    public JAXBElement<GetPersonHealthMeasureByIdResponse> createGetPersonHealthMeasureByIdResponse(GetPersonHealthMeasureByIdResponse value) {
        return new JAXBElement<GetPersonHealthMeasureByIdResponse>(_GetPersonHealthMeasureByIdResponse_QNAME, GetPersonHealthMeasureByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "getMeasureByNameResponse")
    public JAXBElement<GetMeasureByNameResponse> createGetMeasureByNameResponse(GetMeasureByNameResponse value) {
        return new JAXBElement<GetMeasureByNameResponse>(_GetMeasureByNameResponse_QNAME, GetMeasureByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonHealthMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "savePersonHealthMeasureResponse")
    public JAXBElement<SavePersonHealthMeasureResponse> createSavePersonHealthMeasureResponse(SavePersonHealthMeasureResponse value) {
        return new JAXBElement<SavePersonHealthMeasureResponse>(_SavePersonHealthMeasureResponse_QNAME, SavePersonHealthMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonHealthMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "updatePersonHealthMeasureResponse")
    public JAXBElement<UpdatePersonHealthMeasureResponse> createUpdatePersonHealthMeasureResponse(UpdatePersonHealthMeasureResponse value) {
        return new JAXBElement<UpdatePersonHealthMeasureResponse>(_UpdatePersonHealthMeasureResponse_QNAME, UpdatePersonHealthMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonHealthMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "deletePersonHealthMeasure")
    public JAXBElement<DeletePersonHealthMeasure> createDeletePersonHealthMeasure(DeletePersonHealthMeasure value) {
        return new JAXBElement<DeletePersonHealthMeasure>(_DeletePersonHealthMeasure_QNAME, DeletePersonHealthMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "getPersonGoal")
    public JAXBElement<GetPersonGoal> createGetPersonGoal(GetPersonGoal value) {
        return new JAXBElement<GetPersonGoal>(_GetPersonGoal_QNAME, GetPersonGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonHealthMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "updatePersonHealthMeasure")
    public JAXBElement<UpdatePersonHealthMeasure> createUpdatePersonHealthMeasure(UpdatePersonHealthMeasure value) {
        return new JAXBElement<UpdatePersonHealthMeasure>(_UpdatePersonHealthMeasure_QNAME, UpdatePersonHealthMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "updatePersonGoal")
    public JAXBElement<UpdatePersonGoal> createUpdatePersonGoal(UpdatePersonGoal value) {
        return new JAXBElement<UpdatePersonGoal>(_UpdatePersonGoal_QNAME, UpdatePersonGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHealthMeasureHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "getHealthMeasureHistoryResponse")
    public JAXBElement<GetHealthMeasureHistoryResponse> createGetHealthMeasureHistoryResponse(GetHealthMeasureHistoryResponse value) {
        return new JAXBElement<GetHealthMeasureHistoryResponse>(_GetHealthMeasureHistoryResponse_QNAME, GetHealthMeasureHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveHealthMeasureHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.lifefit.com/", name = "saveHealthMeasureHistory")
    public JAXBElement<SaveHealthMeasureHistory> createSaveHealthMeasureHistory(SaveHealthMeasureHistory value) {
        return new JAXBElement<SaveHealthMeasureHistory>(_SaveHealthMeasureHistory_QNAME, SaveHealthMeasureHistory.class, null, value);
    }

}
