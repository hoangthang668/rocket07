package EX2;

import java.time.LocalDate;

public class Student implements Comparable<Student> {
	private static int dem=0;
	
	private int id;
	private String name;
	private LocalDate date;
	private int mark;
	
	
	public Student(String name, LocalDate date, int mark){
		super();
		this.date = date;
		setId(++dem); 
		this.mark= mark;
		this.name= name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public int compareTo(Student st) {
		if (name.compareTo(st.name) > 0) {
			return 1;
		}

		if (name.compareTo(st.name) < 0) {
			return -1;
		}

		return 0;
		
		
		
		
	}
	 @Override
		    public String toString() {
		        return "Student@id=" + id + ",name=" + name 
		                + ",date=" + date + ",mark=" + mark;
	}
	
	
	

}
