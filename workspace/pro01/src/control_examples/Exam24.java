package control_examples;

/**
 * @Data : 2022. 9. 24
 * @Author : 강사
 * @Description :  함수 - Call by Name
 */

public class Exam24 {
	public static void main(String[] ar){
		for(int i=1;i<=5;i++){
			sub();
		}
		System.out.println("end!!");
	}
	
	public static void sub(){
		System.out.println("안녕하세요.");
	}
}
