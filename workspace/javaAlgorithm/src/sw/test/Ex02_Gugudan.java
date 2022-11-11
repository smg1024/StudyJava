package sw.test;

public class Ex02_Gugudan {

	public static void main(String[] args) {
		
		System.out.println("\t구구단");
		
		for(int i=1; i<=9; i+=3) {	// 1, 4, 7
			for(int dan=i; dan<i+3; dan++) {
				System.out.printf("==%d단==\t", dan);
			}
			System.out.println();
			
			for(int j=2; j<10; j++) {
				for(int k=i; k<i+3; k++) {
					int result=k*j;
					System.out.printf("%d*%d=%d\t", k, j, result);
				}
				System.out.println();
			}
			
			
			
//			for(int j=2; j<10; j++) {
//				int result1=i*j;
//				int result2=(i+1)*j;
//				int result3=(i+2)*j;
//				System.out.printf("%d*%d=%d\t", i, j, result1);
//				System.out.printf("%d*%d=%d\t", i+1, j, result2);
//				System.out.printf("%d*%d=%d\n", i+2, j, result3);
//			}
		}	
	}
}
