package com.example;

/**
 * @author linhuang1101@gmail.com
 * <<abstract>> Employee class
 */

public abstract class Employee extends Person {
	private int id;
	private String educationLevel;
	private boolean directDeposit;

	public Employee() {

	}

	/**
	 * <<create>> Employee(firstName:String,lastName:String, address:Address,
	 * id:int, ssn: String)
	 * 
	 * @param ssn The employee's id
	 */

	Employee(String firstName, String lastName, Address address, int id, String ssn) {
		super(firstName, lastName, address, ssn);
		this.id = id;
	}

	/**
	 * Sets the age setID(int): void
	 * 
	 * @param id The id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets Employee's Id
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the education level setEducation(String): void
	 * 
	 * @param educationLevel
	 */
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	
	/**
	 * Gets Education Level 
	 *  
	 * @return educationLevel
	 */
	public String getEducationLevel() {
		return educationLevel;
	}

	/**
	 * Sets the direct deposit setDirectDeposit(boolean): void
	 * 
	 * @param directDeposit
	 */
	public void setDirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}
	
	/**
	 * Gets Direct Deposit 
	 *  
	 * @return directDeposit
	 */
	public boolean isDirectDeposit() {
		return directDeposit;
	}
	
	/** 
	 * toString(): String
	 */
	public String toString() {

		return "Employee " + this.getLastName() + ", " + this.getFirstName() + "\nId: " + id + "\nDirect Deposit: "
				+ directDeposit;
	}

	public void introduce() {
		System.out.println(super.toString());
	}
}