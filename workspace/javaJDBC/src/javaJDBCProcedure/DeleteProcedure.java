package javaJDBCProcedure;

import java.sql.Types;
import java.util.Scanner;

import javaJDBC.DBConn;

public class DeleteProcedure extends DBConn {
	Scanner sc = new Scanner(System.in);
	
	public DeleteProcedure() {
		// 사원번호를 입력받아 해당 사원 삭제하는 프로시저 실행
	}
	
	public void start() {
		try {
			System.out.print("삭제할 사원의 사원번호 -> ");
			int empno = Integer.parseInt(sc.nextLine());
			
			dbConn();
			
			sql = "{CALL employee_del(?,?)}";
			cstmt = conn.prepareCall(sql);
			
			cstmt.setInt(1, empno);
			cstmt.registerOutParameter(2, Types.INTEGER);
			
			cstmt.executeUpdate();
			
			if(cstmt.getInt(2)>0) {
				System.out.printf("사원번호 %d 삭제되었습니다.\n", empno);
			}else {
				System.out.println("사원 삭제를 실패했습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
	}

	public static void main(String[] args) {
		new DeleteProcedure().start();

	}

}
