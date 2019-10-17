package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete 
{
 public static void main(String[] args)
 {
	 Connection con = null;
	 try {
		con = DriverManager.getConnection(ConnectionTest2.URL,ConnectionTest2.ID,ConnectionTest2.PWD);
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 것은? : ");
		String id = sc.nextLine();
		String sql = "delete from user_info where id= '" + id + "'";
		Statement stm = con.createStatement();
		int result = stm.executeUpdate(sql);
		System.out.println("삭제갯수 : " + result);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
