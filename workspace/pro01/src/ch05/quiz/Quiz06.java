package ch05.quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("성별을 입력해주세요 (M/W) ");
		String str=sc.next();
		char sex=str.charAt(0);
		
		if(sex=='M' || sex=='m') {
			System.out.println("man");
		}else if(sex=='W' || sex=='w') {
			System.out.println("woman");
		}else {
			System.out.println("???");
		}
		
		sc.close();
		
	}

}
