package ch10.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("strawberry");
		set.add("apple");		// 중복 허용 안 함
		System.out.println(set.toString());		// 순서 유지하지 않고 저장
		
		set.add("사과");		// 추가
		System.out.println(set.toString());
		
		set.remove("banana");	// 삭제
		System.out.println(set.toString());
		
		HashSet<Object> objSet=new HashSet<Object>();
		objSet.add(10);
		objSet.add(24.5f);
		objSet.add("apple");
		
		System.out.println(objSet.toString());
		
		Iterator<Object> iter=objSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
//		ArrayList : for문, Iterator
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("melon");
		
		Iterator<String> t=list.iterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
	}

}
