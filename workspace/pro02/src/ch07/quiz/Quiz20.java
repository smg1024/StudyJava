package ch07.quiz;

class Test3{
	public int x, y;
	public void setData(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
public class Quiz20 {

	public static void main(String[] args) {
		Test3 a=new Test3();
		a.x=10;
		a.y=20;
		
		Test3 b=new Test3();
		b.setData(77, 88);

	}

}
