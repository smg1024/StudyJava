package ch07.ex07;

class AA{
	public void aa() {}
	public void bb() {}
	public void xx() {
		System.out.println("AA");
	}
}

class BB extends AA{
	public void cc() {}
	public void dd() {}
	public void xx() {
		System.out.println("BB");
	}
}

public class Exam {

	public static void main(String[] args) {
		AA a=new AA();
		a.aa();
		a.bb();
		
		BB b=new BB();
		b.aa();
		b.bb();
		b.cc();
		b.dd();
		
		AA c=new BB();	// Upcasting 묵시적형변환 자식 클래스를 부모에게 담아준다
		c.aa();
		c.bb();
//		c.cc();		부모는 자식의 함수를 마음대로 쓰지 못한다
//		c.dd();
		c.xx();		// Override해줘야 부모클래스에서 쓸 수 있음
	}

}
