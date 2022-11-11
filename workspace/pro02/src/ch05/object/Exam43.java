package ch05.object;

public class Exam43 {

	public static void main(String[] args) {
		Temp t=new Temp();
		t.disp(10);
		t.disp(22.3f);
		t.disp("월요일");
	}

}

// 클래스 : 멤버변수, 멤버구성
//		  : 접근제한자 public, private(클래스 밖에서의 접근 금지)SS
//		  : this, function overload(함수중복)