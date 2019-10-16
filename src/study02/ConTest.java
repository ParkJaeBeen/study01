package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConTest 
{
	public static void main(String[] args)
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "bdi";
		String pwd = "12345678"; 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Connection connect = null;
		try {
			connect = DriverManager.getConnection(url,id,pwd);
			Statement sm = connect.createStatement();
			String osql = "select*from user_info";
			ResultSet rs = sm.executeQuery(osql);
			List<Map<String,String>> sl = new ArrayList<Map<String,String>>();
			
			while(rs.next())
			{
				Map<String,String> map = new HashMap<String,String>();
				map.put("id", rs.getString("id"));
				map.put("pwd", rs.getString("pwd"));
				map.put("name", rs.getString("name"));
				map.put("age", rs.getString("age"));
				map.put("etc", rs.getString("etc"));
				sl.add(map);
			}
			System.out.println(sl.get(0));
			System.out.println(sl.get(1));
			System.out.println(sl.get(2));
			System.out.println(sl.get(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally				//성공여부에 상관없이 실행해야할 것이 필요할 때
		{
			if(connect != null)
			{
				try {
					connect.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
