package ch10.list;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		Data a=new Data(10, 20);		// Data 객체 생성
		Data b=new Data(30, 40);
		Data c=new Data(50, 60);
		
		ArrayList<Data> list=new ArrayList<Data>();	// Data 객체들을 list로 정리
		list.add(a);
		list.add(b);
		list.add(c);
		
		for(int i=0; i<list.size(); i++) {
			Data data=list.get(i);
			data.calculate();
			data.disp();
		}
		System.out.println();
		
		Data d=new Data(70,80);
		list.add(1, d);			// 추가
		
		list.set(0, new Data(90, 100));	// 수정
		
		for(int i=0; i<list.size(); i++) {
			Data data=list.get(i);
			data.calculate();
			data.disp();
		}
		
		list.remove(b);
		System.out.println(list.toString());
		
	}

}
