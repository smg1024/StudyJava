package ch05.object;

public class Exam42 {

	public static void main(String[] args) {
		// 함수중복, 함수재정의, interface
		
		Value v=new Value();
		v.input(10, 22.2f, 'A', "apple");
		v.calc(77);
		v.calc(11.1f);
		v.calc(40, 33.2f);
		
	}

}