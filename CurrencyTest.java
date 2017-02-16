enum Currency
{
	PENNY(1),
	NICKLE(5),
	DIME(10),
	QUARTER(25);

	private int value;

	Currency(int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
};

public class CurrencyTest
{
	Currency currency;

	public CurrencyTest(Currency currency)
	{
		this.currency = currency;
	}

	public void valueOfCurrency()
	{
		switch(currency)
		{
			case PENNY: 
						System.out.println("Penny" + Currency.PENNY.getValue());
						break;
			case NICKLE: 
						System.out.println("Nickle" + Currency.NICKLE.getValue());
						break;
			case DIME: 
						System.out.println("Dime" + Currency.DIME.getValue());
						break;
			case QUARTER: 
						System.out.println("Quarter" + Currency.QUARTER.getValue());
						break;
			default:
                System.out.println("default Case");
                break;
		}
	}

	public static void main(String[] args)
	{
		CurrencyTest ct = new  CurrencyTest(Currency.DIME);
		ct.valueOfCurrency();
	}
}