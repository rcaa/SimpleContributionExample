package controller;

import model.User;

public class UserController {

	public String reverseCharacters(User user) {
		char[] pwd = user.getPassword().toCharArray();
		char[] pwdReverse = new char[pwd.length];
		for (int i = pwd.length - 1, y = 0; i >= 0; i--) {
			pwdReverse[y] = pwd[i];
			y++;
		}
		return new String(pwdReverse);
	}
}