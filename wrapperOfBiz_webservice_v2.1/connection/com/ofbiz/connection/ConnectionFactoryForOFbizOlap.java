package com.ofbiz.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionFactoryForOFbizOlap {

	String url = null, driver = null, username = null, password = null;

	public Connection getConnection() {
		try {

			Properties properties = new Properties();
			try {
				properties
						.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
				url = properties.getProperty("jdbc.olap");
				driver = properties.getProperty("jdbc.driver");
				username = properties.getProperty("jdbc.ofbizolapusername");
				password = properties.getProperty("jdbc.ofbizolappassword");

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
