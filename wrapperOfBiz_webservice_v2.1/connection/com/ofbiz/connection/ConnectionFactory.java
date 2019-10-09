package com.ofbiz.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionFactory {

	String url = null, driver = null, username = null, password = null;

	public Connection getConnection() {
		try {

			Properties properties = new Properties();
			try {
				properties
						.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
				url = properties.getProperty("jdbc.url");
				driver = properties.getProperty("jdbc.driver");
				username = properties.getProperty("jdbc.ofbizusername");
				password = properties.getProperty("jdbc.ofbizpassword");

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			Class.forName(driver).newInstance();
			return DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public void close(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

	public void rollback(Connection con) {
		if (con != null) {
			try {
				con.rollback();
			} catch (SQLException e) {
				// e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

	public void close(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

}
