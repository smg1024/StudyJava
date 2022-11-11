package ch02.control;

// 연습 - 중첩 if

public class Exam10 {

	public static void main(String[] args) {

		int num=150;	// 양수 or 음수, 200보다 큰 수 작은 수?
		
		if(num>0) {			// 150 > 0 --> if(1)
			System.out.println("양수입니다.");
			if(num>200) {	// 150 > 200 --> if(0) --> don't run
				System.out.println("200보다 큰 수 입니다.");
			}else {			// 150 < 200 --> if(1) -->run
				System.out.println("200보다 작은 수 입니다.");
			}
		}else if(num<0) {
			System.out.println("음수입니다.");
		}
		System.out.println("");
		
		// 학점 예제 A : A+ >= 97, A0 96 ~ 94, A- <= 93, B : B+ B0 B-
		int score=84;
		String grade=null;
		
		if(score>=90) {
			if(score>=97) {
				grade="A+";
			}else if(score>=94 && score<=96) {
				grade="A";
			}else if(score<=93) {
				grade="A-";
			}
		}else if(score>=80) {
			if(score>=87) {
				grade="B+";
			}else if(score>=84 && score<=86) {
				grade="B";
			}else if(score<=83) {
				grade="B-";
			}
		}else if(score>=70) {
			if(score>=77) {
				grade="C+";
			}else if(score>=74 && score<=76) {
				grade="C";
			}else if(score<=73) {
				grade="C-";
			}
		}else if(score<70) {
			grade="F";
		}
		System.out.println("학생의 점수는 " + score + "이고, 학점은 " + grade + "입니다");
		
	}

}
