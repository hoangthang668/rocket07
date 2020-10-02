package EX1.QS2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import EX1.Student;

public class set {
	private Set<Student> student;
	private Scanner scanner;

	public set() {
		scanner = new Scanner(System.in);
		student = new HashSet<>();
		inputStudents();
	}

	private void inputStudents() {
		// Input list students by scanner
//		System.out.println("Nhập số lượng student muốn nhập: ");
//		int n = ScannerUtils.inputIntWithString(scanner);
//
//		for (int i = 0; i < n; i++) {
//			students.add(new Student());
//		}

		// fix list students for testing
		student.add(new Student("Thanh"));
		student.add(new Student("Quang"));
		student.add(new Student("Kien"));
		student.add(new Student("Duy"));
		student.add(new Student("Thang"));
		student.add(new Student("Bich"));
	}

	public void printStudent() {
		Iterator<Student> studentIterator = student.iterator();
		while (studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}
	}

	// a) In ra tổng số phần tử của students
	public void getAmountOfStudent() {
		System.out.println("Student Amount: " + student.size());
	}

	// b) Lấy phần tử thứ 4 của students
	public void getIndex4OfStudent() {
		Iterator<Student> studentIterator = student.iterator();
		for (int i = 0; i < 2; i++) {
			studentIterator.next();
		}

		System.out.println("Student thứ 4: ");
		System.out.println(studentIterator.next());
	}

	// c) In ra phần tử đầu và phần tử cuối của students
	public void printFirstAndLastStudent() {
		Iterator<Student> studentIterator = student.iterator();
		System.out.println("Student đầu tiên:");
		System.out.println(studentIterator.next());

		for (int i = 0; i < student.size() - 2; i++) {
			studentIterator.next();
		}

		System.out.println("Student cuối cùng: ");
		System.out.println(studentIterator.next());
	}

	

}
