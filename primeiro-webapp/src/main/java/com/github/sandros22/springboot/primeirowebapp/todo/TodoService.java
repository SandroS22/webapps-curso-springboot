package com.github.sandros22.springboot.primeirowebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(1, "Sandro", "Aprender Angular", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "Sandro", "Aprender Docker", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(3, "Sandro", "Aprender AWS", LocalDate.now().plusYears(1), false));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}
}
