package ch06.quiz;

class Circle{
	private double radius;
	private double area;
	
	public void getRadius(double radius) {
		this.radius=radius;
	}
	
	public double findArea() {
		area=Math.PI*(radius*radius);
		return area;
	}
	
	public void disp() {
		System.out.println("원의 면적: " + area);
	}
	
}

public class Quiz08 {

	public static void main(String[] args) {
		
		Circle c=new Circle();
		
		c.getRadius(4.0);
		c.findArea();
		c.disp();
		
	}

}
