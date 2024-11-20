package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Teacher {

	 

	public void CreateDb() throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197", "root","root");
		Statement stmt = con.createStatement();
		stmt.execute("create database Teacher;");
		System.out.println("database Teacher created..!");
		con.close();
		}
	
	public void Insert() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher", "root","root");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into subject values(101,'physics','AA10bN')");
		System.out.println("record inserted....!");
		con.close();
	}
	
	public void Read()throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher", "root","root");
		Statement stmt = con.createStatement();
		stmt.executeQuery("select * from subject;");
		System.out.println("data fetch successfully..");
		con.close();
	}
	
	public void  Update()throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher", "root","root");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("update subject set sub_name='chemistry';");
		System.out.println("data updated successfully...");
	}
	}

