package backend.service;

import java.sql.SQLException;

import backend.reponsitory.IUserReponsitory;
import backend.reponsitory.UserReponsitory;
import utils.ScannerUtils;

public class UserService implements IUserService {
	private IUserReponsitory userReponsitory;

	public UserService() {
		userReponsitory = new UserReponsitory();
	}

	private boolean chuanHoaEmail(String email) {
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		String email1 = email;
		Boolean check = email1.matches(EMAIL_REGEX);
		return check;
	}

	private boolean checkPassword(String pass) {
		boolean check = false;
		boolean check2 = false;

		for (int i = 0; i < pass.length(); i++) {
			if (Character.isUpperCase(pass.charAt(i)))
				check = true;
		}

		if (pass.length() >= 6 && pass.length() <= 12 && check == true) {
			check2 = true;
		}
		return check2;
	}


	@Override
	public boolean isUserExists(String email, String pass) throws SQLException {
		String email1 = email;
		String pass1 = pass;
		boolean check = false;
		
		while(!check) {
			if (chuanHoaEmail(email1)) {
				check = true;
			}
			else {
				System.out.println("Email nhap chua dung dinh dang. Nhap lai!");
				email1 = ScannerUtils.inputString("Vui long nhap!");
			}
		}
		check = false;
		while(!check) {
			if (checkPassword(pass1)) {
				check = true;
			}
			else {
				System.out.println("Pass nhập từ 6 tới 12 ký tự, có ít nhất 1 ký tự viết hoa. Nhap lai!");
				pass1 = ScannerUtils.inputString("Vui long nhap!");
			}
		}
		
		return userReponsitory.isUserExists(email1, pass1);
	}

}
