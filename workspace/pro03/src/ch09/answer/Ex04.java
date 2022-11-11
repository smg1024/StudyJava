package ch09.answer;

// Wrapper 클래스 : int, long, float .... 를 클래스로 제공

public class Ex04 {
	public static void main(String[] args) {
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		int size=Integer.SIZE;
		int byteSu=Integer.BYTES;
		
		System.out.println("max:" + max);
		System.out.println("min:" + min);
		System.out.println("size:" + size);
		System.out.println("byteSu:" + byteSu);
		
		String binary=Integer.toBinaryString(10);
		String octal=Integer.toOctalString(10);
		String hex=Integer.toHexString(10);
		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hex);
		
		// 문자를 정수형 :  외부 입력시
		int value=Integer.parseInt("10");
		System.out.println(++value);
		
		// 정수형을 문자로 : 외부 출력시
		String str=String.valueOf(10);
		System.out.println(str);
		
		long num=Long.parseLong("10");
		float imsi=Float.parseFloat("22.2f");
	}

	// 4시 5분 시작
}
