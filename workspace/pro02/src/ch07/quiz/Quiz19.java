package ch07.quiz;

class Test2{
	private final double pi=3.141592;
	public double getPi() {
		return pi;
	}
//	public void setPi(double pi) {
//		this.pi=pi;
//	}
}
public class Quiz19 {

	public static void main(String[] args) {
		final int x=10;
		
//		x=20;
		System.out.println("x: " + x);
		
		Test2 a=new Test2();
//		a.setPi(2.4);
		a.getPi();
	}

}
