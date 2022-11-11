package ch07.quiz;

class Card{
	public int kind;
	public int num;
	public static int width;
	public static int height;
	
	public void getCard(int k, int n) {
		kind=k;
		num=n;
	}
}
public class Quiz17 {
	public static void main(String[] args) {
		Card card=new Card();
		card.getCard(10, 20);
		
		System.out.println(Card.width + Card.height + card.kind + card.num);
	}

}
