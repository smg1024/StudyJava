package ch07.ex03;

public class CaptionTV extends TV {	// on/off, 채널, 캡션
	// power, channel, power(), channelUp(), channelDown()
	
	private boolean caption;
	
	public CaptionTV(boolean power, int channel, boolean caption) {
		super.power=power;
		super.channel=channel;
		this.caption=caption;
	}
	
	public void display(String text) {
		if(power && caption) {	// if(1 && 1)
			System.out.println(channel + "\t" + text);
		}else {
			System.out.println("전원 또는 캡션을 켜야합니다.");
		}
	}
}
