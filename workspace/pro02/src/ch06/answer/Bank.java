package ch06.answer;

public class Bank {
	// 금리계산 : 변동금리
	private String name;  // kim     park    lee
	private int don;        // 1000   2000   3000
	private static float iyul;   // 0.07f   0.03f   10.0f
	
	
	public Bank(String name, int don, float iyul) {
		this.name=name;
		this.don=don;
		Bank.iyul=iyul;
	}
	
	public void disp() {
		System.out.println("name:" + name);
		System.out.println("don:" + don);
		System.out.println("iyul:" + iyul + "\n");
	}
	
	public void setIyul(float iyul) {
		Bank.iyul=iyul;
	}
	
}
