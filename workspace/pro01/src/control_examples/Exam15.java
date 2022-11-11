package control_examples;

/**
 * @Data : 2022. 9. 23
 * @Author : 강사
 * @Description : 2. 반복문
 * 						 2-2) while 형식)
 * 								while(①조건식){           // 조건식이 true일 경우
 * 										②실행문;
 * 								}
 * 
 * 						2-3) do ~ while 형식)
 * 							  do{
 * 									①실행문;
 * 							  }while(②조건식);
 *  */

public class Exam15 {
	public static void main(String[] args) {
		int x=1;
		while(x<=10){
			System.out.print(x + "\t");
			x++;
		}	
		System.out.println();
		
		int sum=0;
		int y=1;
		while(y<=100){
			sum+=y;
			y++;
		}
		System.out.println("sum:" +  sum + "\n");
		System.out.println();
		
		int a=1;
		do{
			System.out.print(a + "\t");
			a++;
		}while(a <=10);
		System.out.println();
		
		int hap=0;
		int b=1;
		do{
			hap+=b;
			b++;
		}while(b <= 100);
		System.out.println("hap:" + hap);

	}
}
