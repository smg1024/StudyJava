package ch07.ex03;

public class TV {	// on/off, 채널
	protected boolean power;
	protected int channel;
	
	public void power(boolean power) {
		this.power=power;
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
	
}
