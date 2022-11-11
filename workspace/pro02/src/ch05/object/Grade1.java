package ch05.object;

public class Grade1 {	// 클래스
	public int number;	// 필드 또는 멤버 변수
	public String name;
	public int kor;
	public int eng;
	public int math;
	public int tot;
	public float avg;
	
	public void input(int Number, String Name, int Kor, int Eng, int Math) {
		number=Number;
		name=Name;
		kor=Kor;
		eng=Eng;
		math=Math;
	}
	
	// 총점 담당 함수
	public void total() {	// 멤버함수
		tot=kor+eng+math;
	}
	
	// 평균 담당 함수
	public void avg() {
		avg=(float) tot/3;
	}
	
	// 출력 담당 함수
	public void disp() {
		System.out.println(number + "번 " + name + "의 평균 성적은 " + avg + "점입니다.");
	}
	
}
