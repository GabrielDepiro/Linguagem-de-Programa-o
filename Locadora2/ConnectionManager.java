package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	  public static void main(String[] args) {
		
	}
	/*
	 * public static Connection getConnection() throws SQLException { return
	 * DriverManager.getConnection(
	 * "jdbc:sqlserver://datatechserver.database.windows.net;databaseName=datatech;user=datatech;password=Datttechoffice01"
	 * ); }
	 */
	 
	 
	
	
	
	  public static Connection getConnection() throws SQLException { return
	  DriverManager.getConnection(
	  "jdbc:sqlserver://localhost:1433;databaseName=Locadora;user=Gabriel;password=123;encrypt=true;trustServerCertificate=true"
	  ); }
	 
	  
	 
	  
}
