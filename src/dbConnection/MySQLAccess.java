package dbConnection;
import java.sql.*;


public class MySQLAccess {
	//private static Connection connect=null;

	public static void main(String args[]){  
		try{  
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mytestdb?useSSL=false";
		Connection connect=DriverManager.getConnection(url,  "root","root");
		
		Statement stmt=connect.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from employee");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
		
		connect.close();  
		
	}
		catch(Exception e)
		{ 
			System.out.println(e);
		} 
	}
	

}
