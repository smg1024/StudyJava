package ch07.quiz;

class Test{
	public int x, y;
	public static int z;
	
	public void getData(int x, int y, int z) {
		this.x=x;
		this.y=y;
		Test.z=z;
	}
	
	public void disp() {
		System.out.println(x + "\t" + y + "\t" + z);
	}
}
public class Quiz16 {

	public static void main(String[] args) {
		Test test=new Test();
		test.getData(10, 20, 30);
		test.disp();
	}

}
