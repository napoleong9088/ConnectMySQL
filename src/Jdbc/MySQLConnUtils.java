package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {
	// Kết nối vào MySQL.
	 public static Connection getMySQLConnection() throws SQLException,
	         ClassNotFoundException {
	     String hostName = "localhost";
	 
	     String dbName = "bai9java";
	     String userName = "root";
	     String password = "";
	 
	     return getMySQLConnection(hostName, dbName, userName, password);
	 }
	 
	 public static Connection getMySQLConnection(String hostName, String dbName,
	         String userName, String password) throws SQLException,
	         ClassNotFoundException {
	 
	     String connectionURL = "jdbc:mysql://" + hostName + ":3325/" + dbName;
	 
	     Connection conn = DriverManager.getConnection(connectionURL, userName, password);
	     return conn;
	 }

}
