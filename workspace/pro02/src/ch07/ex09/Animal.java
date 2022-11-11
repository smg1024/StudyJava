package ch07.ex09;

public abstract class Animal {
	protected String kind;
	
	public void breathe() {	// 재정의할 필요 없음
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
	
}
