package ch11.exception;

public class Ex03 {

	public static void main(String[] args) {	// 10 20 30 
//		for(int i=0; i<args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		try {
			int su=Integer.parseInt(args[0]);
			int value=Integer.parseInt(args[1]);
			
			int div=su/value;
			System.out.println("div: " + div);
		}catch(NumberFormatException e) {
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 수 입력을 잘못하셨습니다.");
		}finally {
			System.out.println("나중에 리소스 종료 많이 사용됨!");
		}
		
		System.out.println("END!");
	}

}
