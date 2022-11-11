package ch10.set;

public class Imsi {		// static, final - 변수 함수에 붙는다
	public int x=10;
	public final int Y=20;
	public static int z=30;
	public static final int SU=80;
	
	public void abc() {
		System.out.println(x);
		System.out.println(Y);
		System.out.println(z);
		System.out.println(SU);
		System.out.println(Imsi.SU);
		
		this.x=1;
//		Y=20;	ERROR
		Imsi.z=3;
//		SU-4;	ERROR
	}
	
	public void xyz() {
		int value=10;
		final int num=20;
		
		value=77;
//		num=55;	ERROR
		
//		static int zz=66;	이런 문법은 존재하지 않음
		System.out.println(value + "\t" + num);
	}

}
