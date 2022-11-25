package javaJDBCProcedure;

import java.sql.Types;
import java.util.Scanner;

import javaJDBC.DBConn;

public class InsertProcedure extends DBConn{
	Scanner sc = new Scanner(System.in);
	
	public InsertProcedure() {}
	
	public void start() {
		try {
			// 데이터 준비
			// 사원명, 비밀번호, 연락처, 부서코드, 직급코드를 입력받아
			System.out.print("사원명 : ");
			String username = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			System.out.print("연락처 : ");
			String tel = sc.nextLine();
			System.out.print("부서코드 : ");
			int dept_code = Integer.parseInt(sc.nextLine());
			System.out.print("직급코드 : ");
			int pos_code = Integer.parseInt(sc.nextLine());
			
			// 1. 드라이버 로딩 - DBConn 상속하면서 이미 처리됨
			// 2. DB연결
			dbConn();
			
			// 3. Statement 생성
			// 프로시저 호출은 {}내에 표시한다.
			sql = "{CALL employee_insert(?,?,?,?,?,?)}";
			cstmt = conn.prepareCall(sql);
			
			// 데이터를 statement객체에 할당
			cstmt.setString(1, username);
			cstmt.setString(2, password);
			cstmt.setString(3, tel);
			cstmt.setInt(4, dept_code);
			cstmt.setInt(5, pos_code);
			
			// 프로시저 처리결과를 out받기 위한 위치에 데이터형을 정의한다
			cstmt.registerOutParameter(6, Types.INTEGER);
			
			// 4. 실행
			cstmt.executeUpdate();
			
			if(cstmt.getInt(6)>0) {	// 사원등록 성공
				System.out.println(username + "사원을 등록하였습니다.");
			}else {	// 사원등록 실패
				System.out.println("사원등록을 실패하였습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 5. 종료
			dbClose();
		}
	}

	public static void main(String[] args) {
		new InsertProcedure().start();
	}

}
