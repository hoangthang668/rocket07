package assignment3;
import java.util.Date;;
public class exercise2 {

	public static void main(String[] args) {
		/*Exercise 2: Default value
		Question 1:
		Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
		tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
		 Email: "Email 1"
		 Username: "User name 1"
		 FullName: "Full name 1"
		 CreateDate: now*/
		Account[] account = new Account[5];
		for (int i =0;i<account.length;i++){
			account[i]= new Account();
			account[i].creatDate= new Date("2020/02/03");
			account[i].email= "hoang.@gmail.com";
			account[i].fullName="hoang duc"+i;
			account[i].userName="hoangduc"+i;
		}
		for (int i =0;i<=account.length;i++){
			System.out.println("email  "+account[i].email);
			System.out.println("ngay tao  "+account[i].creatDate);
			System.out.println("fullname  "+account[i].fullName);
			System.out.println("user   "+account[i].userName);
		}
	}

}
