package ch10.list;

/*
 * Collection Framework : 자료형구조를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있다.
 * 1) List : 순서를 유지하고 저장, 데이터 중복 허용
 * 			ArrayList, Vector, LinkedList(queue), stack 등등
 * 			(추가/삭제/수정)
 * 
 * 2) Set : 순서를 유지하지 않고 저장, 중복 저장 안함
 * 			HashSet, TreeSet 등등
 * 			(추가/삭제) 수정X
 * 
 * 3) Map : 키와 값을 쌍으로 저장, 키는 중복 허용 안함
 * 			HasMap, ThreeMap, Properties 등등
 * 			(추가/삭제/수정)
 * 
 * 배열의 단점 : 추가, 삭제가 안 됨
 * 수정하려면 처음부터 다시 짜야함
 * 
 */
import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Oracle");
		list.add("JSP");
		list.add("Servlet");
		list.add("HTML");
		list.add("CSS");
		list.add("CSS");
		list.add("Jquery");
		list.add("Spring");
		
		int size=list.size();	// list내 데이터의 개수
		System.out.println(size);
		
		String subject=list.get(2);	// list내 특정 index에 해당하는 데이터 출
		System.out.println(subject + "\n");
		
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
			System.out.println(str);
		}
		
		// 추가, 삭제, 수정
		list.add(1, "바나나");	// 원하는 index에 추가하기
		System.out.println(list.toString());
		
		list.set(3, "메론");	// 해당 index의 데이터를 수정하기
		System.out.println(list.toString());
		
		list.remove(0);			// 해당 index의 데이터를 삭제하기
		System.out.println(list.toString());
		
	}

}
