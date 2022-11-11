package ch04.function;

public class Exam31 {
	public static void main(String[] args) {
		// Call by Value ~ Return
		int a=sub1();
		System.out.println("a: " + a);
		
		float b=sub2();
		System.out.println("b: " + b);
		
		String c=sub3();
		System.out.println("c: " + c);
		
		int d=sub4(10, 20);
		System.out.println("d: " + d);
		
	}
	
	public static int sub1() {
		int x=10;
		return x;
	}
	
	public static float sub2() {
		float y=22.2f;
		return y;
	}
	
	public static String sub3() {
		return "apple";
	}
	
	public static int sub4(int a, int b) {
		return a+b;
	}
}
