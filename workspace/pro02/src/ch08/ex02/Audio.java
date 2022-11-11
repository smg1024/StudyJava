package ch08.ex02;

public class Audio implements RemoteControl {	// MAX_VOLUME, MIN_VOLUME
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Turn on audio");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off audio");
	}

	@Override
	public void setVolume(int volume) {	// setVolume(9)
		if(volume > MAX_VOLUME) {
			volume=MAX_VOLUME;
		}else if(volume < MIN_VOLUME) {
			volume=MIN_VOLUME;
		}
		this.volume=volume;
		System.out.println("Volume: " + this.volume);
	}
	
	

}
