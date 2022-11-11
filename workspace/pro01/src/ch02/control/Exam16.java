package ch02.control;

/*
 * 데이터를 담아준다.
 * 
 */

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// 나의 소스 Exam16 밖에서 들어오는 것 다 문자열, 나가는 것도 문자열
		System.out.println("수를 입력하세요:");
		String a=sc.next();
		
		System.out.println("수를 입력하세요:");
		int b=sc.nextInt();
		
		System.out.println("수를 입력하세요:");
		double c=sc.nextDouble();
		
		System.out.println("수를 입력하세요.");
		short d=sc.nextShort();
		
		// char, String Y
		System.out.println("문자 입력하세요.");
		String str=sc.next();
		char ch=str.charAt(0); // String을 char로 바꿔
		
		
		System.out.println("a: " + a);
		System.out.println(++b);
		System.out.println(++c);
		System.out.println(++d);
		System.out.println(ch);
		
		sc.close();
		
	}

}
