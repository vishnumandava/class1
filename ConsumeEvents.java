package com.sageit.objectcomparision;

import java.util.Date;

public class ConsumeEvents {

	public static void main(String args[]) {

		Date d = new Date(10, 01, 2019);

		ManageEvents me = new ManageEvents();

		me.createEvent(100, null, "");

		ManageEvents mee = new ManageEventsExtension();

		mee.getOrganizer("Dharani...");

		((ManageEventsExtension) mee).compareObjects(new Event(), new SimpleEvent(), "");

	}

}
