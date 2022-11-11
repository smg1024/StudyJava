package ch02.control;

/*
 * 제어문
 * 1. 조건문
 * 		1) if, if~else, if~else if - 삼항연산자, switch~case 대체 가
 * 		2) switch~case
 * 
 * 2. 반복문
 * 		1) for : 단일 for, 다중 for
 * 		2) while
 * 		3) do ~ while
 * 		4) break, continue
 */

public class Exam07 {

	public static void main(String[] args) {
		
		/* 조건문 - if 형식)
		 * if(조건식){		// 관계연산자, 논리연산자 숙지 필수!!
		 * 		문장들;
		 * 		...
		 * 		...
		 * }
		 */
		
		int x=2;
//		boolean y=x>10;
//		int su=x>10 ? x:2;
		if(x>10) {		// 20 > 10 --> if(1) --> run
			System.out.println("10보다 큰 수입니다.");
			System.out.println("x: " + x);		// x: 20
		}	// 조건이 true일때만 실행된다
		System.out.println("오늘은 힘들고 어려워요! 하지만 재밌습니다!\n");
		
		int y=50;
		if(y>0 && y<100) {		// 50 > 0 && 50 < 100 --> if(1) --> run
			y+=200;		// y=y+200
			System.out.println(y + "\n");
		}
		
		int num=52;
		int value=24;
		if(num>value) {		// 52 > 24 --> if(1) --> run
			System.out.println("num > value");
		}
		
		if(num==value) {	// 52 == 24 --> if(0) --> don't run
			System.out.println("num == value");
		}
		
		if(num<value) {		// 52 < 24 --> if(0) --> don't run
			System.out.println("num < value");
		}
		
		int su=20;
		if(su%2 == 0) {		// 20을 2로 나눈 후 나머지가 0 --> if(1) --> run
			System.out.println("짝수입니다.");
		}
		
		if(su%2 != 0) {		// 20을 2로 나눈 후 나머지가 1 --> if(0) --> run
			System.out.println("홀수입니다.");
		}
	}

}














