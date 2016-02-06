package com.lifefit.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lifefit.rest.client.adapter.LifeFitAdapterClient;
import com.lifefit.soap.client.local.LifeFitLocalClient;

@Path("/externalapi")
public class AppResource {

	@GET
    @Path("quote/{apiname}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String getAPIConfigByName(@PathParam("apiname") String name){
    	LifeFitLocalClient client = new LifeFitLocalClient();  
        System.out.println("Get APIConfig for "+name);
    	
        String endpoint = client.getAPIConfigByName(name);
        return endpoint;
    }
	
	@GET
    @Path("quote")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String getQuote(){
    	LifeFitAdapterClient client = new LifeFitAdapterClient();  
        System.out.println("Get Quote...");
    	
        String quote = client.getQuote();
        return quote;
    }
}
