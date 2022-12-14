package sw.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex06_Array2 {

	public static void main(String[] args) {
		// 행 우선 탐색으로 출력
		Integer arr[][]= new Integer[5][5];
		int cnt = 0;
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr[r].length; c++) {
				arr[r][c] = ++cnt;
			}
		}
		for(int r=0; r<arr.length; r++) {	// r=0,1,2,3,4
			for(int c=0; c<arr[r].length; c++) {	// c=0,1,2,3,4
				System.out.printf("%3d", arr[r][c]);
			}
			System.out.println();
		}
		System.out.println("****************");
		
		// 열 우선 탐색으로 출력
		for(int r=0; r<arr.length; r++) {	// r=0,1,2,3,4
			for(int c=0; c<arr[r].length; c++) {	// c=0,1,2,3,4
				System.out.printf("%3d", arr[c][r]);
			}
			System.out.println();
		}
		System.out.println("****************");
		
		// 지그재그 탐색으로 출력
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr[r].length; c++) {
				if(r%2==0) {	// 짝수 행일때 정방향으로 배열
					System.out.printf("%3d", arr[r][c]);
				}else if(r%2!=0) {	// 홀수 행일때 반대방향으로 배열
					System.out.printf("%3d", arr[r][arr.length-1-c]);
				}
			}
			System.out.println();
		}
		System.out.println("****************");

		// 컬렉션을 이용한 역방향 출력
		for(Integer[] row : arr) {	// 2차원배열 arr의 정보를 한 행씩 1차원배열 row에 대입
			// 1. 컬렉션 중 List로 변환
			List<Integer> list = Arrays.asList(row);	// 1, 2, 3, 4, 5
			// 2. 뒤집기
			Collections.reverse(list);					// 5, 4, 3, 2, 1
			// 3. 배열로 변환
			Integer result[] = list.toArray(new Integer[0]);
			// 4. 출력
			for(int i=0; i<result.length; i++) {
				System.out.printf("%3d", result[i]);
			}
			System.out.println();
		}
		
	}
	
}
