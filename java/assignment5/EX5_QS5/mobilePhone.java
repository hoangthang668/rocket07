package EX5_QS5;

public abstract class mobilePhone implements weapon {
	abstract void nghe();
	abstract void goi();
	abstract void guiTN();
	abstract void nhanTN();
	@Override
	public void attack(){
		System.out.println("tan cong ke xau");
	}
}
