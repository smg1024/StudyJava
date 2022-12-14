package io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// 파일로 쓰기
		
		// 기존의 파일을 적으면 덮어쓰기, 새로운 파일명을 적으면 새로 생성된다
		File f1 = new File("/Users/poby/etc/WriterTest.txt");
		try {
			FileWriter fw = new FileWriter(f1);
			
			String txt = "자바에서 파일쓰기 연습 중\n";	
			fw.write(txt, 0, txt.length());	// write(값, 시작index, 길이);
			
			String txt2 = "java filewriter test...\n";
			fw.write(txt2, 0, txt2.length());
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
