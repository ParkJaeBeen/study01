package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest2 
{
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String ID = "bdi";
	public static final String PWD = "12345678";								//값이 바뀌지 않는(상수) 변수 선언
	public static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	
	public static void main(String[] args)
	{
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL,ID,PWD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
