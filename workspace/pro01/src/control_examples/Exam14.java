package control_examples;

/**
 * @Data : 2022. 9. 23
 * @Author : 강사
 * @Description : 2. 반복문
 * 						 2-1) for문 - 다중 for 형식)
 * 							   for(①초기화;②조건식;③증감식){     			 // ② 조건식이 TRUE일 경우 괄호 실행
 * 									for(④초기화;⑤조건식;⑥증감식){
 * 										 ⑦문장들;
 * 										.......
 * 									}
 * 							   }
 *                            참고) ①-②-④-⑤-⑦-⑥-⑤-⑦-⑥-⑤-⑦-⑥-③
 *									  
 *  */

public class Exam14 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++){
			for(int j=1;j<=5;j++){
				System.out.println("i:" + i + "\t" + "j=" + j);
			}
			System.out.println();
		}
		System.out.println();

		for(char i='A';i<='Z';i++){		
			for(char j=i;j<='Z';j++){  
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}
}
