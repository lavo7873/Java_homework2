package homework2;

public class Executive extends Employee {
	private double yearlyBonus;
	private double compensation;

	public Executive() {
		// TODO Auto-generated constructor stub
	}

	public Executive(String firstName, String lastName, Address address, int id, double pay, double bonus, String ssn) {
		super(firstName, lastName, address, id, ssn);
		this.yearlyBonus = bonus;
		this.compensation = pay;

	}

	public double getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	public double getCompensation() {
		return compensation;
	}

	public void setCompensation(double compensation) {
		this.compensation = compensation;
	}

	public String toString() {
		return super.toString() + "\nYearly bonus : $" + yearlyBonus + "\nCompensation per year: $" + compensation;
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
	 * the pay is simply their yearly compensation plus the yearly bonus
	 * 
	 * @return
	 */
	public double computePay() {
		return compensation + yearlyBonus;
	}
}