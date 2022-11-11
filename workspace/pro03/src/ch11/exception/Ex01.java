package ch11.exception;

import java.util.Scanner;

/*
 * Exception : 예외발생 ~ 처리
 * 			   예외전가
 * 			   예외만들기
 * 
 * 에러가 떴을때의 경우에 어떻게 할 건지 코딩한다
 */


public class Ex01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("x: ");
		int x=sc.nextInt();
		
		System.out.print("y: ");
		int y=sc.nextInt();
		
		try {
			int z=x/y;
			System.out.println("z: " + z);
		}catch (ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
//			e.printStackTrace();
//			System.out.print(e.getMessage());
		}
		
		sc.close();
	}

}
