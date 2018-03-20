package com.sageit.objectcomparision;

import java.util.Date;

public class Event {

	private String name;
	private String venue;
	private Integer numberofAttendes;
	private Date eventDate;
	private Organizer organizer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Integer getNumberofAttendes() {
		return numberofAttendes;
	}

	public void setNumberofAttendes(Integer numberofAttendes) {
		this.numberofAttendes = numberofAttendes;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public Organizer getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}

	@Override
	public boolean equals(Object obj) {

		if (venue.equals(((Event) obj).getVenue())) {
			return true;
		}
		return false;

	}

	@Override
	public int hashCode() {
		return venue.hashCode();

	}

}
