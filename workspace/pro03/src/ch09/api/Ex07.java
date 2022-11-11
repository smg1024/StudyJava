package ch09.api;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex07 {
	public static void main(String[] args) throws ParseException {
		double x=1234567.89;
		
		DecimalFormat df1=new DecimalFormat("0000000.00");
		System.out.println(df1.format(x));
		
		DecimalFormat df2=new DecimalFormat("0000000.0");
		System.out.println(df2.format(x));
		
		DecimalFormat df3=new DecimalFormat("0000000.0000");
		System.out.println(df3.format(x));
		
		DecimalFormat df4=new DecimalFormat("0.000");	// 소수점 이전은 생략가능, 소수 이후는 생략 불가
		System.out.println(df4.format(x) + "\n");
		
		DecimalFormat df5=new DecimalFormat("#######.##");
		System.out.println(df5.format(x));
		
		DecimalFormat df6=new DecimalFormat("#######.#");
		System.out.println(df6.format(x));
		
		DecimalFormat df7=new DecimalFormat("#######.####");
		System.out.println(df7.format(x));
		
		DecimalFormat df8=new DecimalFormat("#.###");	// 의미없는 0을 표시하지 않는다
		System.out.println(df8.format(x));
		
		
		int y=123456789;
		
		DecimalFormat df9=new DecimalFormat("#,###");	// 3자리마다 ,로 끊어준
		System.out.println(df9.format(y));
		
		DecimalFormat df10=new DecimalFormat("#,####");
		System.out.println(df10.format(y));
		
		DecimalFormat df11=new DecimalFormat("\u00A4 #,###");	// \u00A4는 설정한 위치의 화폐단위를 추가
		System.out.println(df11.format(y));
		
		
		String str="1,123,456";
		
		DecimalFormat df=new DecimalFormat("#,###");
		Number num=df.parse(str);
		int su=num.intValue();
		System.out.println(++su);

	}

}
