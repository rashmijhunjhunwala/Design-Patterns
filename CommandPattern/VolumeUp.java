
public class VolumeUp implements Command {
	ElectronicDevices theDevice;
	
	public VolumeUp(ElectronicDevices newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void execute() {
		
		theDevice.volumeUp();
		
	}

	public void undo() {
		
		theDevice.volumeDown();
		
	}
	

}
