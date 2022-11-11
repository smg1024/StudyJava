package ch07.answer;

/**
 * @Data : 2022. 9. 27
 * @Author : 강사
 * @Description : 상속
 */

class AParents{
	protected int x, y;
	protected char z;
	
	public void sub(){
		System.out.println("hahaha");
		System.out.println();
	}
}

class Son extends AParents{
	public int a, b;
	
	public void disp(){
		System.out.println("x:" + x);
		System.out.println("x:" + this.x);
		System.out.println("x:" + super.y);
		System.out.println();
		
		System.out.println("y:" + y);
		System.out.println("y:" + this.y);
		System.out.println("y:" + super.y);
		System.out.println();
		
		System.out.println("z:" + z);
		System.out.println("z:" + this.z);
		System.out.println("z:" + super.z);
		System.out.println();
		
		System.out.println("a:" + a);
		System.out.println("a:" + this.a);
		System.out.println();
			
		System.out.println("b:" + b);
		System.out.println("b:" + this.b);	
		System.out.println();
	}
}
 

public class Exam40 {
	public static void main(String[] args) {
		AParents a=new AParents();			// x, y, z, sub()
		a.sub();
		
		Son b=new Son(); 					// x, y, z, sub()  a, b, disp()
		b.x=20;
		b.y=30;
		b.z='A';
		
		b.a=100;
		b.b=200;
		
		b.sub();
		b.disp();
	}
}
