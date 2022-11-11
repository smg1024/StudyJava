package control_examples;

/**
 * @Data : 2022. 9. 23
 * @Author : 강사
 * @Description : Keyboard 입력
 * 
 *                      자바의 정석 : 4장 - 조건문, 반복문 
 *  */

import java.util.Scanner;

public class Exam19 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char loop=0;
		
		do{
			System.out.print("단을 입력하세요:");
			int dan=sc.nextInt();
			
			for(int i=1;i<=9;i++){
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}			
			System.out.println();
			
			System.out.print("또할래(y/n):");
			String str=sc.next();
			loop=str.charAt(0);
			
		}while(loop=='Y' || loop=='y');
		
		sc.close();
	}
}
