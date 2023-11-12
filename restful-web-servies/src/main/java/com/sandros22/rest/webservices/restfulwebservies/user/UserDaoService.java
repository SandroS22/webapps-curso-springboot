package com.sandros22.rest.webservices.restfulwebservies.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User(1, "Leo", LocalDate.now().minusYears(40)));
		users.add(new User(2, "Evellyn", LocalDate.now().minusYears(23)));
		users.add(new User(3, "James", LocalDate.now().minusYears(19)));
	}

	public List<User> findAll() {
		return users;
	}

	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}
}
