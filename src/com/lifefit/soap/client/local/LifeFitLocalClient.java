package com.lifefit.soap.client.local;

import java.util.List;

import com.lifefit.soap.ws.Goal;
import com.lifefit.soap.ws.HealthMeasureHistory;
import com.lifefit.soap.ws.LifeFit;
import com.lifefit.soap.ws.LifeFitService;
import com.lifefit.soap.ws.LifeStatus;
import com.lifefit.soap.ws.Measure;
import com.lifefit.soap.ws.Person;

public class LifeFitLocalClient {
	
	public LifeFitLocalClient(){}
	
	public Person getPersonById(int personId){
		Person person = null;
		
		try{		
			LifeFitService service = new LifeFitService();
			LifeFit lifefit = service.getLifeFitImplPort();
			
			//Invoking SOAP WS of local-db services
			System.out.println("Invoking SOAP WS of local-db services: readPerson("+personId+")");
			person = lifefit.readPerson(personId);	
		}
		catch(Exception e){
			e.printStackTrace();
		}		
		return person;
	}
	
	public List<Measure> getMeasureTypes(String param1){
		List<Measure> measureTypes = null;
		
		try{
			LifeFitService service = new LifeFitService();
			LifeFit lifefit = service.getLifeFitImplPort();
			
			//Invoking SOAP WS of local-db services
			System.out.println("Invoking SOAP WS of local-db services: getMeasureTypeList("+param1+")");
			measureTypes = lifefit.getMeasureTypeList(param1);
		}
		catch(Exception e){
			e.printStackTrace();
		}		
		return measureTypes;
	}
	
	public Goal getPersonGoal(int personId){
		Goal goal = null;
		
		try{
			LifeFitService service = new LifeFitService();
			LifeFit lifefit = service.getLifeFitImplPort();
			
			//Invoking SOAP WS of local-db services
			System.out.println("Invoking SOAP WS of local-db services: getPersonGoal("+personId+")");
			goal = lifefit.getPersonGoal(personId);
		}
		catch(Exception e){}
		return goal;
	}
	
	public boolean updatePersonGoal(Goal goal, int personId){		
		LifeFitService service = new LifeFitService();
		LifeFit lifefit = service.getLifeFitImplPort();
		
		//Invoking SOAP WS of local-db services
		System.out.println("Invoking SOAP WS of local-db services: updatePersonGoal("+personId+")");
		if(lifefit.updatePersonGoal(goal, personId))
			return true;
		else
			return false;
	}
	
	public boolean savePersonGoal(Goal goal, int personId){		
		LifeFitService service = new LifeFitService();
		LifeFit lifefit = service.getLifeFitImplPort();
		
		//Invoking SOAP WS of local-db services
		System.out.println("Invoking SOAP WS of local-db services: savePersonGoal("+personId+")");
		if(lifefit.savePersonGoal(goal, personId))
			return true;
		else
			return false;
	}
	
	public boolean savePersonHealthMeasure(LifeStatus lifeStatus, int personId){
		LifeFitService service = new LifeFitService();
		LifeFit lifefit = service.getLifeFitImplPort();
		
		//Invoking SOAP WS of local-db services
		System.out.println("Invoking SOAP WS of local-db services: savePersonHealthMeasure("+personId+")");
		if(lifefit.savePersonHealthMeasure(lifeStatus, personId))
			return true;
		else
			return false;
	}
	
	public boolean updatePersonHealthMeasure(LifeStatus lifeStatus, int personId){
		LifeFitService service = new LifeFitService();
		LifeFit lifefit = service.getLifeFitImplPort();
		
		//Invoking SOAP WS of local-db services
		System.out.println("Invoking SOAP WS of local-db services: updatePersonHealthMeasure("+personId+")");
		if(lifefit.updatePersonHealthMeasure(lifeStatus, personId))
			return true;
		else
			return false;
	}
	
	public boolean deletePersonHealthMeasure(LifeStatus lifeStatus, int personId){
		LifeFitService service = new LifeFitService();
		LifeFit lifefit = service.getLifeFitImplPort();
		
		//Invoking SOAP WS of local-db services
		System.out.println("Invoking SOAP WS of local-db services: deletePersonHealthMeasure("+personId+")");
		if(lifefit.deletePersonHealthMeasure(lifeStatus, personId))
			return true;
		else
			return false;
	}
	
	public List<HealthMeasureHistory> getHealthMeasureHistory(int personId, int measureId){
		LifeFitService service = new LifeFitService();
		LifeFit lifefit = service.getLifeFitImplPort();
		
		//Invoking SOAP WS of local-db services
		System.out.println("Invoking SOAP WS of local-db services: getHealthMeasureHistory("+personId+")");
		List<HealthMeasureHistory> list = lifefit.getHealthMeasureHistory(personId, measureId);
		
		return list;
	}
	
	public boolean saveHealthMeasureHistory(HealthMeasureHistory hMeasure){
		LifeFitService service = new LifeFitService();
		LifeFit lifefit = service.getLifeFitImplPort();
		
		//Invoking SOAP WS of local-db services
		System.out.println("Invoking SOAP WS of local-db services: saveHealthMeasureHistory()");
		if(lifefit.saveHealthMeasureHistory(hMeasure))
			return true;
		else
			return false;
	}
	
	public Measure getMeasureByName(String measureName){
		LifeFitService service = new LifeFitService();
		LifeFit lifefit = service.getLifeFitImplPort();
		
		//Invoking SOAP WS of local-db services
		System.out.println("Invoking SOAP WS of local-db services: getMeasureByName("+measureName+")");
		Measure measure = lifefit.getMeasureByName(measureName);
		return measure;
	}
	
	public Person authenticateUser(String email, String pass){
		LifeFitService service = new LifeFitService();
		LifeFit lifefit = service.getLifeFitImplPort();
		
		//Invoking SOAP WS of local-db services
		System.out.println("Invoking SOAP WS of local-db services: authenticateUser("+email+")");
		Person person = lifefit.authenticateUser(email, pass);
		return person;
	}
	
	public LifeStatus getLifeStatusByPersonAndMeasureId(int personId, int measureId){
		LifeFitService service = new LifeFitService();
		LifeFit lifefit = service.getLifeFitImplPort();
		
		//Invoking SOAP WS of local-db services
		System.out.println("Invoking SOAP WS of local-db services: "
				+ "getLifeStatusByPersonAndMeasureId("+personId+","+measureId+")");
		LifeStatus lifeStatus = lifefit.getPersonHealthMeasureById(personId, measureId);
		return lifeStatus;		
	}
	
	public String getAPIConfigByName(String name){
		String endpoint = null;
		
		try{
			LifeFitService service = new LifeFitService();
			LifeFit lifefit = service.getLifeFitImplPort();
			
			//Invoking SOAP WS of local-db services
			System.out.println("Invoking SOAP WS of local-db services: getAPIConfig("+name+")");
			endpoint = lifefit.getAPIConfigByName(name);
		}
		catch(Exception e){
			e.printStackTrace();
		}		
		return endpoint;
	}
}
