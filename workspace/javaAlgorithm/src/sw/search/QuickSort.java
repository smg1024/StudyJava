package sw.search;

public class QuickSort {
	
//	static int[] num = new int[] {13, 1, 15, 17, 6, 9, 8, 7, 4, 11};
//	static void disp(int[] num, int pl, int pr) {
//		for(int i=pl; i<=pr; i++) System.out.printf("%3d", num[i]);
//		System.out.println();
//	}
//
//	public static void main(String[] args) {
//		disp(num, 0, 9);
//		disp(num, 3, 7);
//		disp(num, 6, 9);
//		
//		quickSort(num, 0, 9);
//
//	}
//
//	private static void quickSort(int[] num, int pl, int pr) {
//		// 정렬할 범위는 pl과 pr사이
//		if(pl>=pr) return;
//		
//		// pivot 기준점 설정
//		int piv, left, right;
//		piv = pl;
//		left = pl+1;
//		right = pr;
//		
//		while(left<=right) {
//			while(left<=pr && num[left]<=num[piv]) left++;
//			while(right>=pl && num[right]>=num[piv]) right--;
//			if(left<=right) {
//				int temp = num[left];
//				num[left] = num[right];
//				num[right] = temp;
//			}else {
//				int temp = num[piv];
//				num[piv] = num[right];
//				num[right] = temp;
//			}
//		}
//		
//		disp(num, pl, right-1);
//		System.out.println();
//		disp(num, right+1, pr);
//		quickSort(num, pl, right-1);
//		quickSort(num, right+1, pr);
//		
//	}

}
