package ch01.dataType;

/*
 * 	(2) 단항 연산자 : ! ~ +/- ++/-- (전위형 연산자) (cast) 또는 (자료형)
 */

public class Exam03 {

	public static void main(String[] args) {

		byte a=10;	// a=10
		byte b=a;	// b=a=10
		System.out.println(a + "\t" + b);
		
		short c=a;
		int d=a;
		System.out.println(c + "\t" + d);
		
		int su=77;
		byte imsi= (byte) su;	// int가 더 큰 자료형이기 때문에 강제로 변환해줘야함
		System.out.println(imsi);
		
		int value=10;
		int num=3;
		float result=(float)value/num;	// 10.0f / 3
		System.out.println(result);
		
		byte aa=10;
		byte bb=20;
		int cc=aa+bb;	// 덧셈 뺄셈이 쓰이면 무조건 결과는 int로 변환된다
		byte dd=(byte) (aa+bb);
		System.out.println(cc);
		System.out.println(dd);
		System.out.println();
		
		int kor=80;
		int eng=90;
		int mat=100;
		int tot=kor+eng+mat;
		float avg=(float) tot/3;
		System.out.println(avg);		
		
	}

}
