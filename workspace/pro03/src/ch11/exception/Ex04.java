package ch11.exception;

import java.util.Scanner;

// Exception : 예외발생 ~ 처리

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("x: ");
			int x=sc.nextInt();
			
			System.out.print("y: ");
			int y=sc.nextInt();
			
			int z=x/y;
			System.out.println("z: " + z);
		}catch(Throwable e) {	// 대부분 에러들이 Throwable을 상속받기 때문에 뭉뚱그려서 이렇게 표현해줄 수 있다. 다만 에러의 종류가 세분화되어있지 않음
			System.out.println("에러가 발생하였습니다.");
		}finally {
			System.out.println("finally===========");	// 에러 여부과 관계없이 항상 들른다, close()의 역할을 한다
		}
		
		sc.close();
	}

}
