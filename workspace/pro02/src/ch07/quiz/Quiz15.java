package ch07.quiz;

class Number1{
	public static int x;
	public static int y;
	
	public static int fun() {
		return y;
	}
}

public class Quiz15 {

	public static void main(String[] args) {
		Number1.x=10;
		Number1.y=20;
		
		int imsi=Number1.fun();
		
		System.out.println(imsi);
		
	}

}
