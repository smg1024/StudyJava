package ch10.list;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		Phone p=new Phone("김상민", "010-9701-5637");
		Phone h=new Phone("장지성", "010-4213-1234");
		Phone o=new Phone("박규도", "010-2314-4258");
		
		ArrayList<Phone> list=new ArrayList<Phone>();
		list.add(p);
		list.add(h);
		list.add(o);
		System.out.println(list.toString());
	}

}
