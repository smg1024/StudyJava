package ch06.object;
// 금리계산 : 변동금리
public class Bank {
	private String name;		// kim		park	lee
	private int fund;			// 10000	12000	15000	
	private static float rate;	// 0.07		0.03	0.02
	
	public Bank(String name, int fund, float rate) {
		this.name=name;
		this.fund=fund;
		Bank.rate=rate;
	}
	
	public void disp() {
		System.out.println("Name: " + name);
		System.out.println("Fund: " + fund);
		System.out.println("Rate: " + rate + "\n");
	}
	
	public void setRate(float rate) {
		Bank.rate=rate;
	}
}
