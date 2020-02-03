
public class CheckFund {
	private double balance=1000.00;
	public double getBal()
	{
		return balance;
	}
	public void decreaseCash(double amount)
	{
		balance=balance-amount;
	}
	public void increaseCash(double amount)
	{
		balance=balance+amount;
	}
	public boolean haveEnoughMoney(double amount)
	{
		if(getBal()>amount)
		{
			decreaseCash(amount);
			System.out.println("Successfully withdrawn an amount of "+amount+" Your current balance is "+getBal());
			return true;
		}
		else
		{
			System.out.println("OOPS!YOU ARE BROKE BITCH");
			System.out.println("Your current balance is "+getBal());
			return false;
		}
	}
	public void makedeposit(double amount)
	{
		increaseCash(amount);
		System.out.println("YAyy!! Your current balance is "+getBal());
	}
}
