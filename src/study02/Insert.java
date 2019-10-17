package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert 
{
	public static void main(String[] args)
	{	
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(ConnectionTest2.URL,ConnectionTest2.ID,ConnectionTest2.PWD);
			String sql = "insert into user_info(id,pwd,name,age,etc) ";
			Scanner sc = new Scanner(System.in);
			System.out.println("입력하고싶은 정보를 \",\" 기준으로 작성");
			String info = sc.nextLine();
			String[] infos = info.split(",");		//split = 기준점을 지정해 배열을 나눔
			
			sql += "values("; 
			for(int i = 0;i < infos.length; i++)
			{
				sql += "'" +  infos[i] + "',";
			}
			sql = sql.substring(0, sql.length() -1);
			sql +=")"; 
			
			Statement stm = con.createStatement();
			int result = stm.executeUpdate(sql);
			System.out.println("insert 갯수 : " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
