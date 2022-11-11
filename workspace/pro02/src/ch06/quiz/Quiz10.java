package ch06.quiz;

class Plus{
	
	int x;
	int y;
	public int getX() {
		x++;
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		y++;
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}

public class Quiz10 {

	public static void main(String[] args) {
		
		Plus p=new Plus();
		p.setX(10);
		p.setY(20);
		
		System.out.println("x:" + p.getX() + ", y:" + p.getY());
	}

}
