package ch07.ex04;

public class Son extends Parents {
	private char z;
	
	public Son() {
		super();	// 부모의 default 생성자를 쓴다 Parents()
		this.z='A';
	}
	
	public Son(int x, int y, char z) {
		super(x, y);
		this.z=z;
	}
	
	public void disp() {
		System.out.println(x + "\t" + y + "\t" + z);
	}
}
