package ch04.quiz;

public class Quiz11 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<=20; i++) {
			if(i%2==0) {
				continue;
			}else if(i%3==0) {
				continue;
			}else {
				sum+=i;
			}
		}
		System.out.println("sum:" + sum);
		
	}

}
