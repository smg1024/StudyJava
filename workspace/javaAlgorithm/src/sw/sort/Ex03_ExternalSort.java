package sw.sort;
// 외부 정렬 : 쉘, 퀵, merge, heap
public class Ex03_ExternalSort {

	public static void main(String[] args) {
		ExSort es = new ExSort();
//		es.init();
//		es.disp();
//		es.shellSort();
//		es.quickSort();
		
		// 병합 정렬용 배열
		int[] a = {2, 4, 6, 8, 11, 13};
		int[] b = {1, 2, 3, 4, 9, 16, 21};
		int[] c = new int[a.length+b.length];
		
		es.mergeSort(a, b, c);
		for(int cc : c) {
			System.out.print(cc + " ");
		}
	}

}

class ExSort{
	int[] num;
	void init() {	// 임의 초기값
		num = new int[] {4, 9, 3, 6, 7, 1, 5, 8, 2};
	}
	
	void disp() {	// 출력
		for(int n : num) {
			System.out.printf("%-3d", n);
		}
		System.out.println();
	}
	
	private void swap(int[] num, int left, int right) {	// swap 교환 함수
		int temp = num[left];
		num[left] = num[right];
		num[right] = temp;
	}
	
	// 쉘 정렬 : 단순삽입 정렬의 장점을 살리고 단점을 보완한 정렬
	void shellSort() {
		for(int i=num.length/2; i>0; i/=2) {	// i-way 부분 정렬
			for(int j=i; j<num.length; j++) {	
				int k;
				int temp = num[j];
				for(k=j-i; k>=0 && num[k]>temp; k-=i) num[k+i] = num[k];
				num[k+i] = temp;
			}
			System.out.println("----------");
			disp();
		}
	}
	
	// 퀵 정렬
	void quickSort() {
		int pl = 0;	// 왼쪽 커서
		int pr = num.length-1;	// 오른쪽 커서
		int piv = num[num.length/2];	// pivot 기준점
		
		do {
			while(num[pl]<piv) pl++;
			while(num[pr]>piv) pr--;
			if(pl<=pr)
				swap(num, pl++, pr--);
			disp();
		}while(pl<=pr);
	}
	
	// 병합 정렬
	void mergeSort(int[] a, int[] b, int[] c) {
		int na = a.length;	// a배열 크기
		int nb = b.length;	// b배열 크기
		
		int pa = 0;	// a 포인터
		int pb = 0;	// b 포인터
		int pc = 0;	// c 포인터
		
		// 병합 범위
		while(pa<na && pb<nb) {
			c[pc++] = (a[pa] <= b[pb])? a[pa++] : b[pb++];
		}
		
		while(pa<na) {	// a배열에 데이터가 남았을 때
			c[pc++] = a[pa++];
		}
		
		while(pb<nb) {	// b배열에 데이터가 남았을 때 
			c[pc++] = b[pb++];
		}
	}
}



























