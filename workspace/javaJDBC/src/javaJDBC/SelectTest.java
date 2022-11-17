package javaJDBC;

import java.sql.SQLException;

public class SelectTest extends DBConn{
	
	public SelectTest() {}
	
	public void empList() {
		try {
			// 사원목록 선택
			// 1. 드라이버 로딩 - 상속받은 DBConn 클래스의 static영역에서 이미 실행됨
			// 2. DB연결
			dbConn();
			// 3. 쿼리문(PreparedStatement) 생성
			sql = "select empno, ename, job, hiredate, sal, comm from emp order by empno";	// 쿼리문 끝에 ; 붙이면 에러
			pstmt = conn.prepareStatement(sql);
			
			// 4. 실행
			rs = pstmt.executeQuery();	// 선택한 레코드 정보를 ResultSet 객체로 리턴
			
			// 5. DB에서 SELECT한 레코드 출력
			while(rs.next()) {	// rs.next()는 선택한 레코드의 커서 위치를 이동시킨다
				// 정수 : getInt(), 실수 : getDouble(), 문자열 : getString()
				int empno = rs.getInt(1);	// 1번 칼럼에 있는 정수 리턴
				String ename = rs.getString(2);	// 2번 칼럼에 있는 문자열 리턴
				String job = rs.getString(3);
				String hiredate = rs.getString(4);	// 날짜는 문자열 형태
				double sal = rs.getDouble(5);
				double comm = rs.getDouble("comm");	// 칼럼번호 대신 칼럼명으로도 호출 가능
				System.out.printf("%d, %s, %s, %s, %.2f, %.2f\n", empno, ename, job, hiredate, sal, comm);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			// 6. DB닫기
			dbClose();
		}
	}
	
	
//	public static void main(String[] args) {
//		new SelectTest().empList();
//
//	}

}
