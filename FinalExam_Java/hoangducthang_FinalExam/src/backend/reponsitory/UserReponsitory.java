package backend.reponsitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.JdbcUtils;

public class UserReponsitory implements IUserReponsitory {
	private JdbcUtils jdbcUtils;

	public UserReponsitory() {
		jdbcUtils = new JdbcUtils();
	}




	@Override
	public boolean isUserExists(String email, String pass) throws SQLException {
		Connection con = jdbcUtils.getConnection();
		String query = "select * from `user` where email = ? and pass = ?";
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setString(1,email);
		preparedStatement.setString(2,pass);		
		boolean check = false;
		ResultSet res = preparedStatement.executeQuery();		
		if(res.next())
			check = true;
		jdbcUtils.disconnect();
		return check;
	}

}
