package be.intecBrussel;

import java.time.LocalDateTime;

public abstract class Voyage {
	
	public static final double PRICE_PER_DAY = 50.5;
	private long totalDays;
	private int totalPersonen;
	private LocalDateTime departuerDate;
	private LocalDateTime returnDate;
	private Destination destination;
	
	public Voyage(int totalPersonen , LocalDateTime departuerDate ,
			LocalDateTime returnDate,Destination destination  ) {
		this.totalPersonen= totalPersonen;
		this.departuerDate= departuerDate;
		this.returnDate=returnDate;
		this.destination= destination;
	}
	public Voyage() {
		
	}
	public double getPrice() {
		return PRICE_PER_DAY;
	}
	public long getTotalDays() {
		return totalDays;
	}
	public int getTotalPersonen() {
		return totalPersonen;
	}
	public void setTotalPersonen(int totalPersonen) {
		this.totalPersonen = totalPersonen;
	}
	public LocalDateTime getDepartuerDate() {
		return departuerDate;
	}
	public void setDepartuerDate(LocalDateTime departuerDate) {
		this.departuerDate = departuerDate;
	}
	public LocalDateTime getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	public double calculatePrice() {
		double totalPrice = (PRICE_PER_DAY * getTotalDays() );
		return PRICE_PER_DAY  ;	
	}
	public String toString() {
		
	return "The total price is : " + calculatePrice() ;
		
	}
	

}
