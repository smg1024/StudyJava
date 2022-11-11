package ch05.quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("기간을 입력:");
		int year=sc.nextInt();
		
		System.out.print("대출금입력:");
		int loan=sc.nextInt();
		
		double interestRate=0;
		if(year==7) {
			interestRate=0.0725;
		}else if(year==15) {
			interestRate=0.085;
		}else if(year==30) {
			interestRate=0.09;
		}
		
		int interest=(int) ((loan/(12*year))*interestRate);	// 월이자 계산 방법 모르겠음
		
		System.out.println("대출금: " + loan + "\t월이자: " + interest);
		
		sc.close();
	}

}
