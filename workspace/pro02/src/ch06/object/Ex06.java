package ch06.object;

public class Ex06 {

	public static void main(String[] args) {
		Bank kim=new Bank("Kim", 10000, 0.07f);
		kim.disp();
		
		Bank park=new Bank("Park", 12000, 0.03f);
		park.disp();
		
		Bank lee=new Bank("Lee", 15000, 0.02f);
		lee.disp();
		
		lee.setRate(10.0f);
		kim.disp();
		park.disp();
		lee.disp();
		
	}

}
