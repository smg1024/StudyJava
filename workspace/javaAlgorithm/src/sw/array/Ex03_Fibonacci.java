package sw.array;

import java.util.Scanner;

public class Ex03_Fibonacci {
	static Scanner sc = new Scanner(System.in);
/*
 * 피보나치 수열 만들기
 * [입력]
 * 10
 * 
 * [출력]
 * 1 1 2 3 5 8 13 21 34 55
 */

	public static void fib1(int n) {
		int num1 = 0;	// 전전값
		int num2 = 1;	// 전값
		int sum = 1;	// 현재값
		
		for(int i=0; i<n; i++) {
			System.out.print(sum + " ");	// i번째 index에 해당하는 값을 출력
			sum = num1 + num2;	// 다음 값을 계산
			num1 = num2;	// 새로운 전전값
			num2 = sum;		// 새로운 전값
		}
		
	}
//											2	1	0
	
//	n		10	9	8	7	6	5	4	3	2	1	0
//	n-1		9	8	7	6	5	4	3	2	1	0	-1
//	n-2		8	7	6	5	4	3	2	1	0	-1	-2
	
	public static int fib2(int n) {
		if(n<=-1) return 0;
		if(n==0) return 1;
		
		return fib2(n-1) + fib2(n-2);
	}
	
	public static void main(String[] args) {
		
		int num = sc.nextInt();
		
		fib1(num);
		
		System.out.println();
		
		for(int i=0; i<num; i++) {
			System.out.print(fib2(i) + " ");
		}
	}

}
