package ch05.quiz;

import java.util.Scanner;

public class Quiz05 {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("몸무게를 입력하세요: ");
		int weight=sc.nextInt();
		System.out.print("키를 입력하세요: ");
		int height=sc.nextInt();
		
		double bmi=(height-100)*0.9;
		
		if(weight>bmi) {
			System.out.println("비만입니다. 다이어트하세요!");
		}else {
			System.out.println("정상입니다. 건강하시네요!");
		}
		
		sc.close();
		
		
	}
}
