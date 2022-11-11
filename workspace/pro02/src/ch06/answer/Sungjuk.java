package ch06.answer;

public class Sungjuk {
	private int num;
	private int kor;
	private int eng;
	private int mat;
	
	private int tot;
	private float avg;
	private String hak;
	
	public Sungjuk(int num, int kor, int eng, int mat) {
		this.num=num;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}

	public void total() {
		tot=kor+eng+mat;
	}
	
	public void average() {
		avg=(float) tot/3;
	}
	
	public void hakjum() {
		if(avg >=90) {
			hak="A";
		}else if(avg >=80) {
			hak="B";
		}else if(avg >=70) {
			hak="C";
		}else if(avg >=60) {
			hak="D";
		}else if(avg < 60) {
			hak="F";
		}
	}
	
	public void disp() {
		System.out.println(num + "\t" + avg + "\t" + hak);
	}
}








