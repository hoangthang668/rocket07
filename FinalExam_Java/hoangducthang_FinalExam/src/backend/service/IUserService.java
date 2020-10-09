package backend.service;

import java.sql.SQLException;

public interface IUserService {

	
	public boolean isUserExists(String email, String pass) throws SQLException ;
}
