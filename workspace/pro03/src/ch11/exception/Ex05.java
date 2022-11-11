package ch11.exception;

import java.util.Scanner;

/*
 * Exception : 예외발생 ~ 처리
 * 			   예외전과
 * 			   예외만들기
 * 
 */


public class Ex05 {

	public static void main(String[] args) {
		
		// 예외만들기 throw
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("수를 입력하세요: ");
			int su=sc.nextInt();
			
			if(su==5) {
				NumberFormatException nfe=new NumberFormatException();
				throw nfe;
			}
			
			System.out.println("SU: " + su);
		}catch(Exception e) {
			System.out.println("숫자 5 입력하면 안됩니다.");
		}finally {
			if(sc != null) {
				sc.close();		// sc가 열린 위치에서 해준다
			}
		}		
		
	}

}
