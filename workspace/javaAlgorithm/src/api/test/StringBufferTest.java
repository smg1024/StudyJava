package api.test;

public class StringBufferTest {

		public StringBufferTest() {}
		
		public void start() {
			
			String str="test";
			str=str.replaceAll("t", "TT");
			System.out.println(str);
			
			// StringBuffer(동기화), StringBuilder(동기화 안함)
			
			StringBuffer sb1=new StringBuffer();
			StringBuffer sb2=new StringBuffer(50);
			StringBuffer sb3=new StringBuffer("자바의 문자열처리방식 테스트중");
			// sb1=16, sb2=50, sb3=32
			
			// 마지막에 문자열 추가하기
			sb1.append("goguma");
			sb3.append("1234567890");
			// sb1=16, sb2=50, sb3=32
			
			// 중간에 문자 추가
			sb3.insert(5, "HELLO");
			// sb1=goguma, sb2=, sb3=자바의 문HELLO자열처리방식 테스트중1234567890
			
			// 중간에 문자 삭제
			sb3.delete(3, 5);
			// sb1=goguma, sb2=, sb3=자바의HELLO자열처리방식 테스트중1234567890
			
			// 문자열 뒤집기
			sb3.reverse();
			// sb1=goguma, sb2=, sb3=0987654321중트스테 식방리처열자OLLEH의바자
			
			// 확보된 공간
			System.out.printf("sb1=%d, sb2=%d, sb3=%d\n", sb1.capacity(), sb2.capacity(), sb3.capacity());
			System.out.printf("sb1=%s, sb2=%s, sb3=%s\n", sb1.toString(), sb2.toString(), sb3.toString());
			
;			
		}
		
		public static void main(String[] args) {
			new StringBufferTest().start();
		}

}
