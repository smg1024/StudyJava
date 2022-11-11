package sw.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_Array {

	public static void main(String[] args) {
		/*
		 * [입력] Scanner 사용X
		 * 56 82 35 95 68 35 75 92 89 78
		 * 
		 * [처리조건]
		 * 콘솔에서 입력받은 데이터를 배열에 저장한 후
		 * 총합과 평균(int)을 출력하라.
		 * 
		 * [출력]
		 * _총합_ _평균_
		 */
		
		// 입력
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			String inData=br.readLine();	// 1줄의 문자열을 입력
			String arr[]=inData.split(" ");
			
			int sum=0;
			for(String a:arr) {
				sum+=Integer.parseInt(a);
			}
			int avg=sum/arr.length;
			
			System.out.println(sum + " " + avg);
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
