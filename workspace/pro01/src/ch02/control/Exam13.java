package ch02.control;

/*
 * 2-2) 다중 for 형식
 * 		for(초기화, 조건식, 증감식){
 * 			for(초기화, 조건식, 증감식){
 * 				문장들;
 * 				...
 * 			}
 * 		}
 */

public class Exam13 {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println(i + "\t" + j);
			}
			System.out.println();
		}
		
		for(char i='A'; i<='Z'; i++) {
			for(char j=i; j<='Z'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
