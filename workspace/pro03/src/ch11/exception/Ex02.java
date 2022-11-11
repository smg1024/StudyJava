package ch11.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// Exception : 예외발생 ~ 처리

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("x: ");
			int x=sc.nextInt();
			
			System.out.print("y: ");
			int y=sc.nextInt();
			
			int z=x/y;
			System.out.println("z: " + z);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(InputMismatchException e) {
			System.out.println("정수만 입력하세요.");
		}finally {
			System.out.println("finally===========");	// 에러 여부과 관계없이 항상 들른다, close()의 역할을 한다
		}
		
		sc.close();
	}

}
