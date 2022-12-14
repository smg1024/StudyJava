package sw.search;
/*
 * 스택 메모리
 * 스택은 임시로 데이터를 저장하는 기능을 가지며
 * 나중에 입력된 데이터를 먼저 출력할 수 있는 기능을 가진다
 * 출력한 데이터는 스택에서 제거된다
 */

public class IntStack {
	// 배열의 크기
	private int capacity;
	
	// 데이터를 담을 배열
	private int[] stk;
	
	// 스택의 포인터 : 멤버영역일때 초기값 자동설정됨
	private int ptr = 0;
	
	// 생성자 메소드
	public IntStack(int capacity) {
		// 전달받은 매개변수를 stk배열의 크기로 설정
		this.stk = new int[capacity];
		this.capacity = capacity;
	}
	
	// push 메소드
	public int push(int inData) throws OverflowIntStackException {
		// 오버플로우 예외처리
		if(this.capacity==this.ptr) {	// 배열의 크기 = 최대 index 일때
			throw new OverflowIntStackException(); 
		}
		// ptr위치에 data를 담고, ptr은 1증가 시킨다
		return stk[ptr++] = inData;
	}
	
	// pop 메소드
	public int pop() throws EmptyIntStackException{
		if(this.ptr==0) {
			throw new EmptyIntStackException();
		}
		
		// 가장 마지막으로 저장된 값 (제일 위에 있는 값)을 꺼낸다
		return stk[--ptr];
	}
	
	// peek 메소드
	public int peek() throws EmptyIntStackException{
		if(this.ptr==0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr-1];
	}
	
	// dump 메소드
	public void dump() throws EmptyIntStackException{
		if(this.ptr==0) {
			throw new EmptyIntStackException();
		}
		
		for(int i=0; i<ptr; i++) {
			System.out.println("stk[" + i + "] = " + stk[i]);
		}
	}
	
	// search 메소드
	public int indexOf(int searchData) {
		for(int i=ptr-1; i>=0; i--) {
			if(stk[i]==searchData) {
				return i;
			}
		}
		return -1;
	}
	
	// empty 메소드
	public void makeEmpty() {
		ptr = 0;	// 포인터 처음 위치로 돌려주면 초기화가 된다
	}
	
	// info 용량 메소드
	public int capacity() {
		return this.capacity;
	}
	
	// info 데이터 수 메소드
	public int size() {
		return ptr;
	}
	
	// info empty여부
	public boolean isEmpty() {
		if(ptr==0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	// 오버플로우 발생 시 처리할 예외내부클래스 생성
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	// 스택이 비었을 처리할 예외내부클래스 생성
		public class EmptyIntStackException extends RuntimeException{
			public EmptyIntStackException() {}
	}
}
