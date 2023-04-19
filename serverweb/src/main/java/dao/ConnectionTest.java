package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {
		//String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "exam";
		String password = "exam";
		
		try {
			//1. 드라이버 로딩
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			//2. DB 서버에 접속
			Connection conn = DriverManager.getConnection(url,user,password);
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버로딩실패");
			e.printStackTrace();
		}
	}

}
