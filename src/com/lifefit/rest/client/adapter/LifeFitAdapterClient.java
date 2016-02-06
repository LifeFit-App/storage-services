package com.lifefit.rest.client.adapter;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

import com.owlike.genson.ext.jaxrs.GensonJsonConverter;

public class LifeFitAdapterClient {

	static Response response;
	static String results = null;
	//RESTFul Web Service URL for LifeFit adapter services
	final String SERVER_URL = "https://lifefit-adapter-181499.herokuapp.com/lifefit-adapter";
	WebTarget service;
	
	public LifeFitAdapterClient(){
		init();
	}
	
	private void init(){
		final ClientConfig clientConfig = new ClientConfig().register(GensonJsonConverter.class);			
		Client client = ClientBuilder.newClient(clientConfig);
		service = client.target(getBaseURI(SERVER_URL));		
	}
	
	private static URI getBaseURI(String SERVER_URL){
		return UriBuilder.fromUri(SERVER_URL).build();
	}
	
	public String getQuote(){
		String quote = null;
		
		try{
			response = service.path("/externalapi/quote").request().accept(MediaType.APPLICATION_JSON).get();
			results = response.readEntity(String.class);			
			quote = results.toString();								
		}
		catch(Exception e){e.printStackTrace();}
		return quote;
	}
}
