package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
	private Connection getConnection() throws SQLException
	{
		new com.mysql.jdbc.Driver();
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/jag","root","");
	}
	
	@Override
	public void createUser(User user) throws SQLException
	{
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement("INSERT INTO USER_MASTER VALUES(?,?,?,?,?,?)");
		st.setString(1, user.getUsername());
		st.setString(2, user.getPassword());
		st.setString(3, user.getFirstName());
		st.setString(4, user.getLastName());
		st.setString(5, user.getEmail());
		st.setString(6, user.getRole());
		
		int no=st.executeUpdate();
		con.close();
		System.out.println(no+" row(s) inserted");
	}
	
	@Override
	public List<User> read() throws SQLException
	{
		Connection con = getConnection();
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM USER_MASTER");
		List<User> users=new ArrayList<User>();
		while(rs.next())
		{
			User user=new User(	rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
			users.add(user);
		}
		con.close();
		return users;
	}
	
	@Override
	public User read(String username) throws SQLException
	{
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement("SELECT * FROM USER_MASTER WHERE userName=?");
		st.setString(1, username);
		ResultSet rs = st.executeQuery();
		User user=null;
		if(rs.next())
		{
			user=new User(	rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
		}
		con.close();
		return user;
	}
	
	@Override
	public void update(User user) throws SQLException
	{
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement("UPDATE USER_MASTER SET password=?, firstName=?, lastName=?, email=?, role=? WHERE userName=?");
		st.setString(1, user.getPassword());
		st.setString(2, user.getFirstName());
		st.setString(3, user.getLastName());
		st.setString(4, user.getEmail());
		st.setString(5, user.getRole());
		st.setString(6, user.getUsername());
		
		int no=st.executeUpdate();
		con.close();
		System.out.println(no+" row(s) updated");
	}
	
	@Override
	public void delete(User user) throws SQLException
	{
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement("DELETE FROM USER_MASTER WHERE userName=?");
		st.setString(1, user.getUsername());
		
		int no=st.executeUpdate();
		con.close();
		System.out.println(no+" row(s) deleted");
	}
	
}
