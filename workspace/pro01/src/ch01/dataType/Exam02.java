package ch01.dataType;

/*
 * 	연산자 우선순위
 * 		(1) 최우선 연산자 : . [] ()
 * 		(2) 단항 연산자 : ! ~ +/- ++/-- (전위형 연산자) (cast 또는 자료형)
 * 		(3) 산술 연산자 : * / % + -
 * 		(4) 시프트 연산자 : << >> >>>
 * 		(5) 비교 연산자 : < > <= >= == !=
 * 		(6) 논리 연산자 : & ^ | && ||
 * 		(7) 삼항 연산자 : 조건식 ? 참:거짓
 * 		(8) 대입 연산자 : = *= /= %= +=.= -= <<= >>= >>>= &= ^= !=
 * 		(9) 후위형 증감 연산자 : ++/==
 * 		(10) 순차(컴마) 연산자 : ,
 *  
 */
public class Exam02 {

	public static void main(String[] args) {
		// 참/거짓 : !(일반부정), ~(이진부정)
		boolean a=false;
		boolean b=!a;
		System.out.println(a + "\t" +b);
		
		// +/-
		int su=100;
		int value=-200;
		System.out.println(su + "\t" + value);
		System.out.println(-su + "\t" + value);		// 부호 바꿔서 출
		System.out.println(su + "\t" + -value);		// 원본 데이터에 영향을 안 줌
		System.out.println();
		
		// ++/-- (전위형 연산자)
		int x=10;
		++x;	// 11
		x++;	// 12
		System.out.println(x);
		System.out.println();
		
		--x;	// 11
		x--;	// 10
		++x;	// 11
		System.out.println(x);
		System.out.println();

		int y=55;
		int z=++y;		// 부호 순서대로 y증가 후 z에 전
		System.out.println(y);	// 56
		System.out.println(z);	// 56
		System.out.println();

		int aa=10;
		int bb=20;
		int cc=aa++ + ++bb;	//	cc=30 -> a=11, b=21
		System.out.println(cc);		// 시험에 나오기 좋다
		
	}

}
