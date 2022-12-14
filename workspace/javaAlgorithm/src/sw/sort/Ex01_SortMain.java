package sw.sort;

import java.util.ArrayList;

public class Ex01_SortMain {

	public static void main(String[] args) {
		// 2017 김상민 100
		// 2018 유현승 95
		
		// 1. 생성자로 넣기
		Ex01_SortTest st = new Ex01_SortTest("2017", "김상민", 100);
		System.out.println(st.getAlumni() + " " + st.getName() + " " + st.getScore());

		// 2. setter를 이용해서 넣기
		st.setAlumni("2018");
		st.setName("유현승");
		st.setScore(95);
		System.out.println(st.getAlumni() + " " + st.getName() + " " + st.getScore());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(20);
		arr.add(5);
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		arr.sort(null);
		System.out.println();
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		

	}

}
