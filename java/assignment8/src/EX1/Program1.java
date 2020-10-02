package EX1;
import EX1.listQ1;

import java.util.ArrayList;

import EX1.Student;
public class Program1 {

	public static void main(String[] args) {
		
		
		listQ1 list = new listQ1();
		System.out.println(list);
		list.printSt();
		list.inSoPtu();
		list.inPtuDaucuoi();
	      // khai báo 1 ArrayList có tên là list
        // có kiểu là String
        ArrayList<String> list1 = new ArrayList<String>();
        // thêm các phần tử vào list
        list1.add("Java");
        list1.add("C++");
        list1.add("PHP");
        list1.add("Java");
        // sử dụng vòng lặp for - hiển thị các phần tử của list
        System.out.println("Các phần tử có trong list là: ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
	}

}
