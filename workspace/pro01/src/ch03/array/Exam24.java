package ch03.array;

/*
 * 반복문 : break, continue
 */

public class Exam24 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i==5) {
				break;		// if문을 제외한 가장 가까운 블럭 밖으로 빠져나간다.
							// 반복문 안에서만 사용된다.
			}
			System.out.println(i);
		}
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if(i==5) {
				continue;	// 건너뜀
			}
			System.out.println(i);
		}
		System.out.println();
	
		
		int x=1;
		while(x<10) {
			if(x==5) {
				break;
			}
			System.out.println(x);
			x++;
		}
		System.out.println();
		
		int y=0;
		while(y<10) {
			y++;
			if(y==5) {
				continue;
			}
			System.out.println(y);
		}
		System.out.println();
		
		int z=0;
		do {
			z++;
			
			if(z==5) {
				continue;
			}
			System.out.println(z);
		}while(z<10);
		
		
		
	}

}
