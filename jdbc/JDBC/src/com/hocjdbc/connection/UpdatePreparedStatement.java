package com.hocjdbc.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePreparedStatement {

	public static void insertRecords(int id, String name) {
		Connection cnn = JDBCConnection.getJDBCConnection();

		String sql = "insert into person(id, name) values(?,?)";

		try {
			PreparedStatement ppstm = cnn.prepareStatement(sql);

			ppstm.setInt(1, id);
			ppstm.setString(2, name);

			int rs = ppstm.executeUpdate();
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void updateRecords(int id, String newName) {
		Connection cnn = JDBCConnection.getJDBCConnection();

		String sql = "update person set name = ? where id = ?";
        
		try {
			PreparedStatement ppstm = cnn.prepareStatement(sql);

			ppstm.setString(1, newName);
			ppstm.setInt(2, id);

			int rs = ppstm.executeUpdate();
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deleteRecords(int id) {
		Connection cnn = JDBCConnection.getJDBCConnection();

		String sql = "delete from person where id = ?";

		try {
			PreparedStatement ppstm = cnn.prepareStatement(sql);

			ppstm.setInt(1, id);

			int rs = ppstm.executeUpdate();
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		insertRecords(4, "D");
//		updateRecords(4, "DD");
		deleteRecords(4);
	}

}
