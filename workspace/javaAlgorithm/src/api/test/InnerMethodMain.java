package api.test;


public class InnerMethodMain {

	public static void main(String[] args) {
		InnerMethodTest imt = new InnerMethodTest();
		
		imt.getData();
		
		// 내부클래스 사용하기
		InnerMethodTest.InnerClass inner = new InnerMethodTest().new InnerClass();
		inner.print();
	}

}
