package ch05.quiz;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		int a=sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int b=sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요: ");
		int c=sc.nextInt();
		
		int biggest=0;
		
		if(a>=b || a>=c) {
			biggest=a;
		}
		if(b>=c || b>=a){
			biggest=b;
		}
		if(c>=a || c>=b) {
			biggest=c;
		}
		
		System.out.println("셋 중 가장 큰 숫자는 " + biggest + "입니다.");
		
		sc.close();
	}

}
