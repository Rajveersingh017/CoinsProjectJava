/**
* Represent Coins class.
*
* @author Rajveer
* @version 1.0
*/
public class Coins
{
	private int quarters;
	private int dimes;
	private int nickels;

	/**
	* The constants QUARTER, DIME, NICKEL
	* set to a value of each coin type.
	*
	* @param QUARTER A constant value set for the quarter coin type.
	* @param DIME A constant vale set for the dime coin type.
	* @param NICKEL A constant vale set for the nickel coin type.
	*/

	private static final double QUARTER = 0.25;
	private static final double  DIME = 0.1;
	private static final double NICKEL = 0.05;

	/**
	* The default constructor sets the value
	* of quarters,nickels and dimes to 0.
	*
	* @param value of quarters set to 0.
	* @param value of dimes set to 0.
	* @param value of nickels set t 0.
	*/

	public Coins()
	{
		this.quarters = 0;
		this.dimes = 0;
		this.nickels = 0;
	}


	/**
	* The overloaded constructor sets the value of
	* quarters, dimes, nickels to the value of
	* incoming parameters.
	*
	* @param quarters The coin type quarters.
	* @param dimes The coin type quarters.
	* @param nickels The coin type nickels.
	*/

	public Coins(int quarters, int dimes, int nickels)
	{
		this.quarters = quarters;
		this.dimes = dimes;
		this.nickels = nickels;
	}
	/**
	* Returns The coin type Quarters.
	*
	* @return The coin type quarters.
	*/

	public int getQuarters()
	{
		return this.quarters;
	}

	/**
	* Returns The coin type Dimes.
	*
	* @return The coin type Dimes.
	*/

	public int getDimes()
	{
		return this.dimes;
	}

	/**
	* Returns The coin type Nickels.
	*
	* @return The coin type Nickels.
	*/

	public int getNickels()
	{
		return this.nickels;
	}

	/**
	* Sets The coin type Quarters.
	*
	* @set The coin type Quarters.
	*/

	public void setQuarters(int quarters)
	{
		this.quarters = quarters;
	}
	/**
	* Sets The coin type Dimes.
	*
	* @set The coin type Dimes.
	*/

	public void setDimes(int dimes)
	{
		this.dimes = dimes;
	}
	/**
	* Sets The coin type Dimes.
	*
	* @set The coin type Dimes.
	*/

	public void setNickels(int nickels)
	{
		this.nickels = nickels;
	}

	/**
	* Returns The Dollar Amount.
	*
	* @return The Dollar Amount.
	*/
	public double getDollarAmount()
	{
		double dollarAmount;

		dollarAmount = this.quarters * QUARTER +
						this.dimes * DIME +
						this.nickels * NICKEL;

		return dollarAmount;
	}

	/**
	* Returns The Dollar Amount based on the CoinType specified.
	*
	* @return The Dollar Amount on the basis of CoinType specified.
	*/

	public double getDollarAmount(CoinType type)
	{
		double dollarAmount = 0;

		switch( type )
		{
		case QUARTER:
		dollarAmount = QUARTER * this.quarters;
		break;

		case DIME:
		dollarAmount = DIME * this.dimes;
		break;

		case NICKEL:
		dollarAmount = NICKEL * this.nickels;
		break;
		}

		return dollarAmount;
	}

	/**
	* Returns The Dollar Amount of the specified
	* number of coins of each coin type.
	*
	* @return The Dollar Amount.
	*/

	public static double getDollarAmount(int quarters,int dimes, int nickels)
	{
		double dollarAmount = quarters * QUARTER +
							  dimes * DIME +
							  nickels * NICKEL;

		return dollarAmount;
	}

	/**
	* Returns a String representation of Coins class.
	*
	* @return a String representation of Coins class.
	*/

	public String toString()
	{
		return String.format(
			"Quarters: %d%nDimes: %d%nNickels: %d%nTotal Value: %.1f",
			this.getQuarters(),
			this.getDimes(),
			this.getNickels(),
			this.getDollarAmount());
	}

}