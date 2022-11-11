package ch05.quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력하세요:");
		int i=sc.nextInt();
		
		if(i>10 && i<20) {
			System.out.print(i);
		}
		
		sc.close();
	}

}
