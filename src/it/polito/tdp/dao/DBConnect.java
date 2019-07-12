package it.polito.tdp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	static private final String jdbcUrl = "jdbc:mysql://127.0.0.1/esamitriennale?user=root&password=Pallinomar99";

	public static Connection getConnection() {

		try {
			Connection connection = DriverManager.getConnection(jdbcUrl);
			return connection;

		} catch (SQLException e) {

			e.printStackTrace();
			throw new RuntimeException("Cannot get a connection " + jdbcUrl, e);
		}
		
	}
}