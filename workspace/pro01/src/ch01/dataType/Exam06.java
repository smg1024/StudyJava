package ch01.dataType;
/*
* 	(6) 논리 연산자 : & ^ |	(이진 논리연자 and/or), && ||	(비교 같이 많이 쓰임)
*/

public class Exam06 {

	public static void main(String[] args) {
		
		byte a=10;	
		byte b=2;	
		
		// 	0000 1010
		// 	0000 0010
		// &0000 0010 (and)
		// |0000 1010 (or)
		// ^0000 1000 (xor)
		
		System.out.println("a&b " + (a&b));
		System.out.println("a|b " + (a|b));
		System.out.println("a^b " + (a^b) + "\n");
		
		
		// 나이 > 20 && 나이 < 30
		// 역삼동 동사무소 (여성주민 출력 선물)
		// 주민번호 앞,뒤 (남자 1,3,5 / 여자 2,4,6)
		// 주민번호뒤 == 2 || 주민번호뒤 == 4 || 주민번호 == 6
		
		int x=15;
		boolean y=x>10&&x<20;	// x > 10 (true) and x < 20 (true) --> true
		boolean z=x==10||x==15;	// x == 10 (false) or x == 15 (true) --> true
		System.out.println(y);
		System.out.println(z + "\n");
		
		
		// (7) 삼항 연산자 : 조건식 ? 참:거짓
		int su=10;
		String str=su==10 ? "True" : "False";
		System.out.println(str);
		
		int value=su > 20 ? 1:2;
		System.out.println(value);
		
		int i=20;
		int j=30;
		int k=i!=j ? i:j;	// 자료형은 출력값의 형태에 따라 정해진다
		System.out.println(k + "\n");
		
		// (8) 대입 연산자 : = *= /= %= +=.= -= <<= >>= >>>= &= ^= !=
		int num=100;
		System.out.println(num);
		System.out.println(num+=2);	// num = num + 2
		System.out.println(num-=2);	// num = num - 2
		System.out.println(num*=2);	// num = num * 2
		System.out.println((num/=2) + "\n");	// num = num / 2
		
		// (10) 순차(컴마) 연산자 : ,
		int aa=10;
		int bb=20;
		
		int aaa=10, bbb=20, ccc=30;
		System.out.println(aa+bb+aaa+bbb+ccc);
		
		
	}

}
