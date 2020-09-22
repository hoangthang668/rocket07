package EX5_QS5;

public class main {

	public static void main(String[] args) {
		vintagePhone vtP = new vintagePhone();
		System.out.println("cac chuc nang cua dien thoai co dien:");
		System.out.println(" ");
		vtP.goi();
		vtP.nghe();
		vtP.guiTN();
		vtP.nhanTN();
		vtP.attack();
		vtP.radio();
		smartPhone smP = new smartPhone();
		System.out.println(" ");
		System.out.println("cac chuc nang cua dien thoai thong minh");
		System.out.println(" ");
		smP.goi();
		smP.nghe();
		smP.guiTN();
		smP.nhanTN();
		smP.attack();
		smP.G();
		smP.photo();
		
	}

}
