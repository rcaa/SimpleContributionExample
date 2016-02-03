package inheritanceexample;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		List<ClasseConcreta> classes = new ArrayList<ClasseConcreta>();
		ClasseConcreta clazz = classes.get(0);
		clazz.doPost();
	}
}