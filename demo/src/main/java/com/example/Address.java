package com.example;
/**
 * @author linhuang1101@gmail.com
 * Adress class
 */

public class Address {
	private int streetNum;
	private String streetName, city, state, zip;

	/**
	 * The Address constructor
	 * 
	 * @param streetNumber The street Number
	 * @param streetName   The street Name
	 * @param cityName     The city name
	 * @param state        The state
	 * @param zipCode      The zip code
	 */

	public Address(int streetNumber, String streetName, String cityName, String state, String zipCode) {

		this.streetNum = streetNumber;
		this.streetName = streetName;
		this.city = cityName;
		this.state = state;
		this.zip = zipCode;
	}

	// Getters and Setters
	/**
	 * Gets the street number
	 * 
	 * @return The Street number
	 */
	public int getStreetNum() {
		return this.streetNum;
	}

	/**
	 * Sets the street number
	 * 
	 * @param streetNum The street number
	 */
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}

	/**
	 * Sets the street name
	 * 
	 * @param streetName The street name
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * Gets the street name
	 * 
	 * @return the street name
	 */
	public String getStreetName() {
		return this.streetName;
	}

	/**
	 * Sets the City name
	 * 
	 * @param city The city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the city
	 * 
	 * @return The city
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 * Sets the state
	 * 
	 * @param state The state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the state
	 * 
	 * @return the state
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * Sets the zip code
	 * 
	 * @param zip The zip code
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * Gets the zipcode
	 * 
	 * @return The zipcode
	 */
	public String getZip() {
		return this.zip;
	}

	/**
	 * Takes an address class and instantiates it
	 * 
	 * @param theAddress The addressInstance which will be fed back.
	 */
	public Address(Address theAddress) {
		this.streetNum = theAddress.streetNum;
		this.streetName = theAddress.streetName;
		this.city = theAddress.city;
		this.state = theAddress.state;
		this.zip = theAddress.zip;
	}

	@Override
	/**
	 * @return this.streetNum + this.streetName + this.city+ this.state +this.zip;
	 */
	public String toString() {
		return this.streetNum + this.streetName + this.city + this.state + this.zip;
	}

}