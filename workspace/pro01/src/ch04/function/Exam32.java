package ch04.function;

public class Exam32 {
	public static void main(String[] args) {
		
		int[] array=new int[] {1, 2, 3, 4, 5};
		
		a(array[1]);
		int su=b();
		System.out.println(su);
		
		apple(array);
		int[] numArr= banana();
		for(int i=0; i<numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		
	}
	
	public static void a(int a) {
		System.out.println(a);
	}
	
	public static int b() {
		int[] array=new int[] {77, 88, 99};
		
		return array[0];
	}
	
	public static void apple(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int[] banana() {
		int[] numArr=new int[] {100, 200, 300};
		return numArr;
	}
}
