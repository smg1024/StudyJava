package io.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public static void main(String[] args) {
		// File 클래스
		
		File f1 = new File("/Users/poby/etc");	// 컴퓨터 내 파일경로
		File f2 = new File("/Users/poby/etc/StringBufferTest.java");
//		File f3 = new File(f1, "StringBufferTest.java");	// 부모경로, 세부경로
//		File f4 = new File("/Users/poby/etc", "StringBufferTest.java");
		File f5 = new File(f1, "sample.txt");	// 기존에 없는 파일 -> 에러는 안 뜸
		
		try {
			if(!f5.exists()) {	//  있으면 true, 없으면 false
				boolean result = f5.createNewFile();	// 파일 생성여부 리턴
				if(result) {
					System.out.println(f5.getName() + " created.");	// getParent() : 경로, getName() : 파일명, getPath() : 경로+파일명
				}else {
					System.out.println("File not created.");
				}
			}
			f5.delete();	// 파일 삭제
			
			// 파일 크기 (byte)
			long fileSize = f2.length();
			System.out.println("Size : " + fileSize);
			
			// 마지막 수정일
			long dateModified = f2.lastModified();	// Millisecond로 표시
			
			Calendar date = Calendar.getInstance();	// 현재 시간에 대한 정보
			date.setTimeInMillis(dateModified);		// Calendar 클래스로 받아서
			
//			System.out.println(date);	// 2022-11-01 5:21 PM
			SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy HH:mm:ss");	// SimpleDateFormat으로 표시하고자 하는 날짜 형식을 결정
			String dateStr = sdf.format(date.getTime());	// format메소드를 이용해서 출력할 수 있는 String 형태의 dateStr에 대입한다
			System.out.println("Date Modified : " + dateStr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
