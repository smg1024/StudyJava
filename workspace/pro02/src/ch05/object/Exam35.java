package ch05.object;

public class Exam35 {
	public static void main(String[] args) {
	
		Grade1 kim=new Grade1();	// 클래스의 객체 생성
//		kim.number=1;
//		kim.name="펭수";
//		kim.kor=70;
//		kim.eng=80;
//		kim.math=95;
		kim.input(1, "펭수", 70, 80, 95);	// 값을 함수로 입력해준다
		kim.total();
		kim.avg();
		kim.disp();
		
		Grade1 park=new Grade1();
//		park.number=2;
//		park.name="홍길동";
//		park.kor=85;
//		park.eng=98;
//		park.math=79;
		park.input(2, "홍길동", 85, 98, 79);
		park.total();
		park.avg();
		park.disp();
		
		Grade1 lee=new Grade1();
		lee.input(3, "이하이", 97, 96, 99);
		lee.total();
		lee.avg();
		lee.disp();
		
	}
}
