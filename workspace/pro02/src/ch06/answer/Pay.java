package ch06.answer;

public class Pay {
	private String name;     // 왕눈이
	private int bonbong;   //  2000000
	
	private int tex;
	private int silsu;
	
	public Pay(String name, int bonbong) {
		this.name=name;
		this.bonbong=bonbong;
	}
	
	public void yonsan() {
		tex=(int) (bonbong * 0.045 + 0.5);
		silsu=bonbong-tex;
	}
	
	public void disp() {
		System.out.println(name + "\t" + bonbong + "\t" + tex + "\t\t" + silsu);
		System.out.println();
	}
}
