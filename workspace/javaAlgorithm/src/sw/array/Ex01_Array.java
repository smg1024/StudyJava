package sw.array;

public class Ex01_Array {
	static int[] arr = {50, 60, 80, 30, 40};
	
	// 배열의 값을 반복문을 이용하여 출력하기
	public static void printArray1() {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
	
	// 재귀호출을 이용한 배열의 값 출력하기
	public static void printArray2(int i) {	// i = 0 (초기값)
		if(i==arr.length) {
			System.out.println();
			return;
		}
		System.out.print(arr[i] + " ");
		printArray2(++i);
//		System.out.print("*");
	}
	
	
	public static void main(String[] args) {
//		Ex01_Array ea1 = new Ex01_Array();
//		System.out.println(Arrays.toString(arr));
		
		printArray1();
		printArray2(0);
		
	}

}
