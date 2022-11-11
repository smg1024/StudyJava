package ch09.answer;

import java.util.Arrays;

// java.lang.Math 클래스

public class Ex01 {
	public static void main(String[] args) {
		double pi=Math.PI;
		System.out.println(pi);
		
		int a=Math.abs(-10);
		System.out.println(a);
		
		float b=Math.max(55.5f, 66.6f);
		System.out.println(b);
		
		int c=Math.min(10, -5);
		System.out.println(c);
		
		float su=123.567f;
		int d=Math.round(su);
		System.out.println(d);
		
		double e=Math.random();   // 0~1
		System.out.println(e);
		
		int x=(int) (Math.random() *10) + 1;   // 1~10
		System.out.println(x);
		
		String[] array=new String[] {"박푸름", "허성준", "김지영", "이수연", "강무성", "김승현"};
		int idx=(int) (Math.random() * array.length);
		System.out.println(idx);
		System.out.println(array[idx]);
		
		int num=(int) (Math.random() * 6) +1;   // 1~6
		System.out.println(num);
		System.out.println();
		
		int[] number=new int[6];
		for(int i=0;i<number.length;i++) {
			number[i]=(int) (Math.random() * 45) + 1;
			// System.out.print(number[i] + "\t");
		}
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
		
		
	}
}













