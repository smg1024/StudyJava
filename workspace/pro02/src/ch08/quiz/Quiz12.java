package ch08.quiz;

class A{
	protected int x;
}

class B extends A{
	private int y;
	B(int x, int y){
		super.x=x;
		this.y=y;
	}
	void disp() {
		System.out.println(y);
	}
}

public class Quiz12 {

	public static void main(String[] args) {
		
	}

}
