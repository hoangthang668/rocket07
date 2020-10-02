package EX3;



public class generic {
	public void question1_2_3() {
		// khởi tạo student có id là int
		Student<Integer> student1 = new Student<Integer>(1, "Dang Black");

		// khởi tạo student có id là float
		Student<Float> student2 = new Student<Float>(2.0f, "Hai Dang Black");

		// khởi tạo student có id là double
		Student<Double> student3 = new Student<Double>(3.0, "Duy Nguyen VTI");

		// Question 2: T generic method print object
		print(student1);
		print(student2);
		print(student3);

		// print number
		print(1);
		print(2f);
		print(3d);
	}
	private <T> void print(T a){
		System.out.println(a);
	}

}
