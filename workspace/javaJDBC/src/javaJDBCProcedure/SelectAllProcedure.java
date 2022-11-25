package javaJDBCProcedure;

import java.sql.ResultSet;

import javaJDBC.DBConn;
import oracle.jdbc.OracleTypes;

public class SelectAllProcedure extends DBConn {

	public SelectAllProcedure() {}
	
	public void start() {
		try {
			dbConn();
			
			sql = "{CALL employee_select_all(?)}";
			cstmt = conn.prepareCall(sql);
			
			// ?에 데이터타입 커서를 담을 수 있게 설정
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			cstmt.executeUpdate();
			
			// cstmt에서 ResultSet객체 얻어오기
			rs = (ResultSet) cstmt.getObject(1);
			
			// 사번, 이름, 연락처, 성별, 입사일
			while(rs.next()) {
				System.out.printf("%d\t %s\t %s\t %s\t %s\n",
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}

	public static void main(String[] args) {
		new SelectAllProcedure().start();
	}

}
