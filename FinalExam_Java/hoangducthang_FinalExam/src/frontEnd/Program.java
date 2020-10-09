package frontEnd;

import java.sql.SQLException;

import backend.controller.UserController;
import utils.ScannerUtils;

public class Program {
	private static UserController userController;

	public static void main(String[] args) throws SQLException {
		userController = new UserController();

		int chon;
		do {

			System.out.println("      1. Đăng nhập                   ");
			System.out.println("      2. Thoát chương trình          ");
			System.out.println("                                       ");
			System.out.println();
			System.out.println("      Xin mời chọn chức năng           ");
			chon = ScannerUtils.inputInt("Vui lòng nhập vào một số. Nhập lại!");
			switch (chon) {
			case 1:
				dangNhap();
				break;

			case 2:
				System.out.println("Đã thoát chương trình!");
				break;
			default:
				System.err.println("Không có lựa chọn này. Nhập lại !");
				break;
			}
		} while (chon != 0);
	}

	private static void dangNhap() throws SQLException {
		System.out.println("Nhap Email:");
		String email = ScannerUtils.inputString("Nhap lai!");
		System.out.println("Nhap pass word:");
		String pass = ScannerUtils.inputString("Nhap lai!");
		if (userController.isUserExists(email, pass))
			System.out.println("Đăng nhập thành công!");
		else
			System.out.println("Email hoặc password không đúng. Kiểm tra lại!");
	}

	
}
