package javaJDBCProcedure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.ResultSet;

import javaJDBC.DBConn;
import oracle.jdbc.OracleTypes;

public class SelectSearchProcedure extends DBConn{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public SelectSearchProcedure() {
		// 이름을 입력받아 해당 사원을 선택하는 프로시저 만들기
		// 홍을 입력하면 홍길동을 출력
	}
	
	public void start() {
		try {
			dbConn();
			
			System.out.print("검색할 이름 입력 -> ");
			String searchName = br.readLine();
			
			sql = "{CALL employee_search(?,?)}";
			cstmt = conn.prepareCall(sql);
			
			cstmt.setString(1, searchName);
			cstmt.registerOutParameter(2, OracleTypes.CURSOR);
			
			cstmt.executeUpdate();
			
			rs = (ResultSet)cstmt.getObject(2);
			
			// empno, username, tel, startwork, dept_name, pos_name
			while(rs.next()) {
				System.out.printf("%d\t %s\t %s\t %s\t %s\t %s\n",
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}

	public static void main(String[] args) {
		SelectSearchProcedure ssp = new SelectSearchProcedure();
		ssp.start();
	}

}
