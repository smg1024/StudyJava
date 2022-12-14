package io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// 파일 내용을 byte단위로 읽어서 다른 파일로 쓰기
		
		try {
			// 파일 읽어오기 (byte)단위
			File inFile = new File("/Users/poby/etc/flower1.jpg");	// 읽어오는 위치
			FileInputStream fis = new FileInputStream(inFile);		// 읽어주는 객체
			
			// 파일 쓰기 (byte)단위
			File outFile = new File("/Users/poby/filecopy", inFile.getName());	// 써오는 위치
			FileOutputStream fos = new FileOutputStream(outFile);				// 써주는 객체
			
			while(true) {
				int inData = fis.read();
				if(inData==-1) break;
				fos.write(inData);
			}
			
			fos.close();
			fis.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("복사 완료!");
		
	}

}
