
public class TurnOff implements Command {
ElectronicDevices theDevice;
	
	public TurnOff(ElectronicDevices newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void execute() {
		
		theDevice.off();
		
	}

	public void undo() {
		
		theDevice.on();
		
	}
	
}
