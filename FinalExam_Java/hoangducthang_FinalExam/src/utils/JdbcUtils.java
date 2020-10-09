package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
	private static final String URL_DATABASE = "jdbc:mysql://localhost:3306/QLUV";
	private static final String USER = "rocket07";
	private static final String PASSWORD = "thangdepzai22";
	private Connection myConn;
	
	public Connection getConnection() throws SQLException {
		if (myConn == null || myConn.isClosed()) {
			myConn = DriverManager.getConnection(URL_DATABASE, USER, PASSWORD);
		}		
		return myConn;
	}
	
	public void disconnect() throws SQLException {
		if(myConn != null && !myConn.isClosed()) {
			myConn.close();
		}
	}
}
