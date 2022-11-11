package ch01.dataType;
/*
 * 	(3) 산술 연산자 : * / % + -
 */
public class Exam04 {

	public static void main(String[] args) {

		int x=10;
		int y=20;
		int sum=x+y;
		int sub=x-y;
		int mul=x*y;
		float div=(float) x/y;
		int rem=x%3;	// 나머지
		
		System.out.println("합: " + sum);
		System.out.println("차: " + sub);
		System.out.println("곱: " + mul);
		System.out.println("나누기: " + div);
		System.out.println("나머지: " + rem);
		
		System.out.println("" + 10 + 30);	// 1030
		System.out.println("합: "+ (10 + 30));	// 합: 40
		
		// 내 소스에 입출력되는 데이터는 모두 문자열이다
		
	}

}
