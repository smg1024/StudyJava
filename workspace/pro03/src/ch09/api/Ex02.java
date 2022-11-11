package ch09.api;

// java.lang.String 클래스
public class Ex02 {

	public static void main(String[] args) {
		String a="apple";
		System.out.println(a);
		
		String b=new String("banana");	// String은 사실 자료형이 아니라 함수였다
		
		char at=b.charAt(0);	// 문자열의 index에 해당하는 문자를 출력
		System.out.println(at);
		
		int len=b.length();		// 문자열의 길이
		System.out.println("문자열 길이" + len);
		
		String c="자바프로그래밍";
		int idx=c.indexOf("프로그래밍");
		System.out.println(idx);
		
		String jumin="123456-3234567";	// 남자, 여자 구별하기
		if(jumin.length() == 14) {		// 제대로 입력했는지 확인
			int dash=jumin.indexOf("-");	// - 의 index가 몇인지 확인
			
			if(dash != -1) {
				char ch=jumin.charAt(dash + 1);
//				System.out.println(ch);
				switch(ch) {
				case '1': case '3': case '5':
					System.out.println("남자");
					break;
				case '2': case '4': case '6':
					System.out.println("여자");
				default:
					System.out.println("잘못 입력하셨습니다");
				}
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
	}

}
