package control_examples;

/**
 * @Data : 2022. 9. 24
 * @Author : 강사
 * @Description :  함수 - Call by Name
 */

public class Exam25 {
	public static void main(String[] ar){
  		sub();
		System.out.println("hahaha");
		sub();
		System.out.println("hohoho");
		System.out.println("end!");
	}
	
	public static void sub(){
   		System.out.println("안녕하세요");
	}
}
