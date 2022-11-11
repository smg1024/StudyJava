package ch08.ex02;

public class Television implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Turn on TV");		
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off TV");		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME)	{
			volume=MAX_VOLUME;
		}else if(volume < MIN_VOLUME) {
			volume=MIN_VOLUME;
		}
		
		this.volume=volume;
		System.out.println("Volume: " + this.volume);
	}
	
}
