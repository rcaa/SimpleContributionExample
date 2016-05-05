package clazz;

public class SysoExample {

	private String password;
	
	public SysoExample() {
		this.password = "1234";
	}
	
	public void m() {
		System.out.println(this.password);
	}
	
	public static void main(String[] args) {
		SysoExample s = new SysoExample();
		s.m();
	}
}