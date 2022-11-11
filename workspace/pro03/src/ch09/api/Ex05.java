package ch09.api;

// java.util.Date

import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ex05 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		Date today=new Date();
		System.out.println("오늘 날짜: " + today.toString());	//	현재 시스템 날짜를 가져온다 Wed Oct 26 15:32:18 KST 2022
		
		System.out.print(today.getYear() + "년도");		// 2000년도 이후로 출력이 안됨 --> Calendar 클래스 이용
		System.out.print(today.getMonth() + 1 + "월");
		System.out.print(today.getDate() + "일");
		System.out.print(today.getHours() + "시");
		System.out.print(today.getMinutes() + "분");
		System.out.print(today.getSeconds() + "초" + "\n\n");
		
		// 2022-10-26 15:00:24
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));

		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy년 MM월 dd일 E요일",Locale.KOREAN);
		System.out.println(sdf2.format(today));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf3.format(today));
		
		
		// 1985-12-25 문자열
		String str="1985-12-25";
		Date strDate=sdf1.parse(str);
		System.out.println(str);
		System.out.println(strDate);
	}

}
