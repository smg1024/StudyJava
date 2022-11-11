package ch02.control;

/* 조건문 - if 형식)
 * if(조건식){		// 관계연산자, 논리연산자 숙지 필수!!
 * 		문장들;
 * 		...
 * 		...
 * }
 * 
 * 조건문 - if ~ else 형식) 삼항연산자랑 비슷
 * if(조건식){		if(1)일때
 * 		문장들;
 * 		...
 * 		...
 * }else{			if(0)일때
 * 		문장들;
 * 		...
 * }
 * 
 */

public class Exam08 {

	public static void main(String[] args) {

		int a=-24;
		
		if(a>0) {		// -24 > 0 --> if(0) --> don't run
			System.out.println(a + "는 양수입니다.");
		}else {
			System.out.println(a + "는 음수입니다.");
		}
		
		if(a%2==0) {
			a+=100;
			System.out.println(a + "짝수입니다.");
		}else {
			a*=200;
			System.out.println(a + "홀수입니다.");
		}
		
		String name="홍길동";
		int age=27;
		
		if(age>=20 && age<=30) {	// 27 >= 20 && 27 <= 30 --> if(1) --> run
			System.out.println("저는 " + name + "입니다. " + age + "살이라서 행복합니다.");
		}else {		// 27 >= 20 && 27 <= 30 
			System.out.println("저는 20대가 아닙니다.");
		}
		
		
	}

}
