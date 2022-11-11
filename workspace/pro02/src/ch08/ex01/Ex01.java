package ch08.ex01;

public class Ex01 {

	public static void main(String[] args) {
		// XX a=new XX();	자기 자신의 객체 못 만든다
		
		YY b=new YY(100);
		b.disp();
		System.out.println(XX.SU);
		System.out.println(YY.SU);
		
		XX c=new YY(10);
		c.disp();
		
	}

}
