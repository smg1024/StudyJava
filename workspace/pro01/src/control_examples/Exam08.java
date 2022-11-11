package control_examples;

/**
 * @Data : 2022. 9. 23
 * @Author : 강사
 * @Description :  제어문
 * 			1. 조건문
 * 				1) if, if~else, if~else if
 * 				2) switch
 * 
 * 			2. 반복문
 * 				1) for문 - 단일 for, 다중 for
 * 				2) while
 * 				3) do~while
 * 				4) break, continue
 * 
 * 
 * 			1) 조건문 - if 형식) 
 * 				if(조건식){       			// 조건식 true이면 괄호안 문장들 실행
 * 					문장들;
 * 					....
 * 				} 
 * 				
 */

public class Exam08 {
	public static void main(String[] args) {
		int x=20;
		if(x>10) {
			System.out.println("10보다 큰수입니다.");
		}
		System.out.println();
		
		int y=110;
		if(y>0 && y<100){
			y+=200;
			System.out.println("y:" + y);
		}
		System.out.println();
		
		int num=52;
		int value=24;
		if(num > value){
			System.out.println("num가 value보다 크다.");
		}
		if(num == value){
			System.out.println("num와 value가 같다.");
		}
		if(num > value){
			System.out.println("num가 value보다 작다. \n");
		}
		System.out.println();
		
		
		int su=20;
		if(su%2==0){
			System.out.println("짝수입니다.");
		}
		if(su%2 !=0){
			System.out.println("홀수입니다.");
		}
	}
}
