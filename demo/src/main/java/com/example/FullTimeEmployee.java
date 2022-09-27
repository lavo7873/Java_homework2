package homework2;

public class FullTimeEmployee extends Employee {
	private double basePay;

	public FullTimeEmployee() {

	}

	public FullTimeEmployee(String firstName, String lastName, Address address, int id, double basePay, String ssn) {
		super(firstName, lastName, address, id, ssn);
		this.basePay = basePay;
	}

	/**
	 * Sets the base pay
	 * 
	 * @param basePay The Employee's pay
	 */
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	/**
	 * Gets the base pay
	 * 
	 * @return basePay
	 */
	public double getBasePay() {
		return basePay;
	}

	@Override
	public void introduce(boolean displaySSN) {
		super.introduce(displaySSN);
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
