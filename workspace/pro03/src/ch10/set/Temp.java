package ch10.set;

public class Temp {		// static, final - 함수
	private int x=10;
	private static int y=20;
	
	public void aa() {
		apple();	// this.apple();
		bb();		// Temp.bb();
		System.out.println(x + "\t" + y);
	}
	
	public static void bb() {
//		apple();	static에서 일반 멤버변수 및 일반 함수 접근 불가
//		System.out.println(x + "\t" + y);
		banana();
	}
	
	public final void cc() {	// 상속 시 함수 재정의가 안된다.
		apple();	// this.apple();
		bb();		// Temp.bb();
	}
	
	public static final void banana() {		// 상속 시 재정의 안됨, 클래스명으로 접근 가능
		
	}
	
	public void apple() {
		System.out.println("금요일!");
	}
}
