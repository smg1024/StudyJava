package ch08.quiz;

class Parent{
	public String name;
	public Parent(String name) {
		this.name=name;
	}
}

class Child extends Parent{
	private int studentNo;
	public Child(String name, int studentNo) {
		super(name);
		this.studentNo=studentNo;
	}
	public void disp() {
		System.out.println(studentNo);
	}
	
}

public class Quiz22 {

	public static void main(String[] args) {
		
		
		
	}

}
