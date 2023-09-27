package com.hocjdbc.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatement {
	public static void main(String[] args) {
		Connection cnn = JDBCConnection.getJDBCConnection();
		try {
			Statement stm = cnn.createStatement();

			final String sql = "select * from demo where id = 2";

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
