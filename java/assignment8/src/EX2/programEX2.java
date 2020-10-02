package EX2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class programEX2 {

	public static void main(String[] args) {
		   List<Student> students = new ArrayList<Student>();
	        // add students to list
		   students.add(new Student("Kim", LocalDate.parse("2020-05-29"), 8));
			students.add(new Student("Kim", LocalDate.parse("2020-05-29"), 10));
			students.add(new Student("Kiên", LocalDate.parse("2015-05-04"), 6));
			students.add(new Student("Duy", LocalDate.parse("2020-01-29"), 5));
			students.add(new Student("Thắng", LocalDate.parse("2020-04-29"), 8));
			students.add(new Student("Bích", LocalDate.parse("2020-02-29"), 3));
			
	        // sort list student
	        Collections.sort(students);
	        // show list students
	        for (Student student : students) {
	            System.out.println(student.toString());
	        }
	}

}
