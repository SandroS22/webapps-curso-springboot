package com.github.sandros22.springboot.primeirowebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("admin");
		boolean isValidPassword = password.equalsIgnoreCase("senha");
		
		return isValidPassword && isValidUserName;
	}
	
}
