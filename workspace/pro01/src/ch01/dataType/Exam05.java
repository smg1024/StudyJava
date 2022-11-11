package ch01.dataType;
/*
 * 	(4) 시프트 연산자 : << >> >>>	(진도 포함X)
 * 	(5) 비교 연산자 : < > <= >= == !=
 */
public class Exam05 {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		boolean c=a>b;	// 10 > 20 -> false
		boolean d=a<b;	// 10 < 20 -> true
		boolean e=a>=b;	// 10 >= 20 -> false
		boolean f=a<=b;	// 10 <= 20 -> true
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f + "\n");
		
		int x=100;
		int y=200;
		boolean z=x==y;		// 100 == 200 -> false
		boolean zz=x!=y;	// 100 != 200 -> true
		System.out.println(z);
		System.out.println(zz + "\n");

	}

}
