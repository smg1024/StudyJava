package ch09.answer;

public class Ex03 {
	public static void main(String[] args) {
		String str1="자바는 객체지향 언어입니다.";
		String str2=str1.replace("자바", "JAVA");
		System.out.println(str1);    // 치환
		System.out.println(str2);    // 원본 (원본데이터 영향을 안준다.)
		
		String str3="How are you?";
		System.out.println(str3.substring(2));   			  // 2번지 시작해서 ~~ 끝
		System.out.println(str3.substring(2, 9));           // 2번지 시작해서 9번지 전까지 (2~8)
		
		String str4="    자바    프로그래밍    ";
		System.out.println(str4);
		System.out.println(str4.trim());             // 앞뒤 공백 제거
		
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase() + "\n");
		
		// 문자열 - 숫자  : 외부 입력 문자열
		String su="10";    		 // view 입력 
		int num=Integer.parseInt(su);
		++num;
		System.out.println("num:" + num);
		
		// 숫자 - 문자열  : 외부 출력 문자열
		int a=10;
		float b=22.2f;
		boolean c=true;
		
		String strA=String.valueOf(a);
		String strB=String.valueOf(b);
		String strC=String.valueOf(c);
		
		String str5="홍길동, 이수홍, 박연수, 김자바, 최코딩";
		String[] arr=str5.split(",");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		String str6="홍길동&이수홍,박연수,김자바-최명호";
		String[] array=str6.split("&|,|-");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		
		// 문자열 비교
		String x="apple";
		String y="APPLE";
		
		if(x.equals(y)) {     // 대소문자 구분
			System.out.println("같다.");
		}else {
			System.out.println("같지 않다.");
		}
		
		if(x.equalsIgnoreCase(y)) {    // 대소문자 구분 안함
			System.out.println("같다");
		}else {
			System.out.println("같지 않다.");
		}
	}

}











