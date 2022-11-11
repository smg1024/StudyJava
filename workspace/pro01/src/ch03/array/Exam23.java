package ch03.array;

public class Exam23 {

	public static void main(String[] args) {
		
		int[][] array=new int[][] {{10, 20, 30},{20, 30, 40},{30, 40, 50},{40, 50, 60}};
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("배열의 행의 수: " + array.length);
		System.out.println("0행의 열 수: " + array[0].length);
		System.out.println("1행의 열 수: " + array[1].length);
				
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		int[][] num=new int[][] {{66, -78}, {55, -44},{-22, -11}};
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				if(num[i][j]>0) {		// 배열의 숫자들 중 양수만 뽑아내
					System.out.println(num[i][j]);
				}
			}
		}
		
	}

}