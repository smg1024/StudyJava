package ch07.ex03;

public class Ex {

	public static void main(String[] args) {
		CaptionTV cTV1=new CaptionTV(true, 10, true);
		cTV1.channelUp();
		cTV1.display("캡션했습니다!");
		
		CaptionTV cTV2=new CaptionTV(true, 10, false);
		cTV2.channelDown();
		cTV2.display("캡션했습니다!");
	}

}
