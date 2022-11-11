package ch09.api;

import java.util.Arrays;

// java.lang.Math 클래스 응용

public class Ex01 {

	public static void main(String[] args) {
		double pi=Math.PI;
		System.out.println(pi);
		
		int a=Math.abs(-10);
		System.out.println(a);
		
		float b=Math.max(33.3f, 52.1f);
		System.out.println(b);
		
		int c=Math.min(10, -6);
		System.out.println(c);
		
		float su=123.567f;
		int d=Math.round(su);
		System.out.println(d);
		
		double e=Math.random();	// 0과 1사이의 무작위 실수
		System.out.println(e);
		
		int x=(int) (10*Math.random()) + 1;
		System.out.println(x);
		
		String[] array=new String[] {"김상민", "이지훈", "박하성", "이수형", "안소빈", "이혜린", "최수정", "경유진", "허유정", "최진현"};
		int index=(int) (Math.random()*array.length);
		System.out.println(array[index]);
		
		int[] num=new int[6];
		for(int i=0; i<num.length; i++) {
			num[i]=(int) (Math.random() * 45) + 1;
//			System.out.println(num[i]);
		}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
	}

}
