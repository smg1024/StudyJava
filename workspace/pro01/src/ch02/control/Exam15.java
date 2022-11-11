package ch02.control;

public class Exam15 {

	public static void main(String[] args) {
		
		int x=10;
		
		while(x>50) {	// while(false) --> don't run
			System.out.println(x);
		}
		
		do {
			System.out.println(x);	// run --> while(false) : 최초 1번은 실행
		}while(x>50);
	}

}
