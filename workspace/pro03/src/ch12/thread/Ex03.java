package ch12.thread;

//import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
//		
//		String input=JOptionPane.showInputDialog("10초 안에 값을 입력하세요.");
//		if(input!=null) {
//			System.out.println("입력하신 값은: " + input + "입니다.");
//		}
//		
//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//			
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		System.out.println("10초 안에 값이 입력되지 않아 종료합니다.");
		
		SubThread s=new SubThread();
		s.start();
		
		InputThread i=new InputThread();
		i.start();
		
	}

}
