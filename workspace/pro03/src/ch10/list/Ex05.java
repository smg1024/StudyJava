package ch10.list;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

/* 1) List : 순서를 유지하고 저장, 데이터 중복허용
 * 			ArrayList, Vector,
 * 			LinkedList(queue), stack
 * 
 * 			stack - LIFO (Last in First out)	ex) 웹브라우저 뒤로가기 버튼
 * 			queue - FIFO (First in First out)	ex) 프린터의 split기
 * 
 */

public class Ex05 {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		while(!stack.isEmpty()) {
//			System.out.println(stack.size());
			System.out.println(stack.pop());
		}
		
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.offer(77);
		queue.offer(88);
		queue.offer(99);
		
		while(!queue.isEmpty()) {
//			System.out.println(queue.size());
			System.out.println(queue.poll());
		}
	}

}
