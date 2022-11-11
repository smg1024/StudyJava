package ch02.control;

/*
 * 제어문
 * 1. 조건문
 * 		1) if, if~else, if~else if
 * 		2) switch~case 형식)
 * 		switch(조건식){		// 정수형 또는 문자열, 실수 및 논리관계 연산자 사용X
 * 		case 값:
 * 			문장들;
 * 			...
 * 		case 값:
 * 			문장들;
 * 			...
 * 		}
 */

public class Exam11 {

	public static void main(String[] args) {

		int su=3;
		switch(su) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;		// 조건이 맞다면 블럭 밖으로 빠져 나간다
		case 4:
			System.out.println("4번");
			break;
		}
		System.out.println();
		
		// 변수명, 함수명, 배열명, 객체명 / 프로젝트명, 패키지 : 소문자로 시작해서 절이 바뀔때 대문자 (suValue)
		// 클래스명 : 대문자로 시작해서 절이 바뀔때 대문자 (DataType)
		// 대소문자 구분 안 하는 언어 : HTML, CSS, Oracle --> 절이 바뀔때 언더바_ 사용 (data_type)
		
		String name="홍길동";
		String grade="AA";
		String memberLevel=null;
		
		switch(grade) {		// 정수형, 문자열
		case "AA":
			memberLevel="정회원";
			break;
		case "aa":
			memberLevel="정회원";
			break;
		case "BB":
			memberLevel="준회원";
			break;
		case "bb":
			memberLevel="준회원";
			break;
		case "CC": case "cc":
			memberLevel="게스트";
			break;
		default:
			memberLevel="기타";
			break;
		
		}
		System.out.println(name + "\t" + grade + "\t" + memberLevel);
		
	}

}
