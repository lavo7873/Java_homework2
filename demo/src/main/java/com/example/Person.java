package homework2;

public abstract class Person {
	private String firstName, lastName;
	private int age;
	private String ssn;
	private Address address;

	/**
	 * <<create>> Person()
	 */
	public Person() {

	}

	/**
	 * <<create>> Person(firstName:String, lastName:String, address:Address, String
	 * ssn)
	 * 
	 * @param firstName The first name
	 * @param lastName  The last name
	 * @param address   The address
	 * @param ssn       The ssn
	 */
	public Person(String firstName, String lastName, Address address, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.ssn = ssn;
	}

	/**
	 * Sets the first name
	 * 
	 * @param firstName the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the first name
	 * 
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the Last name
	 * 
	 * @param lastName The last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the last name
	 * 
	 * @return last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the age
	 * 
	 * @param age The age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Gets the age
	 * 
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the ssn
	 * 
	 * @param ssn The SSN
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * Gets the SSN
	 * 
	 * @return ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * Sets the address
	 * 
	 * @param addree The addess
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * Gets the address
	 * 
	 * @return adress
	 */
	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Name: " + this.firstName + " " + this.lastName + "\nAddress: " + address.getStreetNum() + ", "
				+ address.getStreetName() + ", " + address.getCity() + ", " + address.getState() + " "
				+ address.getZip() + '.';
	}

	public void introduce(boolean displaySSN) {
		if (!displaySSN) {
			System.out.println(toString());
		} else {
			System.out.println("SSN:" + ssn + "\n" + toString());
		}
	}
}
