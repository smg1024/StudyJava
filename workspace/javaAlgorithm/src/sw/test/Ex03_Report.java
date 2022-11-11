package sw.test;

/* 과제(22.11.04.까지)
 * 다중 for문을 이용하여 1~50사이의 값 중에서 소수를 구하시오.
 * 소수 : 1과 자기 자신 이외의 약수를 갖지 않는 수 
 */

public class Ex03_Report {

	public static void main(String[] args) {
//		for(int i=2; i<=50; i++) {
//			if(i==2 || i==3 || i==5 || i==7) {
//				System.out.printf("%d ", i);
//			}else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
//				System.out.printf("%d ", i);
//			}
//		}
		
		int count=0;
		for(int num=2; num<=50; num++) {
			int j=0;
			for(j=2; j<num; j++) {
				if(num%j==0) {
					break;	// 소수가 아닐때
				}
			}
			if(num==j) {	// 소수일때
				System.out.print(num + " ");	// 출력
				count++;	// 개수 카운트
			}
		}
		System.out.println("\n개수: " + count);
	}

}
