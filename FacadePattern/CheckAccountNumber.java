
public class CheckAccountNumber {
	private int AccountNumber=1234567;
	
	public int getAccount()
	{
		return AccountNumber;
	}
	
	public boolean checkAccNum(int AccountNumber)
	{
		if(getAccount()==AccountNumber)
			return true;
		else
			return false;
	}

}
