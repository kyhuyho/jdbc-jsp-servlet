package com.hocjdbc.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatement {

	public static void createTable() {
		Connection cnn = JDBCConnection.getJDBCConnection();

		try {
			Statement stm = cnn.createStatement();

			String sql = "create table Person(id int)";

			int rs = stm.executeUpdate(sql);
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void deleteTable() {
		Connection cnn = JDBCConnection.getJDBCConnection();

		try {
			Statement stm = cnn.createStatement();

			String sql = "drop table Person";

			int rs = stm.executeUpdate(sql);
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		createTable();
		deleteTable();
	}

}
