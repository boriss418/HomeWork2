package homeWorke17;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class AbstractConnection {
	String driver = "com.mysql.jdbc.Driver";
	String url= "jdbc:mysql://127.0.0.1:3306/add?characterEncoding=latin1&useConfigs=maxPerformance";
	String username = "root";
	String password = "root";
	
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(driver);
			connection =  DriverManager.getConnection(url, username, password);
			System.out.println("ok");
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("err");
		}
		return connection;
		
	}

}
