package com.hocjdbc.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPrepareStatment {
	public static void main(String[] args) {
		Connection cnn = JDBCConnection.getJDBCConnection();
		
		String sql = "select * from person where id = ? and name = ?";
		
		try {
			PreparedStatement ppstm = cnn.prepareStatement(sql);
			ppstm.setInt(1, 2);
			ppstm.setString(2, "B");
			ResultSet rs = ppstm.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id") + rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
