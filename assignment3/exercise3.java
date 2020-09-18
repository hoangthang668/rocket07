package assignment3;
import java.util.Scanner;
import java.lang.String;
public class exercise3 {

	public static void main(String[] args) {

		/*Question 3:
			Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư
			viết hoa chữ cái đầu thì viết hoa lên*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chuoi:  ");
		String s1= scanner.next();
		System.out.println(s1);
		scanner.close();
		//s1.substring(0,1) lay chuoi con tu 0-1);
		
		 String s=s1.substring(0,1).toUpperCase() + s1.substring(1).toLowerCase();
		 System.out.println(s);
		 
		 
		 
		 
		 /*Question 4:
			 Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
			 của người dùng ra
			 VD:
			 Người dùng nhập vào "Nam", hệ thống sẽ in ra
			 "Ký tự thứ 1 là: N"
			 "Ký tự thứ 1 là: A"
			 "Ký tự thứ 1 là: M"*/
		
		  char[] ch = s1.toCharArray();
		  for (int i = 0; i < ch.length; i++) {
		   System.out.println(ch[i]);
		  }
		 
		  
		  /*Question 15: Revert string by word
		  Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng
		  thư viện.
		  Ví dụ: " I am developer " => "developer am I".
		  Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
		  Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt
		  chuỗi theo dấu cách*/
		  
		  
		  
		 
	}

}
