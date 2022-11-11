package ch07.robot;

class AA{
	private final int VALUE=20;
	
	public void apple() {
		System.out.println("apple Function");
	}
	
	public void aa() {
		final int NUM=10;
		System.out.println(NUM);
		System.out.println(VALUE);
	}
	
	public final void bb() {	// 재정의 불가
		System.out.println("bb Function");
	}
}

class BB extends AA{
	public void apple() {
		System.out.println("override apple function");
	}
	public void banana() {
		System.out.println("banana Function");
	}
}
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
