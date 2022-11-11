package ch10.set;

import java.util.HashSet;
import java.util.Iterator;

import ch10.list.Data;

public class Ex02 {

	public static void main(String[] args) {
		Data a=new Data(10, 20);
		Data b=new Data(20, 30);
		Data c=new Data(30, 40);
		
		HashSet<Data> set=new HashSet<Data>();
		set.add(a);
		set.add(b);
		set.add(c);
		System.out.println(set.toString());
		
		Iterator<Data> iter=set.iterator();
		while(iter.hasNext()) {
			Data data=iter.next();		// Data set의 value값
			data.calculate();
			data.disp();
		}
		
		set.remove(a);		// 삭제
		set.add(new Data(15, 25));		// 추가
		
	}

}
