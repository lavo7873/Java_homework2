package com.example;

/**
 * @author linhuang1101@gmail.com
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
		Executive ceo = new Executive("Lam", "Vong", new Address(3333, "Morrill", "San Jose", "CA", "95111"),
				100, 5000.00, 500.00, "123456854");
		ceo.introduce(true);
		System.out.printf("Total Paid Amount:$%.2f\n", ceo.computePay());
		System.out.println();

		Executive vp = new Executive("Peter", "Vu", new Address(2232, "Foot hills Dr", "San Jose", "CA", "95132"),
				101, 25000.00, 300.0, "123456789");
		vp.introduce(false);
		System.out.printf("Total Paid Amount:$%.2f\n", vp.computePay());
		System.out.println("---------------------------");
		
		//Full time salaried test
		System.out.println(">>>Full Time Salaried Employee<<<");
		FullTimeSalaried generalManager = new FullTimeSalaried("Zed", "Son",
				new Address(10, "South 10th St", "Milpitas", "CA", "95123"), 200, 80000.0, "530584113");
		generalManager.introduce(true);
		System.out.printf("Total Paid Amount:$%.2f\n", generalManager.computePay(3));
		System.out.println();

		FullTimeSalaried departmentManager = new FullTimeSalaried("Alexcender", "Cruzur",
				new Address(2123, "Oakland", "San Jose", "CA", "95222"), 201, 60000.0, "717451102");
		departmentManager.introduce(false);
		System.out.printf("Total Paid Amount:$%.2f\n", departmentManager.computePay(5));
		System.out.println("---------------------------");
		
		//Full Time Hourly Test
		System.out.println(">>>FullTime Hourly Employee<<<");
		FullTimeHourly seniorSupervisor = new FullTimeHourly("Min Hoo", "Lee",
				new Address(23234, " North Mini Street", "San Jose", "CA", "95112"), 300, 35.00, 100.0, "342567823");
		seniorSupervisor.setDirectDeposit(true);
		seniorSupervisor.introduce(true);
		System.out.printf("Total Paid Amount:$%.2f\n", seniorSupervisor.computePay(43));
		System.out.println();

		FullTimeHourly juniorSupervisor = new FullTimeHourly("July", "Nu",
				new Address(3245, "Curtner Ave", "Milpitas", "CA", "95123"), 301, 22.0, 0.0, "345678932");
		juniorSupervisor.introduce(false);
		System.out.printf("Total Paid Amount:$%.2f\n", juniorSupervisor.computePay(40));
		System.out.println("---------------------------");
		
		//Part Time Hourly Test
		System.out.println(">>>Part Time Hourly Employee<<<");
		PartTimeHourly associate1 = new PartTimeHourly("Biden", "Lana",
				new Address(1296, "24th aSt", "Milpitas", "CA", "95035"), 400, 15.5, "789342456");
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
		Customer loyalty = new Customer("Harris", "Lopi", new Address(32212, "Eastridge rd", "San Jose", "CA", "95122"),
				600, "34567329");
		loyalty.introduce(false);
		loyalty.makePayment(" Cash");
		System.out.println();
		
		Customer silver = new Customer("Civel", "Kacon",new Address(11144, "Biden rd", "San Jose", "CA", "98452"),
				601, "123441229");
		silver.introduce(false);
        silver.makePayment(" Credit Card");
        System.out.println("________________________");
	}
}
