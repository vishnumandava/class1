package com.sageit.objectcomparision;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManageEvents {

	public String createEvent(int numberOfAttendes, Date date, String name) {

		// Get data from database for all events on the given date
		// Then check if any event exists please retun error

		Event e = new Event();

		date.getTime();
		
		e.setEventDate(date);
		e.setNumberofAttendes(numberOfAttendes);

		e.setName("Annual Day");
		e.setVenue("Dr Pepper stadium");

		List<Organizer> orgList = getAllOrganizers();

		for (Organizer organizer : orgList) {

			if (organizer.getAge().equals(25) && organizer.getName().startsWith("S")) {
				e.setOrganizer(organizer);
				break;
			}

		}

		Object obj = getEvent(date);

		Event e1 = null;

		if (obj instanceof SimpleEvent) {

			SimpleEvent se = (SimpleEvent) getEvent(date);

		} else if (obj instanceof Event) {

			e1 = (Event) getEvent(date);
		}

		if (e1!=null && e1.equals(e)) {
			return "Not possible, please change venue";
		}

		return "Sucess, go-ahead";

	}

	public List<Organizer> getAllOrganizers() {

		// connect to Database and get all organizer details and convert to
		// Organizer objects and send them back
		Organizer o1 = new Organizer();
		o1.setName("Sumanth");
		o1.setAge(25);
		o1.setDesignation("Pro");

		Organizer o2 = new Organizer();
		o2.setName("Vishnu");
		o2.setAge(25);
		o2.setDesignation("Pro");

		Organizer o3 = new Organizer();
		o3.setName("Ajay");
		o3.setAge(25);
		o3.setDesignation("Pro");

		List<Organizer> orgList = new ArrayList<Organizer>();

		orgList.add(o1);
		orgList.add(o2);
		orgList.add(o3);

		return orgList;

	}

	public Organizer getOrganizer(String name) {

		// connect to Database and get all organizer details and convert to
		// Organizer objects and send them back
		Organizer o1 = new Organizer();
		
		System.out.println("Inside the base class");
		
		return o1;

	}

	public Object getEvent(Date date) {

		Event e = null;

		SimpleEvent se = null;

		if (date.equals("10-01-2019")) {
			e = new Event();
			e.setName("Game day");
		} else {
			se = new SimpleEvent();
			se.setName("Anniversary");
			return se;
		}

		return e;

	}

	public boolean compareObjects(Event e, SimpleEvent se){
		
		if(e.getName().equals(se.getName())){
			return true;
		}
		
		return false;
	}
	
	
}
