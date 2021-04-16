package homeWorke17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException {
		
		AbstractConnection abstractConaction = new AbstractConnection();
		DaoUserImpl daoUserImpl = new DaoUserImpl();
		
		User user = new User();
		
//		user.setId(1);
		user.setName("Gleb");
		user.setPassword("666666");
//		daoUserImpl.create(user);
		
//		
		daoUserImpl.update(1, user);
		
//		daoUserImpl.delete("23689", "Vova");
		
	//	System.out.println(daoUserImpl.read( 1));// not worked
		
		
//		System.out.println(daoUserImpl.readAll());
			
		
		
		
		
		
//		String url= "jdbc:mysql://127.0.0.1:3306/add?characterEncoding=latin1&useConfigs=maxPerformance";
//		String username = "root";
//		String password = "root";
//		Class.forName("com.mysql.jdbc.Driver");
//		try (Connection conn =  DriverManager.getConnection(url, username, password)){
//			System.out.println("Connection to Store DB succesfull!");
//			PreparedStatement stmt = conn.prepareStatement("UPDATE user SET login =?, password=? WHERE id=?");
//			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM user");
//			PreparedStatement stmt = conn.prepareStatement("INSERT INTO user (login, password) VALUES(?,?)");
//			PreparedStatement stmt = conn.prepareStatement("DELETE FROM user WHERE login=? AND password=?");
//			stmt.setString(1, "Vlad");
//			stmt.setString(2, "200007");
//			stmt.setInt(3,2);
//			stmt.execute();
			
//			ResultSet rs = stmt.executeQuery();
//			String pass;			
//			String name;			
//			while (rs.next()) {
//				name = rs.getString("login");
//				pass = rs.getString("password");
//				System.out.println("----------");
//				System.out.println(name+"\n");
//				System.out.println(pass+"\n");
//			}
			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		
	}

}
