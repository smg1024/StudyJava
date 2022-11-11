package ch07.ex01;

public class Son extends Parents {	// x, y, z, sub()를 상속받음
	private int a;
	private int b;
	
	public Son(int x, int y, char z, int a, int b) {
		super.x=x;	// super.x도 가능하다
		super.y=y;	// this.y=y;
		super.z=z;	// this.z=z;
		
		this.a=a;
		this.b=b;
	}
	
	public void disp() {
		System.out.println(x);	// private은 상속을 안해준다
		System.out.println(this.x);
		System.out.println(super.x);	// super는 부모의 것
		
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(super.y);
		
		System.out.println(z);
		System.out.println(this.z);
		System.out.println(super.z);
		
		System.out.println(a);
		System.out.println(b);
	}
}
