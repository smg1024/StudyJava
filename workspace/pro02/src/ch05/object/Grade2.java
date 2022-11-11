package ch05.object;

public class Grade2 {
	
	// 입력받는 값
	private String name;
	private int StudNum;
	private int kor;
	private int eng;
	private int math;
	
	// 연산하는 값
	private int tot;
	private float avg;
	private String gpa;
	
//	public void input(String name, int StudNum, int kor, int eng, int math) {
//		this.name=name;
//		this.StudNum=StudNum;
//		this.kor=kor;
//		this.eng=eng;
//		this.math=math;
//	}
	public Grade2(String name, int StudNum, int kor, int eng, int math) {
		this.name=name;
		this.StudNum=StudNum;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public void total() {
		tot=kor+eng+math;
	}
	
	public void average() {
		avg=(float) tot/3;
	}
	
	public void gpa() {
		if(avg>=95) {
			gpa="A+";
		}else if(avg>=90) {
			gpa="A";
		}else if(avg>=85) {
			gpa="B+";
		}else if(avg>=80) {
			gpa="B";
		}else if(avg>=75) {
			gpa="C+";
		}else if(avg>=70) {
			gpa="C";
		}else if(avg>=60) {
			gpa="D";
		}else if(avg<60) {
			gpa="F";
		}
	}
	
	public void disp() {
		System.out.println(StudNum + "번 " + name + "학생의 총점 평균은 " + avg + "점, 학점은 " + gpa + "입니다.");
	}
}
