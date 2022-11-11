package api.test;

public class AutoBoxing {

	public static void main(String[] args) {
		// 오토박싱 : 기본데이터형을 객체로 자동 대입해준다
		int a = 10;
		Integer b = a;	// 오토박싱
//		Integer c = new Integer(a);
		Integer c = Integer.valueOf(a);
		
		System.out.println(b);
		System.out.println(c);
		
		// 오토언박싱 : 객체형을 기본데이터형으로 자동 대입해준다
		int d = c;
		int e = c.intValue();
		System.out.println(d);
		System.out.println(e);
		
	}

}
