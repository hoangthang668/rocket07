package EX5_QS5;

public class smartPhone extends mobilePhone{
	 void G(){
		System.out.println("su dung 3g");
	}
	 
	public void photo(){
		System.out.println("take a photo");}

	@Override
	void nghe() {
		System.out.println("alo alo smart");
		
	}

	@Override
	void goi() {
		System.out.println("hello hello smart");
	}

	@Override
	void guiTN() {
		System.out.println("gui sms smart");
	}

	@Override
	void nhanTN() {
		System.out.println("nhan sms smart");
	}
	

}
