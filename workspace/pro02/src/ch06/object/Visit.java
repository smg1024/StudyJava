package ch06.object;

public class Visit {
	public int cnt = 0;	// 생성자가 없을 시 자료형에 따른 초기값으로 설정
	public static int count = 0;	// static이 붙으면 프로그램이 종료될때까지 메모리에 남아있다
								// this가 아닌 클래스명을 사용해서 접근한다
	
	
	public void newVisit() {
		++count;
		++cnt;
	}
	
	public void disp() {
		System.out.println(cnt);
		System.out.println(count);
	}
}
