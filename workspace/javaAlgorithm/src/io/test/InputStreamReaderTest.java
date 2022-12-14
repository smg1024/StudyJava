package io.test;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public InputStreamReaderTest() {
		// InputStreamReader : 콘솔, 파일, 네트워크의 데이터를 문자단위로 입력받는 클래스
		InputStreamReader isr=new InputStreamReader(System.in);
		
		try {
//			while(true) {
//				// read() : 1문자씩 입력한다.
//				int inData=isr.read();
//				if(inData==10) break;
//				System.out.println(inData + " : " + (char)inData);
//			}
			
			while(true) {
				// 한번에 여러 문자를 입력
				char[] inData=new char[10];
				int len=isr.read(inData);
				System.out.println("문자 수 : " + len);
				if(len<=0) break;
				
				System.out.println(String.valueOf(inData));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("*************** the end ***************");
	}
	
	public static void main(String[] args) {
		new InputStreamReaderTest();
	}

}
