package be.intecBrussel;

public class VoyageReservation  {
	private Person person;
	private Voyage voyage;
	private TravelAgency travelagency;
	
	public VoyageReservation(Person person, Voyage voyage,TravelAgency travelagency){
		this.person=person;
		this.voyage=voyage;
		this.travelagency= travelagency;
	}
	public VoyageReservation(Person person, Voyage voyage) {
		this.person=person;
		this.voyage=voyage;
		
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Voyage getVoyage() {
		return voyage;
	}
	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}
	public TravelAgency getTravelagency() {
		return travelagency;
	}
	public void setTravelagency(TravelAgency travelagency) {
		this.travelagency = travelagency;
	}
	public String toString() {
		return null;
		
	}

}
