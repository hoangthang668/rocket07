package EX1;

public class Student {
	private int id;
	private String name;
	private static int counter = 0;
	
	
	
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
	public Student( String name){
		this.name= name;
		setId(++counter);
	}
	

}
