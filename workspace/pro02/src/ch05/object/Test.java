package ch05.object;

public class Test {
	private int a;		// 변수는 private 90%
	private int b;
	private int c;
	
	public int getA() {	// 함수는 public 90%
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}				// Source -> Generate Getters and Setters
	
	
}
