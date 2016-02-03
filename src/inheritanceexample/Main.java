package inheritanceexample;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		ClasseAbstrata temp = new ClasseConcreta();
		List<ClasseAbstrata> classes = new ArrayList<ClasseAbstrata>();
		classes.add(temp);
		ClasseAbstrata clazz = classes.get(0);
		clazz.doPost();
	}
}