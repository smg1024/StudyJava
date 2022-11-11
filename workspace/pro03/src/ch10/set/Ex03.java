package ch10.set;

public class Ex03 {

	public static void main(String[] args) {
		Imsi i=new Imsi();
		System.out.println(i.x);
		System.out.println(i.Y);
		System.out.println(Imsi.z);
		System.out.println(Imsi.SU);
		
		Temp.bb();	// static은 객체발생이 필요하지 않음
	}

}
