package com.hocjdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	
	public static Connection getJDBCConnection() {
		final String url = "jdbc:mysql://localhost:3306/hello";
		final String username = "root";
		final String password = "12345678";
			
		try {
			// tải mysql driver vào
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}

