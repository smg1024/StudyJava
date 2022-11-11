package api.test;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// 난수 : 실행할 떄 무작위 숫자(double)을 만들어준다.
		//		  0.0 < 난수 < 1.0
		//		  공식 : (Math.random() * 범위숫자 개수) + 시작 숫자
//		for(int i=1; i<=100; i++) {
//			double ran = Math.random();
//			System.out.println((int)(ran*6)+1);	// 무작위 주사위 숫자 출력
//		}
		
		Random rand = new Random();	// 난수 생성 클래스
		for(int i=1; i<=100; i++) {
//			System.out.printf("%d, ", rand.nextInt());	// int자료형의 범위내의 값을 무작위 생성
//			System.out.printf("%s ", rand.nextBoolean());	// true/false를 무작위로 생성
			System.out.printf("%d, ", rand.nextInt(100)+1);
			if(i%10==0) System.out.println();
		}
	}

}
