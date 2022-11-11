package ch07.ex07;

public class Son extends Parents{	// x, y, 생성자(), calculate()
	public Son() {
		super();
	}
	
	public Son(int x, int y) {
		super(x, y);
	}
	
	public void calculate() {
		System.out.println("sub: " + (x - y));
	}
	
	public void disp() {
		System.out.println("disp Function");
	}
}
