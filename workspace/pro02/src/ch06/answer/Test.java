package ch06.answer;

public class Test {    // 클래스 : 변수(지역변수, static변수 final 상수), 함수(함수중복), 생성자(생성자중복)
	private int x;   // this=s	
	private int y;
	
	public Test() {   // 
		x=0;
		y=0;
	}
	
	public Test(int x, int y) {   // 10, 20
		this.x=x;
		this.y=y;
	}
	
	public Test(int x) {   // 77
		this.x=x;
		y=88;
	}
	
	public void disp() {
		System.out.println(x + "\t" + y);   // 77 88
	}
}
