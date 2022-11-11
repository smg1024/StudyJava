package ch10.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	private ArrayList<Account> list;	// list=null 초기값
	private Scanner sc;					// sc=null 초기값
	
	public AccountManager() {
		list=new ArrayList<Account>();
		sc=new Scanner(System.in);
	}
	
	// 1. 계좌개설
	public void makeAccount() {
		Account account=new Account();	// getter setter로 값 넣어주기
		
		// view
		System.out.print("계좌번호:");
		account.setId(sc.nextInt());
		System.out.print("이름:");
		account.setName(sc.next());
		System.out.print("입금액:");
		account.setBalance(sc.nextLong());
		
		// get함수 --> DB
		list.add(account);
//		System.out.println(list.size()); ArrayList에 제대로 들어가고 있는지 확인하는 방법
		
		System.out.println("계좌가 개설되었습니다");
		
//		System.out.println(account.toString());		// 출력해서 값이 제대로 들어갔는지 확인
	}
	
	// 5. 전체 출력
	public void disp() {
		for(int i=0; i<list.size();i++) {
			Account account=list.get(i);
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
	}
	
	// 4. 잔액조회
	public void inquire() {
		System.out.print("계좌번호를 입력하세요:");
		int id=sc.nextInt();
		
		for(int i=0; i<list.size(); i++) {
			Account account=list.get(i);
			if(account.getId()==id) {
				System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
				return;		// 찾으면 AccountView의 case 4로 돌아감
			}
		}
		System.out.println("유효하지 않은 계좌번호입니다.");
	}
	
	// 2. 입금
	public void deposit() {
		System.out.print("계좌번호를 입력하세요:");
		int id=sc.nextInt();
		
		for(int i=0; i<list.size(); i++) {
			Account account=list.get(i);
			
			if(account.getId()==id) {
				System.out.print("입금액:");
				long money=sc.nextLong();
				
				long balance=account.getBalance() + money;	// 입금액+잔액을 새로운 잔액으로 치환
				account.setBalance(balance);
				
				System.out.println("입금완료!");
				
				return;
			}
		}
		System.out.println("유효하지 않은 계좌번호입니다.");
	}
	
	// 3. 출금
	public void withdraw() {
		System.out.print("계좌번호를 입력하세요:");
		int id=sc.nextInt();
		
		for(int i=0; i<list.size(); i++) {
			Account account=list.get(i);
			
			if(account.getId()==id) {
				System.out.print("출금액:");
				long money=sc.nextLong();
				
				if(account.getBalance() < money) {
					System.out.println("잔액 부족입니다.");
					return;
				}
				
				long balance=account.getBalance() - money;
				account.setBalance(balance);
				
				
				return;
			}
		}
		System.out.println("유효하지 않은 계좌번호입니다.");
	}
}










