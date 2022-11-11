package control_examples;

/**
 * @Data : 2022. 9. 23
 * @Author : 강사
 * @Description : 1-1) 조건문 - if~else if 형식) 
 * 				if(조건식1){						// 조건식 true      
 * 					문장들;
 * 					....
 * 				}else if(조건식2){				// 조건식 true
 * 					문장들;
 * 					....
 * 				}else if(조건식3){				// 조건식 true
 * 					문장들;
 * 					.....
 * 				}
 * 					
 */

public class Exam10 {
	public static void main(String[] args) {
		int num=52;
		int value=24;
		
		if(num > value){
			System.out.println("num가 value보다 크다.");
		}else if(num == value){
			System.out.println("num와 value가 같다.");
		}else if(num > value){
			System.out.println("num가 value보다 작다. \n");
		}
		
		System.out.println();
		
		String name="홍길동";
		int kor=70;
		int eng=80;
		int mat=90;
		
		int tot=kor+eng+mat;
		float avg=(float)tot/3;
		
		char hakjum=0;
		if(avg>=90)
			hakjum='수';
		else if(avg >=80)
			hakjum='우';
		else if(avg >=70)
			hakjum='미';
		else if(avg >=60)
			hakjum='양';
		else if(avg < 60)
			hakjum='가';
		
		System.out.println("이름:" + name);
		System.out.println("평균:" + (int)(avg*10+0.5)/10.0 + "\t" + "평가:" + hakjum);

	}
}
