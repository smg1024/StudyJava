package ch02.control;

import java.util.Scanner;

public class Exam19 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char loop=0;
		
		do {
			System.out.print("구구단의 단을 입력하세요: ");
			int dan=sc.nextInt();
			
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" + (dan*i));
			}
			System.out.print("또 하시겠습니까? (Y/N) ");
			String str=sc.next();
			loop=str.charAt(0);
			
		}while(loop == 'Y' || loop == 'y');
		
		System.out.println("어렵지만 해냈습니다!!");
		
		
		
		
		
		
		sc.close();
	}

}
