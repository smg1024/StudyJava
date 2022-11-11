package ch12.thread;

//import java.awt.Toolkit;

public class Ex02 {

	public static void main(String[] args) {
//		Toolkit toolkit=Toolkit.getDefaultToolkit();
//		
//		for(int i=0; i<5; i++) {
//			toolkit.beep();
//		}
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("띵");
//		}	// 이렇게 짜면 순차적으로 진행한다. 소리와 글자가 동시에 나오려면 thread 이용
		
		PrintSub p=new PrintSub();
		p.start();
		
		BeepTask b=new BeepTask();
		b.start();
		
	}

}
