package control_examples;

/**
 * @Data : 2022. 9. 23
 * @Author : 강사
 * @Description : 2. 반복문
 * 						 2-4) continue, break
 *  */

public class Exam17 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			if(i==5)
				break;
			System.out.print(i + "\t");
		}
		System.out.println();
		
		for(int i=1;i<=10;i++){
			if(i==5)
				continue;
			System.out.print(i + "\t");
		}
		System.out.println("\n");
		
		int x=1;
		while(x<10){
			if(x==5) break;
			System.out.print(x + "\t");
			x++;
		}
		System.out.println();
		
		int y=0;
		do{
			y++;
			if(y==5) continue;			
			System.out.print(y + "\t");
		}while(y<10);
	}
}
