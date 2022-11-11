package ch07.robot;

public class LowRobot extends Robot{
	public LowRobot(String model) {
		super.model=model;
	}
	
	@Override
	public void flight() {
		System.out.println("날 수 없습니다");		
	}

	@Override
	public void missile() {
		System.out.println("미사일을 쏠 수 없습니다");		
	}

	@Override
	public void sword() {
		System.out.println("검을 가지고 있지 않습니다");
	}

}
