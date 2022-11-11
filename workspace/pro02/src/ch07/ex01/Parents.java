package ch07.ex01;

public class Parents {
	protected int x;	// 외부에서 접근은 막으면서 상속은 해주는 protected 제한자
	protected int y;
	protected char z;
	
	public void sub() {
		System.out.println("화요일입니다.\n");
	}
}
