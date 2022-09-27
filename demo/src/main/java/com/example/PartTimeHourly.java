package homework2;

public class PartTimeHourly extends Employee {
	private double baseHourPay;

	/**
	 * default constructor
	 */
	public PartTimeHourly() {

	}

	/**
	 *
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param ssn
	 * @param id
	 * @param baseHourpay
	 */
	public PartTimeHourly(String firstName, String lastName, Address address, int id, double baseHourPay, String ssn) {
		super(firstName, lastName, address, id, ssn);
		this.baseHourPay = baseHourPay;
	}

	/**
	 * Sets the hourly base pay
	 * 
	 * @param baseHourPay The employee's base pay
	 */
	public void setBaseHourPay(double baseHourPay) {
		this.baseHourPay = baseHourPay;
	}

	/**
	 * Gets the hourly pay.
	 * 
	 * @return The employee's hourly pay.
	 */
	public double getBaseHourPay() {
		return baseHourPay;
	}

	@Override
	public String toString() {
		return super.toString() + "\nBase pay per hour: $" + +baseHourPay;
	}

	/**
	 * Prints the toString method
	 * 
	 * @param displaySSN A boolean that if true, print the SSN.
	 */
	@Override
	public void introduce(boolean displaySSN) {
		super.introduce(displaySSN);
	}

	/**
	 * A method that computes the pay of the employee
	 * 
	 * @param numHRS The hours worked
	 * @return The pay
	 */
	public double computePay(int numHrs) {
		if (numHrs <= 40) {
			return baseHourPay * numHrs;
		} else {
			System.out.println("Working hours cannot exceed 40 hours.");
			return -1;
		}
	}

}