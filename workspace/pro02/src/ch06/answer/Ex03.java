package ch06.answer;

public class Ex03 {

	public static void main(String[] args) {
		Sungjuk hong=new Sungjuk(1, 70, 80, 90);
		hong.total();
		hong.average();
		hong.hakjum();
		hong.disp();
		
		Pay pay=new Pay("왕눈이", 20000);
		pay.yonsan();
		pay.disp();
		
		Saram saram=new Saram("홍길동", "서울시강남구", "010", "123467");
		saram.disp();
		
		// int a=10;
		// int[] array=new int[] {1, 2, 3, 4, 5};
		// class : . , 함수, 생성자  / this
	}
}
