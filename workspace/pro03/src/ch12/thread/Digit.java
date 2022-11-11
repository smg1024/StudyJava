package ch12.thread;

public class Digit extends Thread{	// sub thread
	@Override
	public void run(){
		for(int i=1; i<20; i++) {
			System.out.print(i + "\t");
			if(i%10==0) System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
