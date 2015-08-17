package others;

public class C {

	int x;

	public void n(Object obj) {
		D d = new D();
		if (obj == null) {
			d.m(5);
		} else {
			d.m(x);
		}
	}

	public void n2() {
		D d = new D();
		d.m(5);
	}

	public static void main(String[] args) {
		C c = new C();
		c.n(null);		
	}
}