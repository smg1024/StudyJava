package ch06.answer;

public class Ex05 {
	public static void main(String[] args) {
		Num num=new Num();
		System.out.println(num.a);
		System.out.println(num.b);
		System.out.println(Num.c);
		
		System.out.println("---------------");
		
		ABC a=new ABC();
		a.input();

		ABC b=new ABC();
		b.input();

		ABC c=new ABC();
		c.input();
		
		System.out.println("cnt:" + c.cnt);
		System.out.println("count:" + ABC.count);
	}

}
