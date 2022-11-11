package ch04.function;

// 함수끼리 데이터 주고 받기

public class Exam28 {
	public static void main(String[] args) {
		
		sub(10, 20, 30);
		fun(77, 88, 88.5, "apple", "banana");
		
	}
	
	public static void sub(int a, int b, int c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void fun(int a, int b, double c, String s, String ss) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(s);
		System.out.println(ss);
	}

}
