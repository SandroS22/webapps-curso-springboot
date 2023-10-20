package com.github.sandros22.springboot.primeirowebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();

	private static int todosCount = 0;

	static {
		todos.add(new Todo(++todosCount, "Sandro", "Aprender Angular", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "Sandro", "Aprender Docker", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "Sandro", "Aprender AWS", LocalDate.now().plusYears(1), false));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
		todos.add(todo);
	}
}
