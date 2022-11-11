package ch05.quiz;

import java.util.Scanner;

public class Quiz15 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char factor=0;
		
		do {
			System.out.print("수를 입력하세요: ");
			int num1=sc.nextInt();
			System.out.print("부호를 입력하세요(+, -, *, /): ");
			String str=sc.next();
			factor=str.charAt(0);
			System.out.print("수를 입력하세요: ");
			int num2=sc.nextInt();
			
			int result=0;
			
			if(factor == '+') {
				result=num1+num2;
				System.out.println(num1 + "+" + num2 + "=" + result);
				break;
			}else if(factor == '-') {
				result=num1-num2;
				System.out.println(num1 + "-" + num2 + "=" + result);
				break;
			}else if(factor == '*') {
				result=num1*num2;
				System.out.println(num1 + "*" + num2 + "=" + result);
				break;
			}else if(factor == '/') {
				result=num1/num2;
				System.out.println(num1 + "/" + num2 + "=" + result);
				break;
			}
			
			
		}while(factor != '+' || factor != '-' || factor != '*' || factor != '/');
		
		sc.close();
	}
}
