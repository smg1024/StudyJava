package ch02.control;

import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {
		// 어떤 수를 입력해서 양수만 출력해라
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int a=sc.nextInt();
		
		if(a > 0) {
			System.out.println(a + "는 양수입니다.");
		}
		
		// 국어 영어 수학 시험점수를 입력 받아서 총점 평균 학점을 구하세요.
		System.out.print("이름:");
		String name = sc.next();
		
		System.out.print("국어:");
		int kor = sc.nextInt();
		
		System.out.print("영어:");
		int eng = sc.nextInt();
		
		System.out.print("수학:");
		int math = sc.nextInt();
		
		int tot = kor + eng + math;
		float avg = (float) tot/3;
		
		String gpa=null;
		if(avg >= 90) {
			gpa = "A";
		}else if(avg >= 80) {
			gpa = "B";
		}else if(avg >= 70) {
			gpa = "C";
		}else if(avg >= 60) {
			gpa = "D";
		}else if(avg < 60) {
			gpa = "F";
		}
		
		System.out.println(name + "\t" + avg + "\t" + gpa);
		
		
		sc.close();
	}

}
