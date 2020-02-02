
import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
	public static void main(String args[])
	{
		ElectronicDevices newDevice=TVRemote.getDevice();
		Command turnItOn=new TurnOn(newDevice);
		DeviceButton onPressed=new DeviceButton(turnItOn);
		onPressed.press();
		onPressed.undo();
		
		Command turnItOff=new TurnOff(newDevice);
		onPressed=new DeviceButton(turnItOff);
		onPressed.press();
		onPressed.undo();
		
		Command turnVolumeUp=new VolumeUp(newDevice);
		onPressed=new DeviceButton(turnVolumeUp);
		onPressed.press();
		onPressed.press();
		onPressed.undo();
		
		Command turnVolumeDown=new VolumeDown(newDevice);
		onPressed=new DeviceButton(turnVolumeDown);
		onPressed.press();
		onPressed.press();
		onPressed.undo();
		
		ElectronicDevices radio=new Radio();
		List<ElectronicDevices> allDevices = new ArrayList<ElectronicDevices>();
		allDevices.add(radio);
		allDevices.add(newDevice);
		
		TurnItAllOff turnItAllOff=new TurnItAllOff(allDevices);
		turnItAllOff.execute();
		turnItAllOff.undo();
		
		
		
		
	}

}
