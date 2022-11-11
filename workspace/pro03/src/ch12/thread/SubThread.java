package ch12.thread;

public class SubThread extends Thread {
	public static boolean inputCheck=false;
	
	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			if(SubThread.inputCheck) return;
			
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("10초 안에 값이 입력되지 않아 종료합니다.");
		System.exit(0);
	}
}
