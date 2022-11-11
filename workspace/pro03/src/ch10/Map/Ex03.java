package ch10.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import ch10.list.Data;

public class Ex03 {

	public static void main(String[] args) {
		Data a=new Data(10, 20);
		Data b=new Data(30, 40);
		Data c=new Data(50, 60);
		
		HashMap<String, Data> map=new HashMap<String, Data>();
		map.put("one", a);
		map.put("two", b);
		map.put("three", c);
		
		System.out.println(map.toString());
		
		Set<String> set=map.keySet();
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()) {
			Data data=map.get(iter.next());
			data.calculate();
			data.disp();
		}
		
		map.put("four", new Data(70, 80));	// 추가
		map.replace("two", new Data(1, 2));	// 교체
		map.remove("three");				// 삭제
		
		System.out.println(map.toString());
	}

}
