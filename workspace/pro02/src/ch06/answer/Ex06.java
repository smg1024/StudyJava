package ch06.answer;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		Bank kim=new Bank("kim", 1000, 0.07f);
		kim.disp();
		
		Bank park=new Bank("park", 2000, 0.03f);
		park.disp();
		
		Bank lee=new Bank("lee", 3000, 0.05f);
		lee.disp();
		
		lee.setIyul(10.0f);
		lee.disp();
		
		kim.disp();
		park.disp();
		
		System.out.println(XYZ.VALUE);
		
		int x=Integer.BYTES;
		System.out.println(x);
		
		int y=Integer.MAX_VALUE;
		System.out.println(y);
		
		Integer a=new Integer("10");
		
		Date date=new Date();
		int month=date.getMonth();
		System.out.println(month);
		
		PrintStream ps=System.out;
		ps.println("하하하");
		
		System.out.println("헤헤헤헤");
		
		InputStream in=System.in;
		Scanner sc=new Scanner(in);
		int aa=sc.nextInt();
	}
}










