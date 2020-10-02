package EX1;

import java.util.ArrayList;

public class listQ1 {
	private ArrayList<Student> student;
	public listQ1(){
		student = new ArrayList<>();
	
		student.add(new Student("dang"));
		student.add(new Student("quy"));
		student.add(new Student("Kiên"));
		student.add(new Student("Duy"));
		student.add(new Student("Thắng"));
		student.add(new Student("Bích"));
	}
	public void printSt(){
		for (Student st : student) {
			System.out.println(st);
		}
	}
	public void inSoPtu(){
		System.out.println("tong so ptu : "+student.size());
	}
	public void layPtu(){
		System.out.println("ptu thu 4 la: "+ student.get(3));
	}
	public void inPtuDaucuoi(){
		System.out.println("ptu dau: "+ student.get(0));
		System.out.println("ptu cuoi la: "+ student.get(student.size()-1));
	}

}
