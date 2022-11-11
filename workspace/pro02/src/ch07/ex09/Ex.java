package ch07.ex09;

public class Ex {
	
	public static void sub(Animal animal) {	// animal=c, d
		animal.sound();
	}

	public static void main(String[] args) {
//		Animal animal=new Animal():		ERROR
//		Animal dog=new Dog();
//		dog.sound();
//		
//		Animal cat=new Cat();
//		cat.sound();
		
		Dog d=new Dog();
		d.sound();
		
		Cat c=new Cat();
		c.sound();
		
		sub(c);
		sub(d);
	}

}
