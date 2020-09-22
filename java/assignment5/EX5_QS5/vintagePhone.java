package EX5_QS5;

public class vintagePhone extends mobilePhone{
	void radio(){
		System.out.println("nghe radio");
	}

	@Override
	void nghe() {
		System.out.println("alo alo vintage");
	}

	@Override
	void goi() {
		System.out.println("hello hello vintage");
		
	}

	@Override
	void guiTN() {
		System.out.println("gui sms vintage");
	}

	@Override
	void nhanTN() {
		System.out.println("nhan sms vintage");
	}

}
