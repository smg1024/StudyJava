package ch06.object;

public class Ex03 {
	public static void main(String[] args) {
		Grade hong=new Grade("홍길동", 1, 80, 90, 87);
		hong.total();
		hong.average();
		hong.gpa();
		hong.disp();
		
		Pay pay=new Pay("왕눈이", 200000);	// 객체명은 클래스명 소문자로
		pay.NetSalary();
		pay.disp();
		
		Person person=new Person("홍길동", "서울시 강남구 청담동", "010-9701-5637", "981024-1111111");
		person.disp();
		
	}
}
