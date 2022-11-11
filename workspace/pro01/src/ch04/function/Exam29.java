package ch04.function;

// 함수끼리 데이터 입력값 주고받기

import java.util.Scanner;

public class Exam29 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Name: ");
		String name=sc.next();
		
		System.out.println("Input grade for each subject");
		System.out.print("kor: ");
		int kor=sc.nextInt();
		
		System.out.print("eng: ");
		int eng=sc.nextInt();
		
		System.out.print("math: ");
		int math=sc.nextInt();
		
		avg(name, kor, eng, math);
		
		sc.close();
	}
	
	public static void avg(String name, int kor, int eng, int math) {
		int tot=kor+eng+math;
		float avg=(float) tot/3;
		System.out.println(name + "의 평균성적은 " + avg + "점입니다.");
	}
}
