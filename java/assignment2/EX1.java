package asignment1;
import java.util.Date;;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question1
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";
		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketting";
		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Accounting";
		
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = "Dev";
		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName = "Test";
		Position position3 = new Position();
		position3.positionId = 3;
		position3.positionName = "PM";
		
		Groupp group1 = new Groupp();
		group1.id = 1;
		group1.name = "Java Fresher";
		
		Groupp group2 = new Groupp();
		group2.id = 2;
		group2.name = "C# Fresher";
		
		
		Account account1 = new Account();
		account1.id = 1;
		account1.creatDate = new Date("2020/05/03") ;
		account1.email = "hoangducthang@gmail.com";
		account1.department = department1;
		account1.gender = Gender.MALE;
		account1.position = position1;
		Groupp[] groupOfAccount1 = {group1};
		account1.groups = groupOfAccount1;
		
		Account account2 = new Account();
		account2.id = 2;
		account2.creatDate = new Date("2020/06/09") ;
		account2.email = "hoangducvinh@gmail.com";
		account2.department = department2;
		account2.gender = Gender.MALE;
		account2.position = position2;
		Groupp[] groupOfAccount2 = {group2};
		account2.groups = groupOfAccount2;
		
		
	
	/*	System.out.println("thong phong ban 2: ");
		System.out.println("name: " + department2.name+"\n");
		System.out.println("id: " + department2.id);
		System.out.println("thong tin position: ");
		System.out.println("id: "+position2.positionId);
		System.out.println("name: " + position2.positionName);
		System.out.println("thong tin account2: ");
		System.out.println("id: " + account2.id);
		System.out.println("ngay tao : " + account2.creatDate);
		System.out.println("email: " + account2.email);
		System.out.println("phong ban: " + account2.department.name);
		System.out.println("gioi tinh : " + account2.gender);*/
		
			/*Question 1:
				Kiểm tra account thứ 2
				Nếu không có phòng ban (tức là department == null) thì sẽ in ra
				text "Nhân viên này chưa có phòng ban"
				Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là
				..."
			*/
		
		if (account2.department == null){
			System.out.println("nhan vien nay chua co phong ban");
		}
		else  {System.out.println("phong ban cua nv nay la: " + account2.department.name);}
		
		/*
		Question 2:
			Kiểm tra account thứ 2,
			Nếu không có group thì sẽ in ra text "Nhân viên này chưa có
			group"
			Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của
			nhân viên này là Java Fresher, C# Fresher"
			Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là
			người quan trọng, tham gia nhiều group"
			Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên
			này là người hóng chuyện, tham gia tất cả các group"
*/	
			
				
				
				/*Question 3: Sử dụng toán tử ternary để làm Question 1*/			
	
		System.out.println(account2.department == null ? " nhan vien naychua co phong ban" : "phong ban cua nv nay la: "+account2.department.name);

		
		/*Question 4: Sử dụng toán tử ternary để làm yêu cầu sau:
			Kiểm tra Position của account thứ 1
			Nếu Position = Dev thì in ra text "Đây là Developer"
			Nếu không phải thì in ra text "Người này không phải là
			Developer"
*/	
		System.out.println(account1.position.positionName == "Dev" ? "day la developer" : "ng nay kp developer");
		
		/*Question 5:
			Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
			Còn lại in ra "Nhóm có nhiều thành viên"*/
		switch (group1.id){
		case 1:
			System.out.println("nohm co 1 thnah vien");
			break;
		case 2:
			System.out.println("nohm co 2 thnah vien");
			break;
		case 3:	
			System.out.println("nohm co 3 thnah vien");
			break;
		default:
			System.out.println("nohm co nhieu thnah vien");
		}
		
		
		/*Question 7: Sử dụng switch case để làm lại Question 4*/
		switch (account1.position.positionName ){
		case "Dev":
			System.out.println("day la developer");
			break;
		default:
			System.out.println("ng nay kp developer");
			
		}
		
		
		/*Question 8: in ra thông tin các account bao gồm: Email, FullName và tên
		phòng ban của họ*/
		Account account[] = {account1,account2};
		for( Account acIn : account ){
			System.out.println( acIn.email);
			System.out.println(acIn.department.name);
			
		}
		
		
		/*Question 9: in ra thông tin các phòng ban bao gồm: id và name*/
		Department department[] = {department1,department2};
		for (Department dep : department) {
			System.out.println(dep.name);
			System.out.println(dep.id);
		}
		
		
		/*Question 10: in ra thông tin các account bao gồm: Email, FullName và tên
		phòng ban của họ theo định dạng như sau:
		Thông tin account thứ 1 là:
		Email: NguyenVanA@gmail.com
		Full name: Nguyễn Văn A
		Phòng ban: Sale
		Thông tin account thứ 2 là:
		Email: NguyenVanB@gmail.com
		Full name: Nguyễn Văn B
		Phòng ban: Marketting*/

		for(int i=0;i < account.length ;i++){
			System.out.println("thong tin account thu "+ i+" la  ");
			System.out.println(account[i].email);
			System.out.println("phong ban: ");
			System.out.println(account[i].department.name);
			
		}
		/*
		Question 11: in ra thông tin các phòng ban bao gồm: id và name theo định
		dạng sau:
		Thông tin department thứ 1 là:
		Id: 1
		Name: Sale
		Thông tin department thứ 2 là:
		Id: 2
		Name: Marketing*/
		
		
		for (int i = 0;i < account.length;i++ ){
			System.out.println("thong tin department thu "+i +"la");
			System.out.println("id "+ department[i].id);
			System.out.println("name "+ department[i].name);
					
		}
		
		/*Question 12: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như
		Question 10*/
		
		
		for(int i=0;i < 2 ;i++){
			System.out.println("thong tin account thu "+ i+" la  ");
			System.out.println(account[i].email);
			System.out.println("phong ban: ");
			System.out.println(account[i].department.name);}
		
		/*Question 13: in ra thông tin tất cả các account ngoại trừ account thứ 2*/
		
		for (int i=0;i < account.length;i++){
			if (account[i].id !=2){
				System.out.println("thong tin account thu "+ i+" la  ");
				System.out.println(account[i].email);
				System.out.println("phong ban: ");
				System.out.println(account[i].department.name);
			
				
			}
		}
		/*Question 14: in ra thông tin tất cả các account có id < 4*/
		for (int i=0;i < account.length;i++){
			if (account[i].id <4){
				System.out.println("thong tin account thu "+ i+" la  ");
				System.out.println(account[i].email);
				System.out.println("phong ban: ");
				System.out.println(account[i].department.name);}
		}
		
		/*Question 15: in ra các số chẵn nhỏ hơn hoặc bằng 20*/
		for (int i =1;i <20;i++){
			if (i%2 == 0){
				i++;}
			System.out.println(i);
			}
			
		/*WHILE
		Question 16: Làm lại các Question ở phần FOR bằng cách sử dụng WHILE
		kết hợp với lệnh break, continue*/
		
		
		
		
		
	}
}


