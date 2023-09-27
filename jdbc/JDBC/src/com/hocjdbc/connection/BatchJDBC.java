package com.hocjdbc.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchJDBC {
	public static void main(String[] args) {
		Connection cnn = JDBCConnection.getJDBCConnection();

		String sql1 = "insert into person(id, name) values(3, 'A')";
		String sql2 = "insert into person(id, name) values(4, 'A')";
		String sql3 = "insert into person(id, name) values(5, 'A')";
		String sql4 = "insert into person(id, name) values(?, ?)";

		try {
			// Dùng Statement
//			Statement stm = cnn.createStatement();
//			stm.addBatch(sql1);
//			stm.addBatch(sql2);
//			stm.addBatch(sql3);
//			
//			stm.executeBatch();

			// Dùng PreparedStatement
			PreparedStatement ppstm = cnn.prepareStatement(sql4);
			ppstm.setInt(1, 6);
			ppstm.setString(2, "D");
			ppstm.addBatch();
			ppstm.setInt(1, 7);
			ppstm.setString(2, "DD");
			ppstm.addBatch();

			ppstm.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
