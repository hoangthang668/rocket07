package assignment3;
import java.util.Random;
import java.lang.String;
public class exercise1 {

	public static void main(String[] args) {
		
	
	/*Question 2:
	Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
	có số 0 ở đầu cho đủ 5 chữ số)*/
	
	Random random=new Random();
	int x = random.nextInt(99999);
	System.out.println(x);
	//Question 3:
			/*Lấy 2 số cuối của số ở Question 2 và in ra.
			Gợi ý:
			Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
			Cách 2: chia lấy dư số đó cho 100*/
	String s = String.valueOf(x);
	System.out.println(s);
	String st=s.substring(s.length()-2,s.length());
	System.out.println(st);
	
	

	}
	
	
}
