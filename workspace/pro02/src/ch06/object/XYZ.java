package ch06.object;

// 변수 : 멤버변수, 지역변수, static 변수, final 상
// 함수 : 함수중복
// 생성자 : 생성자중복
public class XYZ {

	
	private int su;
	public final float PI=31.1415f;
	
//	static : 프로그램 종료될때까지 메모리에 남아있음
//	final : 값이 절대 바뀌지 않음
	public static final int VALUE=12;
	
	public XYZ(int su) {
		this.su=su;
	}
	
	public void sub() {
		++su;
		
		int value=10;
		final int NUM=22;
		
		++value;
//		++Num;	ERROR
		
		System.out.println(NUM);
		System.out.println(PI);
		System.out.println(value);
	}
	
	public void disp() {
		System.out.println(su);
		System.out.println(PI);
//		System.out.println(NUM);	ERROR
	}
}
