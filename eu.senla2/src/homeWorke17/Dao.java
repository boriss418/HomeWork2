package homeWorke17;

import java.util.List;

public interface Dao {
	
	User create(User user);
	User read(String name);
	User update(int id, User newUser);
	boolean delete (String name, String pass);
	List <User> readAll();

}
