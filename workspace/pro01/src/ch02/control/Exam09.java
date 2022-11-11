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
 * 조건문 - if ~ else if 형식)
 * if(조건식){
 * 		문장들;
 * 		...
 * }else if(조건식){
 * 		문장들;
 * 		...
 * }else{
 * 		문장들;
 * 		...
 * }
 * 
 */

public class Exam09 {

	public static void main(String[] args) {
		// 학년 예
		int value=3;
		
		if(value==1) {			// 3 == 1 --> if(0) --> don't run
			System.out.println("1학년입니다.");
		}else if(value==2) {	// 3 == 2 --> if(0) --> don't run
			System.out.println("2학년입니다.");
		}else if(value==3) {	// 3 == 3 --> if(1) --> run
			System.out.println("3학년입니다.");
		}else if(value==4) {
			System.out.println("4학년입니다.");
		}
		
		System.out.println("점심시간이다!\n");
		
		String name="홍길동";
		int kor=70;
		int eng=80;
		int mat=90;
		int tot=kor+eng+mat;	// 80
		float avg=(float)tot/3;
		
		/* if(avg>90) {			// 80 > 90 --> if(0) --> don't run
			System.out.println(name + " : 수");
		}else if(avg>=80) {		// 80 >= 80 --> if(1) --> run
			System.out.println(name + " : 우");
		}else if(avg>=70) {
			System.out.println(name + " : 미");
		}else if(avg>=60) {
			System.out.println(name + " : 양");
		}else {
			System.out.println(name + " : 가");
		} */
		
		// 성적표 예
		char grade=0;		// byte, short, int, long, char 초기값 0 / 실수형 0.0 / 문자형 0 / 문자열 null
		if(avg>=90) {
			grade='수';
		}else if(avg>=80) {
			grade='우';
		}else if(avg>=70) {
			grade='미';
		}else if(avg>=60) {
			grade='양';
		}else {
			grade='가';
		}
		System.out.println(name + " : " + grade);
		

	}

}
