package com.hocjdbc.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {
	public static void insertRecords(int id, String name) {
		Connection cnn = JDBCConnection.getJDBCConnection();

		try {
			Statement stm = cnn.createStatement();
			String sql = "insert into person(id, name) values('" + id + "', '" + name + "')";
			int rs = stm.executeUpdate(sql);
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void updateRecords(int id, String newName) {
		Connection cnn = JDBCConnection.getJDBCConnection();

		try {
			Statement stm = cnn.createStatement();
			String sql = "update person set name = '" + newName + "' where id = '" + id + "' ";
			int rs = stm.executeUpdate(sql);
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void deleteRecords(int id) {
		Connection cnn = JDBCConnection.getJDBCConnection();

		try {
			Statement stm = cnn.createStatement();
			String sql = "delete from person where id = '" + id + "'";
			int rs = stm.executeUpdate(sql);
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		insertRecords(22, "A");
//		updateRecords(22, "B");
//		deleteRecords(22);

	}
}
