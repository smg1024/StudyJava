package ch04.function;

// 흐름을 잘 이해하자!

public class Exam25 {

	public static void main(String[] args) {	// main class는 시작 역할 기능
	// 접근제한자 지정예약어 반환형 함수명(매개변수...)
		sub();		// Call By Name
		fun();
		
		System.out.println("나는 Main 함수입니다");
		
		sub();
		fun();
		
		for(int i=0; i<5; i++) {
			abc();
		}
		
	}
	
	public static void sub() {
		System.out.println("나는 은행 입금 기능입니다.");
	}
	
	public static void fun() {
		System.out.println("나는 은행 출금 기능입니다.");
	}
	
	public static void abc() {
		System.out.println("오늘은 금요일입니다!!!");
	}

}
