package ch02.control;

/*
 * 2. 반복문
 * 		2-1) for문 형식
 * 			for(초기화: 조건식; 증감식){
 * 				문장들;
 * 				...
 * 			}
 * 			처리 순서: 초기화->(조건식->문장들->증감식)->반복
 */

public class Exam12 {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {	// 1 <= 10 --> run --> i++ --> 2 <= 10 --> run ....
			System.out.println("목요일입니다.");
		}
		System.out.println();
		
		for(int i=1; i<=10; i+=2) {	// 5번 반복
			System.out.println("목요일인가요?");
		}
		System.out.println();
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		for(int i=1; i<=100; i++) {
			if(i>50 && i<70) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int i=100; i<=200; i++) {
			if(i>150 && i<200) {
				sum1 = sum1 + i;
			}
		}
		System.out.println(sum1);
		
	}

}
