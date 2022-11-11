package ch05.quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("어른 인원 수: ");
		int adult=sc.nextInt();
		System.out.print("청소년 인원 수: ");
		int teen=sc.nextInt();
		System.out.print("어린이 인원 수: ");
		int child=sc.nextInt();
		
		int fee=0;
		
		if(adult>=5) {
			fee=(adult*300)+(teen*200)+(child*50);
			System.out.println("전체 요금은: " + fee + "원입니다.");
		}else {
			fee=(adult*300)+(teen*200)+(child*100);
			System.out.println("전체 요금은: " + fee + "원입니다.");
		}
		
		sc.close();		
		
	}

}
