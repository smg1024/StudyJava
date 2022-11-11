package ch05.object;

public class Exam33 {

	public static void main(String[] args) {	// 실행클래스
		PersonInfo hong=new PersonInfo();		// 객체명 : 클래스에서 생성된 객체
		hong.name="홍길동";
		hong.age=27;
		hong.height=188.2f;
		hong.disp();
		
		PersonInfo lee=new PersonInfo();
		lee.name="이순신";
		lee.age=28;
		lee.height=176.3f;
		lee.disp();
		
		PersonInfo peng=new PersonInfo();
		peng.name="펭수";
		peng.age=10;
		peng.height=210f;
		peng.disp();
	}

}
