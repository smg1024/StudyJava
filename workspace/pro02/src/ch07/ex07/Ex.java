package ch07.ex07;

public class Ex {

	public static void main(String[] args) {
		Parents parent=new Parents(1,3);
		parent.calculate();
		
		Son son=new Son(10, 20);
		son.calculate();
		
		Parents s=new Son(77, 88);
		s.calculate();
		
        Son c=(Son) s;
        c.calculate();
	}
}
