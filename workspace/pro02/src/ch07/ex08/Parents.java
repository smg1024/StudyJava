package ch07.ex08;

public abstract class Parents {	//추상클래스
	protected int x;
	protected int y;
	
	public void msg() {
		System.out.println("hahaha");
	}
	
	public abstract void disp();	// 추상함수 - 함수선언, 반드시 재정의가 필요함
	
//	Parents a=new Parents();
//	Parents b=new Son();
//	b.msg();
//	b.disp();
//	b.apple();
	
}
