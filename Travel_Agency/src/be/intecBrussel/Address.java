package be.intecBrussel;

public class Address {
	private String street;
	private String housnumber;
	private int zipcode;
	private String city;
	
	public Address () {
		
	}
	
	public Address (String street, String housnumber , int zipcode , String city) {
		this.street= street;
		this.housnumber=housnumber;
		this.zipcode= zipcode;
		this.city= city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHousnumber() {
		return housnumber;
	}

	public void setHousnumber(String housnumber) {
		this.housnumber = housnumber;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return null;
	}
	
	
}
