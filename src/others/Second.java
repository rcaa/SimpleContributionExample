package others;

public class Second {

	int x;
	
	public void m() {
		c();
	}
	
	public void c() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		Second s = new Second();
		s.m();
	}
}
