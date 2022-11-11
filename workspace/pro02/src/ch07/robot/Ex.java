package ch07.robot;
/*
 * 추상클래스 시나리오
 * 	1) 로봇 구성 : 팔, 다리, 머리, 몸
 * 	2) 로봇 기능 : 걷기, 달리기
 * 	3) 로봇 종류
 * 		3-1) Super : 비행, 미사일, 레이저검 탑
 * 		3-2) Standard : 비행 불가, 미사일, 목검 탑
 * 		3-3) Low : 기본사양
 * 
 */

public class Ex {
	
	public static void sub(Robot robot) {	// robot=sup(SuperRobot)
		robot.shape();
		robot.walk();
		robot.run();
		robot.flight();
		robot.missile();
		robot.sword();
		
		System.out.println("============================");
	}

	public static void main(String[] args) {
		SuperRobot sup=new SuperRobot("Super Robot");
		sub(sup);
		
		
		StandardRobot standard=new StandardRobot("Standard Robot");
		sub(standard);
		
		LowRobot low=new LowRobot("Low Robot");
		sub(low);
	}

}
