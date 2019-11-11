package ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySQL {
	
	@Test
	public void testDB() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","MH432019!");
		System.out.println("connected to mySQL DB");
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from seleniumuser");
		while(rs.next())
		{
			String firstName = rs.getString("firstname");
			System.out.println("database record is:" +firstName);
			
			String eMail = rs.getString("email");
			System.out.println("database record is:" +eMail);
			
		}
		}
		
	

}
