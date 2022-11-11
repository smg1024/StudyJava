package ch07.ex05;

public class Point {
	protected int x;
	protected int y;
	
	public Point() {
		this.x=0;
		this.y=0;
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void showPoint() {
		System.out.println(x + "\t" + y);
	}
}
