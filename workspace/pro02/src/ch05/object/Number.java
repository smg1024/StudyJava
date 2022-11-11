package ch05.object;

public class Number {
	
	private int a;
	private float b;
	private float c;
	
	public void input(int a, float b) {
		this.a=a;
		this.b=b;
	}
	
	public void calculation() {
		c=a+b;
	}
	
	public void disp() {
		System.out.println(a + "\t" + b + "\t" + c);
	}

}
