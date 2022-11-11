package ch10.bank;

import java.util.Scanner;

public class AccountView {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountManager kbank=new AccountManager();	// 오답: while문 안에 들어가있어서 ArrayList가 계속 반복해서 하나씩밖에 안 만들어짐

		while(true) {
			printMenu();
			System.out.print("메뉴를 선택하세요: ");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				// 계좌개설
				kbank.makeAccount();
				break;
			case 2:
				// 입금
				kbank.deposit();
				break;
			case 3:
				// 출금
				kbank.withdraw();
				break;
			case 4:
				// 잔액조회
				kbank.inquire();
				break;
			case 5:
				// 전체 출력
				kbank.disp();
				break;
			case 6:
				// 종료
				System.out.println("종료합니다.");
				sc.close();
				return;		// main으로 return해준다
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public static void printMenu() {
		System.out.println("Menu---------------");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 잔액조회");
		System.out.println("5. 전체 출력");
		System.out.println("6. 종료\n");
	}
}
