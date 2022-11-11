package control_examples;

/**
 * @Data : 2022. 9. 23
 * @Author : 강사
 * @Description : 1-1) 조건문 - 중첩 if 예)
 * 
 */

public class Exam11 {
	public static void main(String[] args) {
		int num=150;
		
		if(num > 0){
			if(num >200){
				System.out.println("200보다 큰수 입니다.");
			}else{
				System.out.println("200보다 작은수 입니다.");
			}
		}else{
			System.out.println("음수입니다");
		}

		System.out.println();
		
		
		int score=84;
		String grade="";
		
		if(score >=90){
			if(score>=97){
				grade="A+";
			}else if(score <=96 && score >=94){
				grade="A0";
			}else if(score <=93){
				grade="A-";
			}
			
		}else if(score >=80){
			if(score>=87){
				grade="B+";
			}else if(score <=86 && score >=84){
				grade="B0";
			}else if(score <=83){
				grade="B-";
			}
			
		}else if(score >=70){
			if(score>=77){
				grade="C+";
			}else if(score <=76 && score >=74){
				grade="C0";
			}else if(score <=73){
				grade="C-";
			}
			
		}else if(score < 70){
			System.out.println("재수강!!!");
		}
		
		System.out.println("학점:" + score + "\t" + grade);
	}
}
