/**
* Demonstrates the testing of the Coin class.
*
* @author Rajveer
* @version 1.0
*/
public class CoinsTest
{
	public static void main(String[] args)
	{
		// Coins(int, int, int)
		System.out.println("Coins(int, int, int)");

		System.out.println("Test #1 - Initialize the number of quarters");
		constructor1_quarters_initialize();

		System.out.println("Test #2 - Initialize the number of dimes");
		constructor1_dimes_initialize();

		System.out.println("Test #3 - Initialize the number of nickels");
		constructor1_nickels_initialize();

		// Coins()
		System.out.println("Coins()");

		System.out.println("Test #1 - Initialize the number of quarters");
		constructor2_quarters_initialize();

		System.out.println("Test #2 - Initialize the number of dimes");
		constructor2_dimes_initialize();

		System.out.println("Test #3 - Initialize the number of nickels");
		constructor2_nickels_initialize();

		// setQuarters(int) : void
		System.out.println("setQuarters(int) : void");
		System.out.println("Test #1 - Update the state of quarters.");
		set_quarters_update();

		// setDimes(int) : void
		System.out.println("setDimes(int) : void");
		System.out.println("Test #1 - Update the state of dimes.");
		set_dimes_update();

		// setNickels(int) : void
		System.out.println("setNickels(int) : void");
		System.out.println("Test #1 - Update the state of nickels.");
		set_nickels_update();

		// getDollarAmount() : double
		System.out.println("getDollarAmount() : double");
		System.out.println("Test #1 - Returns the correct dollar amount");
		getDollarAmount();

		// getDollarAmount(CoinType) : double
		System.out.println("getDollarAmount() : double");
		System.out.println("Test #1 - Returns the correct dollar amount for the quarter CoinType");
		getDollarAmount_COINTYPE1();

		// getDollarAmount(CoinType) : double
		System.out.println("getDollarAmount() : double");
		System.out.println("Test #2 - Returns the correct dollar amount for the dimes CoinType");
		getDollarAmount_COINTYPE2();

		// getDollarAmount(CoinType) : double
		System.out.println("getDollarAmount() : double");
		System.out.println("Test #3 - Returns the correct dollar amount for the nickels CoinType");
		getDollarAmount_COINTYPE3();

		// getDollarAmount() : double
		System.out.println("getDollarAmount(int,int,int) : double");
		System.out.println("Test #1 - Returns the correct dollar amount");
		getDollarAmount_Static();


		// toString() : String
		System.out.println("toString() : String");
		System.out.println("Test #1 - Returns the correct String representation");
		toString_returns();

		System.out.println("Testing Complete.");
	}

	static void constructor1_quarters_initialize()
	{
		int quarters = 4;
		int dimes = 5;
		int nickels = 6;

		Coins design = new Coins(quarters, dimes, nickels);

		int expected = 4;
		int actual = design.getQuarters();

		System.out.printf("Expected: %d%nActal: %d%n%n", expected, actual);
	}

    static void constructor1_dimes_initialize()
	{
		int quarters = 4;
		int dimes = 5;
		int nickels = 6;

		Coins design = new Coins(quarters, dimes, nickels);

		int expected = 5;
		int actual = design.getDimes();

		System.out.printf("Expected: %d%nActal: %d%n%n", expected, actual);
	 }

	 static void constructor1_nickels_initialize()
	 {
		int quarters = 4;
		int dimes = 5;
		int nickels = 6;

		Coins design = new Coins(quarters, dimes, nickels);

		int expected = 5;
		int actual = design.getDimes();


		System.out.printf("Expected: %d%nActal: %d%n%n", expected, actual);
	}

	static void constructor2_quarters_initialize()
	{
		Coins design = new Coins();

		int expected = 0;
		int actual = design.getQuarters();


		System.out.printf("Expected: %d%nActal: %d%n%n", expected, actual);
	 }

	static void constructor2_dimes_initialize()
	{
		Coins design = new Coins();

		int expected = 0;
		int actual = design.getDimes();

		System.out.printf("Expected: %d%nActal: %d%n%n", expected, actual);
	 }

	 static void constructor2_nickels_initialize()
	 {
		Coins design = new Coins();

		int expected = 0;
		int actual = design.getNickels();

		System.out.printf("Expected: %d%nActal: %d%n%n", expected, actual);
 	 }

	 static void set_quarters_update()
	 {
		Coins design = new Coins();

		design.setQuarters(8);

		int expected = 8;
		int actual = design.getQuarters();

		System.out.printf("Expected: %d%nActual: %d%n%n", expected, actual);
	 }

	 static void set_dimes_update()
	 {
		Coins design = new Coins();

		design.setDimes(10);

		int expected =10 ;
		int actual = design.getDimes();

		System.out.printf("Expected: %d%nActual: %d%n%n", expected, actual);
	 }

	 static void set_nickels_update()
	 {
		Coins design = new Coins();

		design.setNickels(12);

		int expected = 12;
		int actual = design.getNickels();

		System.out.printf("Expected: %d%nActual: %d%n%n", expected, actual);
	 }

	 static void getDollarAmount()
	 {
		int quarters = 4;
		int dimes = 5;
		int nickels = 6;

		Coins design = new Coins(quarters, dimes, nickels);

		double expected = 1.8;
		double actual = design.getDollarAmount();

		System.out.printf("Expected: %.1f%nActual: %.1f%n%n", expected, actual);
	  }

	  static void getDollarAmount_COINTYPE1()
	  {
		 int quarters = 12;
		 int dimes = 40;
		 int nickels = 80;

		 Coins design = new Coins(quarters, dimes, nickels);

		 double expected = 3;
		 double actual = design.getDollarAmount(CoinType.QUARTER);

		 System.out.printf("Expected: %.1f%nActual: %.1f%n%n", expected, actual);
	  }

	  static void getDollarAmount_COINTYPE2()
	  {
		 int quarters = 12;
		 int dimes = 40;
		 int nickels = 80;

		 Coins design = new Coins(quarters, dimes, nickels);

		 double expected = 4;
		 double actual = design.getDollarAmount(CoinType.DIME);

		 System.out.printf("Expected: %.1f%nActual: %.1f%n%n", expected, actual);
	  }

	  static void getDollarAmount_COINTYPE3()
	  {
		 int quarters = 12;
	     int dimes = 40;
		 int nickels = 80;

		 Coins design = new Coins(quarters, dimes, nickels);

		 double expected = 4;
		 double actual = design.getDollarAmount(CoinType.NICKEL);

		 System.out.printf("Expected: %.1f%nActual: %.1f%n%n", expected, actual);
	  }


	  static void getDollarAmount_Static()
	  {
		  int quarters = 8;
		  int dimes = 20;
		  int nickels = 40;

		  double expected = 6;
	      double actual = Coins.getDollarAmount(quarters, dimes, nickels);

		  System.out.printf("Expected: %.1f%nActual: %.1f%n%n", expected, actual);
	  }

	 static void toString_returns()
   	 {
     	  int quarters = 24;
		  int dimes = 60;
		  int nickels = 100;

		  Coins design = new Coins(quarters, dimes, nickels);

		  String expected = "Quarters: 24 \nDimes: 60 \nNickels: 100 \nTotal Value: $17";
		  String actual = design.toString();

		  System.out.printf("Expected: %s%n%nActual: %s%n%n", expected, actual);
	  }
}