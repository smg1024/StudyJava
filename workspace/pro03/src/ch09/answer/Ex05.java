package ch09.answer;

// java.util.Date

import java.util.Date;
import java.text.SimpleDateFormat;

public class Ex05 {

	public static void main(String[] args) throws Exception{
		Date today=new Date();
		System.out.println("오늘 날짜:" + today.toString());   

		System.out.println(today.getYear() + "년도");
		System.out.println(today.getMonth() +1 + "월");
		System.out.println(today.getDate() + "일");
		System.out.println(today.getHours() + "시");
		System.out.println(today.getMinutes() + "분");
		System.out.println(today.getSeconds() + "초" + "\n\n");
		
		// 2022-10-26 12:00:26
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yy년도 MM월 dd일 E요일");
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








