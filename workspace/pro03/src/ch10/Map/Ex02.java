package ch10.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("JAVA", "자바");
		map.put("JSP", "웹");
		map.put("Oracle", "데이터베이스");
		map.put("Python", "머신러닝");
		
		System.out.println(map.toString());
		
		Set<String> set=map.keySet();		// key전체 값 뽑아오기
//		System.out.println(set.toString());
		
		Iterator<String> iter=set.iterator();	// Set중 하나의 key를 뽑기
		while(iter.hasNext()) {		// [JAVA, JSP, Oracle, Python]
//			System.out.println(iter.next());
			
			String value=map.get(iter.next());
			System.out.println(value);
		}
		
		System.out.println("\n===============\n");
		
		HashMap<String, Integer> hash=new HashMap<String, Integer>();
		hash.put("one", 66);
		hash.put("two", 77);
		hash.put("three", 88);
		
//		System.out.println(hash.toString());
//		System.out.println(hash.keySet());
		
		Set<String> s=hash.keySet();
//		System.out.println(s);
		
		Iterator<String> it=s.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());
			
			int value=hash.get(it.next());
			System.out.println(value);
		}
	}

}
