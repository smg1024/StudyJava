package ch05.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하세요 >>> ");
		int num=sc.nextInt();
		
		if(num%10==3 || num%10==6 || num%10==9) {
			if(num%30==3 || num%30==6 || num%30==9) {
				System.out.println("박수 짝짝");
			}else {
				System.out.println("박수 짝");
			}
		}else if((num>=30 && num<40) || (num>=60 && num<70) || (num>=90 && num<100)) {
			System.out.println("박수 짝");
		}
		
		
//		for(int i=0; i<10; i++) {
//			if(num==3+(i*10) || num==6+(i*10) || num==9+(i*10) || (num>=30 && num<40) || (num>=60 && num<70) || (num>=90 && num<100)) {
//				if(num==3+((i+1)*30) || num==6+((i+1)*30) || num==9+((i+1)*30)) {
//					System.out.println("박수 짝짝");
//					break;
//				}else {
//					System.out.println("박수 짝");
//					break;
//				}
//			}else {
//				System.out.println("박수 없음");
//				break;
//			}
//		}
		
		sc.close();
		
	}

}
