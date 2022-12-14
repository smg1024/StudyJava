package api.test;

public class InnerMethodTest {
	// 멤버변수(field)
	int a = 1234;
	static int z = 9999;
	
	static {
		// 실행 명령어 사용 가능하며 제일 먼저 실행됨
		try {
			System.out.println("static 영역 실행됨");
		}catch(Exception e) {e.printStackTrace();}
	}
	
	// 생성자메소드		new InnerMethodTest();	new InnermethodTest(int a);
	InnerMethodTest(){
		System.out.println("SampleTest() 생성자 메소드 실행됨");
	}
	InnerMethodTest(int a){}
	
	// 메소드
	void getData() {
		System.out.println("getData() 실행됨");
		InnerClass i1 = new InnerClass();
		System.out.println("i1.b=" + i1.b);
		
		// 메소드에 정의한 내부클래스
		class InnerMethod{
			int c=5678;
			InnerMethod(){}
			void output() {
				System.out.println("c=" + c);
			}
		}
		
		InnerMethod im = new InnerMethod();
		im.output();
	}
	
	// 멤버 내부클래스
	class InnerClass{
		int b = 4567;
		InnerClass(){}
		void print() {
			System.out.println("b=" + b);
			System.out.println("a=" + a);
		}
	}
}

