package ch05.object;

public class Value {
	private int x;
	private float y;
	private char a;
	private String b;
	
	public void input(int x, float y, char a, String b) {
		this.x=x;
		this.y=y;
		this.a=a;
		this.b=b;
	}
	
	// 함수중복(overload) : 함수 기능이 비슷한 함수의 이름을 같게 하는 것
	//		규칙 : 함수 이름이 같고, 매개변수 타입과 개수가 다
	public void calc(int num) {
		x+=num;
		System.out.println(x);
	}
	
	public void calc(float num) {
		y+=num;
		System.out.println(y);
	}
	
	public void calc(int su, float num) {
		x+=su;
		y+=num;
		System.out.println(x + "\t" + y);
	}
	
	public void disp() {
		System.out.println(a + "\t" + b);
	}
}
