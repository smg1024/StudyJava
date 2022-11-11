package ch04.function;

import java.util.Scanner;

// 함수의 흐름

public class Exam26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1, 2, 3 중에서 하나를 입력하세요.");
		int su=sc.nextInt();
		
		if(su==1) {
			aa();
		}else if(su==2) {
			bb();
		}else if(su==3) {
			cc();
		}else {
			main(null);
		}
		
		sc.close();
		
	}
	
	public static void aa() {
		System.out.println("우리반 총점 구하기 기능 함수");
	}
	
	public static void bb() {
		System.out.println("우리반 평균 구하기 기능 함수");
	}
	
	public static void cc() {
		System.out.println("우리반 등수 구하기 기능 함수");
	}

}
