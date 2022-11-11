package ch07.robot;

public class StandardRobot extends Robot {
	public StandardRobot(String model) {
		super.model=model;
	}
	
	@Override
	public void flight() {
		System.out.println("날 수 없습니다");		
	}

	@Override
	public void missile() {
		System.out.println("미사일을 쏠 수 있습니다");		
	}

	@Override
	public void sword() {
		System.out.println("목검을 가지고 있습니다");
	}

}
