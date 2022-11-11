package ch02.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		int no=0;
		boolean a=no>=4;
		System.out.println(a);
		
		int kimchi=0;
		boolean b=kimchi>2 && kimchi<8;
		System.out.println(b);
		
		int book=0;
		boolean c=(book>-2 && book<0) || (book>5 && book<8);
		System.out.println(c);
		
	}

}
