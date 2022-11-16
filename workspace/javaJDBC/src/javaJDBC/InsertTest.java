package javaJDBC;

public class InsertTest {

	public InsertTest() {}
	public void empInsert() {
		// JDBC : Java DataBase Connection
		// 자바에서 Oracle Database를 사용하기 위해서 build path 설정한다.
		// 프로젝트 -> Build Path -> Configure Build Path -> Library -> Add External jar -> 드라이버 추가
	}
	
	public static void main(String[] args) {
		InsertTest it = new InsertTest();
		it.empInsert();
		
	}

}
