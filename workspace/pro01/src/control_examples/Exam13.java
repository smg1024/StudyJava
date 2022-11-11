package control_examples;

/**
 * @Data : 2022. 9. 23
 * @Author : 강사
 * @Description : 2. 반복문
 * 						 2-1) for문 - 단일 for 형식)
 * 							   for(①초기화;②조건식;③증감식){     			 // ② 조건식이 TRUE일 경우 괄호 실행
 * 									④ 문장들;
 * 									.......
 * 							   }
 *                            참고) ①-②-③-④ 
 *									  ②-③-④  ②-③-④  ②-③-④  반복실행 
 *  */

public class Exam13 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){					// for문 블럭안 10번 실행
			System.out.println("How are  you?");
		}
		System.out.println();
		
		for(int j=10;j >=1;j--){					// for문 블럭안 10번 실행
			System.out.println("How are  you?");
		}
		System.out.println();
	
		for(int k=1;k<=10;k++){
			System.out.println(k);
		}
		System.out.println();
		
		for(int x=1;x<=100;x++){
			System.out.print(x + "\t");
			if(x%10==0)
				System.out.println();
		}
		System.out.println();
		
		int hap=0;
		for(int i=1;i<=10;i++){
			hap=hap+i; 		
		}
		System.out.println("hap:" + hap);
		
		int sum=0;
		for(int i=100;i<=200;i++){
			if(i>150 && i <200)
				sum+=i;		
		}
		System.out.println("sum:" + sum);
	}
}
