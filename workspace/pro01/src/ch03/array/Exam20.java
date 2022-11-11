package ch03.array;

/*
 * 배열 : 변수는 한개의 데이터를 저장한다.
 * 		  배열은 같은 타입의 데이터를 연속된 공간에 저장한다.
 */

public class Exam20 {

	public static void main(String[] args) {
		
//		char ch='a';
		char[] arr=new char[] {'A', 'B', 'C'};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		for(int i=0; i<3; i++) {
			System.out.println(arr[i]);
		}
		
		
		int[] num=new int[] {123, 234, 345, 456, 567};
		System.out.println(num.length);
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		String[] str=new String[] {"apple", "hi", "안녕", "야호", "banana"};
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
