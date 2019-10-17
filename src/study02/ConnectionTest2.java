package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest2 
{
	public static final String URL;
	public static final String ID;
	public static final String PWD;								//값이 바뀌지 않는(상수) 변수 선언
	public static final String DRIVER_NAME;
	
	static
	{
		URL = "jdbc:oracle:thin:@localhost:1521:xe";
		ID = "bdi";
		PWD = "12345678";
		DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		Connection con = null;				//null 의 이유 : 2. 이쪽 con 변수는 아무 값을 대입받지 않게 되어
		try {										
			con = DriverManager.getConnection(URL,ID,PWD);		//1. 이쪽 try 에서 con 에 대입이 실패하면
			String sql = "Select * from user_info";
			
			Scanner sc = new Scanner(System.in);
			System.out.println("id value is?");
			String id = "'%" +  sc.nextLine() + "%'";
			sql += " " + "where id like " + id + " ";
			Statement sm = con.createStatement();
			
			ResultSet rs = sm.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getString("id"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally									//3. finally 문의 (위의 try|catch문의 조건이 만족하든 하지 않든 finally를 실행)
		{
			if(con != null)							//4. if 조건을 만족하지 못하여
			{
				try {								//연결을 close 할때도 예외상황이 발생할 수 있기에
					con.close();					//5. 연결이 끊기지 않게 된다.
				} catch (SQLException e) {			//try catch문 내에 close() 를 설정한다
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
