package ch07.ex09;

public class Cat extends Animal {
	public Cat() {
		super.kind="mammal";
	}
	
	// Override
	public void sound() {
		System.out.println("meow");
	}
}
