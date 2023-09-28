package service;

import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserService {
	private static List<User> list = new ArrayList<User>();

	public static void createUser(User user) {
		list.add(user);
	}
	
	public static List<User> getAll() {
		return list;
	}

}
