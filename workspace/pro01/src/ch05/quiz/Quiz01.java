package ch05.quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("1과 2중 하나를 선택하여 입력하세요:");
		int i=sc.nextInt();
		
		switch(i) {
		case 1:
			System.out.println("남성");
			break;
		case 2:
			System.out.println("여성");
			break;
		}
		sc.close();
		
		
	}

}
