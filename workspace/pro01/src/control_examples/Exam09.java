package control_examples;

/**
 * @Data : 2022. 9. 23
 * @Author : 강사
 * @Description : 1-1) 조건문 - if~else 형식) 
 * 				if(조건식){			// 조건식 true      
 * 					문장들;
 * 					....
 * 				}else{					// 조건식 false
 * 					문장들;
 * 					....
 * 				}
 */

public class Exam09 {
	public static void main(String[] args) {
		int a=-25;
		
		if(a>0)
			System.out.println("양수입니다.");
		else
			System.out.println("음수입니다.");   
		
		// 삼항식 표현
		String str=a>0 ? "양수":"음수";
		System.out.println(str + "입니다.");

		if(a%2==0){
			a+=100;
			System.out.println("짝수입니다." + a);
		}else{
			a*=200;
			System.out.println("홀수입니다." + a);
		}
		
		String name="홍길동";
		int age=27;
		if(age>=20 && age<30){
			System.out.println("저는" + name + "입니다." + age + "대라서 행복합니다.");
		}else{
			System.out.println("20대가 아닙니다.");
		}
	}
}











