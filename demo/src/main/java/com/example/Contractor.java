package homework2;

public class Contractor extends Employee {

	private double basePay;

	public Contractor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with arguments
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param ssn
	 * @param id
	 * @param pay
	 **/
	public Contractor(String firstName, String lastName, Address address, int id, double pay, String ssn) {
		super(firstName, lastName, address, id, ssn);
		this.basePay = pay;
	}

	/**
	 * Sets the base Pay
	 * 
	 * @param basePay The Employee's pay
	 */
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	/**
	 * Gets the Employee pay
	 * 
	 * @return The employee pay
	 */
	public double getBasePay() {
		return basePay;
	}

	@Override
	public String toString() {
		return super.toString() + "\nBase Pay per hour: $ " + basePay;
	}

	/**
	 *
	 * @param displaySSN
	 */
	@Override
	public void introduce(boolean displaySSN) {
		super.introduce(displaySSN);
	}

	/**
	 * method to Compute the pay
	 * 
	 * @param numHRS The hours worked
	 * @return The total pay
	 */
	public double computePay(int numHrs) {
		return basePay * numHrs;
	}

}
