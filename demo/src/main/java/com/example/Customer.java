package homework2;

public class Customer extends Person {

	/**
	 * Attribute - customerID: int - payPreference: String
	 */
	private int customerID;
	private String payPreference;

	/**
	 * Default Constructor <<create>> Customer()
	 */
	public Customer() {

	}

	/**
	 * <<create>> Customer(firstName:String, lastName:String, address:Address,
	 * id:int, ssn: String)
	 * 
	 * @param firstName The customer's first name
	 * @param lastName  The customer's last name
	 * @param address   The customer's address
	 * @param id        The customer's ID
	 * @param ssn       The customer's SSN
	 */
	public Customer(String firstName, String lastName, Address address, int id, String ssn) {
		super(firstName, lastName, address, ssn);
		this.customerID = id;
	}

	/**
	 * Sets the Customer ID setID(int):void
	 * 
	 * @param id The customer's ID
	 */
	public void setCustomerID(int id) {
		this.customerID = id;
	}

	/**
	 * Gets the customer ID getID(): int
	 * 
	 * @return the customer ID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * Sets the Customer Pay Preference setPayPreference(String):void
	 * 
	 * @param payPreference The customer's pay preference
	 */
	public void setPayPreference(String payPreference) {
		this.payPreference = payPreference;
	}

	/**
	 * Gets the pay preference getPayPreference(): String
	 * 
	 * @return The pay preference
	 */
	public String getPayPreference() {
		return payPreference;
	}

	/**
	 * toString(): String
	 */
	@Override
	public String toString() {
		return super.toString() + "\nID: " + customerID;
	}

	/**
	 * introduce(): void
	 */
	@Override
	public void introduce(boolean displaySSN) {
		super.introduce(displaySSN);
	}

	/**
	 * makePayment(): void
	 * 
	 * @param payPreference
	 */
	public void makePayment(String payPreference) {
		// Print out customer preferred payment method.
		System.out.println("Preferred Payment method:" + payPreference);
	}

}
