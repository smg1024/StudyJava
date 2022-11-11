package ch07.ex09;

public class Dog extends Animal {
	public Dog() {
		super.kind="mammal";
	}
	
	public void sound() {
		System.out.println("woof");
	}
}
