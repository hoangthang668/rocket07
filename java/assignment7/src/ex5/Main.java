package ex5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

			studentManagement listStudents = new studentManagement();
			
			listStudents.inputListStudents();
			listStudents.printListStudents();
			/*try {
				listStudents.writeStudents();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				listStudents.readStudents();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			
	}

}
