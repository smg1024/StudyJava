package sw.sort;

import java.util.Arrays;
import java.util.Comparator;


// 신체검사 데이터 배열 정렬하기
public class Ex05_PhyscExamSort {
	
	static class PhyscData{
		String name;	// 이름
		int height;		// 키
		double sight;	// 시력
		
		public PhyscData(String name, int height, double sight) {
			this.name = name;
			this.height = height;
			this.sight = sight;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name + "\t" + height + "\t" + sight;
		}
		
		// 키순 정렬 클래스
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			@Override
			public int compare(PhyscData h1, PhyscData h2) {
				// compare() 반환값이 -1: h1을 왼쪽에 배치, 1: h1을 오른쪽에 배치
				return (h1.height > h2.height)? 1 : (h1.height < h2.height)? -1:0;	// 키 오름차순
//				return (h1.height > h2.height)? -1 : (h1.height < h2.height)? 1:0;	// 키 내림차순
			}
		}
		
		public static final Comparator<PhyscData> NAME_ORDER = new NameOrderComparator();
		private static class NameOrderComparator implements Comparator<PhyscData>{

			@Override
			public int compare(PhyscData n1, PhyscData n2) {
				return n1.name.compareTo(n2.name);	// 가나다 순서
//				return n2.name.compareTo(n1.name);	// 가나다 역순
			}
		}
		
		
		public static final Comparator<PhyscData> SIGHT_ORDER = new SightOrderComparator();
		private static class SightOrderComparator implements Comparator<PhyscData>{
			@Override
			public int compare(PhyscData s1, PhyscData s2) {
				return (s1.sight > s2.sight)? 1 : (s1.sight < s2.sight)? -1 : 0;	// 오름차순
//				return (s1.sight > s2.sight)? -1 : (s1.sight < s2.sight)? 1 : 0;	// 내림차순
			}
		}
		
		
	}

	public static void main(String[] args) {
		// 1. 배열 정의한다
		PhyscData[] p = {
				new PhyscData("김상민", 172, 1.2), 
				new PhyscData("유현승", 170, 0.6), 
				new PhyscData("박하성", 171, 0.2), 
				new PhyscData("이지훈", 178, 0.8), 
				new PhyscData("이수형", 175, 0.1),
				new PhyscData("최진현", 177, 1.0),
				new PhyscData("김민석", 173, 0.7)
		};
		
		// 2. Arrays.sort(Object )
		// 키 순서대로 정렬
//		Arrays.sort(p, PhyscData.HEIGHT_ORDER);
		
//		// 이름 순서대로 정렬
		Arrays.sort(p, PhyscData.NAME_ORDER);
//
		// 시력 순서대로 정렬
//		Arrays.sort(p, PhyscData.SIGHT_ORDER);

		
		// 3. 출력
		System.out.println("**신체검사 리스트**");
		System.out.println("이름\t키\t시력");
		System.out.println("-------------------");
		for(int i=0; i<p.length; i++) {
			System.out.printf("%-5s%3d%8.1f\n", p[i].name, p[i].height, p[i].sight);
		}
	}

}
