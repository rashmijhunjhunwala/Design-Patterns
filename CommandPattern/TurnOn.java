
public class TurnOn implements Command {
	ElectronicDevices theDevice;
	
	public TurnOn(ElectronicDevices newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void execute() {
		
		theDevice.on();
		
	}

	public void undo() {
		
		theDevice.off();
		
	}
	
}

