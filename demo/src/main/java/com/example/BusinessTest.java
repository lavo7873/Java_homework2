package com.example;

/**
 * @author vuaivantrinhsjgmail.com
 *  main class : BusinessTest
 */
public class BusinessTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("--------Business Managment----------");
		
		//Executive Test
		System.out.println(">>>Executive<<<");
		Executive ceo = new Executive("Viana", "Trinjh", new Address(3005, "Fenwick way", "San Jose", "CA", "95148"),
				100, 500000.00, 5000.00, "23467362");
		ceo.introduce(true);
		System.out.printf("Total Paid Amount:$%.2f\n", ceo.computePay());
		System.out.println();

		Executive vp = new Executive("Victor", "Pham", new Address(2691, "Sand Point Dr", "San Jose", "CA", "95148"),
				101, 2500000.00, 30000.0, "123456789");
		vp.introduce(false);
		System.out.printf("Total Paid Amount:$%.2f\n", vp.computePay());
		System.out.println("---------------------------");
		
		//Full time salaried test
		System.out.println(">>>Full Time Salaried Employee<<<");
		FullTimeSalaried generalManager = new FullTimeSalaried("Cris", "Johnson",
				new Address(1001, "South Main St", "Milpitas", "CA", "95035"), 200, 80000.0, "530584113");
		generalManager.introduce(true);
		System.out.printf("Total Paid Amount:$%.2f\n", generalManager.computePay(3));
		System.out.println();

		FullTimeSalaried departmentManager = new FullTimeSalaried("Alex", "Cruz",
				new Address(200, "Hillsdale Ave", "San Jose", "CA", "95136"), 201, 60000.0, "717451102");
		departmentManager.introduce(false);
		System.out.printf("Total Paid Amount:$%.2f\n", departmentManager.computePay(5));
		System.out.println("---------------------------");
		
		//Full Time Hourly Test
		System.out.println(">>>FullTime Hourly Employee<<<");
		FullTimeHourly seniorSupervisor = new FullTimeHourly("Kimjoon", "Lee",
				new Address(234, "1st North Street", "San Jose", "CA", "95112"), 300, 35.00, 100.0, "342567823");
		seniorSupervisor.setDirectDeposit(true);
		seniorSupervisor.introduce(true);
		System.out.printf("Total Paid Amount:$%.2f\n", seniorSupervisor.computePay(43));
		System.out.println();

		FullTimeHourly juniorSupervisor = new FullTimeHourly("June", "Nguyen",
				new Address(324, "Curtis Ave", "Milpitas", "CA", "95035"), 301, 22.0, 0.0, "345678932");
		juniorSupervisor.introduce(false);
		System.out.printf("Total Paid Amount:$%.2f\n", juniorSupervisor.computePay(40));
		System.out.println("---------------------------");
		
		//Part Time Hourly Test
		System.out.println(">>>Part Time Hourly Employee<<<");
		PartTimeHourly associate1 = new PartTimeHourly("Minnie", "Lana",
				new Address(296, "Abel ave", "Milpitas", "CA", "95035"), 400, 15.5, "789342456");
		associate1.introduce(true);
		System.out.printf("Total Paid Amount:$%.2f\n", associate1.computePay(38));
		System.out.println();
		
		PartTimeHourly associate2 = new PartTimeHourly("Tracy", "Jenson",
				new Address(4565, "Daydream st", "Palo Alto", "CA", "94304"), 401, 15.5, "789342456");
		associate2.introduce(true);
		System.out.printf("Total Paid Amount:$%.2f\n", associate2.computePay(35));
		System.out.println("---------------------------");
		
		//Contractor Test
		System.out.println(">>>Contractor Employee<<<");
		Contractor contractor1 = new Contractor("Louie", "Grande",
				new Address(432, "Bedford De", "Beverly Hills", "CA", "90210"), 500, 15.0, "456738290");
		contractor1.introduce(true);
		System.out.printf("Total Paid Amount:$%.2f\n", contractor1.computePay(45));
		System.out.println();

		Contractor contractor2 = new Contractor("Hannah", "Montah",
				new Address(112, " Venti Ave", "Houston", "TX", "77071"), 501, 16.0, "432789933");
		contractor2.introduce(false);
		System.out.printf("Total Paid Amount:$%.2f\n", contractor2.computePay(50));
		System.out.println("---------------------------");
		
		//Customer Test 
		System.out.println("Customer ");
		Customer loyalty = new Customer("Brandon", "Lopez", new Address(332, "Eastridge rd", "San Jose", "CA", "95122"),
				600, "34567329");
		loyalty.introduce(false);
		loyalty.makePayment(" Cash");
		System.out.println();
		
		Customer silver = new Customer("Grey", "Wilson",new Address(1004, "Oakstridge rd", "San Jose", "CA", "95132"),
				601, "34565429");
		silver.introduce(false);
        silver.makePayment(" Credit Card");
        System.out.println("________________________");
	}
}
