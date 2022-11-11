package control_examples;

/**
 * @Data : 2022. 9. 23
 * @Author : 강사
 * @Description : 1-2) 조건문 - switch ~ case 형식)
 * 								switch(조건식){		// 조건식 결과가 정수 또는 문자열 즉, 실수 및 논리/관계 연산자는 안됨
 * 									case 값:				
 * 										문장들;
 * 										...
 * 									case 값:
 * 										문장들;
 * 										...
 * 								}
 * 
 */

public class Exam12 {
	public static void main(String[] args) {
		int su=2;
		switch(su){    
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		default : 
			System.out.println("1~5까지만 나옵니다.");
			break;
		}
		System.out.println();
		
		
		String name="홍길동";
		String gread="BB";
		String memberLevel="";
		
		switch(gread){
		case "AA":case "aa":
			memberLevel="정회원";
			break;
		case "BB":case "bb":
			memberLevel="준회원";
			break;	
		case "CC":case "cc":
			memberLevel="손님";
			break;				
		}
		System.out.println(name + "회원님은 " + memberLevel +"입니다." );

		switch(su%2){       // su+10
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
	}
}
