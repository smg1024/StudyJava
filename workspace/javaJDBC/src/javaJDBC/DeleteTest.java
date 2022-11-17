package javaJDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DeleteTest extends DBConn{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public DeleteTest() {}
	
	public void empRemove() {
		// 사원번호 기준으로 사원 삭제하기
		try {
			// 데이터준비
			SelectTest st = new SelectTest();
			st.empList();
			System.out.print("삭제할 사원번호->");
			int empno = Integer.parseInt(br.readLine());
			
			// DB 연결
			dbConn();
			
			// 쿼리문 생성
			sql = "delete from emp where empno=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, empno);
			
			// 실행
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.printf("사원번호 %d 삭제되었습니다.\n", empno);
			}else {
				System.out.println("삭제 실패.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// DB 닫기
			dbClose();
		}
	}
	
//	public static void main(String[] args) {
//		DeleteTest dt = new DeleteTest();
//		dt.empRemove();
//
//	}

}
