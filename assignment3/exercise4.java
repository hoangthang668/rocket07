package assignment3;

public class exercise4 {
	/*Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
	sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
	VD:
	Accounting
	Boss of director
	Marketing
	Sale
	Waiting room*/

	public static void main(String[] args) {
		
		department[] departmenT = new department[5];
			departmenT[0].name ="Accounting" ;
			departmenT[1].name ="Boss of director";
			departmenT[2].name ="Marketing";
			String[] s= new String[5];
			for(int i =0;i<departmenT.length;i++){
				for(int j=0;j<s.length;j++){
					s[j] = departmenT[i].name.substring(0,1);
				}
			}
			
				
							
		}
}
