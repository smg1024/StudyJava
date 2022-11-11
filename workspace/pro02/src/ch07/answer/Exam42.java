package ch07.answer;

/**
 * @Data : 2022. 9. 27
 * @Author : 강사
 * @Description : 상속
 */

class TV{
	protected boolean power;			// 전원상태, Television 
	protected int channel;				// 채널
	
	public void power(boolean power){
		this.power=power;
	}
	
	public void channelUP(){
		++channel;
	}
	
	public void channelDown(){
		--channel;
	}
}

class CaptionTV extends TV{
	private boolean caption;
	
	public CaptionTV(){ }
	
	public CaptionTV(boolean power, int channel, boolean caption){
		super.power=power;
		super.channel=channel;
		this.caption=caption;
	}
	
	public void display(String text){
		if(power && caption){
			System.out.println(channel + "\t" + text);
		}else{
			System.out.println("power 또는 caption을 켜세요" );
		}
	}
}

public class Exam42 {
	public static void main(String[] args) {
		CaptionTV ct=new CaptionTV(true, 10, true);
		ct.channelUP();
		ct.display("캡션을 보여줍니다.");
		
		CaptionTV cta=new CaptionTV(true, 10, false);
		cta.channelDown();
		cta.display("캡션을 보여줍니다.");
	}
}
