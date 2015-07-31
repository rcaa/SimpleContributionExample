package view;

import model.User;
import controller.UserController;

public class Main {

	public static void main(String[] args) {
		UserController uc = new UserController();
		User u = new User("rca", "123456");
		uc.reverseCharacters(u);
	}
}
