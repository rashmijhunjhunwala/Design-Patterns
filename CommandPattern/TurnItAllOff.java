
import java.util.List;

public class TurnItAllOff implements Command {
  List<ElectronicDevices> theDevices;
 
  public TurnItAllOff(List<ElectronicDevices> newDevices) {
	  theDevices = newDevices;
  }
 
  public void execute() {
 
    for (ElectronicDevices device : theDevices) {
      device.off();
    }
 
  }

  public void undo() {
	
	for (ElectronicDevices device : theDevices) {
	      device.on();
	    }
	
  }
}