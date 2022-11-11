package ch06.quiz;

class SutdaCard{
	private int num;
	private boolean isKwang;
	
	public void setNum(int num) {
		if(num<1 || num>10) return;
		this.num=num;
		
	}
	public int getNum() {
		return num;
	}
	
	public void setisKwang(boolean isKwang) {
		if(isKwang=false) return;
		this.isKwang=isKwang;
	}
	
	public boolean getisKwang() {
		return isKwang;
	}
	
}

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
