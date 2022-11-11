package ch07.quiz;

class Test4{
	private int x;
	public Test4(int x) {
		this.x=x;
	}
	public Test4(char x) {
		this.x=x;
	}
	public void disp() {
		System.out.println(x);
	}
}

public class Quiz21 {

	public static void main(String[] args) {
		Test4 t=new Test4(10);
		t.disp();
		Test4 e=new Test4('A');
		e.disp();
		
	}

}
