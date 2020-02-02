
public class Television implements ElectronicDevices{
	private int volume=0;
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("TV in on");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("TV is Off");
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		volume++;
		System.out.println("The volume is turned up to"+volume);
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		volume--;
		System.out.println("The volume is turned down to"+volume);
		
	}

}
