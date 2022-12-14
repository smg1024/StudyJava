package sw.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SequentialSearch {
	// 검색처리하는 메소드
	// 반환형의 값이 존재하면 찾는 값의 index를 리턴, 없으면 -1을 리턴
	public static int linearSearch(int num, int[] data, int value) {
		// for문으로 선형검색
		for(int i=0; i<num; i++) {
			if(data[i]==value) {	// 데이터를 찾았을 때 해당 index 리턴
				return i;
			}
		}
		return -1;	// 데이터를 못 찾았을 떄 -1 리턴
	}
	
	public static int linearSearch2(int cnt, int[] arr, int key) {
		int idx = 0;
		while(true) {
			if(idx==cnt) {
				return -1;
			}
			if(arr[idx]==key){	// idx 위치에 찾는 문자가 있는지 확인
				return idx;
			}
			idx++;	// 다음 값을 찾기 위해서 idx를 하나씩 증가	
		}		
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 데이터 준비
			// 데이터 개수
			int num = Integer.parseInt(br.readLine());
			
			// 콘솔에서 입력받은 데이터를 저장할 배열
			int data[] = new int[num];
			
			for(int i=0; i<num; i++) {
				System.out.print("[" + i + "]=");
				data[i] = Integer.parseInt(br.readLine());
			}
			do {
				// 찾을 숫자값 입력 (무작위 정수)
				System.out.print("찾을 값을 입력하세요 : ");
				int value = Integer.parseInt(br.readLine());
				
				// 검색			데이터 개수, 배열, 찾을 값
//				int key = linearSearch(num, data, value);	// for문을 이용한 검색 메소드
				int key = linearSearch2(num, data, value);	// while문을 이용한 검색 메소드
				
				// 결과
				if(key==-1) {	// 못 찾았을 때
					System.out.println("찾는 값이 존재하지 않습니다.");
				}else {	// 찾았을 때
					System.out.println("찾는 값은 index는 " + key + "입니다.");
					break;
				}
			}while(true);
		}catch(IOException e) {
			e.printStackTrace();
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력해주세요.");
		}
	}

}
