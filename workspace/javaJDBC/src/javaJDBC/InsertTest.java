package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertTest {

	public InsertTest() {}
	public void empInsert() {
		// JDBC : Java DataBase Connection
		// 자바에서 Oracle Database를 사용하기 위해서 build path 설정한다.
		// 프로젝트 -> Build Path -> Configure Build Path
		//			-> Library -> Add External jar -> 드라이버 추가
		
		// 1. JDBC 드라이버를 JVM에 등록한다
		//		oracle.jdbc.driver.OracleDriver -> 패키지경로.클래스명을 알려주면 객체로 변환해주는 클래스
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩 예외 발생");
//			e.printStackTrace();
		}
		
		// 2. DB 연결
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";	// 서버주소, 포트, SID(전역데이터베이스)
			String username = "poby";
			String password = "981024";
			conn = DriverManager.getConnection(url, username, password);
			
			// 사원정보 - 사원번호, 사원명, 입사일(sysdate), 급여 입력
			System.out.print("사원번호->");
			int empno = Integer.parseInt(sc.nextLine());
			System.out.print("사원명->");
			String ename = sc.nextLine();
			System.out.print("급여->");
			int sal = Integer.parseInt(sc.nextLine());
			
			// 3. SQL문을 만들어 PreparedStatement 객체 생성
			String sql = "insert into emp(empno, ename, hiredate, sal) values(?,?,sysdate,?)";	// 실제 입력 데이터는 ?로 임시처리
			pstmt = conn.prepareStatement(sql);
			
			// ? 세팅
			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);
			pstmt.setInt(3, sal);
			
			// 4. 쿼리문 실행 -- 자동 커밋된다
			// executeUpdate()는 레코드의 변화가 있을때, executeQuery()는 조회할 때 사용
			int result = pstmt.executeUpdate();	// 처리한 레코드 수를 리턴한다
			
			if(result>0) {	// 사원 등록 성공
				System.out.println("사원이 등록되었습니다.");
			}else {	// 사원 등록 실패
				System.out.println("사원 등록 실패하였습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 5. conn, pstmt 닫기 **역순으로 닫아줘야 한다
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e) {System.out.println("DB연결 닫기 예외발생.");}
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		InsertTest it = new InsertTest();
		it.empInsert();
		
		
		
	}
	
}
