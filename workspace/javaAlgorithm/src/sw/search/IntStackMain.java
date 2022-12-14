package sw.search;

import java.util.Scanner;


public class IntStackMain {
	public static Scanner sc = new Scanner(System.in);
	
	public static void startStack() {
		// 스택 객체를 생성하고, 스택의 크기를 설정할 수 있음
		IntStack stack = new IntStack(5);
		
		do {
			// 메뉴 작성하기
			System.out.print("(1) PUSH  (2) POP  (3) PEEK  (4) DUMP  (5) SEARCH  (6) EMPTY  (7) INFO  (0) 종료 -> ");
			int menu = sc.nextInt();
			
			if(menu==0) {
				System.out.println("종료했습니다.");
				break;
			}	// 종료
			
			switch(menu) {
			case 1:
				// push : 데이터를 스택에 담기
				System.out.print("데이터 입력 : ");
				int inData = sc.nextInt();
				try {
					stack.push(inData);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				// pop : 스택에서 제일 마지막으로 저장된 값 꺼내기
				try {
					int popData = stack.pop();
					System.out.println(popData + " 꺼냄.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}
				break;
			case 3:
				// peek : 스택에서 제일 마지막으로 저장된 값 구하기
				try {
					int topData = stack.peek();
					System.out.println("마지막으로 담긴 데이터 : " + topData);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}
				break;
			case 4:
				// dump : 스택의 정보 알아내기
				try {
					stack.dump();
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}
				break;
			case 5:
				// search : 입력한 데이터가 위치한 index값 구하기
				System.out.print("검색값 : ");
				int searchData = sc.nextInt();
				int idx = stack.indexOf(searchData);
				if(idx>=0) {	// 스택에 데이터가 있을 때
					System.out.println(searchData + "은(는) " + idx + "번 index위치에 있습니다.");
				}else {		// 스택에 데이터가 없을 때
					System.out.println(searchData + "은(는) 없습니다.");
				}
				break;
			case 6:
				// empty : 스택 내의 모든 데이터를 지우기
				stack.makeEmpty();
				break;
			case 7:
				// info : 용량, 데이터 수, 데이터 정보, empty 여부
				System.out.println("저장 가능한 데이터 수 : " + stack.capacity());	// 용량
				System.out.println("현재 데이터 수 : " + stack.size());
				try {
					stack.dump();
				}catch(IntStack.EmptyIntStackException e) {}
				System.out.println("스택이 " + (stack.isEmpty() ? "비어있습니다.":"비어있지 않습니다."));
				
				break;
			default:
				// 메뉴를 잘못 선택했습니다.
				System.out.println("메뉴를 잘못 입력하였습니다. 0~8 사이의 값을 입력하세요.");
			}
			
		}while(true);
		
	}
	
	public static void main(String[] args) {
		startStack();
	}

}
