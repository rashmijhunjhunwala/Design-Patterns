
public class BankMain {
	public static void main(String args[])
	{
		BankAccountFacade accessBank=new BankAccountFacade(1234567,123);
		accessBank.withdraw(500.00);
		accessBank.deposit(1000.00);
	}
}
