package ch05.quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("3개의 정수를 입력하세요: ");
		int a=sc.nextInt();
		if(a<=10) {
			sum+=a;
		}
		
		int b=sc.nextInt();
		if(b<=10) {
			sum+=b;
		}
		
		int c=sc.nextInt();
		if(c<=10) {
			sum+=c;
		}
		
		System.out.println("10이하의 수의 합은: " + sum + " 입니다.");
		
		
		sc.close();
	}

}
