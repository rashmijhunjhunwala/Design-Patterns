
public class VolumeDown implements Command{
	ElectronicDevices theDevice;
	
	public VolumeDown(ElectronicDevices newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void undo() {
		
		theDevice.volumeUp();
		
	}

	public void execute() {
		
		theDevice.volumeDown();
		
	}
}
