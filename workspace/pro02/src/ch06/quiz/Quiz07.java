package ch06.quiz;

class Employee{
	String name;
	int id;
	int age;
	String position;
	String dept;
	char grade;
	
	public void input() {
		name="홍길동";
		id=123456;
		age=32;
		position="선임연구원";
		dept="IT개발부서";
		grade='B';
	}
	
	public void output() {
		System.out.println(name + id + "\t" + age + "\t" + position + "\t" + dept + "\t" + grade);
	}
}

public class Quiz07 {

	public static void main(String[] args) {
		Employee emp=new Employee();
		
		emp.input();
		emp.output();
	}

}
