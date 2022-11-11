package ch03.quiz;

public class Quiz09 {

	public static void main(String[] args) {
		
		char coin='K';
		
		switch(coin) {
		case 'A': case'a':
			System.out.println("사과");
			break;
		case 'P': case 'p':
			System.out.println("배");
			break;
		case 'G': case 'g':
			System.out.println("포도");
			break;
		default:
			System.out.println(coin);
			break;
		}
	}

}
