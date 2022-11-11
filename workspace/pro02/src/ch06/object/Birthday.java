package ch06.object;

public class Birthday {
	public int year;
	public int month;
	public int day;
	public String name;
	
//	public void input(int year, int month, int day, String name) {
//		this.year=year;
//		this.month=month;
//		this.day=day;
//		this.name=name;
	
	public Birthday(int year, int month, int day, String name) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.name=name;
	}
	
	public void disp() {
		System.out.println(name + "의 생년월일은 " + year + "년 " + month + "월 " + day + "일입니다.");
	}
}
