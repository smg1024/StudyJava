package ch05.object;

public class Data {		// this라는 내부 포인터가 존재한다.
	private int x;		// 내부적으로 this.x, 외부적으론 a.x
	private int y;
	
	public void setData(int x, int y) {		// 외부에서 받아온 a와 b를 각각 x와 y에 넣어준다
		this.x=x;
		this.y=y;
	}
	
	public void disp() {
		System.out.println(x + "\t" + y);
	}
}
