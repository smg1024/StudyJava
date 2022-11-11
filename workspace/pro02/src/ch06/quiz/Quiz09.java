package ch06.quiz;

class ABS{
	int value;
	
	public void setValue(int value) {
		this.value=value;
	}
	public int resultAbs() {
		if(value<0) {
			value=value*(-1);
		}
		return value;
	}
	public void disp() {
		System.out.println("result: " + value);
	}
	
}

public class Quiz09 {

	public static void main(String[] args) {
		
		ABS abs=new ABS();
		
		abs.setValue(-10);
		abs.resultAbs();
		abs.disp();
	}

}
