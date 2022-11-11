package ch07.ex06;

public class Son extends Parents {	// aa()~disp()까지 무조건 받음
	
	// 함수재정의(Overriding)
	public void disp() {
		System.out.println("Son Class");
	}
}
