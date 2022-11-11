package ch06.object;

public class Ex01 {

	public static void main(String[] args) {
		// 데이터 전달 : . , 함수, 생성자 - public
		
//		생성자로 데이터 전달
		Number n=new Number(10, 33.5f);
		
//		. 연산자로 데이터 전달
//		n.a=10;
//		n.b=33.5f;
		
//		함수로 데이터 전달
//		n.input(10, 33.5f);
		
		n.disp();
		
	}

}