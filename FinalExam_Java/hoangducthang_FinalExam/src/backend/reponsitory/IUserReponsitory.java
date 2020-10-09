package backend.reponsitory;

import java.sql.SQLException;

public interface IUserReponsitory {

	
	public boolean isUserExists(String email, String pass) throws SQLException ;
}
