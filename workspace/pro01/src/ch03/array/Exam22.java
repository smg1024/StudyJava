package ch03.array;

import java.util.Scanner;
public class Exam22 {

	public static void main(String[] args) {
		
		//임의의 수 5개를 입력받아서 최대값, 최소값 출력
		
		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[5];
		for(int i=0; i<num.length; i++) {
			System.out.print("수를 입력해주세요: ");
			num[i]=sc.nextInt();	// 15, 24, 36, 77, 53
		}
		System.out.println();
		
		int max=num[0];	// 몇번째 배열인지는 상관없음
		for(int i=0; i<num.length; i++) {
			if(max < num[i]) {		// max 15 < 15 --> don't run --> i++
				max=num[i];			// 배열 중 기존 max의 데이터보다 더 큰 숫자가 나오면 그 숫자로 max에 대입한다.
			}
		}
		System.out.println("maximum: " + max);
		
		int min=num[0];
		for(int i=0; i<num.length; i++) {
			if(min > num[i]) {
				min=num[i];		// 작은 놈이 나타나면 그 놈으로 교체한다.
			}
		}
		System.out.println("minimum: " + min);
		
		
		
		sc.close();
		
	}

}
