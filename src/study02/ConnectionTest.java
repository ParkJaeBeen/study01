package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest 
{
	public static void main(String[] args)
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";		//oracle 연결 번호@호스트:포트번호:서비스명
		String id = "bdi";
		String pwd = "12345678";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");		//oracle 접속을 위해 oracledriver 를 사용한다
			Connection con = DriverManager.getConnection(url,id,pwd); 	//oracle 접속
			Statement state = con.createStatement();				//sql 의 기본 화면
			String sql = "select * from user_info";					//sql 명령문
			ResultSet result = state.executeQuery(sql);				//실행문 - statement 에 Query를 실행 대기(sql = "select * from user_info")
			while(result.next())									//result 의 데이터타입 = boolean
			{														//while 은 () 안의 값이 참일때 반복한다
				System.out.println(result.getString("id"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
