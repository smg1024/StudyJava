package ch08.quiz;

class LCD{
	protected int size;
	public LCD(int size) {
		this.size=size;
	}
}

class ColorLCD extends LCD{
	int colorSize;
	public ColorLCD(int colorSize, int size) {
		super(size);
		this.colorSize=colorSize;
	}
	
	public void disp() {
		System.out.println(super.size);
	}
}

public class Quiz11 {
	public static void main(String[] args) {
		
	}

}
