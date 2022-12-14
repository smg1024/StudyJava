package sw.sort;

import java.util.Scanner;

public class Ex06_HeapSort {
	
	static void swap(int[] num, int left, int right) {	// swap 교환 함수
		int temp = num[left];
		num[left] = num[right];
		num[right] = temp;
	}
	
	static void heapSort(int[] arr, int len) {
		for(int i=(len-1)/2; i>=0; i--) {
			downHeap(arr, i, len-1);
		}
		for(int i=len-1; i>0; i--) {
			swap(arr, 0, i);
			downHeap(arr, 0, i-1);
		}
	}
	
	static void downHeap(int[] arr, int left, int right) {
		int temp = arr[left];
		int child;
		int parent;
		
		for(parent = left; parent<(right+1); parent=child) {
			int cl = parent*2+1;	// 왼쪽 자식
			int cr = cl+1;			// 오른쪽 자식
			child = (cr<=right && arr[cr]>arr[cl])? cr : cl;	// 큰쪽을 자식에 대입
			
			if(temp>=arr[child]) break;
			arr[parent] = arr[child];
		}
		arr[parent] = temp;
	}
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("힙 정렬");
		System.out.print("배열 크기 : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		for(int i=0; i<len; i++) {
			System.out.print("x[" + i + "]: ");
			arr[i] = sc.nextInt();
		}
		
		heapSort(arr, len);
		
		sc.close();
	}
}
