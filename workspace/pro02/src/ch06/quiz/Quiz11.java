package ch06.quiz;

class Printer{
	public void println(int num) {
		System.out.println(num);
	}
	
	public void println(boolean tf) {
		System.out.println(tf);
	}
	public void println(double decimal) {
		System.out.println(decimal);
	}
	public void println(String str) {
		System.out.println(str);
	}
}

public class Quiz11 {

	public static void main(String[] args) {
		Printer printer=new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
	}

}
