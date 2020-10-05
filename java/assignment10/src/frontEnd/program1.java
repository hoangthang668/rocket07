package frontEnd;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import backend.EX1;
import entity.ScannerUtils;

public class program1 {
	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
			
		EX1 ex1 = new EX1();
		ex1.connectionDatabase();
		ex1.printPosition();
		System.out.println("nhap name:  ");
		String name= ScannerUtils.inputName();
		ex1.createPosition(name);
		ex1.updatePositionName();
		
		System.out.println("nhap id xoa: ");
		int id = ScannerUtils.inputId();
		ex1.deleteDepartment(id);
		
		
		ex1.closeConnection();
	}

}
