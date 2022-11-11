package ch10.Map;

import java.util.HashMap;

public class Ex01 {
	
//		key값을 설정해서 해당 key에 value를 할당해준다.
//		key가 index역할을 해준

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("spring", "봄");
		map.put("summer", "여름");
		map.put("fall", "가을");
		map.put("winter", "겨울");
		System.out.println(map.get("fall"));
		System.out.println(map.toString() + "\n");
		
		HashMap<Integer, Double> h=new HashMap<Integer, Double>();
		h.put(10, 64.7);
		h.put(20, 63.9);
		h.put(30, 67.3);
		System.out.println(h.get(20));
		System.out.println(h.toString() + "\n");
		
		HashMap<String, Integer> a=new HashMap<String, Integer>();
		a.put("apple", 10);
		a.put("banana", 20);
		a.put("melon", 30);
		System.out.println(a.get("apple"));
		System.out.println(a.toString() + "\n");
		
		// 추가
		a.put("JSP", 88);
		System.out.println(a.toString() + "\n");
		
		// 데이터 중복 가능, KEY 중복 불가
		a.put("JAVA", 88);
//		a.put("apple", 99);		// key가 중복될 경우, value가 overwrite된다
		System.out.println(a.toString() + "\n");
		
		// 수정
		a.replace("banana", 100);
		System.out.println(a.toString() + "\n");
		
		// 삭제
		a.remove("melon");
		System.out.println(a.toString() + "\n");


	}

}
