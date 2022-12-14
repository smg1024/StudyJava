package io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex02_FileTest {

	public static void main(String[] args) {
		/*
		 * data2.txt의 파일을 입력하여 성적처리를 하는 프로그램을 작성하라
		 * 
		 * 중간고사, 기말고사, 과제물, 출석점수
		 * [입력]
		 * 90 89 99 100
		 * 100 66 55 85
		 * 60 60 58 73
		 * 90 50 99 70
		 * 70 60 80 92
		 * 90 80 72 70
		 * 
		 * [처리조건1]
		 * 평균
		 * (중간고사 + 기말고사)/2 --> 60% 반영
		 * 과제물					-> 20% 반영
		 * 출석						-> 20% 반영
		 * 
		 * [처리조건2]
		 * 학점
		 * 90~100 : A
		 * 80~89  : B
		 * 70~79  : C
		 * 60~69  : D
		 * 0~59   : F
		 * 
		 * [처리조건3]
		 * 평가
		 * A, B -> excellent
		 * C, D -> good
		 * F	-> poor
		 * 
		 * 평균, 학점, 평가
		 * [출력]
		 * 93.20 A excellent
		 */
		
		
		try {
			File f = new File("/Users/poby/etc/data2.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);	// 파일 읽어오기
			
			for(int i=1;;i++) {
				String score = br.readLine();	// 한 줄씩 읽어오기
				if(score==null) break;			// 내용 없을 시 반복문 종료
				
				String stud[] = score.split(" ");	// " "기준으로 문자열을 나눠서 stud[]배열로 만들기
				int mid = Integer.parseInt(stud[0]);	// 각 index마다의 값을 중간, 기말, 과제, 출석 값(정수형)으로 정의
				int fin = Integer.parseInt(stud[1]);
				int as = Integer.parseInt(stud[2]);
				int att = Integer.parseInt(stud[3]);
				
				// 평균
				double avg = (mid+fin)*0.3 + as*0.2 + att*0.2;
				
				// 학점 및 평가
				char gpa = ' ';
				String eval = null;
				if(avg>=90) {
					gpa = 'A'; eval = "Excellent";
				}else if(avg>=80) {
					gpa = 'B'; eval = "Excellent";
				}else if(avg>=70) {
					gpa = 'C'; eval = "Good";
				}else if(avg>=60) {
					gpa = 'D'; eval = "Good";
				}else {
					gpa = 'F'; eval = "Poor";
				}
				System.out.printf("%.2f %c %s\n", avg, gpa, eval);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
