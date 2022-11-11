package ch07.ex08;

public class Ex {

	public static void main(String[] args) {
//		Parents a=new Parents();	ERROR
		Son s=new Son();
		s.msg();
		s.disp();
		s.apple();
		
		Parents p=new Son();
		p.msg();
		p.disp();
//		p.apple();	ERROR
		
		/*
		 * 함수재정의 : 자식 - 함수 내용을 재정의한다(고쳐쓴다)
		 * 				부모 - 자식클래스를 담아준다 (UpCasting)
		 * 
		 * 				일반클래스 상속 시 함수재정의 선택
		 * 				추상클래스 상속 시 함수재정의 필수
		 */
	}
}
