
public class BankAccountFacade {
	
	private int accountNumber;
	private int securityCode;
	WelcomeBank welcomeBank;
	CheckAccountNumber checkAcc;
	CheckSecurityCode checkSec;
	CheckFund checkFund;
	
	
	public BankAccountFacade(int accountNumber,int securityCode)
	{
		this.accountNumber=accountNumber;
		this.securityCode=securityCode;
		
		welcomeBank=new WelcomeBank();
		checkAcc=new CheckAccountNumber();
		checkSec=new CheckSecurityCode();
		checkFund=new CheckFund();
		
		
		
	}
	
	public int getAccNum() {
		return accountNumber;
	}
	public int getSec()
	{
		return securityCode;
	}
	public void withdraw(double amount)
	{
		if(checkAcc.checkAccNum(getAccNum()) && checkSec.checkSecCode(getSec()) && checkFund.haveEnoughMoney(amount))
		{
			System.out.println("Transaction Successful");
		}
		else
		{
			System.out.println("Transaction Failed");
		}
	}
	
	public void deposit(double amount)
	{
		if(checkAcc.checkAccNum(getAccNum()) && checkSec.checkSecCode(getSec()))
		{
			checkFund.makedeposit(amount);
			System.out.println("Transaction Successful");
		}
		else
		{
			System.out.println("Transaction Failed");
		}
	}
}
