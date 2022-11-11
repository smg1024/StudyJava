package ch02.control;

/*
 * 2. 반복문
 * 		2-3) while 형식
 * 			while(조건식){	// (true)
 * 				실행문;
 * 			}
 * 
 * for문 : 수치반복일때
 * while, do~while : 레코드 단위 데이터 반복 처리, 행위 제어
 * 
 * 		2-4) do~while 형식
 * 			do{
 * 				실행문;
 * 			}while(조건식);
 */

public class Exam14 {
	public static void main(String[] args) {
		
		// while 예
		int x=1;
		while(x<=10) {
			System.out.println("목요일입니다.");
			++x;
		}
		
		int sum=0;
		int y=1;
		while(y<=100) {
			sum += y;
			y++;
		}
		System.out.println(sum);
		
		// do~while 예제
		int a=1;	// 초기화
		do {
			System.out.println(a);
			++a;	// 증감식
		}while(a<=10);	// 조건식
		
		int hap=0;
		int b=1;
		do {
			hap += b;
			b++;
		}while(b<=100);
		System.out.println(hap);
		
	}

}
