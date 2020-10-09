package backend.controller;

import java.sql.SQLException;

import backend.service.IUserService;
import backend.service.UserService;

public class UserController {
	private IUserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	

	
	public boolean isUserExists(String email, String pass) throws SQLException {
		return userService.isUserExists(email, pass);
	}
}
