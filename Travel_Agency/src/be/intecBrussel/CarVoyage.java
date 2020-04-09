package be.intecBrussel;

import java.time.LocalDateTime;

public class CarVoyage extends Voyage {
	public static final double EXTRA_PRICRE_CAR_RENT = 10;
	private boolean owncar;
	
	public CarVoyage (boolean owncar){
		this.owncar=owncar;
	}
	
	public CarVoyage (int totalPersonen , LocalDateTime departuerDate ,
			          LocalDateTime returnDate,Destination destination ,boolean owncar){
		super (totalPersonen,departuerDate,returnDate,destination);
		this.owncar=owncar;
	
	}

	public boolean isOwncar() {
		return owncar;
	}

	public void setOwncar(boolean owncar) {
		this.owncar = owncar;
	}
	
	@Override
	public double calculatePrice() {
		double totalPriceWithCar= (PRICE_PER_DAY * getTotalDays()) +EXTRA_PRICRE_CAR_RENT;
		return PRICE_PER_DAY;
	}
	
	private double calculateNumberOfCar() {
		int numberOfCar;
		if (getTotalPersonen() > 5 ) {
			numberOfCar = (getTotalPersonen()/5); 
			if (numberOfCar % 5 != 0) {
				numberOfCar++;
			}
			
		} else if (getTotalPersonen() > 0  ) {
			return 1;
		}
		
		return 0;
	}
	
	
	
	
	
	
	
	
	
}
