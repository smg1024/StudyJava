package control_examples;

/**
 * @Data : 2022. 9. 23
 * @Author : 강사
 * @Description : 2. 반복문 - while문, do~while문 차이
 *
 *  */

public class Exam16 {
	public static void main(String[] args) {
		int x=10;
		
		while(x>50){
			System.out.println("while x:" + x);
		}
		
		do{
			System.out.println("do x:" + x);
		}while(x > 50);
	}
}
