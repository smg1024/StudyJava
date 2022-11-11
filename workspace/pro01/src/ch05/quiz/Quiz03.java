package ch05.quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력하세요:");
		int i=sc.nextInt();
		System.out.print("수를 입력하세요:");
		int j=sc.nextInt();
		
		if(i>j) {
			System.out.println(i);
		}else if(j>i) {
			System.out.println(j);
		}
		
		sc.close();
		
	}

}
