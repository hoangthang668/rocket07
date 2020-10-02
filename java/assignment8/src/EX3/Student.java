package EX3;

public class Student<T> implements Comparable<Student> {
	private String name;
	private T id;
	
	
	public Student(T id,String name){
		super();
		this.id=id;
		this.name=name;
				
		
	}
	
	
	
	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public T getId() {
		return id;
	}






	public void setId(T id) {
		this.id = id;
	}






	@Override
	public int compareTo(Student other) {
		// TODO Auto-generated method stub
		if((this.name.compareTo(other.getName())> 0)){
			return 1;
		}else if((this.name.compareTo( other.getName())<0)){
			return -1;
		}else{
		return 0;
	}
	}
}
	
	


