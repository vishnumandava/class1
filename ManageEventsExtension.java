package com.sageit.objectcomparision;

public class ManageEventsExtension extends ManageEvents {
	
	
	public Organizer getOrganizer(String name) {
		
		Organizer o = new Organizer();
		o.setAge(30);
		o.setName("Dharani");

		System.out.println("Inside the sub class");
		
		return o;
	}

	public boolean compareObjects(Event e, SimpleEvent se, String eventObject){
		
		if(e.getName().equals(se.getName())){
			return true;
		}
		
		return false;
	}
	
	

}
