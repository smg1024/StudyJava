package ch08.quiz;

class Parents{
	protected int x, y;
	public Parents(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

class Son extends Parents{
	private int z;
	public Son(int x, int y, int z) {
		super(x, y);
		this.z=z;
	}
	
	public void disp() {
		System.out.println(x + ", " + y + ", " + z);
	}
}

public class Quiz20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
