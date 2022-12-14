package sw.sort;

public class Ex02_InternalSort {

	public static void main(String[] args) {
		IntSort s = new IntSort();
		s.init();
		s.disp();
//		s.bubbleSort();
//		s.selectionSort();
		s.insertSort();
		
//		TestSort ts = new TestSort();
//		ts.init();
//		ts.disp();
//		ts.bubbleSort();
	}

}

class IntSort{
	// 1. 배열에 정렬할 자료를 넣어준다
	int[] num;
	void init() {
		num = new int[] {5, 4, 3, 7, 1, 9, 8, 10};
	}
	
	// 출력
	void disp() {
		for(int n : num) {
			System.out.printf("%-3d", n);
		}
		System.out.println();
	}
	
	// 2. bubble sort 정렬
	void bubbleSort(){
		System.out.println("--------버블 정렬--------");
		for(int i=0; i<num.length-1; i++) {		// 전체 정렬 횟수는 n-1회
			
			for(int j=num.length-1; j>i; j--) { // 비교 index 설정 (오른쪽 끝에서부터)
				if(num[j-1] < num[j]) {	// 부등호 방향에 따라서 오름차순, 내림차순 결정
					swap(num, j-1, j);	// swap 함수로 자리 바꿔주기
				}
			}
			System.out.println((i+1) + "회 정렬 ===>");
			disp();
		}
	}

	// 3. selection sort 선택정렬
	void selectionSort() {
		int min, pos;
		System.out.println("-----------선택 정렬------------");
		for(int i=0; i<num.length-1; i++) {	// 전체 반복 횟수, 기준이 되는 시작점
			min = num[i];
			pos = i;
			
			for(int j=i+1; j<num.length; j++) {	// 1회 정렬 당 반복 횟수(시작은 i+1)
				if(min > num[j]) {
					min = num[j];
					pos = j;
				}
			}
			swap(num, i, pos);
			System.out.println((i+1) + "회 정렬 ===>");
			disp();
		}
	}
	
	void insertSort1() {
		int i, j;
		for(i=0; i<num.length; i++) {
			int temp = num[i];
			j = i;
			while(j>0 && temp<num[j-1]) {
				num[j] = num[j-1];
				j--;
			}
			num[j]=temp;
		}
	}
	
	// 4. insert sort 삽입정렬
	void insertSort() {
		System.out.println("----------삽입 정렬------------");
		int i, j;
		for(i=0; i<num.length; i++) {
			
			int temp = num[i];
			j = i;
			while(j>0 && temp<num[j-1]) {
				num[j] = num[j-1];
				j--;
			}
			num[j] = temp;
			System.out.println((i+1) + "회차 정렬 ===>");
			disp();
		}
	}
	
	private void swap(int[] num, int left, int right) {	// 교환 함수
		int temp = num[left];
		num[left] = num[right];
		num[right] = temp;
	}
}

//class TestSort{
//	String[] name;
//	void init() {
//		name = new String[] {"김상민", "유현승", "박건국", "박하성"};
//	}
//	
//	void bubbleSort() {
//		System.out.println("----------버블 정렬-----------");
//		char[] c;
//		for(int i=0; i<name.length-1; i++) {
//			for(int j=name.length-1; j>i; j--) {
//				if(name[j-1] > name[j]) {
//					
//				}
//			}
//		}
//	}
//	
//	void disp() {
//		for(String n : name) {
//			System.out.printf("%-4s", n);
//		}
//		System.out.println();
//	}
//}