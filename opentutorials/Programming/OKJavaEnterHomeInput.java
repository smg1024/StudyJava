import org.opentutorials.iot.Aircon;
import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaEnterHomeInput {

	// parameter (매개변수)
	public static void main(String[] args) {
		
		String id = args[0];
		String bright = args[1];

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
		
		DimmingLights moodLamp = new DimmingLights(id+" Lamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
		// A/C on
		Aircon livingroomAC = new Aircon(id+" / Living Room A/C");
		livingroomAC.on(24);
		
	}

}
