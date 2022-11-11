package ch05.quiz;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int pos=0;
		int neg=0;
		
		for(int i=0; i<10; i++) {
			System.out.print("수를 입력하세요: ");
			int num=sc.nextInt();
			if(num<0) {
				neg++;
			}else if(num>0) {
				pos++;
			}
		}
		System.out.println("양수개수: " + pos);
		System.out.println("음수개수: " + neg);
		
		sc.close();
	}

}
