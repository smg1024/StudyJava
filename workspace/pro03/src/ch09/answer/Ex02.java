package ch09.answer;

// java.lang.String 클래스

public class Ex02 {
	public static void main(String[] args) {
		String a="apple";
		
		String b=new String("banana");
		char at=b.charAt(2);
		System.out.println("원하는 문자 추출:" + at);
		
		int len=b.length();
		System.out.println("문자열 길이:" + len);
		
		String c="자바프로그래밍";
		int idx=c.indexOf("프로그래밍");
		System.out.println("문자열 위치:" + idx);
		
		String jumin="123456-1234567";   // 남자, 여자
		if(jumin.length() == 14) {
			int loc=jumin.indexOf("-");     		// 6
			// System.out.println("loc:" + loc);
			
			if(loc !=-1) {      // -1 해당문자가 없으면
				char ch=jumin.charAt(loc + 1);   // 1
				// System.out.println(ch);
				
				switch(ch) {
				case '1': case '3':case '5':
					System.out.println("남자");
					break;
				case '2':case '4':case '6':
					System.out.println("여자");
					break;
				default:
					System.out.println("잘못되습니다.");
				}
			}else {
				System.out.println("해당 문자(-) 존재하지 않습니다.");
			}
			
		}else {
			System.out.println("주민번호 개수가 틀립니다.");
		}
		
		// 2시 시작!!
	}

}

















