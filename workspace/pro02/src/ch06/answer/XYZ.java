package ch06.answer;

public class XYZ {
		// 변수 : 멤버변수, 지역변수, static 변수, final 상수
		// 함수 : 함수중복
		// 생성자 : 생성자 중복
	
	private int su;
	public final float PI=3.1415f;
	
	// static : 프로그램 종료될때까지 살아있다. (메모리 존재)
	//           클래스명으로 접근한다.
	// final : 치환 완됨 (값이 바뀌지 말아야한다.)
	public static final int VALUE=12;     
	
	
	public XYZ(int su) {
		this.su=su;
	}
	
	public void sub() {
		++su;
		
		int value=10;
		final int NUM=22;
		
		value=77;
		// NUM=33;  ERROR
		
		System.out.println(NUM);
		System.out.println(PI);
		
	}
	
	public void disp() {
		System.out.println(su);
		System.out.println(PI);
		// System.out.println(NUM);  ERROR
	}
	
	// 4시 10분 시작합니다. 
}













