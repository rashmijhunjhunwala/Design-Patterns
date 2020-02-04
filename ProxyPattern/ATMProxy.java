
public class ATMProxy implements getATMData{
	getATMData atmMachine;
	public ATMProxy(getATMData newAtmMachine)
	{
		atmMachine=newAtmMachine;
	}
	@Override
	public ATMState getATMState() {
		// TODO Auto-generated method stub
		return atmMachine.getATMState();
	}

	@Override
	public int getCashInMachine() {
		// TODO Auto-generated method stub
		return atmMachine.getCashInMachine();
	}

}
