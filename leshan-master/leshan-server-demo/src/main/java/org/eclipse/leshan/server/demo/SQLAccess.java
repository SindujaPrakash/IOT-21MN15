package org.eclipse.leshan.server.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class SQLAccess { 
	
	Connection conn = null;
    Statement stmt = null;
    
	void createConnection()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			conn=DriverManager.getConnection(  
			"jdbc:mysql://127.0.0.1:3306/iotdb","root","");
			stmt = conn.createStatement();
			ResultSet s = stmt.executeQuery("SELECT * FROM `iotdb`");
			while(s.next())
			{
				 	int id = s.getInt("id");
			        String name = s.getString("name");
			        String gender = s.getString("gender");
			        String city = s.getString("city");
			        // print the results
			        System.out.format("%s, %s, %s, %s\n", id, name, gender, city);	
			}
			stmt.close();
			conn.close(); 
			System.out.println("Connection terminated");
		}
		catch(Exception s)
		{
			System.out.println(s.getMessage());
		}
	}
}
