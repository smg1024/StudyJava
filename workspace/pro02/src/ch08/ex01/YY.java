package ch08.ex01;
/*
 * class <--- class extends
 * interface <--- class implements
 * interface <--- interface extends
 * class <--- interface (이런 경우는 없음)
 */
public class YY implements XX {	// SU, disp() 반드시 재정의

	private int value;
	
	public YY(int value) {
		this.value=value;
	}
	
	@Override
	public void disp() {
		System.out.println("수요일입니다");
		System.out.println(SU);
		System.out.println(value);
	}
	
	public void apple() {
//		SU=77;
		value=88;
	}

}
