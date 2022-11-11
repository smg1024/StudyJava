package bb;

import aa.AA;

public class YY {

	public static void main(String[] args) {
		AA aa=new AA();
//		System.out.println(aa.x);	ERROR
//		System.out.println(aa.y);	ERROR	동일 패키지에서는 상속없이 가능
		System.out.println(aa.z);
	}

}
