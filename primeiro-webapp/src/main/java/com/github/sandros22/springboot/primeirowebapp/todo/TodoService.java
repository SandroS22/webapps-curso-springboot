package com.github.sandros22.springboot.primeirowebapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {

	private static List<Todo> todos;
	static {
		todos.add(new Todo(1, "Sandro", "Aprender Angular", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "Sandro", "Aprender Docker", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(3, "Sandro", "Aprender AWS", LocalDate.now().plusYears(1), false));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}
}
