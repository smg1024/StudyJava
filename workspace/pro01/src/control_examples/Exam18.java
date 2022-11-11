package control_examples;

/**
 * @Data : 2022. 9. 23
 * @Author : 강사
 * @Description : Keyboard 입력
 *  */

import java.util.Scanner;

public class Exam18 {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input String:");
		String a=sc.next();
				
		System.out.print("input byte su:");
		byte b=sc.nextByte();
			
		System.out.print("input integer su:");
		int c=sc.nextInt();
	
		System.out.print("input float su:");
		float x=sc.nextFloat();
				
		System.out.print("input double su:");
		double y=sc.nextDouble();
		
		System.out.print("input character:");
		String str=sc.next();
		char ch = str.charAt(0);
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
		System.out.println("ch:" + ch);
		
		sc.close();
	}
}
