package sw.search;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();	// 난수 생성 객체
	
	public static int binarySearch(int cnt, int[] arr, int inData) {	// 결과값의 index를 리턴
		int pl = 0;			// 시작위치 index
		int pr = cnt-1;		// 끝위치 index
		
		do {
			int pc = (pl+pr)/2;	// 중간위치 index
			if(inData==arr[pc]) {
				return pc;
			}else if(inData > arr[pc]) {	// 찾는 값이 중간위치의 값보다 클 때 
				pl = pc+1;			// 기존 중간위치 index를 새로운 시작위치로 설정
			}else if(inData < arr[pc]) {	// 찾는 값이 중간위치의 값보다 작을 떄 
				pr = pc-1;					// 기존 중간위치 index를 새로운 끝위치로 설정
			}
		}while(pl <= pr);	// 종료
		
		// 검색을 했는데 데이터가 존재하지 않을 때
		return -1;
	}
	
	public static void main(String[] args) {
		// 이진검색
		// 데이터의 수 입력 받아서 1~100사이 난수를 생성 후 오름차순으로 정렬
		System.out.print("데이터 수 : ");
		int cnt = sc.nextInt();
		
		// 난수를 이용하여 1~100사이의 값을 cnt 만큼 생성하여 배열에 저장
		int arr[] = new int[cnt];
		for(int i=0; i<cnt; i++) {
			arr[i] = rand.nextInt(100)+1;
		}
		
		// 정렬 - 오름차순
		Arrays.sort(arr);
		System.out.println("정렬 : " + Arrays.toString(arr));
		
		// 찾을 값 입력
		System.out.print("찾고 싶은 값 입력 : ");
		int inData = sc.nextInt();	// NumberFormatException
		
		// 이진검색 실행
		int result = binarySearch(cnt, arr, inData);	// -1이면 없다
		if(result==-1) {
			System.out.println(inData + "는 존재하지 않습니다.");
		}else {
			System.out.println(arr[result] + "는 " + result + "번째 index에 있습니다.");
		}
		
		sc.close();

	}

}
