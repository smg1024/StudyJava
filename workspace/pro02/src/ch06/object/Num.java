package ch06.object;

// 변수 : 지역변수, static, final, static final
// 함수, 함수중복
// 생성자, 생성자중복

public class Num {
	public int a;
	public int b;
	public static int c;
	
	public void apple() {   
		int su=10;       // 지역변수
		System.out.println(su);
		// System.out.println(value);  ERROR

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public void banana(int value) {    // 지역변수
		System.out.println(value);
		// System.out.println(su);    ERROR
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// System.out.println(su);    ERROR
		// System.out.println(value);  ERROR
	}
}
