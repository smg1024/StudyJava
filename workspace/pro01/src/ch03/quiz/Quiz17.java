package ch03.quiz;

public class Quiz17 {

	public static void main(String[] args) {
		char grade='B';
		if(grade=='A' || grade=='a') {
			System.out.println("우수회원입니다.");
		}else if(grade=='B' || grade=='b') {
			System.out.println("정회원입니다.");
		}else if(grade=='C' || grade=='c') {
			System.out.println("일반회원입니다.");
		}else if(grade=='F' || grade=='f') {
			System.out.println("손님입니다.");
		}
	}

}
