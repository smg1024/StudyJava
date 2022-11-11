package ch09.answer;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Ex06 {
	public static void main(String[] args) {
		Calendar today=Calendar.getInstance();
		// System.out.println(today.toString());
		
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH) +1;
		int d=today.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "년도");
		System.out.println(month + "월");
		System.out.println(d+ "일");
		System.out.println(today.get(Calendar.HOUR) + "시간");
		System.out.println(today.get(Calendar.MINUTE) + "분");
		System.out.println(today.get(Calendar.SECOND) + "초");
	
		Date date=today.getTime();
		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));

	}

}
