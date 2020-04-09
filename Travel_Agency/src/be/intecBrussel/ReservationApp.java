package be.intecBrussel;

public class ReservationApp {

	public static void main(String[] args) {
		Person person = new Person ();
		TravelAgency travelAgency = new TravelAgency(null, null);
		Voyage voyage = new Voyage () {};
		VoyageReservation voyageReservation = new VoyageReservation(person, voyage);
		ReservationLog reservationLog = new ReservationLog ();
		
		System.out.println(person);
		System.out.println(travelAgency);
		System.out.println(voyage);
		System.out.println(voyageReservation);
		System.out.println(reservationLog);

	}

}
