package javaJDBC;

import java.util.Scanner;

public class UpdateTest extends DBConn{
	Scanner sc = new Scanner(System.in);
	
	public UpdateTest() {}
	
	public void empEdit() {
		// 사원번호를 기준으로 담당업무와 급여를 수정
		try {
			// 기존 사원목록 출력
			SelectTest st = new SelectTest();
			st.empList();
			System.out.println("==================================================");
			// 수정할 정보를 Scanner로 입력
			System.out.print("사원번호->");
			int empno = Integer.parseInt(sc.nextLine());
			System.out.print("수정할 담당 업무->");
			String job = sc.nextLine();
			System.out.print("수정할 급여->");
			double sal = Double.parseDouble(sc.nextLine());
			
			// 1. DB 연결
			dbConn();
			
			// 2. 쿼리문 생성 -> PreparedStatement객체 생성
			sql = "update emp set job=?, sal=? where empno=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, job);
			pstmt.setDouble(2, sal);
			pstmt.setInt(3, empno);
			
			// 3. 실행
			int result = pstmt.executeUpdate();	// Update된 레코드 수를 리턴
			if(result>0) {
				System.out.printf("사원번호 %d의 담당업무는 %s, 급여는 %.2f로 수정되었습니다.\n", empno, job, sal);
			}else {
				System.out.println("수정 실패.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 4. DB 닫기
			dbClose();
		}
		
	}
	
//	public static void main(String[] args) {
//		new UpdateTest().empEdit();
//
//	}

}
