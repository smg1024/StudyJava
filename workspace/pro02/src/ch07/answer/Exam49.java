package ch07.answer;

/**
 * @Data : 2022. 9. 27
 * @Author : 강사
 * @Description : 상속 - 추상클래스, 추상함수
 *                      
 */

abstract class Animal{
	public String kind;
	
	public void breathe(){     				 // 브리드
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}

class Dog extends Animal{
	public Dog(){
		this.kind="포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	public Cat(){
		this.kind="포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

public class Exam49 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		Cat cat=new Cat();
		dog.sound();
		cat.sound();
		
		System.out.println("\n-------- \n");
		
		Animal animal=null;
		animal=new Dog();
		animal.sound();
		animal=new Cat();
		animal.sound();
	}
}

//  다음 실습문제) ch07.robotAbstract - Robot, SuperRobot, StandardRobot, LowRobot, RobotMain
