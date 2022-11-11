package ch05.object;

public class Temp {
	private int num;
	private float value;
	private String str;
	
	public void disp(int num) {
		this.num=num;
		System.out.println(this.num);
	}
	
	public void disp(float value) {
		this.value=value;
		System.out.println(this.value);
	}
	
	public void disp(String str) {
		this.str=str;
		System.out.println(this.str);
	}
}
