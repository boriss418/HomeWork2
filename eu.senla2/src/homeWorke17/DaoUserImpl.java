package homeWorke17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

public class DaoUserImpl extends AbstractConnection implements Dao {
	
	Connection connection = getConnection();
		
	@Override
	public User create(User user) {
		PreparedStatement ps = null;
		String sql = "INSERT INTO user (login, password) VALUES(?,?)";
		try {
			ps = connection.prepareStatement(sql);			

			ps.setString(1,user.getName());
			ps.setString(2,user.getPassword());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {					
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {					
					e.printStackTrace();
				}
			}
		}
		return user;
	
	}
	
	@Override
	public User read(String name) {
		PreparedStatement ps = null;
		String sql = "SELECT id, login, password FROM user WHERE id=?";
		User user = new User();
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			
			ResultSet resultSet = ps.executeQuery();
			
			user.setId(resultSet.getInt("id"));
			user.setName(resultSet.getNString("name"));
			user.setPassword(resultSet.getNString("password"));
			
			ps.executeUpdate();
			System.out.println(user);
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return user;
	}

	@Override
	public User update(int id, User newUser) {
		PreparedStatement ps = null;
		String sql = "UPDATE user SET login =?, password=? WHERE login=?";
		
		try {
			ps = connection.prepareStatement(sql);
			
			ps.setInt(1, newUser.getId());
			ps.setString(2, newUser.getName());
			ps.setString(3, newUser.getPassword());
			
			ps.executeUpdate();
			System.out.println(newUser);
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public boolean delete(String name, String pass) {
		PreparedStatement ps = null;
		String sql = "DELETE FROM user WHERE login=? AND password=?";
		
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, pass);
			
			ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return false;
	}

	@Override
	public List<User> readAll() {
		List <User> userList = new ArrayList<>();
		String sql = "SELECT id, login, password FROM USER";
		Statement statement = null;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
					
			while (resultSet.next()) {
				User user = new User();
				user.setId(resultSet.getInt("id"));
				user.setName(resultSet.getString("login"));
				user.setPassword(resultSet.getNString("password"));
				
				userList.add(user);
			}		
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return userList;
	}

}
 