package ch12.thread;

/*
 * 1. Process(프로세스) : 실행중인 프로그램 ex) MS Word, MS PPT, MS Excel
 * 2. Multitasking(다중작업) : 여러개의 프로세스를 동시에 실행
 * 3. Multi-Thread Process : 하나의 프로세스에 여러개의 thread가 동시에 실행
 * 
 */

public class Ex01 {

	public static void main(String[] args) {	// main thread
		Alphabet a=new Alphabet();
		a.start();	// run()
		
		Digit d=new Digit();
		d.start();	// run()
		
		for(int i=1; i<=20; i++) {
			System.out.println("**********");
		}
	}

}
