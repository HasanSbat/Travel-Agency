package be.intecBrussel;

import java.time.LocalDateTime;

public class Cruise extends Voyage {
	
	public static final double CRUISE_PRICE_EXTRA_COST =10;
	private boolean vip;
	
	public Cruise() {
		super();
	}
	public Cruise (int totalPersonen , LocalDateTime departuerDate , 
			LocalDateTime returnDate,Destination destination, boolean vip ) {
		super (totalPersonen,departuerDate,returnDate,destination);
		this.vip=vip;
	}
	public boolean isVip() {
		return true;	
	}
	public void setVip() {
		
	}
	@Override
	public double calculatePrice() {
		double totalPriceWithCruise=(PRICE_PER_DAY * getTotalDays()) + (CRUISE_PRICE_EXTRA_COST *getTotalDays());
		if (vip =true) {
			System.out.println(totalPriceWithCruise * 1.5);
					}
		return PRICE_PER_DAY  ;	
	}
	
}
