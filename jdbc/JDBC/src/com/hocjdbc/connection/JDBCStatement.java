package com.hocjdbc.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStatement {
	public static void main(String[] args) {
		try {
			Connection cnn = JDBCConnection.getJDBCConnection();
			Statement stm = cnn.createStatement();

			String sql = "select * from demo";

			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("name");
				System.out.println(id + " " + name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
