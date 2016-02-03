package com.lifefit.rest.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;

import com.lifefit.soap.client.LifeFitClient;
import com.lifefit.soap.ws.Goal;
import com.lifefit.soap.ws.HealthMeasureHistory;
import com.lifefit.soap.ws.LifeStatus;
import com.lifefit.soap.ws.Person;

@Path("/person")
public class PersonCollectionResource {

	// Allows to insert contextual objects into the class,
    // e.g. ServletContext, Request, Response, UriInfo
    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    
    @Path("{personId}")
    public PersonResource getPerson(@PathParam("personId") int id) {
        return new PersonResource(uriInfo, request, id);
    }
    
    @GET
    @Path("{personId}/measurehistory/{measureId}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<HealthMeasureHistory> getPersonHealthMeasureHistory(@PathParam("personId") int personId, 
    		@PathParam("measureId") int measureId) {
    	
    	LifeFitClient client = new LifeFitClient();
    	
    	List<HealthMeasureHistory> healthMeasureHistory = client.getHealthMeasureHistory(personId, measureId);
        return healthMeasureHistory;
    }
    
    @GET
    @Path("{personId}/goal")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Goal getPersonGoal(@PathParam("personId") int personId) {
    	
    	LifeFitClient client = new LifeFitClient();
    	
    	Goal personGoal = client.getPersonGoal(personId);
        return personGoal;
    }
    
    @PUT
    @Path("{personId}/goal")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response updatePersonGoal(Goal goal, @PathParam("personId") int personId){
    	Response res;
    	LifeFitClient client = new LifeFitClient();
    	
    	if(client.updatePersonGoal(personId, goal)){
    		res = Response.created(uriInfo.getAbsolutePath()).build();   
    	}
    	else
    		throw new NotFoundException();
    	
    	return res;    	
    }    
    
    @POST
    @Path("{personId}/hp")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response savePersonHealthMeasure(LifeStatus lifeStatus, @PathParam("personId") int personId){
    	Response res;
    	LifeFitClient client = new LifeFitClient();
    	
    	if(client.savePersonHealthMeasure(lifeStatus, personId)){
    		res = Response.created(uriInfo.getAbsolutePath()).build();   
    	}
    	else
    		throw new NotFoundException();
    	
    	return res;
    }
    
    @PUT
    @Path("{personId}/hp")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response updatePersonHealthMeasure(LifeStatus lifeStatus, @PathParam("personId") int personId){
    	Response res;
    	LifeFitClient client = new LifeFitClient();
    	
    	if(client.updatePersonHealthMeasure(lifeStatus, personId)){
    		res = Response.ok().build();  
    	}
    	else
    		throw new NotFoundException();
    	
    	return res;
    }
    
    @DELETE
    @Path("{personId}/hp")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response deletePersonHealthMeasure(LifeStatus lifeStatus, @PathParam("personId") int personId){
    	Response res;
    	LifeFitClient client = new LifeFitClient();
    	
    	if(client.deletePersonHealthMeasure(lifeStatus, personId)){
    		res = Response.ok().build();
    	}
    	else
    		throw new NotFoundException();
    	
    	return res;
    }
    
    @GET
    @Path("{email}/{pass}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Person authenticateUser(@PathParam("email") String email, @PathParam("pass") String pass){
    	LifeFitClient client = new LifeFitClient();
    	
    	Person person = client.authenticateUser(email, pass);
    	return person;    	
    }
    
    @POST
    @Path("{personId}/measurehistory")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response saveHealthMeasureHistory(HealthMeasureHistory healthMeasure){
    	Response res;
    	LifeFitClient client = new LifeFitClient();
    	
    	if(client.saveHealthMeasureHistory(healthMeasure)){
    		res = Response.created(uriInfo.getAbsolutePath()).build();   
    	}
    	else
    		throw new NotFoundException();
    	
    	return res;
    }
    
    @GET
    @Path("{personId}/hp/{measureId}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public LifeStatus getLifeStatusByPersonAndMeasureId(@PathParam("personId") int personId,
    		@PathParam("measureId") int measureId){
    	LifeFitClient client = new LifeFitClient();
    	LifeStatus lifeStatus = client.getLifeStatusByPersonAndMeasureId(personId, measureId);
    	return lifeStatus;
    }
}
