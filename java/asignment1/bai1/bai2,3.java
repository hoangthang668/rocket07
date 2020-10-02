package asignment1;
import java.util.Date;
public class program {

	public static void main(String[] args) {
		// Question1
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";
		Department department2 = new Department();
		department1.id = 2;
		department1.name = "Marketting";
		Department department3 = new Department();
		department1.id = 3;
		department1.name = "Accounting";
		
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = "Dev";
		Position position2 = new Position();
		position1.positionId = 2;
		position1.positionName = "Test";
		Position position3 = new Position();
		position1.positionId = 3;
		position1.positionName = "PM";
		
		Account account1 = new Account();
		account1.id = 1;
		account1.creatDate = new Date("2020/05/03") ;
		account1.email = "hoangducthang@gmail.com";
		account1.department = department1;
		account1.gender = Gender.MALE;
		account1.position = position1;
		
		//Question2
		System.out.println("thong phong ban 1: ");
		System.out.println("name: " + department1.name);
		System.out.println("id: " + department1.id);
		System.out.println("thong tin position: ");
		System.out.println("id: "+position1.positionId);
		System.out.println("name: " + position1.positionName);
		System.out.println("thong tin account1: ");
		System.out.println("id: " + account1.id);
		System.out.println("ngay tao: " + account1.creatDate);
		System.out.println("email: " + account1.email);
		System.out.println("phong ban: " + account1.department.name);
		System.out.println("gioi tinh : " + account1.gender);
	}

}
