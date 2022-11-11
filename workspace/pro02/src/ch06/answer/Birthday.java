package ch06.answer;

public class Birthday {    // this=b
	private int year;
	private int month;
	private int day;
	private String name;
	
	/* public void input(int year, int month, int day, String name) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.name=name;
	} */
	
	public Birthday(int year, int month, int day, String name) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.name=name;
	}
	
	public void disp() {
		System.out.println(year + "\t" + month  + "\t" + day + "\t" + name);
		
	}
}
