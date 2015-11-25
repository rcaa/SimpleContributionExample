package innerclassexample;

public class Rodrigo {

	private String password;

	public void createInnerClass() {
		InnerClass inClass = new InnerClass();
		inClass.accessOuter();
	}

	class InnerClass {

		public void accessOuter() {
			System.out.println("The outer class's password is " + password);
		}
	}
	
	public static void main(String[] args) {
		Rodrigo r = new Rodrigo();
		r.createInnerClass();
	}
}