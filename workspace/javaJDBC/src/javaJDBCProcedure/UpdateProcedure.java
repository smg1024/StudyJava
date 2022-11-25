package javaJDBCProcedure;

import java.sql.Types;
import java.util.Scanner;

import javaJDBC.DBConn;

public class UpdateProcedure extends DBConn {
	Scanner sc = new Scanner(System.in);

	public UpdateProcedure() {
		// 
	}
	
	public void start() {
		try {
			System.out.print("수정 대상 사원번호 -> ");
			int empno = Integer.parseInt(sc.nextLine());
			System.out.print("비밀번호 -> ");
			String password = sc.nextLine();
			
			System.out.print("새 연락처 (ex.010-1234-5678)-> ");
			String tel = sc.nextLine();
			System.out.print("퇴사일 (ex.20220425) -> ");
			String endwork = sc.nextLine();
			
			dbConn();
			
			sql = "{CALL employee_edit(?,?,?,?,?)}";
			cstmt = conn.prepareCall(sql);
			
			cstmt.setInt(1, empno);
			cstmt.setString(2, password);
			cstmt.setString(3, tel);
			cstmt.setString(4, endwork);
			cstmt.registerOutParameter(5, Types.INTEGER);
			
			cstmt.executeUpdate();
			
			if(cstmt.getInt(5)>0) {
				System.out.println("사원 정보가 수정되었습니다.");
			}else {
				System.out.println("사원 정보 수정을 실패했습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}

	public static void main(String[] args) {
		new UpdateProcedure().start();
	}

}
