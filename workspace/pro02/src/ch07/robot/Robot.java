package ch07.robot;

public abstract class Robot {
	protected String model;
	
	public void shape() {
		System.out.println(model + "은 팔, 다리, 몸통, 머리가 있습니다");
	}
	
	public void walk() {
		System.out.println("걸을 수 있습니다");
	}
	
	public void run() {
		System.out.println("달릴 수 있습니다");
	}
	
	public abstract void flight();
	public abstract void missile();
	public abstract void sword();

}
