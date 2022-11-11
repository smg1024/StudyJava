package sw.test;

import java.util.Scanner;

public class Ex07_Report {

	static String leap(int year) {
		if(year%4==0) {
			if(year%400==0) {
				System.out.print("윤년");
			}else if(year%100==0) {
				System.out.print("평년");
			}else {
				System.out.print("윤년");
			}
		}else {
			System.out.print("평년");
		}
		
		return "";
		
	}
	
	public static void main(String[] args) {
		/*
		 * [문제]
		 * 년도를 입력받아 윤년과 평년을 구별하여 출력하라.
		 * 1행은 입력받을 데이터 수
		 * 
		 * 1. 4의 배수의 해면서 100의 배수는 아닌 경우
		 * 2. 400의 배수인 경우
		 * 
		 * [입력]
		 * 6
		 * 4 100 400 2000 2001 2004
		 * 
		 * [출력]
		 * #1 윤년
		 * #2 평년
		 * #3 윤년
		 * #4 윤년
		 * #5 평년
		 * #6 윤년
		 */
		Scanner sc = new Scanner(System.in);
		
		// 입력할 데이터 수
		System.out.print("몇 개의 년도를 알아보시겠습니까? ");
		int n = sc.nextInt();
//		sc.nextLine();	// 엔터처리
		
		// 연도를 문자열로 입력
		String yearStr = sc.nextLine();	// "4 100 400 2000 2001 2004"
		
		String yearArr[] = yearStr.split(" ");	// {4, 100, 400, 2000, 2001, 2004}
		String yearRes[] = new String[n];	// 결과를 저장할 배열
		
		// 처리
		for(int i=0; i<n; i++) {
			int year = Integer.parseInt(yearArr[i]);
			
			if(year%4==0 && year%100!=0 || year%400==0) {
				yearRes[i] = "윤년";
			}else {
				yearRes[i] = "평년";
			}
		}
		
		// 출력
		for(int i=0; i<n; i++) {
			System.out.printf("#%d %s\n", i+1, yearRes[i]);
		}
		
		
//		System.out.print("몇 개의 년도를 알아보시겠습니까? ");
//		int[] year = new int[sc.nextInt()];
//		
//		
//		for(int i=0; i<year.length; i++) {
//			System.out.print(i+1 + "번째 년도를 적어주세요 : ");
//			year[i] = sc.nextInt();
//		}
//		
//		for(int i=0; i<year.length; i++) {
//			System.out.print("#" + (i+1) + " ");
//			System.out.println(leap(year[i]));
//		}
//		
		sc.close();
		
	}

}
