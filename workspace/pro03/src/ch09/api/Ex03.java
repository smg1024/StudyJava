package ch09.api;

public class Ex03 {

	public static void main(String[] args) {
		String str1="자바는 객체지향 언어입니다";
		String str2=str1.replace("자바", "JAVA");
		System.out.println(str1);	// 치환
		System.out.println(str2);	// 원본 (원본데이터 영향을 안 준다)
		
		String str3="How are you?";
		System.out.println(str3.substring(2, 9));	// 2번지 시작해서 9번지 앞까지(2~8)
		
		String str4="    자 바 프로그  래밍  ";
		System.out.println(str4);
		System.out.println(str4.trim());	// 앞뒤 공백 제거
		
		System.out.println(str3.toLowerCase());	// 모두 소문자로
		System.out.println(str3.toUpperCase());	// 모두 대문자로
		
		// 문자열 -> 숫자 : 외부 입력 문자열
		String su="10";		// view 입력
		int num=Integer.parseInt(su);
		System.out.println(num);
		
		// 숫자 -> 문자열 : 외부 출력 문자열
		int a=10;
		float b=22.2f;
		boolean c=true;
		
		String strA=String.valueOf(a);
		String strB=String.valueOf(b);
		String strC=String.valueOf(c);
		System.out.println(strA);
		System.out.println(strB);
		System.out.println(strC);
		
		String str5="홍길동, 안중근, 김원봉, 윤봉길";	// 문자열에서 특정 문자열(, & -)들을 기준으로 나누어 쪼개서 배열로 만들기
		String[] arr=str5.split(",| ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		String str6="홍길동&안중근,김원봉-윤봉길";
		String[] array=str6.split("&|,|-");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		
		// 문자열 비교
		String x="apple";
		String y="APPLE";
		
		if(x.equals(y)) {		// 대소문자 구분해서 비교하기
			System.out.println("같습니다");
		}else {
			System.out.println("같지 않습니다");
		}
		
		if(x.equalsIgnoreCase(y)) {	// 대소문자 구분없이 비교하기
			System.out.println("같습니다");
		}else {
			System.out.println("같지 않습니다");
		}
	}

}
