package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Doctor {

	public void Insert() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into medicine values(?,?,?)");
		ps.setInt(1, 123);
		ps.setString(2, "paracetamol");
		ps.setString(3, "30rs");
		ps.executeUpdate();
		System.out.println("data inserted successfully");
	}

	public void Update() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "root");
		PreparedStatement ps = con.prepareStatement("update medicine set price = ? where  id=?");
		ps.setString(1, "15rs");
		ps.setInt(2, 205);
		ps.executeUpdate();
		System.out.println("data updated successfully");

	}

	public void Delete() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "root");
		PreparedStatement ps = con.prepareStatement("delete from medicine where name=?");
		ps.setString(1, "painkiller");
		ps.executeUpdate();
		System.out.println("data deleted successfully");

	}

 public void Read()throws Exception{
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital","root","root"); 
  PreparedStatement ps = con.prepareStatement("select * from medicine;");
  ResultSet rs=ps.executeQuery();
  while(rs.next());{
  
 	System.out.println("id =" +rs.getInt(1)+"name = "+rs.getString(2)+"price ="+rs.getInt(3)); 
}

  con.close();
}
}
