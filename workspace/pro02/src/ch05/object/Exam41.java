package ch05.object;

public class Exam41 {

	public static void main(String[] args) {
		
		Grade2 hong=new Grade2("홍길동", 1, 80, 90, 87);
//		hong.input("홍길동", 1, 80, 90, 87);
		hong.total();
		hong.average();
		hong.gpa();
		hong.disp();
		
	}

}
