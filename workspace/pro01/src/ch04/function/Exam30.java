package ch04.function;

public class Exam30 {
	public static void main(String[] args) {
		
		sub();
		fun(10, 20);
		
		String str=apple();
		System.out.println(str);
		
		int su=10;
		int value=20;
		int hap=sum(su, value);
		System.out.println("sum: " + hap);
	}
	
	public static int sum(int su, int value) {
		int hap=su+value;
		return hap;
	}
	
	public static void sub() {
		System.out.println("sub Fun");
	}
	
	public static void fun(int a, int b) {
		System.out.println(a + "\t" + b);
	}
	
	public static String apple() {
		String str="곧 점심시간입니다~";
		System.out.println(str);
		
		return str;
	}
}
