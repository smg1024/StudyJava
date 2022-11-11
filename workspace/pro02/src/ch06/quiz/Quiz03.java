package ch06.quiz;

class Person{
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		Person a=new Person();
		a.setAge(17);
	}

}
