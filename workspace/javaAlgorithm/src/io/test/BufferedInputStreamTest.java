package io.test;

//import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedInputStreamTest {
	public BufferedInputStreamTest() {
		// BufferedInputStream(), BufferedReader() : 1줄의 데이터를 입력받는 클래스
		
//		BufferedInputStream bis=new BufferedInputStream(System.in);
		
		try {
//			while(true) {
//				byte data[]=new byte[10];
//				int cnt=bis.read(data);
//				System.out.println(cnt);
//				if(cnt<=0) break;
//				System.out.println(new String(data));
//			}
			
			// BufferedReader
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			String str=br.readLine();
			System.out.println(str);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		new BufferedInputStreamTest();
	}

}
