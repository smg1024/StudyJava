import org.opentutorials.iot.Aircon;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaEnterHome {

	public static void main(String[] args) {
		
		String id = "Samhwan APT 1005";
		
		// Call Elevator
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting livingroomLamp = new Lighting(id+" / Living Room Lamp");
		livingroomLamp.on();
		
		Lighting bedroomLamp = new Lighting(id+" / Bedroom Lamp");
		bedroomLamp.on();
		
		// A/C on
		Aircon livingroomAC = new Aircon(id+" / Living Room A/C");
		livingroomAC.on(24);
		
	}

}
