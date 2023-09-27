package com.hocjdbc.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTransaction {
	public static void main(String[] args) {
		Connection cnn = JDBCConnection.getJDBCConnection();
		
		try {
			Statement stm1 = cnn.createStatement();
			//Statement stm2 = cnn.createStatement();
			
			cnn.setAutoCommit(false);
			
			String sql1 = "insert into person(id, name) values(1, 'A')";
			String sql2 = "delete from person where id = 2";
			
			stm1.executeUpdate(sql2);
			stm1.executeUpdate(sql1);
			
			cnn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
