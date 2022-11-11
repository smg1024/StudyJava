package ch01.dataType;
/*
 * 1. 자료형 : 데이터
 * 		1-1) 숫자 : 정수형 : 10, 22, 88
 * 					실수형 : 11.2, 489.2
 * 		1-2) 문자 : 문자형 : 하나의 글자(영, 한, 특) A, 가, *
 * 					문자열형 : 하나 이상의 글자 ex) Hi, 안녕하세요, &*$
 * 2. 자바 자료형
 * 		2-1) 정수형 : byte, short, int, long
 * 		2-2) 실수형 : float, double
 * 		2-3) 문자형 : char
 * 		2-4) 문자열형 : String
 * 
 * 3.변수규칙
 * 		3-1) 숫자와 영문자 조합으로 만든다 (첫 글자는 영문자) ex) su1, su2, value01
 * 		3-2) 특수문자 사용불가 (예외: _(밑줄)) ex) su_value, min_avg
 * 		3-3) 예약어(명령어) 사용 불가 ex) main, System
 * 		3-4) 문자 사이 공백 불가
 * 		3-5) 대소문자 구분 int su=10; int SU=10; int sU=10;
 * 		3-6) 변수의 길이는 32자 내외 작
 * 
 */
public class Exam01 {

	public static void main(String[] args) {

		System.out.println("Hello World!");
		System.out.println("Java Start!!!");
		System.out.println();

		// 정수형 자료형
		System.out.println("정수형 자료형");
		byte a=10;      // 1 byte -> -128 ~ +127까지 표현 가능
		short b=129;	// 2 byte -> -32768 ~ 32767
		int c=500;		// 4 byte -> -2147483648 ~ 2147483647
		long d=6580L;	// 8 byte -> -2^63 ~ 2^63-1
		
		// 	정수를 자료형에 담는다면?
		// 50000 -> int, long
		// 27억 -> long
		// 100 -> byte, short, int, long
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("d:" + d);
		System.out.println();
		
		System.out.println("실수형 자료형");
		float e=45.5f;		// 4 byte(1.4e-45 ~ 3.4082e38)
		double f=120.40;	// 8 byte(4.92e-324 ~ 1.8e308)
		System.out.println(e);
		System.out.println("f:" + f);
		System.out.println();
		
		System.out.println("문자형 자료형");
		char x='A';			// 2 byte *char은 홀따옴표만 사용 가능
		char y='김';
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		System.out.println("문자열 자료형");
		String str1="Hello Java";		// 무한참조형
		String str2="How are you";
		String str3="Hi";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println();

		
		System.out.println("논리형 자료형");
		boolean b1=true;		// 1
		boolean	b2=false;		// 0
		System.out.println(b1);
		System.out.println(b2);
		System.out.println();
		
//		int xx=10;
//		float yy=22.2F;
//		float zz=xx+yy;
//		
//		float su=10;
//		int value=20;
//		float result=su+value;

//		byte su=10;
//		char value='A';		// char 문자형은 아스키코드로 치환 (A=65)
//		int result=su+value;
//		System.out.println(result);
//		System.out.println();
//		
//		String aa="apple";
//		int bb=10;
//		String cc=aa+bb;
//		System.out.println(cc);
//		System.out.println();

		
	}

}