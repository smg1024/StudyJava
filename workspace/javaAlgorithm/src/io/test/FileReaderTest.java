package io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// 파일의 내용을 읽어 콘솔에 출력하기
		
		try {
			File f = new File("/Users/poby/etc/StringBufferTest.java");
			FileReader fr = new FileReader(f);	// FileInputStream
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				// 문자단위
//				int inData = fr.read();	// EOF(End of file)일때 -1을 리턴
//				if(inData==-1) break;	// 끝까지 다 읽으면 반복문 종료
//				System.out.print((char)inData);	// 문자형으로 변환 필수
				
				// 줄단위
				String str = br.readLine();	// 읽어온 내용에는 Enter가 포함되지 않고, 읽어올 데이터의 구분기호로 Enter를 사용한다
				if(str==null) break;	// EOF일때 null을 리턴
				System.out.println(str);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 읽기 예외 발생");
			e.printStackTrace();
		}
		
		
	}

}
