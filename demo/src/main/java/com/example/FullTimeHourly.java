package com.example;

public class FullTimeHourly extends FullTimeEmployee {

	private double overtimePay;

	public FullTimeHourly() {

	}

	public FullTimeHourly(String firstName, String lastName, Address address, int id, double basePay,
			double overtimePay, String ssn) {
		super(firstName, lastName, address, id, basePay, ssn);

		this.overtimePay = overtimePay;

		// TODO Auto-generated constructor stub
	}

	public void setOvertimePay(double overtimePay) {
		this.overtimePay = overtimePay;
	}

	public double getOvertimePay() {
		return overtimePay;
	}

	@Override
	public String toString() {
		return super.toString() + "\nOvertime Pay per hour: $ " + overtimePay + " per hour";
	}

	/**
	 * introduce(displaySSN:boolean): void
	 * 
	 * @param displaySSN
	 */
	@Override
	public void introduce(boolean displaySSN) {
		super.introduce(displaySSN);
	}

	//
	public double computePay(int numHrs) {
		if (numHrs < 41) {
			return super.getBasePay() * numHrs;
		} else {
			return (super.getBasePay() * 40) + ((numHrs - 40) * overtimePay);
		}
	}

}