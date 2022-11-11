package ch12.thread;

public class Alphabet extends Thread{	// sub thread
	@Override
	public void run() {
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i + "\t");
			if(i=='Z') System.out.println(i);
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
