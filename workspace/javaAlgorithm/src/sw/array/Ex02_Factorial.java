package sw.array;

import java.util.Scanner;

/*
 * [문제]
 * 정수를 입력받아 팩토리얼값을 구하라.
 * 
 * [입력]
 * 5
 * 
 * [출력]
 * 120
 */
public class Ex02_Factorial {
	static Scanner sc = new Scanner(System.in);
	
	// 반복문 이용
	public static int fac1(int n) {
		int res1 = 1;
		for(int i=1; i<=n; i++) {
			res1 *= i;	// 계산
		}
		return res1;
	}
	
	// 재귀호출 이용 : 반환형이 없는 ver.
	static int res2 = 1;
	public static void fac2(int n) {
		if(n==1) return;
		res2 *= n;	// 계산
		fac2(n-1);
	}
	
	// 재귀호출 이용 : 반환형이 있는 ver.
	public static int fac3(int n) {
		if(n==1) return n;
		return n*fac3(n-1);
	}

	public static void main(String[] args) {
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 반복문 실행
		System.out.println(fac1(num));
		
		// 재귀호출 반환형X
		fac2(num);
		System.out.println(res2);
		
		// 재귀호출 반환형O
		System.out.println(fac3(num));
		
	}

}
