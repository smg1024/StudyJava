package ch08.quiz;

abstract class Figure{
	public abstract void area();
	public abstract void around();
}

class Rectangular extends Figure{
	double width, length;
	public Rectangular(double width, double length) {
		this.width=width;
		this.length=length;
	}
	@Override
	public void area() {
		double area=width*length;
		System.out.println("사각형의 면적: " + area);
	}
	@Override
	public void around() {
		double around=(2*width)+(2*length);
		System.out.println("사각형의 둘레: " + around);
	}
	
}

class Circle extends Figure{
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	@Override
	public void area() {
		double area=Math.PI*(radius*radius);
		System.out.println("원의 면적: " + area);
	}
	@Override
	public void around() {
		double around=2*Math.PI*radius;
		System.out.println("원의 둘레: " + around);
	}
	
}

public class Quiz27 {

	public static void main(String[] args) {
		Figure f=new Rectangular(2.3, 3.7);
		f.area();
		f.around();
		
		Figure i=new Circle(3.6);
		i.area();
		i.around();
	}

}
