
public class CheckSecurityCode {
	private int securityCode=1234;
	public int getSecurity()
	{
		return securityCode;
	}
	public boolean checkSecCode(int securityCode)
	{
		if(getSecurity()==securityCode)
			return true;
		else
			return false;
	}
	
}
