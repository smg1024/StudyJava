package ch05.quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("영문자를 입력하세요: ");
		String alphabet=sc.next();
		char a=alphabet.charAt(0);
		
		if(a>=65 && a<=90) {
			System.out.println((char) (a+32));
		}else if(a>=97 && a<=122) {
			System.out.println((char) (a-32));
		}
		
		sc.close();
		
	}

}
