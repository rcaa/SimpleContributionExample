package inheritanceexample;


public class Main {

	public static void main(String[] args) throws Exception {
		//List<ClasseConcreta> classes = new ArrayList<ClasseConcreta>();
		ClasseAbstrata clazz = new ClasseConcreta();
		clazz.doPost();
	}
}