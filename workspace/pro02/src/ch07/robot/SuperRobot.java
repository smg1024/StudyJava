package ch07.robot;

public class SuperRobot extends Robot {
	public SuperRobot(String model) {
		super.model=model;
	}
	
	public void flight() {
		System.out.println("날 수 있습니다");
	}
	
	public void missile() {
		System.out.println("미사일을 쏠 수 있습니다");
	}
	
	public void sword() {
		System.out.println("레이저검을 가지고 있습니다");
	}
}
