package ch06.object;

public class Number {
	private int a;
	private float b;
	
//	함수로 데이터 전달하는 방법
//	public void input(int a, float b) {
//		this.a=a;
//		this.b=b;
//	}
	
//	생성자로 데이터 전달하는 방법
	public Number(int a, float b) {
		this.a=a;
		this.b=b;
	}
	
	public void disp() {
		System.out.println(a + "\t" + b);
	}
}