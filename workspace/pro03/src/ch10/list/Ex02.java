package ch10.list;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.toString() + "\n");
		
		ArrayList<Float> arr=new ArrayList<Float>();
		arr.add(55.5f);
		arr.add(66.6f);
		arr.add(77.7f);
		System.out.println(arr.toString() + "\n");
		
		// 추가
		list.add(1, 15);
		list.add(50);
		System.out.println(list.toString());
		
		// 삭제
		list.remove(2);
		System.out.println(list.toString() + "\n\n");
		
		// Java에서 사용하는 모든 클래스(API, My)는 Object를 상속받는다
		// Object 클래스는 부모클래스로 자식클래스(String, Integer, Float,...)를 담아줄 수 있다
		ArrayList<Object> arrList=new ArrayList<Object>();
		arrList.add(10);
		arrList.add(55.5f);
		arrList.add("apple");
		System.out.println(arrList.toString());
		
		for(int i=0; i<arrList.size(); i++) {
			Object obj=arrList.get(i);
			System.out.println(obj.toString());
		}
		
	}

}
