package bb;

import aa.AA;	// import 패키지명.클래스명;

public class XX extends AA{
	public void disp() {
//		System.out.println(x);	ERROR	private변수
		System.out.println(y);
		System.out.println(z);
	}
}
