package model;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {

	void createUser(User user) throws SQLException;

	List<User> read() throws SQLException;

	User read(String username) throws SQLException;

	void update(User user) throws SQLException;

	void delete(User user) throws SQLException;

}