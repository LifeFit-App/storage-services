package com.lifefit.rest.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lifefit.soap.client.local.LifeFitLocalClient;
import com.lifefit.soap.ws.Measure;

@Path("/measureTypes")
public class MeasureResource {

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Measure> getMeasureTypes(@PathParam("measureName") String measureName) {
    	LifeFitLocalClient client = new LifeFitLocalClient();  
        System.out.println("Getting list of measureTypes...");
        List<Measure> measureType = client.getMeasureTypes("all");
        return measureType;
    }
    
    @GET
    @Path("goal/list")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Measure> getMeasureTypesGoal() {
    	LifeFitLocalClient client = new LifeFitLocalClient();  
        System.out.println("Getting list of measureTypes Goal...");
        List<Measure> measureType = client.getMeasureTypes("goal");
        return measureType;
    }
    
    @GET
    @Path("{measureName}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Measure getMeasureByName(@PathParam("measureName") String measureName){
    	LifeFitLocalClient client = new LifeFitLocalClient();  
        System.out.println("Get measure by name = "+measureName);
    	
        Measure measure = client.getMeasureByName(measureName);
        return measure;
    }
}
