package ch04.function;

public class Exam27 {
	public static void main(String[] args) {
		int su=10;
		System.out.println(++su);
		
		sub(su);	// su=11
		
		int a=10;
		float b=22.5f;
		char c='A';
		String str="apple";
		
		fun(a, b, c, str);	// Call By Value: 블럭 너머로 값을 넘겨주는 방법
	}
	
	public static void sub(int value) {	// value=su=11
		System.out.println("Sub 함수입니다.");
		
		System.out.println(value);
		
		}
	
	public static void fun(int a, float b, char c, String str) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(str);
	}
}
