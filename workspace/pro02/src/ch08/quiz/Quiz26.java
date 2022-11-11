package ch08.quiz;

class Employee1{
	protected String name, dept, grade;
	protected int number, age;
	public Employee1(String name, String dept, String grade, int number, int age) {
		this.name=name;
		this.dept=dept;
		this.grade=grade;
		this.number=number;
		this.age=age;
	}
	public void disp() {
		System.out.println("한 사람의 이름은" + name + "이고 나이는 " + age);
	}
}

class Manager1 extends Employee1{
	
	public Manager1(String name, String dept, String grade, int number, int age) {
		super(name, dept, grade, number, age);
	}
	public void disp() {
		System.out.println("한 사람의 이름은" + name + "이고 부서는 " + dept);
	}
}
public class Quiz26 {

	public static void main(String[] args) {
		Manager a=new Manager("홍길동", "개발부서", "대리", 1234, 27);
		a.disp();
	}

}
