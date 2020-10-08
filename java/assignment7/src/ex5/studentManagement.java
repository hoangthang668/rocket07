package ex5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentManagement {

	private List<Student> students;
	private String pathFile;

	public studentManagement() {
		students = new ArrayList<>();
		pathFile = "D:\\test.txt";
	}

	public void inputListStudents() {
		System.out.println("nhap so luong student: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// input list student
		for (int i = 0; i < n; i++) {
			students.add(new Student());
		}
	}

	public void printListStudents() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void writeStudents() throws Exception {
		IOStream.writeObject(students, pathFile);
	}

	@SuppressWarnings("unchecked")
	public void readStudents() throws Exception {
		students = (List<Student>) IOStream.readObject(pathFile);
	}


}
