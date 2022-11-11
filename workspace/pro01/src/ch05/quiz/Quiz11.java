package ch05.quiz;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("몇개의 수를 입력받겠습니까? ");
		int loop=sc.nextInt();
		int sum=0;
		
		for(int i=0; i<loop; i++) {
			System.out.print("수를 입력하세요: ");
			int num=sc.nextInt();
			sum+=num;
		}
		double avg=(double) sum/loop;
		
		System.out.println("sum: " + sum + "\t" + "avg: " + avg);
		
		sc.close();
	}

}
