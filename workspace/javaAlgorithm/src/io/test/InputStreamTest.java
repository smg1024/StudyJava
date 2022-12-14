package io.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamTest {
	public InputStreamTest() {}
	
	public void start() {
		// InputStream : byte단위로 입력받는 추상클래스
		//				 객체를 new로 만들 수 없으며, System.in이라는 멤버변수 사용
		
		
		try {
			InputStream input=System.in;
			while(true) {
				// 1 byte씩 읽어오기
//				int inData=input.read();	// 콘솔에서 읽어온 값이 없으면 -1을 리턴, 값이 있으면 ascii코드를 리턴한다
//				if(inData==-1) break;		// 입력값이 없으면 반복문 탈출
//				System.out.println(inData + ":" + (char)inData);
				while(true) {
					// 배열의 크기만큼 읽어오기
					byte inData[]=new byte[10];
					int cnt=input.read(inData);	// cnt : 읽어온 byte수 --> inData 매개변수에 읽어온 값이 배열로 담긴다
					System.out.println("바이트 수: " + cnt);
					System.out.println(Arrays.toString(inData));
					System.out.println(new String(inData, 0, cnt));
				}
			}
		} catch (IOException e) {
			System.out.println("입력 에러 발생");
		}
		System.out.println("-------------");
	}
	public static void main(String[] args) {
		new InputStreamTest().start();
	}

}
