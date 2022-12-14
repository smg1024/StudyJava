package io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex01_FileArray {

	public static void main(String[] args) {
		/* data1.txt 파일의 내용을 읽어 다음 출력형식으로 표시하라.
		 * [입력]
		 * 3 4 5 1 3 4 5 1 4 5
		 * 6 7 8 5 4 2 1 5 6 7
		 * 4 5 6 7 2 5 7 6 1 1
		 * 
		 * [출력]
		 * #1 1행 합
		 * #2 2행 합
		 * #3 3행 합
		 */

		
		try {
			File f = new File("/Users/poby/etc/data1.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			for(int i=1;;i++) {	// 무한 반복
				String inData = br.readLine();
				if(inData==null) break;
				String strLine[] = inData.split(" ");	// 파일에서 1줄 읽은 후 " "으로 구분지어 배열에 저장
				
				int sum = 0;	// 합 변수 초기화
				for(String s:strLine) {	// s 배열에 strLine의 배열값들을 첫번째부터 차례로 대입
					sum+=Integer.parseInt(s);
				}
				// 출력
				System.out.println("#" + i + " " + sum);
			}
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
