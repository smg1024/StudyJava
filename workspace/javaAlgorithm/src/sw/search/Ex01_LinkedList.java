package sw.search;

public class Ex01_LinkedList {

	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		// 삽입하기
		list.insertTail("A");
		list.insertTail("B");
		list.insertTail("C");
		list.insertTail("D");
		list.insertTail("E");
		list.insertTail("F");
		list.disp();
		
		// 삭제하기
		String deleteHead = list.deleteHead();
		System.out.println("삭제한 데이터는 " + deleteHead);
		deleteHead = list.deleteHead();
		System.out.println("삭제한 데이터는 " + deleteHead);
		deleteHead = list.deleteHead();
		System.out.println("삭제한 데이터는 " + deleteHead);
		
		// 출력하기
		list.disp();
		
		// 역출력하기
		list.revDisp();
	}

}

class DoubleLinkedList{
	Node head;
	Node tail;
	
	public DoubleLinkedList() {
		init();
	}

	public String deleteHead() {	// 맨 왼쪽에 있는 데이터를 삭제하고 반환한다
		String data = "";
		if(head.next == tail) return data;	// 지울 데이터가 없음(head와 tail사이에 아무것도 없음)
		
		data = head.next.data;	// "A"
		Node del = head.next;	// 삭제될 "A"가 있는 노드의 주소를 넣음
		head.next = del.next;
		head.next.prev = head;
		
		return data;
	}

	public void disp() {
		// 출력하기
		Node trace = head.next;
		while(trace != tail) {
			System.out.printf("%-3s", trace.data);
			trace = trace.next;
		}
		System.out.println();
	}
	
	public void revDisp() {
		Node trace = tail.prev;
		while(trace != head) {
			System.out.printf("%-3s", trace.data);
			trace = trace.prev;
		}
		System.out.println();
	}
	
	public void insertTail(String data) {
		Node temp = new Node();
		temp.data = data;
		
		temp.prev = tail.prev;
		tail.prev = temp;
		temp.prev.next = temp;
		temp.next = tail;
		
		System.out.println(data + " 추가됨");
	}

	private void init() {
		head = new Node();
		tail = new Node();
		
		head.prev = head;
		head.next = tail;
		tail.prev = head;
		tail.next = tail;
	}
}

class Node{
	String data;
	Node prev;	// 앞의 노드를 가리킴
	Node next;	// 뒤의 노드를 가리킴
}