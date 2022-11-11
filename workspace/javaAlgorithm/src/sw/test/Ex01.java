package sw.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("양의 정수 입력: ");
			int num=sc.nextInt();	// exception
			int sum=0;
			int odd_sum=0;
			int even_sum=0;
			
			
			
	//		for(int i=1; i<=num; i++) {
	//			sum+=i;
	//		}
	//		
	//		for(int i=1; i<=num; i+=2) {
	//			odd_sum+=i;
	//		}
	//		
	//		for(int i=0; i<=num; i+=2) {
	//			even_sum+=i;
	//		}
			if(num>0) {	// 입력값이 0보다 클 때
				for(int i=1; i<=num; i++) {
					
					sum+=i;
					
					if(i%2!=0) {	// odd
						odd_sum+=i;
					}else {	// even
						even_sum+=i;
					}
				}

			
//		System.out.println("1~" + num + "까지의 합은? " + sum);
//		System.out.println("1~" + num + "까지 홀수의 합은? " + odd_sum);
//		System.out.println("1~" + num + "까지 짝수의 합은? " + even_sum);
		
		// format : d->decimal, s->string, f->float,double, c->character
		// 제어문자 : \n newline, \" \' \t tab(8칸)
//		System.out.printf("%5s%-5d까지의 합은 %3d\n", "1~", num, sum);	// format 앞에 숫자를 붙이면 왼쪽/오른쪽에 해당 공간만큼 띄운다
//		System.out.printf("%,.2f\t결과%2c확인", 125122.255512, 'A');	// float 앞에 ,를 붙이면 3자리수마다 ,표시 .과 숫자를 붙이면 그만큼 소수자리까지 반올
			
				System.out.printf("1~%d까지의 합은? %d\n", num, sum);
				System.out.printf("1~%d까지 홀수의 합은? %d\n", num, odd_sum);
				System.out.printf("1~%d까지 짝수의 합은? %d\n", num, even_sum);
			}else {	// 입력값이 0보다 작거나 같을 때
				System.out.println("양수가 아닙니다.");
			}
		}catch(InputMismatchException e){
			System.out.println("정수가 아닙니다.");
		}
		sc.close();

	}

}

/*
 * 실행
 * 양의 정수 입력=__
 * 1~__까지의 합은? ___
 * 1~__까지 홀수의 합은?___
 * 1~__까지 짝수의 합은?___
 * 
 */