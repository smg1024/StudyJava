package ch06.answer;

public class ABC {   // this=b
	// 프로그램이 종료될까지 메모리에 남아있다.
	// 클래스명을 사용해서 접근 ABC.count
	public static int count;    
	public int cnt;

	public void input() {
		++count;           // 3
		++cnt;             // 1
	}
	
	public void apple(int cnt, int count) {
		this.cnt=cnt;
		ABC.count=count;
	}
}
