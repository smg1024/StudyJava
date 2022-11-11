package ch03.array;

import java.util.Scanner;

public class Exam21 {

	public static void main(String[] args) {
		
		int a=0;
		System.out.println(a);
		
		int[] array=new int[5];	// 배열에 5자리를 만든다, 데이터값은 전부 0
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[3];
		for(int i=0; i<num.length; i++) {
			System.out.print("수 입력:");
			num[i]=sc.nextInt();
		}
		
		int hap=0;
		for(int i=0; i<num.length; i++) {
			hap += num[i];
		}
		System.out.println(hap);
		
		sc.close();
	}

}
