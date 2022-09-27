package homework2;

public class FullTimeSalaried extends FullTimeEmployee  {

	public FullTimeSalaried() {
		// TODO Auto-generated constructor stub
	 
	}
	public FullTimeSalaried(String firstName, String lastName, 
			Address address, int id, double salary, String ssn) {
        super(firstName, lastName, address, id, salary, ssn);
    }


    @Override
    public String toString() {
        return super.toString() + " ";
    }

    /**
     *
     * @param displaySSN
     */
    public void introduce(boolean displaySSN) {
        super.introduce(displaySSN);
    }

    /**
     
     * @param numWeeks
     * @return
     */
    public double computePay(int numWeeks){
        return (super.getBasePay()/52)*numWeeks;
    }



}


