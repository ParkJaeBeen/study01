package study02.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Execute 
{
	Connection con = DBCon.getCon();
	Scanner sc = new Scanner(System.in);
	
	void insert()
	{
		try {
		System.out.println("insert id : ");
		String id = "'" + sc.nextLine() + "'";
		System.out.println("pwd : ");
		String pwd = "'" + sc.nextLine() + "'";
		System.out.println("name : ");
		String name = "'" + sc.nextLine() + "'";
		System.out.println("age : ");
		String age = "'" + sc.nextLine() + "'";
		System.out.println("etc : ");
		String etc = "'" + sc.nextLine() + "'";
		
		String sql = "insert into user_info(id,pwd,name,age,etc) ";
		sql += "values(" + id + "," + pwd + "," + name + "," + age + "," + etc + ")";
		Statement stm = con.createStatement();
		int result = stm.executeUpdate(sql);
		System.out.println("insert 갯수 : " + result);
		System.out.println("insert값 : " + sql);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void delete()
	{
		try {
		System.out.println("delete something? : ");
		String id = sc.nextLine();
		
		String sql = "delete from user_info where id= '" + id + "'";
		Statement stm = con.createStatement();
		int result = stm.executeUpdate(sql);
		System.out.println("삭제갯수 : " + result);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void update()
	{
		try {
		System.out.println("update something? : ");
		String age = sc.nextLine();
		String sql = "update user_info set age = " + age;
		System.out.println("what id? : ");
		String where = sc.nextLine();
		sql += " where id='" + where + "'";
		Statement stm = con.createStatement();
		ResultSet result = stm.executeQuery(sql);
		System.out.println(sql);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void select()
	{
		try {	
			System.out.println("select something : ");
			String sql = "select * from user_info ";
			String id = "'%" +  sc.nextLine() + "%'";
			sql += " " + "where id like " + id + " ";
			Statement state = con.createStatement();
			ResultSet result = state.executeQuery(sql);
			
			while(result.next())						
			{
				System.out.println(result.getString("id"));
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		Execute ex = new Execute();
		String start ="";
		while(!"q".equals(start))
		{
			System.out.println("1 : insert 2 : update 3 : delete 4 : select q : exit");
			start = ex.sc.nextLine();
			if(start.equals("1"))
			{
				ex.insert();
			}
			else if(start.equals("2"))
			{
				ex.update();
			}
			else if(start.equals("3"))
			{
				ex.delete();
			}
			else if(start.equals("4"))
			{
				ex.select();
			}
		}
	}
}
