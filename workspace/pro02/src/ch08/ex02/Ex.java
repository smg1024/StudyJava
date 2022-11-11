package ch08.ex02;

public class Ex {

	public static void main(String[] args) {
		RemoteControl rc=null;
		
		rc=new Television();
		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
		
		rc=new Audio();
		rc.turnOn();
		rc.setVolume(-15);
		rc.turnOff();
	}

}
