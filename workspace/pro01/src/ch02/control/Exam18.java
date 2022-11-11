package ch02.control;

import java.util.Scanner;

public class Exam18 {

	public static void main(String[] args) {
		
		// 어떤 수를 입력해서 입력한 수 만큼 apple 단어를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요: ");
		int su = sc.nextInt();
		
		for(int i=1; i<=su; i++) {
			System.out.println("apple");
		}
		
		
		
		
		sc.close();
	}

}
